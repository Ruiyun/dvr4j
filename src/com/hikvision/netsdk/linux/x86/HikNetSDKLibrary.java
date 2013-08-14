package com.hikvision.netsdk.linux.x86;

import com.sun.jna.Callback;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.jna.Pointer;

/**
 * 海康的x86版本Linux设备网络SDK封装库
 */
@SuppressWarnings("UnusedDeclaration")
public interface HikNetSDKLibrary extends Library {
    public static final String JNA_LIBRARY_NAME = "hcnetsdk";
    public static final NativeLibrary JNA_NATIVE_LIB = NativeLibrary.getInstance(HikNetSDKLibrary.JNA_LIBRARY_NAME);
    public static final HikNetSDKLibrary INSTANCE = (HikNetSDKLibrary) Native.loadLibrary(HikNetSDKLibrary.JNA_LIBRARY_NAME, HikNetSDKLibrary.class);

    /**
     * 没有错误
     */
    public static final int NET_DVR_NOERROR = 0;

    /**
     * 用户名密码错误
     */
    public static final int NET_DVR_PASSWORD_ERROR = 1;

    /**
     * 权限不足
     */
    public static final int NET_DVR_NOENOUGHPRI = 2;

    /**
     * 没有初始化
     */
    public static final int NET_DVR_NOINIT = 3;

    /**
     * 通道号错误
     */
    public static final int NET_DVR_CHANNEL_ERROR = 4;

    /**
     * 连接到DVR的客户端个数超过最大
     */
    public static final int NET_DVR_OVER_MAXLINK = 5;

    /**
     * 版本不匹配
     */
    public static final int NET_DVR_VERSIONNOMATCH = 6;

    /**
     * 连接服务器失败
     */
    public static final int NET_DVR_NETWORK_FAIL_CONNECT = 7;

    /**
     * 向服务器发送失败
     */
    public static final int NET_DVR_NETWORK_SEND_ERROR = 8;

    /**
     * 从服务器接收数据失败
     */
    public static final int NET_DVR_NETWORK_RECV_ERROR = 9;

    /**
     * 从服务器接收数据超时
     */
    public static final int NET_DVR_NETWORK_RECV_TIMEOUT = 10;

    /**
     * 传送的数据有误
     */
    public static final int NET_DVR_NETWORK_ERRORDATA = 11;

    /**
     * 调用次序错误
     */
    public static final int NET_DVR_ORDER_ERROR = 12;

    /**
     * 无此权限
     */
    public static final int NET_DVR_OPERNOPERMIT = 13;

    /**
     * DVR命令执行超时
     */
    public static final int NET_DVR_COMMANDTIMEOUT = 14;

    /**
     * 串口号错误
     */
    public static final int NET_DVR_ERRORSERIALPORT = 15;

    /**
     * 报警端口错误
     */
    public static final int NET_DVR_ERRORALARMPORT = 16;

    /**
     * 参数错误
     */
    public static final int NET_DVR_PARAMETER_ERROR = 17;

    /**
     * 服务器通道处于错误状态
     */
    public static final int NET_DVR_CHAN_EXCEPTION = 18;

    /**
     * 没有硬盘
     */
    public static final int NET_DVR_NODISK = 19;

    /**
     * 硬盘号错误
     */
    public static final int NET_DVR_ERRORDISKNUM = 20;

    /**
     * 服务器硬盘满
     */
    public static final int NET_DVR_DISK_FULL = 21;

    /**
     * 服务器硬盘出错
     */
    public static final int NET_DVR_DISK_ERROR = 22;

    /**
     * 服务器不支持
     */
    public static final int NET_DVR_NOSUPPORT = 23;

    /**
     * 服务器忙
     */
    public static final int NET_DVR_BUSY = 24;

    /**
     * 服务器修改不成功
     */
    public static final int NET_DVR_MODIFY_FAIL = 25;

    /**
     * 密码输入格式不正确
     */
    public static final int NET_DVR_PASSWORD_FORMAT_ERROR = 26;

    /**
     * 硬盘正在格式化，不能启动操作
     */
    public static final int NET_DVR_DISK_FORMATING = 27;

    /**
     * DVR资源不足
     */
    public static final int NET_DVR_DVRNORESOURCE = 28;

    /**
     * DVR操作失败
     */
    public static final int NET_DVR_DVROPRATEFAILED = 29;


    /**
     * 打开PC声音失败
     */
    public static final int NET_DVR_OPENHOSTSOUND_FAIL = 30;

    /**
     * 服务器语音对讲被占用
     */
    public static final int NET_DVR_DVRVOICEOPENED = 31;

    /**
     * 时间输入不正确
     */
    public static final int NET_DVR_TIMEINPUTERROR = 32;

    /**
     * 回放时服务器没有指定的文件
     */
    public static final int NET_DVR_NOSPECFILE = 33;

    /**
     * 创建文件出错
     */
    public static final int NET_DVR_CREATEFILE_ERROR = 34;

    /**
     * 打开文件出错
     */
    public static final int NET_DVR_FILEOPENFAIL = 35;

    /**
     * 上次的操作还没有完成
     */
    public static final int NET_DVR_OPERNOTFINISH = 36;

    /**
     * 获取当前播放的时间出错
     */
    public static final int NET_DVR_GETPLAYTIMEFAIL = 37;

    /**
     * 播放出错
     */
    public static final int NET_DVR_PLAYFAIL = 38;

    /**
     * 文件格式不正确
     */
    public static final int NET_DVR_FILEFORMAT_ERROR = 39;

    /**
     * 路径错误
     */
    public static final int NET_DVR_DIR_ERROR = 40;

    /**
     * 资源分配错误
     */
    public static final int NET_DVR_ALLOC_RESOURCE_ERROR = 41;

    /**
     * 声卡模式错误
     */
    public static final int NET_DVR_AUDIO_MODE_ERROR = 42;

    /**
     * 缓冲区太小
     */
    public static final int NET_DVR_NOENOUGH_BUF = 43;

    /**
     * 创建SOCKET出错
     */
    public static final int NET_DVR_CREATESOCKET_ERROR = 44;

    /**
     * 设置SOCKET出错
     */
    public static final int NET_DVR_SETSOCKET_ERROR = 45;

    /**
     * 个数达到最大
     */
    public static final int NET_DVR_MAX_NUM = 46;

    /**
     * 用户不存在
     */
    public static final int NET_DVR_USERNOTEXIST = 47;

    /**
     * 写FLASH出错
     */
    public static final int NET_DVR_WRITEFLASHERROR = 48;

    /**
     * DVR升级失败
     */
    public static final int NET_DVR_UPGRADEFAIL = 49;

    /**
     * 解码卡已经初始化过
     */
    public static final int NET_DVR_CARDHAVEINIT = 50;

    /**
     * 调用播放库中某个函数失败
     */
    public static final int NET_DVR_PLAYERFAILED = 51;

    /**
     * 设备端用户数达到最大
     */
    public static final int NET_DVR_MAX_USERNUM = 52;

    /**
     * 获得客户端的IP地址或物理地址失败
     */
    public static final int NET_DVR_GETLOCALIPANDMACFAIL = 53;

    /**
     * 该通道没有编码
     */
    public static final int NET_DVR_NOENCODEING = 54;

    /**
     * IP地址不匹配
     */
    public static final int NET_DVR_IPMISMATCH = 55;

    /**
     * MAC地址不匹配
     */
    public static final int NET_DVR_MACMISMATCH = 56;

    /**
     * 升级文件语言不匹配
     */
    public static final int NET_DVR_UPGRADELANGMISMATCH = 57;

    /**
     * 播放器路数达到最大
     */
    public static final int NET_DVR_MAX_PLAYERPORT = 58;

    /**
     * 备份设备中没有足够空间进行备份
     */
    public static final int NET_DVR_NOSPACEBACKUP = 59;

    /**
     * 没有找到指定的备份设备
     */
    public static final int NET_DVR_NODEVICEBACKUP = 60;

    /**
     * 图像素位数不符，限24色
     */
    public static final int NET_DVR_PICTURE_BITS_ERROR = 61;

    /**
     * 图片高*宽超限， 限128*256
     */
    public static final int NET_DVR_PICTURE_DIMENSION_ERROR = 62;

    /**
     * 图片大小超限，限100K
     */
    public static final int NET_DVR_PICTURE_SIZ_ERROR = 63;

    /**
     * 载入当前目录下Player Sdk出错
     */
    public static final int NET_DVR_LOADPLAYERSDKFAILED = 64;

    /**
     * 找不到Player Sdk中某个函数入口
     */
    public static final int NET_DVR_LOADPLAYERSDKPROC_ERROR = 65;

    /**
     * 载入当前目录下DSsdk出错
     */
    public static final int NET_DVR_LOADDSSDKFAILED = 66;

    /**
     * 找不到DsSdk中某个函数入口
     */
    public static final int NET_DVR_LOADDSSDKPROC_ERROR = 67;

    /**
     * 调用硬解码库DsSdk中某个函数失败
     */
    public static final int NET_DVR_DSSDK_ERROR = 68;

    /**
     * 声卡被独占
     */
    public static final int NET_DVR_VOICEMONOPOLIZE = 69;

    /**
     * 加入多播组失败
     */
    public static final int NET_DVR_JOINMULTICASTFAILED = 70;

    /**
     * 建立日志文件目录失败
     */
    public static final int NET_DVR_CREATEDIR_ERROR = 71;

    /**
     * 绑定套接字失败
     */
    public static final int NET_DVR_BINDSOCKET_ERROR = 72;

    /**
     * socket连接中断，此错误通常是由于连接中断或目的地不可达
     */
    public static final int NET_DVR_SOCKETCLOSE_ERROR = 73;

    /**
     * 注销时用户ID正在进行某操作
     */
    public static final int NET_DVR_USERID_ISUSING = 74;

    /**
     * 监听失败
     */
    public static final int NET_DVR_SOCKETLISTEN_ERROR = 75;

    /**
     * 程序异常
     */
    public static final int NET_DVR_PROGRAM_EXCEPTION = 76;

    /**
     * 写文件失败
     */
    public static final int NET_DVR_WRITEFILE_FAILED = 77;

    /**
     * 禁止格式化只读硬盘
     */
    public static final int NET_DVR_FORMAT_READONLY = 78;

    /**
     * 用户配置结构中存在相同的用户名
     */
    public static final int NET_DVR_WITHSAMEUSERNAME = 79;

    /**
     * 导入参数时设备型号不匹配
     */
    public static final int NET_DVR_DEVICETYPE_ERROR = 80;

    /**
     * 导入参数时语言不匹配
     */
    public static final int NET_DVR_LANGUAGE_ERROR = 81;

    /**
     * 导入参数时软件版本不匹配
     */
    public static final int NET_DVR_PARAVERSION_ERROR = 82;

    /**
     * 预览时外接IP通道不在线
     */
    public static final int NET_DVR_IPCHAN_NOTALIVE = 83;

    /**
     * 加载高清IPC通讯库StreamTransClient.dll失败
     */
    public static final int NET_DVR_RTSP_SDK_ERROR = 84;

    /**
     * 加载转码库失败
     */
    public static final int NET_DVR_CONVERT_SDK_ERROR = 85;

    /**
     * 超出最大的ip接入通道数
     */
    public static final int NET_DVR_IPC_COUNT_OVERFLOW = 86;

    /**
     * 添加标签(一个文件片段64)等个数达到最大
     */
    public static final int NET_DVR_MAX_ADD_NUM = 87;

    /**
     * 图像增强仪，参数模式错误（用于硬件设置时，客户端进行软件设置时错误值）
     */
    public static final int NET_DVR_PARAMMODE_ERROR = 88;

    /**
     * 视频综合平台，码分器不在线
     */
    public static final int NET_DVR_CODESPITTER_OFFLINE = 89;

    /**
     * 设备正在备份
     */
    public static final int NET_DVR_BACKUP_COPYING = 90;

    /**
     * 通道不支持该操作
     */
    public static final int NET_DVR_CHAN_NOTSUPPORT = 91;

    /**
     * 高度线位置太集中或长度线不够倾斜
     */
    public static final int NET_DVR_CALLINEINVALID = 92;

    /**
     * 取消标定冲突，如果设置了规则及全局的实际大小尺寸过滤
     */
    public static final int NET_DVR_CALCANCELCONFLICT = 93;

    /**
     * 标定点超出范围
     */
    public static final int NET_DVR_CALPOINTOUTRANGE = 94;

    /**
     * 尺寸过滤器不符合要求
     */
    public static final int NET_DVR_FILTERRECTINVALID = 95;

    /**
     * 设备没有注册到ddns上
     */
    public static final int NET_DVR_DDNS_DEVOFFLINE = 96;

    /**
     * DDNS 服务器内部错误
     */
    public static final int NET_DVR_DDNS_INTER_ERROR = 97;

    /**
     * 此功能不支持该操作系统
     */
    public static final int NET_DVR_FUNCTION_NOT_SUPPORT_OS = 98;

    /**
     * 别名重复  //2011-08-31 通过别名或者序列号来访问设备的新版本ddns的配置
     */
    public static final int NET_DVR_ALIAS_DUPLICATE = 150;

    /**
     * 网络流量超过设备能力上限
     */
    public static final int NET_DVR_DEV_NET_OVERFLOW = 800;

    /**
     * 录像文件在录像，无法被锁定
     */
    public static final int NET_DVR_STATUS_RECORDFILE_WRITING_NOT_LOCK = 801;

    /**
     * 由于硬盘太小无法格式化
     */
    public static final int NET_DVR_STATUS_CANT_FORMAT_LITTLE_DISK = 802;

    /**
     * 无权限：服务器返回401时，转成这个错误码
     */
    public static final int NET_DVR_RTSP_ERROR_NOENOUGHPRI = 401;

    /**
     * 分配资源失败
     */
    public static final int NET_DVR_RTSP_ERROR_ALLOC_RESOURCE = 402;

    /**
     * 参数错误
     */
    public static final int NET_DVR_RTSP_ERROR_PARAMETER = 403;

    /**
     * 用户中途强行退出
     */
    public static final int NET_DVR_RTSP_ERROR_FORCE_STOP = 406;

    /**
     * rtsp 得到端口错误
     */
    public static final int NET_DVR_RTSP_GETPORTFAILED = 407;


    /**
     * rtsp decribe 交互错误
     */
    public static final int NET_DVR_RTSP_DESCRIBERROR = 410;

    /**
     * rtsp decribe 发送超时
     */
    public static final int NET_DVR_RTSP_DESCRIBESENDTIMEOUT = 411;

    /**
     * rtsp decribe 发送失败
     */
    public static final int NET_DVR_RTSP_DESCRIBESENDERROR = 412;

    /**
     * rtsp decribe 接收超时
     */
    public static final int NET_DVR_RTSP_DESCRIBERECVTIMEOUT = 413;

    /**
     * rtsp decribe 接收数据错误
     */
    public static final int NET_DVR_RTSP_DESCRIBERECVDATALOST = 414;

    /**
     * rtsp decribe 接收失败
     */
    public static final int NET_DVR_RTSP_DESCRIBERECVERROR = 415;

    /**
     * rtsp decribe 服务器返回401:用户名密码错误或者无权限,或者 501:设备内部资源分配失败
     */
    public static final int NET_DVR_RTSP_DESCRIBESERVERERR = 416;

    /**
     * rtsp setup 发送超时
     */
    public static final int NET_DVR_RTSP_SETUPSENDTIMEOUT = 421;

    /**
     * rtsp setup 发送错误
     */
    public static final int NET_DVR_RTSP_SETUPSENDERROR = 422;

    /**
     * rtsp setup 接收超时
     */
    public static final int NET_DVR_RTSP_SETUPRECVTIMEOUT = 423;

    /**
     * rtsp setup 接收数据错误
     */
    public static final int NET_DVR_RTSP_SETUPRECVDATALOST = 424;

    /**
     * rtsp setup 接收失败
     */
    public static final int NET_DVR_RTSP_SETUPRECVERROR = 425;

    /**
     * rtsp setup 服务器返回401,501等错误,超过最大连接数
     */
    public static final int NET_DVR_RTSP_OVER_MAX_CHAN = 426;


    /**
     * rtsp play 发送超时
     */
    public static final int NET_DVR_RTSP_PLAYSENDTIMEOUT = 431;

    /**
     * rtsp play 发送错误
     */
    public static final int NET_DVR_RTSP_PLAYSENDERROR = 432;

    /**
     * rtsp play 接收超时
     */
    public static final int NET_DVR_RTSP_PLAYRECVTIMEOUT = 433;

    /**
     * rtsp play 接收数据错误
     */
    public static final int NET_DVR_RTSP_PLAYRECVDATALOST = 434;

    /**
     * rtsp play 接收失败
     */
    public static final int NET_DVR_RTSP_PLAYRECVERROR = 435;

    /**
     * rtsp play 服务器返回401,501等错误
     */
    public static final int NET_DVR_RTSP_PLAYSERVERERR = 436;


    /**
     * rtsp teardown 发送超时
     */
    public static final int NET_DVR_RTSP_TEARDOWNSENDTIMEOUT = 441;

    /**
     * rtsp teardown 发送错误
     */
    public static final int NET_DVR_RTSP_TEARDOWNSENDERROR = 442;

    /**
     * rtsp teardown 接收超时
     */
    public static final int NET_DVR_RTSP_TEARDOWNRECVTIMEOUT = 443;

    /**
     * rtsp teardown 接收数据错误
     */
    public static final int NET_DVR_RTSP_TEARDOWNRECVDATALOST = 444;

    /**
     * rtsp teardown 接收失败
     */
    public static final int NET_DVR_RTSP_TEARDOWNRECVERROR = 445;

    /**
     * rtsp teardown 服务器返回401,501等错误
     */
    public static final int NET_DVR_RTSP_TEARDOWNSERVERERR = 446;

    /**
     * 序列号长度
     */
    public static final int SERIALNO_LEN = (int) 48;

    public static final int TRUE = (int) 1;
    public static final int FALSE = (int) 0;


    /**
     * 系统头数据
     */
    public static final int NET_DVR_SYSHEAD = 1;

    /**
     * 视频流数据（包括复合流和音视频分开的视频流数据）
     */
    public static final int NET_DVR_STREAMDATA = 2;

    /**
     * 音频流数据
     */
    public static final int NET_DVR_AUDIOSTREAMDATA = 3;

    /**
     * 标准视频流数据
     */
    public static final int NET_DVR_STD_VIDEODATA = 4;

    /**
     * 标准音频流数据
     */
    public static final int NET_DVR_STD_AUDIODATA = 5;

    /**
     * 码流改变为正放
     */
    public static final int NET_DVR_CHANGE_FORWARD = 10;

    /**
     * 码流改变为倒放
     */
    public static final int NET_DVR_CHANGE_REVERSE = 11;

    /**
     * 私有数据,包括智能信息
     */
    public static final int NET_DVR_PRIVATE_DATA = 112;


    /**
     * 码流数据回调接口
     */
    public interface RealDataCallBack_V30 extends Callback {
        /**
         * @param lRealHandle 当前的预览句柄
         * @param dwDataType  数据类型
         *                    <table>
         *                    <thead>
         *                    <tr><th>类型</th><th>值</th><th>含义</th></tr>
         *                    </thead>
         *                    <tbody>
         *                    <tr><td>NET_DVR_SYSHEAD</td><td>1</td><td>系统头数据</td></tr>
         *                    <tr><td>NET_DVR_STREAMDATA</td><td>2</td><td>流数据（包括复合流或音视频分开的视频流数据）</td></tr>
         *                    <tr><td>NET_DVR_AUDIOSTREAMDATA</td><td>3</td><td>音频数据</td></tr>
         *                    <tr><td>NET_DVR_PRIVATE_DATA</td><td>112</td><td>私有数据,包括智能信息</td></tr>
         *                    </tbody>
         *                    </table>
         * @param pBuffer     存放数据的缓冲区指针
         * @param dwBufSize   缓冲区大小
         * @param pUser       用户数据
         */
        void apply(int lRealHandle, int dwDataType, Pointer pBuffer, int dwBufSize, Pointer pUser);
    }

    /**
     * 返回最后操作的错误码。
     *
     * @return 返回值为错误码。错误码主要分为网络通讯库错误码、RTSP通讯库错误码和软硬解库错误码，详见下表。
     *         <p style="text-align:center"><b>网络通讯库错误码</b></p>
     *         <table>
     *         <thead>
     *         <tr><th>错误类型</th><th>错误值</th><th>错误信息</th></tr>
     *         </thead>
     *         <tbody>
     *         <tr><td>NET_DVR_NOERROR</td><td>0</td><td>没有错误。</td></tr>
     *         <tr><td>NET_DVR_PASSWORD_ERROR</td><td>1</td><td>用户名密码错误。注册时输入的用户名或者密码错误。</td></tr>
     *         <tr><td>NET_DVR_NOENOUGHPRI</td><td>2</td><td>权限不足。该注册用户没有权限执行当前对设备的操作，可以与远程用户参数配置做对比。</td></tr>
     *         <tr><td>NET_DVR_NOINIT</td><td>3</td><td>SDK未初始化。</td></tr>
     *         <tr><td>NET_DVR_CHANNEL_ERROR</td><td>4</td><td>通道号错误。设备没有对应的通道号。</td></tr>
     *         <tr><td>NET_DVR_OVER_MAXLINK</td><td>5</td><td>设备总的连接数超过最大。</td></tr>
     *         <tr><td>NET_DVR_VERSIONNOMATCH</td><td>6</td><td>版本不匹配。SDK和设备的版本不匹配。</td></tr>
     *         <tr><td>NET_DVR_NETWORK_FAIL_CONNECT</td><td>7</td><td>连接设备失败。设备不在线或网络原因引起的连接超时等。</td></tr>
     *         <tr><td>NET_DVR_NETWORK_SEND_ERROR</td><td>8</td><td>向设备发送失败。</td></tr>
     *         <tr><td>NET_DVR_NETWORK_RECV_ERROR</td><td>9</td><td>从设备接收数据失败。</td></tr>
     *         <tr><td>NET_DVR_NETWORK_RECV_TIMEOUT</td><td>10</td><td>从设备接收数据超时。</td></tr>
     *         <tr><td>NET_DVR_NETWORK_ERRORDATA</td><td>11</td><td>传送的数据有误。发送给设备或者从设备接收到的数据错误，如远程参数配置时输入设备不支持的值。</td></tr>
     *         <tr><td>NET_DVR_ORDER_ERROR</td><td>12</td><td>调用次序错误。</td></tr>
     *         <tr><td>NET_DVR_OPERNOPERMIT</td><td>13</td><td>无此权限。</td></tr>
     *         <tr><td>NET_DVR_COMMANDTIMEOUT</td><td>14</td><td>设备命令执行超时。</td></tr>
     *         <tr><td>NET_DVR_ERRORSERIALPORT</td><td>15</td><td>串口号错误。指定的设备串口号不存在。</td></tr>
     *         <tr><td>NET_DVR_ERRORALARMPORT</td><td>16</td><td>报警端口错误。指定的设备报警输出端口不存在。</td></tr>
     *         <tr><td>NET_DVR_PARAMETER_ERROR</td><td>17</td><td>参数错误。SDK接口中给入的输入或输出参数为空，或者参数格式或值不符合要求。</td></tr>
     *         <tr><td>NET_DVR_CHAN_EXCEPTION</td><td>18</td><td>设备通道处于错误状态</td></tr>
     *         <tr><td>NET_DVR_NODISK</td><td>19</td><td>设备无硬盘。当设备无硬盘时，对设备的录像文件、硬盘配置等操作失败。</td></tr>
     *         <tr><td>NET_DVR_ERRORDISKNUM</td><td>20</td><td>硬盘号错误。当对设备进行硬盘管理操作时，指定的硬盘号不存在时返回该错误。</td></tr>
     *         <tr><td>NET_DVR_DISK_FULL</td><td>21</td><td>设备硬盘满。</td></tr>
     *         <tr><td>NET_DVR_DISK_ERROR</td><td>22</td><td>设备硬盘出错</td></tr>
     *         <tr><td>NET_DVR_NOSUPPORT</td><td>23</td><td>设备不支持。</td></tr>
     *         <tr><td>NET_DVR_BUSY</td><td>24</td><td>设备忙。</td></tr>
     *         <tr><td>NET_DVR_MODIFY_FAIL</td><td>25</td><td>设备修改不成功。</td></tr>
     *         <tr><td>NET_DVR_PASSWORD_FORMAT_ERROR</td><td>26</td><td>密码输入格式不正确</td></tr>
     *         <tr><td>NET_DVR_DISK_FORMATING</td><td>27</td><td>硬盘正在格式化，不能启动操作。</td></tr>
     *         <tr><td>NET_DVR_DVRNORESOURCE</td><td>28</td><td>设备资源不足。</td></tr>
     *         <tr><td>NET_DVR_DVROPRATEFAILED</td><td>29</td><td>设备操作失败。</td></tr>
     *         <tr><td>NET_DVR_OPENHOSTSOUND_FAIL</td><td>30</td><td>语音对讲、语音广播操作中采集本地音频或打开音频输出失败。</td></tr>
     *         <tr><td>NET_DVR_DVRVOICEOPENED</td><td>31</td><td>设备语音对讲被占用。</td></tr>
     *         <tr><td>NET_DVR_TIMEINPUTERROR</td><td>32</td><td>时间输入不正确。</td></tr>
     *         <tr><td>NET_DVR_NOSPECFILE</td><td>33</td><td>回放时设备没有指定的文件。</td></tr>
     *         <tr><td>NET_DVR_CREATEFILE_ERROR</td><td>34</td><td>创建文件出错。本地录像、保存图片、获取配置文件和远程下载录像时创建文件失败。</td></tr>
     *         <tr><td>NET_DVR_FILEOPENFAIL</td><td>35</td><td>打开文件出错。设置配置文件、设备升级、上传审讯文件时打开文件失败。</td></tr>
     *         <tr><td>NET_DVR_OPERNOTFINISH</td><td>36</td><td>上次的操作还没有完成。</td></tr>
     *         <tr><td>NET_DVR_GETPLAYTIMEFAIL</td><td>37</td><td>获取当前播放的时间出错。</td></tr>
     *         <tr><td>NET_DVR_PLAYFAIL</td><td>38</td><td>播放出错。</td></tr>
     *         <tr><td>NET_DVR_FILEFORMAT_ERROR</td><td>39</td><td>文件格式不正确。</td></tr>
     *         <tr><td>NET_DVR_DIR_ERROR</td><td>40</td><td>路径错误</td></tr>
     *         <tr><td>NET_DVR_ALLOC_RESOURCE_ERROR</td><td>41</td><td>SDK资源分配错误。</td></tr>
     *         <tr><td>NET_DVR_AUDIO_MODE_ERROR</td><td>42</td><td>声卡模式错误。当前打开声音播放模式与实际设置的模式不符出错。</td></tr>
     *         <tr><td>NET_DVR_NOENOUGH_BUF</td><td>43</td><td>缓冲区太小。接收设备数据的缓冲区或存放图片缓冲区不足。</td></tr>
     *         <tr><td>NET_DVR_CREATESOCKET_ERROR</td><td>44</td><td>创建SOCKET出错。</td></tr>
     *         <tr><td>NET_DVR_SETSOCKET_ERROR</td><td>45</td><td>设置SOCKET出错。</td></tr>
     *         <tr><td>NET_DVR_MAX_NUM</td><td>46</td><td>个数达到最大。分配的注册连接数、预览连接数超过SDK支持的最大数。</td></tr>
     *         <tr><td>NET_DVR_USERNOTEXIST</td><td>47</td><td>用户不存在。注册的用户ID已注销或不可用。</td></tr>
     *         <tr><td>NET_DVR_WRITEFLASHERROR</td><td>48</td><td>写FLASH出错。设备升级时写FLASH失败。</td></tr>
     *         <tr><td>NET_DVR_UPGRADEFAIL</td><td>49</td><td>设备升级失败。网络或升级文件语言不匹配等原因升级失败。</td></tr>
     *         <tr><td>NET_DVR_CARDHAVEINIT</td><td>50</td><td>解码卡已经初始化过。</td></tr>
     *         <tr><td>NET_DVR_PLAYERFAILED</td><td>51</td><td>调用播放库中某个函数失败。</td></tr>
     *         <tr><td>NET_DVR_MAX_USERNUM</td><td>52</td><td>登录设备的用户数达到最大。</td></tr>
     *         <tr><td>NET_DVR_GETLOCALIPANDMACFAIL</td><td>53</td><td>获得本地PC的IP地址或物理地址失败。</td></tr>
     *         <tr><td>NET_DVR_NOENCODEING</td><td>54</td><td>设备该通道没有启动编码。</td></tr>
     *         <tr><td>NET_DVR_IPMISMATCH</td><td>55</td><td>IP地址不匹配。</td></tr>
     *         <tr><td>NET_DVR_MACMISMATCH</td><td>56</td><td>MAC地址不匹配。</td></tr>
     *         <tr><td>NET_DVR_UPGRADELANGMISMATCH</td><td>57</td><td>升级文件语言不匹配。</td></tr>
     *         <tr><td>NET_DVR_MAX_PLAYERPORT</td><td>58</td><td>播放器路数达到最大。</td></tr>
     *         <tr><td>NET_DVR_NOSPACEBACKUP</td><td>59</td><td>备份设备中没有足够空间进行备份。</td></tr>
     *         <tr><td>NET_DVR_NODEVICEBACKUP</td><td>60</td><td>没有找到指定的备份设备。</td></tr>
     *         <tr><td>NET_DVR_PICTURE_BITS_ERROR</td><td>61</td><td>图像素位数不符，限24色。</td></tr>
     *         <tr><td>NET_DVR_PICTURE_DIMENSION_ERROR</td><td>62</td><td>图片高*宽超限，限128*256。</td></tr>
     *         <tr><td>NET_DVR_PICTURE_SIZ_ERROR</td><td>63</td><td>图片大小超限，限100K。</td></tr>
     *         <tr><td>NET_DVR_LOADPLAYERSDKFAILED</td><td>64</td><td>载入当前目录下Player Sdk出错。</td></tr>
     *         <tr><td>NET_DVR_LOADPLAYERSDKPROC_ERROR</td><td>65</td><td>找不到Player Sdk中某个函数入口。</td></tr>
     *         <tr><td>NET_DVR_LOADDSSDKFAILED</td><td>66</td><td>载入当前目录下DSsdk出错。</td></tr>
     *         <tr><td>NET_DVR_LOADDSSDKPROC_ERROR</td><td>67</td><td>找不到DsSdk中某个函数入口。</td></tr>
     *         <tr><td>NET_DVR_DSSDK_ERROR</td><td>68</td><td>调用硬解码库DsSdk中某个函数失败。</td></tr>
     *         <tr><td>NET_DVR_VOICEMONOPOLIZE</td><td>69</td><td>声卡被独占。</td></tr>
     *         <tr><td>NET_DVR_JOINMULTICASTFAILED</td><td>70</td><td>加入多播组失败。</td></tr>
     *         <tr><td>NET_DVR_CREATEDIR_ERROR</td><td>71</td><td>建立日志文件目录失败。</td></tr>
     *         <tr><td>NET_DVR_BINDSOCKET_ERROR</td><td>72</td><td>绑定套接字失败。</td></tr>
     *         <tr><td>NET_DVR_SOCKETCLOSE_ERROR</td><td>73</td><td>socket连接中断，此错误通常是由于连接中断或目的地不可达。</td></tr>
     *         <tr><td>NET_DVR_USERID_ISUSING</td><td>74</td><td>注销时用户ID正在进行某操作。</td></tr>
     *         <tr><td>NET_DVR_SOCKETLISTEN_ERROR</td><td>75</td><td>监听失败。</td></tr>
     *         <tr><td>NET_DVR_PROGRAM_EXCEPTION</td><td>76</td><td>程序异常。</td></tr>
     *         <tr><td>NET_DVR_WRITEFILE_FAILED</td><td>77</td><td>写文件失败。本地录像、远程下载录像、下载图片等操作时写文件失败。</td></tr>
     *         <tr><td>NET_DVR_FORMAT_READONLY</td><td>78</td><td>禁止格式化只读硬盘。</td></tr>
     *         <tr><td>NET_DVR_WITHSAMEUSERNAME</td><td>79</td><td>远程用户配置结构中存在相同的用户名。</td></tr>
     *         <tr><td>NET_DVR_DEVICETYPE_ERROR</td><td>80</td><td>导入参数时设备型号不匹配。</td></tr>
     *         <tr><td>NET_DVR_LANGUAGE_ERROR</td><td>81</td><td>导入参数时语言不匹配。</td></tr>
     *         <tr><td>NET_DVR_PARAVERSION_ERROR</td><td>82</td><td>导入参数时软件版本不匹配。</td></tr>
     *         <tr><td>NET_DVR_IPCHAN_NOTALIVE</td><td>83</td><td>预览时外接IP通道不在线。</td></tr>
     *         <tr><td>NET_DVR_RTSP_SDK_ERROR</td><td>84</td><td>加载标准协议通讯库StreamTransClient失败。</td></tr>
     *         <tr><td>NET_DVR_CONVERT_SDK_ERROR</td><td>85</td><td>加载转封装库失败。</td></tr>
     *         <tr><td>NET_DVR_IPC_COUNT_OVERFLOW</td><td>86</td><td>超出最大的IP接入通道数。</td></tr>
     *         <tr><td>NET_DVR_MAX_ADD_NUM</td><td>87</td><td>添加录像标签或者其他操作超出最多支持的个数。</td></tr>
     *         <tr><td>NET_DVR_PARAMMODE_ERROR</td><td>88</td><td>图像增强仪，参数模式错误（用于硬件设置时，客户端进行软件设置时错误值）。</td></tr>
     *         <tr><td>NET_DVR_CODESPITTER_OFFLINE</td><td>89</td><td>码分器不在线。</td></tr>
     *         <tr><td>NET_DVR_BACKUP_COPYING</td><td>90</td><td>设备正在备份。</td></tr>
     *         <tr><td>NET_DVR_CHAN_NOTSUPPORT</td><td>91</td><td>通道不支持该操作。</td></tr>
     *         <tr><td>NET_DVR_CALLINEINVALID</td><td>92</td><td>高度线位置太集中或长度线不够倾斜。</td></tr>
     *         <tr><td>NET_DVR_CALCANCELCONFLICT</td><td>93</td><td>取消标定冲突，如果设置了规则及全局的实际大小尺寸过滤。</td></tr>
     *         <tr><td>NET_DVR_CALPOINTOUTRANGE</td><td>94</td><td>标定点超出范围。</td></tr>
     *         <tr><td>NET_DVR_FILTERRECTINVALID</td><td>95</td><td>尺寸过滤器不符合要求。</td></tr>
     *         <tr><td>NET_DVR_DDNS_DEVOFFLINE</td><td>96</td><td>设备没有注册到ddns上。</td></tr>
     *         <tr><td>NET_DVR_DDNS_INTER_ERROR</td><td>97</td><td>DDNS 服务器内部错误。</td></tr>
     *         <tr><td>NET_DVR_ALIAS_DUPLICATE</td><td>150</td><td>别名重复（EasyDDNS的配置）</td></tr>
     *         <tr><td>NET_DVR_DEV_NET_OVERFLOW</td><td>800</td><td>网络流量超过设备能力上限</td></tr>
     *         <tr><td>NET_DVR_STATUS_RECORDFILE_WRITING_NOT_LOCK</td><td>801</td><td>录像文件在录像，无法被锁定</td></tr>
     *         <tr><td>NET_DVR_STATUS_CANT_FORMAT_LITTLE_DISK</td><td>802</td><td>由于硬盘太小无法格式化</td></tr>
     *         </tbody>
     *         </table>
     *         <p style="text-align:center"><b>RTSP通讯库错误码</b></p>
     *         <table>
     *         <thead>
     *         <tr><th>错误类型</th><th>错误值</th><th>错误信息</th></tr>
     *         </thead>
     *         <tbody>
     *         <tr><td>NET_DVR_RTSP_ERROR_NOENOUGHPRI</td><td>401</td><td>无权限：服务器返回401时，转成这个错误码</td></tr>
     *         <tr><td>NET_DVR_RTSP_ERROR_ALLOC_RESOURCE</td><td>402</td><td>分配资源失败</td></tr>
     *         <tr><td>NET_DVR_RTSP_ERROR_PARAMETER</td><td>403</td><td>参数错误</td></tr>
     *         <tr><td>NET_DVR_RTSP_ERROR_FORCE_STOP</td><td>406</td><td>用户中途强行退出</td></tr>
     *         <tr><td>NET_DVR_RTSP_GETPORTFAILED</td><td>407</td><td>获取RTSP端口错误</td></tr>
     *         <tr><td>NET_DVR_RTSP_DESCRIBERROR</td><td>410</td><td>RTSP DECRIBE交互错误</td></tr>
     *         <tr><td>NET_DVR_RTSP_DESCRIBESENDTIMEOUT</td><td>411</td><td>RTSP DECRIBE发送超时</td></tr>
     *         <tr><td>NET_DVR_RTSP_DESCRIBESENDERROR</td><td>412</td><td>RTSP DECRIBE发送失败</td></tr>
     *         <tr><td>NET_DVR_RTSP_DESCRIBERECVTIMEOUT</td><td>413</td><td>RTSP DECRIBE接收超时</td></tr>
     *         <tr><td>NET_DVR_RTSP_DESCRIBERECVDATALOST</td><td>414</td><td>RTSP DECRIBE接收数据错误</td></tr>
     *         <tr><td>NET_DVR_RTSP_DESCRIBERECVERROR</td><td>415</td><td>RTSP DECRIBE接收失败</td></tr>
     *         <tr><td>NET_DVR_RTSP_DESCRIBESERVERERR</td><td>416</td><td>RTSP DECRIBE服务器返回401,501等错误</td></tr>
     *         <tr><td>NET_DVR_RTSP_SETUPSENDTIMEOUT</td><td>421</td><td>RTSP SETUP发送超时</td></tr>
     *         <tr><td>NET_DVR_RTSP_SETUPSENDERROR</td><td>422</td><td>RTSP SETUP发送错误</td></tr>
     *         <tr><td>NET_DVR_RTSP_SETUPRECVTIMEOUT</td><td>423</td><td>RTSP SETUP接收超时</td></tr>
     *         <tr><td>NET_DVR_RTSP_SETUPRECVDATALOST</td><td>424</td><td>RTSP SETUP接收数据错误</td></tr>
     *         <tr><td>NET_DVR_RTSP_SETUPRECVERROR</td><td>425</td><td>RTSP SETUP接收失败</td></tr>
     *         <tr><td>NET_DVR_RTSP_OVER_MAX_CHAN</td><td>426</td><td>设备超过最大连接数</td></tr>
     *         <tr><td>NET_DVR_RTSP_PLAYSENDTIMEOUT</td><td>431</td><td>RTSP PLAY发送超时</td></tr>
     *         <tr><td>NET_DVR_RTSP_PLAYSENDERROR</td><td>432</td><td>RTSP PLAY发送错误</td></tr>
     *         <tr><td>NET_DVR_RTSP_PLAYRECVTIMEOUT</td><td>433</td><td>RTSP PLAT接收超时</td></tr>
     *         <tr><td>NET_DVR_RTSP_PLAYRECVDATALOST</td><td>434</td><td>RTSP PLAY接收数据错误</td></tr>
     *         <tr><td>NET_DVR_RTSP_PLAYRECVERROR</td><td>435</td><td>RTSP PLAY接收失败</td></tr>
     *         <tr><td>NET_DVR_RTSP_PLAYSERVERERR</td><td>436</td><td>RTSP PLAY设备返回错误状态</td></tr>
     *         <tr><td>NET_DVR_RTSP_TEARDOWNSENDTIMEOUT</td><td>441</td><td>RTSP TEARDOWN发送超时</td></tr>
     *         <tr><td>NET_DVR_RTSP_TEARDOWNSENDERROR</td><td>442</td><td>RTSP TEARDOWN发送错误</td></tr>
     *         <tr><td>NET_DVR_RTSP_TEARDOWNRECVTIMEOUT</td><td>443</td><td>RTSP TEARDOWN接收超时</td></tr>
     *         <tr><td>NET_DVR_RTSP_TEARDOWNRECVDATALOST</td><td>444</td><td>RTSP TEARDOWN接收数据错误</td></tr>
     *         <tr><td>NET_DVR_RTSP_TEARDOWNRECVERROR</td><td>445</td><td>RTSP TEARDOWN接收失败</td></tr>
     *         <tr><td>NET_DVR_RTSP_TEARDOWNSERVERERR</td><td>446</td><td>RTSP TEARDOWN设备返回错误状态</td></tr>
     *         <p/>
     *         </tbody>
     *         </table>
     */
    int NET_DVR_GetLastError();

    /**
     * 初始化SDK，调用其他SDK函数的前提。
     *
     * @return <a href="#TRUE">TRUE</a>表示成功，<a href="#FALSE">FALSE</a>表示失败。
     *         获取错误码调用<a href="#NET_DVR_GetLastError">NET_DVR_GetLastError</a>
     *         <p style="text-align:center"><b>以下是该接口可能返回的错误值</b></p>
     *         <table>
     *         <thead>
     *         <tr><th>错误类型</th><th>错误值</th><th>错误信息</th></tr>
     *         </thead>
     *         <tbody>
     *         <tr><td>NET_DVR_NOERROR</td><td>0</td><td>没有错误。</td></tr>
     *         <tr><td>NET_DVR_ALLOC_RESOURCE_ERROR</td><td>41</td><td>SDK资源分配错误。</td></tr>
     *         <tr><td>NET_DVR_GETLOCALIPANDMACFAIL</td><td>53</td><td>获得本地PC的IP地址或物理地址失败。</td></tr>
     *         </tbody>
     *         </table>
     * @see #NET_DVR_Cleanup
     */
    int NET_DVR_Init();

    /**
     * 释放SDK资源，在程序结束之前调用。
     *
     * @return <a href="#TRUE">TRUE</a>表示成功，<a href="#FALSE">FALSE</a>表示失败。
     *         获取错误码调用<a href="#NET_DVR_GetLastError">NET_DVR_GetLastError</a>
     * @see #NET_DVR_Init
     */
    int NET_DVR_Cleanup();

    /**
     * 用户注册设备。
     * <p>如DS-7116、DS-81xx、DS-90xx、DS-91xx等系列设备允许有32个注册用户名，且同时最多允许128个用户注册；
     * 如DS-80xx等设备允许有16个注册用户名，且同时最多允许128个用户注册。</p>
     * <p>SDK支持512个注册，返回UserID逐一递增，从0到511之后又返回0，注销以及NET_DVR_Cleanup均没有初始化为0。</p>
     * <p>客户端发生异常离线时，设备端保留用户ID的有效时间是5分钟。</p>
     *
     * @param sDVRIP       设备IP地址
     * @param wDVRPort     设备端口号
     * @param sUserName    登录的用户名
     * @param sPassword    用户密码
     * @param lpDeviceInfo [out] 设备信息
     * @return -1表示失败，其他值表示返回的用户ID值。
     *         该用户ID具有唯一性，后续对设备的操作都需要通过此ID实现。
     *         获取错误码调用<a href="#NET_DVR_GetLastError">NET_DVR_GetLastError</a>
     *         <p style="text-align:center"><b>以下是该接口可能返回的错误值</b></p>
     *         <table>
     *         <thead>
     *         <tr><th>错误类型</th><th>错误值</th><th>错误信息</th></tr>
     *         </thead>
     *         <tbody>
     *         <tr><td>NET_DVR_NOERROR</td><td>0</td><td>没有错误。</td></tr>
     *         <tr><td>NET_DVR_PASSWORD_ERROR</td><td>1</td><td>用户名密码错误。注册时输入的用户名或者密码错误。</td></tr>
     *         <tr><td>NET_DVR_NOINIT</td><td>3</td><td>SDK未初始化。</td></tr>
     *         <tr><td>NET_DVR_NETWORK_FAIL_CONNECT</td><td>7</td><td>连接设备失败。设备不在线或网络原因引起的连接超时等。</td></tr>
     *         <tr><td>NET_DVR_NETWORK_SEND_ERROR</td><td>8</td><td>向设备发送失败。</td></tr>
     *         <tr><td>NET_DVR_NETWORK_RECV_ERROR</td><td>9</td><td>从设备接收数据失败。</td></tr>
     *         <tr><td>NET_DVR_NETWORK_RECV_TIMEOUT</td><td>10</td><td>从设备接收数据超时。</td></tr>
     *         <tr><td>NET_DVR_COMMANDTIMEOUT</td><td>14</td><td>设备命令执行超时。</td></tr>
     *         <tr><td>NET_DVR_PARAMETER_ERROR</td><td>17</td><td>参数错误。SDK接口中给入的输入或输出参数为空。</td></tr>
     *         <tr><td>NET_DVR_ALLOC_RESOURCE_ERROR</td><td>41</td><td>SDK资源分配错误。</td></tr>
     *         <tr><td>NET_DVR_NOENOUGH_BUF</td><td>43</td><td>缓冲区太小。接收设备数据的缓冲区或存放图片缓冲区不足。</td></tr>
     *         <tr><td>NET_DVR_CREATESOCKET_ERROR</td><td>44</td><td>创建SOCKET出错。</td></tr>
     *         <tr><td>NET_DVR_MAX_NUM</td><td>46</td><td>个数达到最大。分配的注册连接数、预览连接数超过SDK支持的最大数。</td></tr>
     *         <tr><td>NET_DVR_MAX_USERNUM</td><td>52</td><td>登录设备的用户数达到最大。</td></tr>
     *         <tr><td>NET_DVR_BINDSOCKET_ERROR</td><td>72</td><td>绑定套接字失败。</td></tr>
     *         <tr><td>NET_DVR_SOCKETCLOSE_ERROR</td><td>73</td><td>socket连接中断，此错误通常是由于连接中断或目的地不可达。</td></tr>
     *         </tbody>
     *         </table>
     * @see #NET_DVR_Logout_V30
     */
    int NET_DVR_Login_V30(String sDVRIP, short wDVRPort, String sUserName, String sPassword, LPNET_DVR_DEVICEINFO_V30_struct lpDeviceInfo);

    /**
     * 用户注销。
     * <p>该接口强制停止该用户的所有操作和释放所有的资源，确保该ID对应的线程都安全退出，资源得到释放。
     * 建议使用NET_DVR_Logout接口实现注销功能。</p>
     *
     * @param lUserID 用户ID号，<a href="#NET_DVR_Login_V30">NET_DVR_Login_V30</a>的返回值
     * @return <a href="#TRUE">TRUE</a>表示成功，<a href="#FALSE">FALSE</a>表示失败。
     *         获取错误码调用<a href="#NET_DVR_GetLastError">NET_DVR_GetLastError</a>
     *         <p style="text-align:center"><b>以下是该接口可能返回的错误值</b></p>
     *         <table>
     *         <thead>
     *         <tr><th>错误类型</th><th>错误值</th><th>错误信息</th></tr>
     *         </thead>
     *         <tbody>
     *         <tr><td>NET_DVR_NOERROR</td><td>0</td><td>没有错误。</td></tr>
     *         <tr><td>NET_DVR_NOINIT</td><td>3</td><td>SDK未初始化。</td></tr>
     *         <tr><td>NET_DVR_NETWORK_FAIL_CONNECT</td><td>7</td><td>连接设备失败。设备不在线或网络原因引起的连接超时等。</td></tr>
     *         <tr><td>NET_DVR_NETWORK_SEND_ERROR</td><td>8</td><td>向设备发送失败。</td></tr>
     *         <tr><td>NET_DVR_NETWORK_RECV_ERROR</td><td>9</td><td>从设备接收数据失败。</td></tr>
     *         <tr><td>NET_DVR_NETWORK_RECV_TIMEOUT</td><td>10</td><td>从设备接收数据超时。</td></tr>
     *         <tr><td>NET_DVR_COMMANDTIMEOUT</td><td>14</td><td>设备命令执行超时。</td></tr>
     *         <tr><td>NET_DVR_PARAMETER_ERROR</td><td>17</td><td>参数错误。SDK接口中给入的输入或输出参数为空。</td></tr>
     *         <tr><td>NET_DVR_ALLOC_RESOURCE_ERROR</td><td>41</td><td>SDK资源分配错误。</td></tr>
     *         <tr><td>NET_DVR_CREATESOCKET_ERROR</td><td>44</td><td>创建SOCKET出错。</td></tr>
     *         <tr><td>NET_DVR_USERNOTEXIST</td><td>47</td><td>用户不存在。注册的用户ID已注销或不可用。</td></tr>
     *         <tr><td>NET_DVR_BINDSOCKET_ERROR</td><td>72</td><td>绑定套接字失败。</td></tr>
     *         <tr><td>NET_DVR_SOCKETCLOSE_ERROR</td><td>73</td><td>socket连接中断，此错误通常是由于连接中断或目的地不可达。</td></tr>
     *         </tbody>
     *         </table>
     * @see #NET_DVR_Login_V30
     */
    int NET_DVR_Logout_V30(int lUserID);

    /**
     * 用户注销。
     * <p>建议使用此接口实现注销功能。</p>
     *
     * @param lUserID 用户ID号，<a href="#NET_DVR_Login_V30">NET_DVR_Login_V30</a>的返回值
     * @return <a href="#TRUE">TRUE</a>表示成功，<a href="#FALSE">FALSE</a>表示失败。
     *         获取错误码调用<a href="#NET_DVR_GetLastError">NET_DVR_GetLastError</a>
     *         <p style="text-align:center"><b>以下是该接口可能返回的错误值</b></p>
     *         <table>
     *         <thead>
     *         <tr><th>错误类型</th><th>错误值</th><th>错误信息</th></tr>
     *         </thead>
     *         <tbody>
     *         <tr><td>NET_DVR_NOERROR</td><td>0</td><td>没有错误。</td></tr>
     *         <tr><td>NET_DVR_NOINIT</td><td>3</td><td>SDK未初始化。</td></tr>
     *         <tr><td>NET_DVR_NETWORK_FAIL_CONNECT</td><td>7</td><td>连接设备失败。设备不在线或网络原因引起的连接超时等。</td></tr>
     *         <tr><td>NET_DVR_NETWORK_SEND_ERROR</td><td>8</td><td>向设备发送失败。</td></tr>
     *         <tr><td>NET_DVR_NETWORK_RECV_ERROR</td><td>9</td><td>从设备接收数据失败。</td></tr>
     *         <tr><td>NET_DVR_NETWORK_RECV_TIMEOUT</td><td>10</td><td>从设备接收数据超时。</td></tr>
     *         <tr><td>NET_DVR_COMMANDTIMEOUT</td><td>14</td><td>设备命令执行超时。</td></tr>
     *         <tr><td>NET_DVR_PARAMETER_ERROR</td><td>17</td><td>参数错误。SDK接口中给入的输入或输出参数为空。</td></tr>
     *         <tr><td>NET_DVR_ALLOC_RESOURCE_ERROR</td><td>41</td><td>SDK资源分配错误。</td></tr>
     *         <tr><td>NET_DVR_CREATESOCKET_ERROR</td><td>44</td><td>创建SOCKET出错。</td></tr>
     *         <tr><td>NET_DVR_USERNOTEXIST</td><td>47</td><td>用户不存在。注册的用户ID已注销或不可用。</td></tr>
     *         <tr><td>NET_DVR_BINDSOCKET_ERROR</td><td>72</td><td>绑定套接字失败。</td></tr>
     *         <tr><td>NET_DVR_SOCKETCLOSE_ERROR</td><td>73</td><td>socket连接中断，此错误通常是由于连接中断或目的地不可达。</td></tr>
     *         </tbody>
     *         </table>
     * @see #NET_DVR_Login_V30
     */
    int NET_DVR_Logout(int lUserID);

    /**
     * 实时预览。
     * <p>该接口中可以设置当前预览操作是否阻塞（通过bBlocked参数设置）。
     * 若设为不阻塞，表示发起与设备的连接就认为连接成功，如果发生码流接收失败、播放失败等情况以预览异常的方式通知上层。
     * 在循环播放的时候可以减短停顿的时间，与NET_DVR_RealPlay处理一致。 若设为阻塞，表示直到播放操作完成才返回成功与否。</p>
     * <p>该接口中的回调函数可以置为空，这样该函数将不回调码流数据给用户，不过用户仍可以通过接口NET_DVR_SetRealDataCallBack
     * 或NET_DVR_SetStandardDataCallBack注册捕获码流数据的回调函数以捕获码流数据。</p>
     * <p>客户端异常离线时，设备端对取流连接的保持时间为10秒。</p>
     *
     * @param lUserID               NET_DVR_Login_V30的返回值
     * @param lpClientInfo          预览参数
     * @param fRealDataCallBack_V30 码流数据回调函数
     * @param pUser                 用户数据
     * @param bBlocked              请求码流过程是否阻塞：0－否；1－是
     * @return -1表示失败，其他值作为<a href="#NET_DVR_StopRealPlay">NET_DVR_StopRealPlay</a>等函数的句柄参数。
     *         获取错误码调用<a href="#NET_DVR_GetLastError">NET_DVR_GetLastError</a>
     *         <p style="text-align:center"><b>以下是该接口可能返回的错误值</b></p>
     *         <table>
     *         <thead>
     *         <tr><th>错误类型</th><th>错误值</th><th>错误信息</th></tr>
     *         </thead>
     *         <tbody>
     *         <tr><td>NET_DVR_NOERROR</td><td>0</td><td>没有错误。</td></tr>
     *         <tr><td>NET_DVR_PASSWORD_ERROR</td><td>1</td><td>用户名密码错误。注册时输入的用户名或者密码错误。</td></tr>
     *         <tr><td>NET_DVR_NOINIT</td><td>3</td><td>SDK未初始化。</td></tr>
     *         <tr><td>NET_DVR_OVER_MAXLINK</td><td>5</td><td>连接到设备的用户个数超过最大。</td></tr>
     *         <tr><td>NET_DVR_NETWORK_FAIL_CONNECT</td><td>7</td><td>连接设备失败。设备不在线或网络原因引起的连接超时等。</td></tr>
     *         <tr><td>NET_DVR_NETWORK_SEND_ERROR</td><td>8</td><td>向设备发送失败。</td></tr>
     *         <tr><td>NET_DVR_NETWORK_RECV_ERROR</td><td>9</td><td>从设备接收数据失败。</td></tr>
     *         <tr><td>NET_DVR_NETWORK_RECV_TIMEOUT</td><td>10</td><td>从设备接收数据超时。</td></tr>
     *         <tr><td>NET_DVR_COMMANDTIMEOUT</td><td>14</td><td>设备命令执行超时。</td></tr>
     *         <tr><td>NET_DVR_PARAMETER_ERROR</td><td>17</td><td>参数错误。SDK接口中给入的输入或输出参数为空。</td></tr>
     *         <tr><td>NET_DVR_ALLOC_RESOURCE_ERROR</td><td>41</td><td>SDK资源分配错误。</td></tr>
     *         <tr><td>NET_DVR_NOENOUGH_BUF</td><td>43</td><td>缓冲区太小。接收设备数据的缓冲区或存放图片缓冲区不足。</td></tr>
     *         <tr><td>NET_DVR_CREATESOCKET_ERROR</td><td>44</td><td>创建SOCKET出错。</td></tr>
     *         <tr><td>NET_DVR_USERNOTEXIST</td><td>47</td><td>用户不存在。注册的用户ID已注销或不可用。</td></tr>
     *         <tr><td>NET_DVR_LOADPLAYERSDKFAILED</td><td>64</td><td>载入当前目录下Player Sdk出错。</td></tr>
     *         <tr><td>NET_DVR_LOADPLAYERSDKPROC_ERROR</td><td>65</td><td>找不到Player Sdk中某个函数入口。</td></tr>
     *         <tr><td>NET_DVR_LOADDSSDKFAILED</td><td>66</td><td>载入当前目录下DSsdk出错。</td></tr>
     *         <tr><td>NET_DVR_BINDSOCKET_ERROR</td><td>72</td><td>绑定套接字失败。</td></tr>
     *         <tr><td>NET_DVR_SOCKETCLOSE_ERROR</td><td>73</td><td>socket连接中断，此错误通常是由于连接中断或目的地不可达。</td></tr>
     *         <tr><td>NET_DVR_IPCHAN_NOTALIVE</td><td>83</td><td>预览时外接IP通道不在线。</td></tr>
     *         <tr><td>NET_DVR_RTSP_SDK_ERROR</td><td>84</td><td>加载标准协议通讯库StreamTransClient失败。</td></tr>
     *         <tr><td>NET_DVR_CONVERT_SDK_ERROR</td><td>85</td><td>加载转封装库失败。</td></tr>
     *         </tbody>
     *         </table>
     * @see #NET_DVR_StopRealPlay
     */
    int NET_DVR_RealPlay_V30(int lUserID, LPNET_DVR_CLIENTINFO_struct lpClientInfo, RealDataCallBack_V30 fRealDataCallBack_V30, Pointer pUser, int bBlocked);

    /**
     * 停止预览。
     *
     * @param lRealHandle 预览句柄，<a href="#NET_DVR_RealPlay_V30">NET_DVR_RealPlay_V30</a>的返回值
     *                    <p>推模式：预览句柄lStreamHandle，由NET_DVR_SetPreviewResponseCallBack注册的回调函数返回。</p>
     * @return <a href="#TRUE">TRUE</a>表示成功，<a href="#FALSE">FALSE</a>表示失败。
     *         获取错误码调用<a href="#NET_DVR_GetLastError">NET_DVR_GetLastError</a>
     *         <p style="text-align:center"><b>以下是该接口可能返回的错误值</b></p>
     *         <table>
     *         <thead>
     *         <tr><th>错误类型</th><th>错误值</th><th>错误信息</th></tr>
     *         </thead>
     *         <tbody>
     *         <tr><td>NET_DVR_NOERROR</td><td>0</td><td>没有错误。</td></tr>
     *         <tr><td>NET_DVR_NOINIT</td><td>3</td><td>SDK未初始化。</td></tr>
     *         <tr><td>NET_DVR_ORDER_ERROR</td><td>12</td><td>调用次序错误。</td></tr>
     *         <tr><td>NET_DVR_PARAMETER_ERROR</td><td>17</td><td>参数错误。SDK接口中给入的输入或输出参数为空。</td></tr>
     *         <tr><td>NET_DVR_ALLOC_RESOURCE_ERROR</td><td>41</td><td>SDK资源分配错误。</td></tr>
     *         <tr><td>NET_DVR_LOADDSSDKPROC_ERROR</td><td>67</td><td>找不到DsSdk中某个函数入口。</td></tr>
     *         <tr><td>NET_DVR_DSSDK_ERROR</td><td>68</td><td>调用硬解码库DsSdk中某个函数失败。</td></tr>
     *         <tr><td>NET_DVR_LOADPLAYERSDKPROC_ERROR</td><td>65</td><td>找不到Player Sdk中某个函数入口。</td></tr>
     *         </tbody>
     *         </table>
     * @see #NET_DVR_RealPlay_V30
     */
    int NET_DVR_StopRealPlay(int lRealHandle);
}
