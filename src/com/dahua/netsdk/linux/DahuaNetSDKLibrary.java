package com.dahua.netsdk.linux;

import com.dahua.netsdk.def.DH_RealPlayType;
import com.sun.jna.*;
import com.sun.jna.ptr.IntByReference;

/**
 * 大华的Linux版本设备网络SDK封装库
 */
@SuppressWarnings("UnusedDeclaration")
public interface DahuaNetSDKLibrary extends Library {
    public static final String JNA_LIBRARY_NAME = "dhnetsdk";
    public static final NativeLibrary JNA_NATIVE_LIB = NativeLibrary.getInstance(DahuaNetSDKLibrary.JNA_LIBRARY_NAME);
    public static final DahuaNetSDKLibrary INSTANCE = (DahuaNetSDKLibrary) Native.loadLibrary(DahuaNetSDKLibrary.JNA_LIBRARY_NAME, DahuaNetSDKLibrary.class);

    public static final int NULL = 0;
    public static final int TRUE = 1;
    public static final int FALSE = 0;

    public static final int MAX_PATH = 260;

    /**
     * 设备序列号字符长度
     */
    public static final int DH_SERIALNO_LEN = 48;

    /**
     * 网络连接断开回调函数原形
     */
    public interface DisConnectCallBack extends Callback {
        /**
         * @param lLoginID 登陆句柄
         * @param pchDVRIP 设备IP
         * @param nDVRPort 端口
         * @param dwUser   用户数据，就是上面输入的用户数据
         */
        void invoke(NativeLong lLoginID, String pchDVRIP, int nDVRPort, NativeLong dwUser);
    }

    /**
     * 网络连接恢复回调函数原形
     */
    public interface HaveReConnectCallBack extends Callback {
        /**
         * @param lLoginID 登陆句柄
         * @param pchDVRIP 当前设备IP地址
         * @param nDVRPort 当前设备端口号
         * @param dwUser   用户自定义数据
         */
        void invoke(NativeLong lLoginID, String pchDVRIP, int nDVRPort, NativeLong dwUser);
    }

    /**
     * 实时监视数据回调函数原形--扩展
     */
    public interface RealDataCallBackEx extends Callback {
        /**
         * @param lRealHandle 实时监视ID
         * @param dwDataType  标识回调出来的数据类型，只有dwFlag设置标识的数据才会回调出来：
         *                    <table>
         *                    <thead>
         *                    <tr><th>dwDataType</th><th>数据类型</th></tr>
         *                    </thead>
         *                    <tbody>
         *                    <tr><td>0</td><td>原始数据(与SaveRealData保存的数据一致)</td></tr>
         *                    <tr><td>1</td><td>帧数据</td></tr>
         *                    <tr><td>2</td><td>yuv数据</td></tr>
         *                    <tr><td>3</td><td>pcm音频数据</td></tr>
         *                    </tbody>
         *                    </table>
         * @param pBuffer     回调数据，根据数据类型的不同每次回调不同的长度的数据，除类型0，其他数据类型都是按帧，每次回调一帧数据
         * @param dwBufSize   回调数据的长度，根据不同的类型，长度也不同(单位字节)
         * @param param       回调数据参数结构体，根据不同的类型，参数结构也不一致，当类型为0(原始数据)和2(YUV数据) 时为0。
         *                    当回调的数据类型为帧数据时param为一个tagVideoFrameParam结构体指针。
         *                    当数据类型是PCM数据的时候param也是一个tagCBPCMDataParam结构体指针
         * @param dwUser      用户数据，就是上面输入的用户数据
         */
        void invoke(NativeLong lRealHandle, int dwDataType, Pointer pBuffer, int dwBufSize, int param, NativeLong dwUser);
    }

    int CLIENT_GetLastError();

    /**
     * 初始化SDK, 在所有的SDK函数之前调用
     * <p>在应用程序初始化时调用。</p>
     *
     * @param cbDisConnect 断线回调函数，回调出当前网络已经断开的设备，
     *                     对调用SDK的{@link #CLIENT_Logout}函数主动断开的设备不回调，设置为0时禁止回调
     * @param dwUser       用户数据
     * @return 成功返回TRUE，不成功返回FALSE。
     * @see #CLIENT_Cleanup
     */
    int CLIENT_Init(DisConnectCallBack cbDisConnect, NativeLong dwUser);

    /**
     * 清空SDK, 释放占用的资源，在所有的SDK函数之后调用
     * <p>在应用程序关闭时调用。</p>
     *
     * @see #CLIENT_Init
     */
    void CLIENT_Cleanup();

    /**
     * 注册用户到设备的扩展接口，支持一个用户指定设备支持的能力
     * <p>车载DVR主动侦听模式下的用户登陆。除了车载dvr登录需要用到该接口，一般不建议客户使用。</p>
     *
     * @param pchDVRIP     设备IP
     * @param wDVRPort     设备端口
     * @param pchUserName  用户名
     * @param pchPassword  用户密码
     * @param nSpecCap     设备支持的能力，值为2表示主动侦听模式下的用户登陆(车载dvr登录)
     *                     <table>
     *                     <thead>
     *                     <tr><th>参数值</th><th>代表含义</th></tr>
     *                     </thead>
     *                     <tbody>
     *                     <tr><td>0</td><td>TCP方式登入</td></tr>
     *                     <tr><td>2</td><td>主动注册登入</td></tr>
     *                     <tr><td>3</td><td>组播方式下的登入</td></tr>
     *                     <tr><td>4</td><td>UDP方式登入</td></tr>
     *                     <tr><td>6</td><td>只建立主连接登陆方式</td></tr>
     *                     <tr><td>7</td><td>SSL加密登录</td></tr>
     *                     <tr><td>8</td><td>成都佳发登陆</td></tr>
     *                     <tr><td>9</td><td>登录远程设备，这个时候void* pCapParam填入远程设备的名字的字符串</td></tr>
     *                     <tr><td>12</td><td>LDAP方式登录</td></tr>
     *                     <tr><td>13</td><td>AD方式登录</td></tr>
     *                     </tbody>
     *                     </table>
     * @param pCapParam    对nSpecCap 的补充参数，nSpecCap = 2时，pCapParam填充设备序列号字串(车载dvr登录)
     * @param lpDeviceInfo 设备信息，属于输出参数
     * @param error        (当函数返回成功时,该参数的值无意义)，返回登录错误码，如下表：
     *                     <table>
     *                     <thead>
     *                     <tr><th>错误码</th><th>代表含义</th></tr>
     *                     </thead>
     *                     <tbody>
     *                     <tr><td>1</td><td>密码不正确</td></tr>
     *                     <tr><td>2</td><td>用户名不存在</td></tr>
     *                     <tr><td>3</td><td>登录超时</td></tr>
     *                     <tr><td>4</td><td>帐号已登录</td></tr>
     *                     <tr><td>5</td><td>帐号已被锁定</td></tr>
     *                     <tr><td>6</td><td>帐号被列为黑名单</td></tr>
     *                     <tr><td>7</td><td>资源不足，系统忙</td></tr>
     *                     <tr><td>8</td><td>子连接失败</td></tr>
     *                     <tr><td>9</td><td>主连接失败</td></tr>
     *                     <tr><td>10</td><td>超过最大用户连接数</td></tr>
     *                     </tbody>
     *                     </table>
     * @return 失败返回0，成功返回设备ID，登录成功之后对设备的操作都可以通过此值(设备句柄)对应到相应的设备。
     * @see #CLIENT_Logout
     */
    NativeLong CLIENT_LoginEx(String pchDVRIP, short wDVRPort, String pchUserName, String pchPassword, int nSpecCap, Pointer pCapParam, NET_DEVICEINFO.ByReference lpDeviceInfo, IntByReference error);

    /**
     * 注销设备用户
     * <p>当需要设备主动断开时调用。</p>
     *
     * @param lLoginID {@link #CLIENT_LoginEx}的返回值
     * @return 成功返回TRUE，失败返回FALSE。
     * @see #CLIENT_LoginEx
     */
    int CLIENT_Logout(NativeLong lLoginID);

    /**
     * 设置断线重连的回调函数，不调用sdk内部就不进行断线重连；调用后，sdk内部会在检测到设备断线之后不断重连设备，直到连接成功，
     * 连接过程中若出现密码或用户错误时，将停止重连。
     * <p>在初始化SDK后，可以设置断线重连成功的回调函数。</p>
     *
     * @param cbAutoConnect 断线重连成功的回调函数
     * @param dwUser        用户自定义数据，在回调中可以使用
     */
    void CLIENT_SetAutoReconnect(HaveReConnectCallBack cbAutoConnect, NativeLong dwUser);

    /**
     * 启动实时监视或多画面预览。对于支持双码流的设备，可通过设置RealPlayType参数选择主码流或从码流进行监视
     *
     * @param lLoginID   CLIENT_Login的返回值
     * @param nChannelID 实时监视通道号，如果rType为RType_Multiplay该参数保留。
     *                   当rType为RType_Multiplay_1~RType_Multiplay_16时，nChannelID决定了预览的画面，
     *                   如当RType_Multiplay_4时，通道为4或5或6或7表示预览第5到第7通道的四画面预览
     * @param hWnd       窗口句柄。值为0（NULL）时对数据不解码不显示图像
     * @param rType      值定义类型{@link DH_RealPlayType}，如下表：
     *                   <table>
     *                   <thead>
     *                   <tr><th>类型</th><th>代表含义</th></tr>
     *                   </thead>
     *                   <tbody>
     *                   <tr><td>{@link DH_RealPlayType#DH_RType_Realplay}</td><td>实时预览</td></tr>
     *                   <tr><td>{@link DH_RealPlayType#DH_RType_Multiplay}</td><td>多画面预览</td></tr>
     *                   <tr><td>{@link DH_RealPlayType#DH_RType_Realplay_0}</td><td>实时监视-主码流，等同于DH_RType_Realplay</td></tr>
     *                   <tr><td>{@link DH_RealPlayType#DH_RType_Realplay_1}</td><td>实时监视-从码流1</td></tr>
     *                   <tr><td>{@link DH_RealPlayType#DH_RType_Realplay_2}</td><td>实时监视-从码流2</td></tr>
     *                   <tr><td>{@link DH_RealPlayType#DH_RType_Realplay_3}</td><td>实时监视-从码流3</td></tr>
     *                   <tr><td>{@link DH_RealPlayType#DH_RType_Multiplay_1}</td><td>多画面预览－1画面</td></tr>
     *                   <tr><td>{@link DH_RealPlayType#DH_RType_Multiplay_4}</td><td>多画面预览－4画面</td></tr>
     *                   <tr><td>{@link DH_RealPlayType#DH_RType_Multiplay_8}</td><td>多画面预览－8画面</td></tr>
     *                   <tr><td>{@link DH_RealPlayType#DH_RType_Multiplay_9}</td><td>多画面预览－9画面</td></tr>
     *                   <tr><td>{@link DH_RealPlayType#DH_RType_Multiplay_16}</td><td>多画面预览－16画面</td></tr>
     *                   <tr><td>{@link DH_RealPlayType#DH_RType_Multiplay_6}</td><td>多画面预览－6画面</td></tr>
     *                   <tr><td>{@link DH_RealPlayType#DH_RType_Multiplay_12}</td><td>多画面预览－12画面</td></tr>
     *                   </tbody>
     *                   </table>
     * @return 失败返回0，成功返回实时监视ID(实时监视句柄)，将作为相关函数的参数。
     * @see #CLIENT_StopRealPlayEx
     */
    NativeLong CLIENT_RealPlayEx(NativeLong lLoginID, int nChannelID, Pointer hWnd, int rType);

    /**
     * 停止实时监视或多画面预览
     * <p>关闭实时监视或者多画面预览。</p>
     *
     * @param lRealHandle {@link #CLIENT_RealPlayEx}的返回值
     * @return 成功返回TRUE，失败返回FALSE。
     * @see #CLIENT_RealPlayEx
     */
    int CLIENT_StopRealPlayEx(NativeLong lRealHandle);

    /**
     * 设置实时监视数据回调扩展接口，是对上一接口的补充，增加一个回调数据类型标志dwFlag参数，可以选择性的回调出需要的数据，
     * 对于没设置回调的数据类型就不回调出来了，当设置为0x1f时与上一接口效果一样，不过对回调函数也做了扩展。
     * <p>通过调用本接口可以比较自如的获取实时监视数据，用来保存成文件，也可以用来数据分发多路窗口显示及实现其他功能。</p>
     *
     * @param lRealHandle {@link #CLIENT_RealPlayEx}的返回值
     * @param cbRealData  回调函数,用于传出多种类型的实时数据
     * @param dwUser      用户数据
     * @param dwFlag      是按位来的，可以组合，为0x1f时五种数据类型都回调,如下表:
     *                    <table>
     *                    <thead>
     *                    <tr><th>dwFlag</th><th>数据类型</th></tr>
     *                    </thead>
     *                    <tbody>
     *                    <tr><td>0x00000001</td><td>等同原来的原始数据</td></tr>
     *                    <tr><td>0x00000002</td><td>是MPEG4/H264标准数据</td></tr>
     *                    <tr><td>0x00000004</td><td>YUV数据</td></tr>
     *                    <tr><td>0x00000008</td><td>PCM数据</td></tr>
     *                    <tr><td>0x00000010</td><td>原始音频数据</td></tr>
     *                    <tr><td>0x0000001f</td><td>以上五种数据类型</td></tr>
     *                    </tbody>
     *                    </table>
     * @return 成功返回TRUE，失败返回FALSE。
     * @see #CLIENT_RealPlayEx #CLIENT_StopRealPlayEx
     */
    int CLIENT_SetRealDataCallBackEx(NativeLong lRealHandle, RealDataCallBackEx cbRealData, NativeLong dwUser, int dwFlag);
}
