package com.dahua.netsdk.linux;

import com.dahua.netsdk.def.DH_RealPlayType;
import com.dahua.netsdk.linux.callback.*;
import com.sun.jna.*;
import com.sun.jna.ptr.IntByReference;

/**
 * 大华的Linux版本设备网络SDK封装库
 */
@SuppressWarnings("UnusedDeclaration")
public interface DahuaNetSDKLibrary extends Library {
    public static final String JNA_LIBRARY_NAME = "dhnetsdk";

    public static final NativeLibrary JNA_NATIVE_LIB =
            NativeLibrary.getInstance(DahuaNetSDKLibrary.JNA_LIBRARY_NAME);

    public static final DahuaNetSDKLibrary INSTANCE = (DahuaNetSDKLibrary) Native.loadLibrary(
            DahuaNetSDKLibrary.JNA_LIBRARY_NAME, DahuaNetSDKLibrary.class);

    public static final int NULL = 0;
    public static final int TRUE = 1;
    public static final int FALSE = 0;

    public static final int MAX_PATH = 260;

    /**
     * 设备序列号字符长度
     */
    public static final int DH_SERIALNO_LEN = 48;

    /**
     * 返回函数执行失败代码，当调用SDK接口失败时，可以用该函数获取失败的代码，具体错误代码参见下表
     * <table>
     * <thead>
     * <tr><th>类型</th><th>数值</th><th>代表含义</th></tr>
     * </thead>
     * <tbody>
     * <tr><td>NET_NOERROR</td><td>0</td><td>没有错误</td></tr>
     * <tr><td>NET_ERROR</td><td>-1</td><td>未知错误</td></tr>
     * <tr><td>NET_SYSTEM_ERROR</td><td>(0x80000000|1)</td><td>Windows系统出错</td></tr>
     * <tr><td>NET_NETWORK_ERROR</td><td>(0x80000000|2)</td><td>网络错误</td></tr>
     * <tr><td>NET_DEV_VER_NOMATCH</td><td>(0x80000000|3)</td><td>设备协议不匹配</td></tr>
     * <tr><td>NET_INVALID_HANDLE</td><td>(0x80000000|4)</td><td>句柄无效</td></tr>
     * <tr><td>NET_OPEN_CHANNEL_ERROR</td><td>(0x80000000|5)</td><td>打开通道失败</td></tr>
     * <tr><td>NET_CLOSE_CHANNEL_ERROR</td><td>(0x80000000|6)</td><td>关闭通道失败</td></tr>
     * <tr><td>NET_ILLEGAL_PARAM</td><td>(0x80000000|7)</td><td>用户参数不合法</td></tr>
     * <tr><td>NET_SDK_INIT_ERROR</td><td>(0x80000000|8)</td><td>SDK初始化出错</td></tr>
     * <tr><td>NET_SDK_UNINIT_ERROR</td><td>(0x80000000|9)</td><td>SDK清理出错</td></tr>
     * <tr><td>NET_RENDER_OPEN_ERROR</td><td>(0x80000000|10)</td><td>申请render资源出错</td></tr>
     * <tr><td>NET_DEC_OPEN_ERROR</td><td>(0x80000000|11)</td><td>打开解码库出错</td></tr>
     * <tr><td>NET_DEC_CLOSE_ERROR</td><td>(0x80000000|12)</td><td>关闭解码库出错</td></tr>
     * <tr><td>NET_MULTIPLAY_NOCHANNEL</td><td>(0x80000000|13)</td><td>多画面预览中检测到通道数为0</td></tr>
     * <tr><td>NET_TALK_INIT_ERROR</td><td>(0x80000000|14)</td><td>录音库初始化失败</td></tr>
     * <tr><td>NET_TALK_NOT_INIT</td><td>(0x80000000|15)</td><td>录音库未经初始化</td></tr>
     * <tr><td>NET_TALK_SENDDATA_ERROR</td><td>(0x80000000|16)</td><td>发送音频数据出错</td></tr>
     * <tr><td>NET_REAL_ALREADY_SAVING</td><td>(0x80000000|17)</td><td>实时数据已经处于保存状态</td></tr>
     * <tr><td>NET_NOT_SAVING</td><td>(0x80000000|18)</td><td>未保存实时数据</td></tr>
     * <tr><td>NET_OPEN_FILE_ERROR</td><td>(0x80000000|19)</td><td>打开文件出错</td></tr>
     * <tr><td>NET_PTZ_SET_TIMER_ERROR</td><td>(0x80000000|20)</td><td>启动云台控制定时器失败</td></tr>
     * <tr><td>NET_RETURN_DATA_ERROR</td><td>(0x80000000|21)</td><td>对返回数据的校验出错</td></tr>
     * <tr><td>NET_INSUFFICIENT_BUFFER</td><td>(0x80000000|22)</td><td>没有足够的缓存</td></tr>
     * <tr><td>NET_NOT_SUPPORTED</td><td>(0x80000000|23)</td><td>当前SDK未支持该功能</td></tr>
     * <tr><td>NET_NO_RECORD_FOUND</td><td>(0x80000000|24)</td><td>查询不到录象</td></tr>
     * <tr><td>NET_NOT_AUTHORIZED</td><td>(0x80000000|25)</td><td>无操作权限</td></tr>
     * <tr><td>NET_NOT_NOW</td><td>(0x80000000|26)</td><td>暂时无法执行</td></tr>
     * <tr><td>NET_NO_TALK_CHANNEL</td><td>(0x80000000|27)</td><td>未发现对讲通道</td></tr>
     * <tr><td>NET_NO_AUDIO</td><td>(0x80000000|28)</td><td>未发现音频</td></tr>
     * <tr><td>NET_NO_INIT</td><td>(0x80000000|29)</td><td>网络SDK未经初始化</td></tr>
     * <tr><td>NET_DOWNLOAD_END</td><td>(0x80000000|30)</td><td>下载已结束</td></tr>
     * <tr><td>NET_EMPTY_LIST</td><td>(0x80000000|31)</td><td>查询结果为空</td></tr>
     * <tr><td>NET_ERROR_GETCFG_SYSATTR</td><td>(0x80000000|32)</td><td>获取系统属性配置失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_SERIAL</td><td>(0x80000000|33)</td><td>获取序列号失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_GENERAL</td><td>(0x80000000|34)</td><td>获取常规属性失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_DSPCAP</td><td>(0x80000000|35)</td><td>获取DSP能力描述失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_NETCFG</td><td>(0x80000000|36)</td><td>获取网络配置失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_CHANNAME</td><td>(0x80000000|37)</td><td>获取通道名称失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_VIDEO</td><td>(0x80000000|38)</td><td>获取视频属性失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_RECORD</td><td>(0x80000000|39)</td><td>获取录象配置失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_PRONAME</td><td>(0x80000000|40)</td><td>获取解码器协议名称失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_FUNCNAME</td><td>(0x80000000|41)</td><td>获取232串口功能名称失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_485DECODER</td><td>(0x80000000|42)</td><td>获取解码器属性失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_232COM</td><td>(0x80000000|43)</td><td>获取232串口配置失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_ALARMIN</td><td>(0x80000000|44)</td><td>获取外部报警输入配置失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_ALARMDET</td><td>(0x80000000|45)</td><td>获取动态检测报警失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_SYSTIME</td><td>(0x80000000|46)</td><td>获取设备时间失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_PREVIEW</td><td>(0x80000000|47)</td><td>获取预览参数失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_AUTOMT</td><td>(0x80000000|48)</td><td>获取自动维护配置失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_VIDEOMTRX</td><td>(0x80000000|49)</td><td>获取视频矩阵配置失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_COVER</td><td>(0x80000000|50)</td><td>获取区域遮挡配置失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_WATERMAKE</td><td>(0x80000000|51)</td><td>获取图象水印配置失败</td></tr>
     * <tr><td>NET_ERROR_SETCFG_GENERAL</td><td>(0x80000000|55)</td><td>修改常规属性失败</td></tr>
     * <tr><td>NET_ERROR_SETCFG_NETCFG</td><td>(0x80000000|56)</td><td>修改网络配置失败</td></tr>
     * <tr><td>NET_ERROR_SETCFG_CHANNAME</td><td>(0x80000000|57)</td><td>修改通道名称失败</td></tr>
     * <tr><td>NET_ERROR_SETCFG_VIDEO</td><td>(0x80000000|58)</td><td>修改视频属性失败</td></tr>
     * <tr><td>NET_ERROR_SETCFG_RECORD</td><td>(0x80000000|59)</td><td>修改录象配置失败</td></tr>
     * <tr><td>NET_ERROR_SETCFG_485DECODER</td><td>(0x80000000|60)</td><td>修改解码器属性失败</td></tr>
     * <tr><td>NET_ERROR_SETCFG_232COM</td><td>(0x80000000|61)</td><td>修改232串口配置失败</td></tr>
     * <tr><td>NET_ERROR_SETCFG_ALARMIN</td><td>(0x80000000|62)</td><td>修改外部输入报警配置失败</td></tr>
     * <tr><td>NET_ERROR_SETCFG_ALARMDET</td><td>(0x80000000|63)</td><td>修改动态检测报警配置失败</td></tr>
     * <tr><td>NET_ERROR_SETCFG_SYSTIME</td><td>(0x80000000|64)</td><td>修改设备时间失败</td></tr>
     * <tr><td>NET_ERROR_SETCFG_PREVIEW</td><td>(0x80000000|65)</td><td>修改预览参数失败</td></tr>
     * <tr><td>NET_ERROR_SETCFG_AUTOMT</td><td>(0x80000000|66)</td><td>修改自动维护配置失败</td></tr>
     * <tr><td>NET_ERROR_SETCFG_VIDEOMTRX</td><td>(0x80000000|67)</td><td>修改视频矩阵配置失败</td></tr>
     * <tr><td>NET_ERROR_SETCFG_COVER</td><td>(0x80000000|68)</td><td>修改区域遮挡配置失败</td></tr>
     * <tr><td>NET_ERROR_SETCFG_WATERMAKE</td><td>(0x80000000|69)</td><td>修改图象水印配置失败</td></tr>
     * <tr><td>NET_ERROR_SETCFG_WLAN</td><td>(0x80000000|70)</td><td>修改无线网络信息失败</td></tr>
     * <tr><td>NET_ERROR_SETCFG_WLANDEV</td><td>(0x80000000|71)</td><td>选择无线网络设备失败</td></tr>
     * <tr><td>NET_ERROR_SETCFG_REGISTER</td><td>(0x80000000|72)</td><td>修改主动注册参数配置失败</td></tr>
     * <tr><td>NET_ERROR_SETCFG_CAMERA</td><td>(0x80000000|73)</td><td>修改摄像头属性配置失败</td></tr>
     * <tr><td>NET_ERROR_SETCFG_INFRARED</td><td>(0x80000000|74)</td><td>修改红外报警配置失败</td></tr>
     * <tr><td>NET_ERROR_SETCFG_SOUNDALARM</td><td>(0x80000000|75)</td><td>修改音频报警配置失败</td></tr>
     * <tr><td>NET_ERROR_SETCFG_STORAGE</td><td>(0x80000000|76)</td><td>修改存储位置配置失败</td></tr>
     * <tr><td>NET_AUDIOENCODE_NOTINIT</td><td>(0x80000000|77)</td><td>音频编码接口没有成功初始化</td></tr>
     * <tr><td>NET_DATA_TOOLONGH</td><td>(0x80000000|78)</td><td>数据过长</td></tr>
     * <tr><td>NET_UNSUPPORTED</td><td>(0x80000000|79)</td><td>设备不支持该操作</td></tr>
     * <tr><td>NET_DEVICE_BUSY</td><td>(0x80000000|80)</td><td>设备资源不足</td></tr>
     * <tr><td>NET_SERVER_STARTED</td><td>(0x80000000|81)</td><td>服务器已经启动</td></tr>
     * <tr><td>NET_SERVER_STOPPED</td><td>(0x80000000|82)</td><td>服务器尚未成功启动</td></tr>
     * <tr><td>NET_LISTER_INCORRECT_SERIAL</td><td>(0x80000000|83)</td><td>输入序列号有误</td></tr>
     * <tr><td>NET_QUERY_DISKINFO_FAILED</td><td>(0x80000000|84)</td><td>获取硬盘信息失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_SESSION</td><td>(0x80000000|85)</td><td>获取连接Session信息</td></tr>
     * <tr><td>NET_USER_FLASEPWD_TRYTIME</td><td>(0x80000000|86)</td><td>输入密码错误超过限制次数</td></tr>
     * <tr><td>NET_LOGIN_ERROR_PASSWORD</td><td>(0x80000000|100)</td><td>密码不正确</td></tr>
     * <tr><td>NET_LOGIN_ERROR_USER</td><td>(0x80000000|101)</td><td>帐户不存在</td></tr>
     * <tr><td>NET_LOGIN_ERROR_TIMEOUT</td><td>(0x80000000|102)</td><td>等待登录返回超时</td></tr>
     * <tr><td>NET_LOGIN_ERROR_RELOGGIN</td><td>(0x80000000|103)</td><td>帐号已登录</td></tr>
     * <tr><td>NET_LOGIN_ERROR_LOCKED</td><td>(0x80000000|104)</td><td>帐号已被锁定</td></tr>
     * <tr><td>NET_LOGIN_ERROR_BLACKLIST</td><td>(0x80000000|105)</td><td>帐号已被列为黑名单</td></tr>
     * <tr><td>NET_LOGIN_ERROR_BUSY</td><td>(0x80000000|106)</td><td>资源不足，系统忙</td></tr>
     * <tr><td>NET_LOGIN_ERROR_CONNECT</td><td>_EC(107</td><td>连接主机失败</td></tr>
     * <tr><td>NET_LOGIN_ERROR_NETWORK</td><td>(0x80000000|108)</td><td>网络连接失败</td></tr>
     * <tr><td>NET_LOGIN_ERROR_SUBCONNECT</td><td>(0x80000000|109)</td><td>登录设备成功，但无法创建视频通道，请检查网络状况</td></tr>
     * <tr><td>NET_LOGIN_ERROR_MAXCONNECT</td><td>(0x80000000|110)</td><td>超过最大连接数</td></tr>
     * <tr><td>NET_RENDER_SOUND_ON_ERROR</td><td>(0x80000000|120)</td><td>Render库打开音频出错</td></tr>
     * <tr><td>NET_RENDER_SOUND_OFF_ERROR</td><td>(0x80000000|121)</td><td>Render库关闭音频出错</td></tr>
     * <tr><td>NET_RENDER_SET_VOLUME_ERROR</td><td>(0x80000000|122)</td><td>Render库控制音量出错</td></tr>
     * <tr><td>NET_RENDER_ADJUST_ERROR</td><td>(0x80000000|123)</td><td>Render库设置画面参数出错</td></tr>
     * <tr><td>NET_RENDER_PAUSE_ERROR</td><td>(0x80000000|124)</td><td>Render库暂停播放出错</td></tr>
     * <tr><td>NET_RENDER_SNAP_ERROR</td><td>(0x80000000|125)</td><td>Render库抓图出错</td></tr>
     * <tr><td>NET_RENDER_STEP_ERROR</td><td>(0x80000000|126)</td><td>Render库步进出错</td></tr>
     * <tr><td>NET_RENDER_FRAMERATE_ERROR</td><td>(0x80000000|127)</td><td>Render库设置帧率出错</td></tr>
     * <tr><td>NET_GROUP_EXIST</td><td>(0x80000000|140)</td><td>组名已存在</td></tr>
     * <tr><td>NET_GROUP_NOEXIST</td><td>(0x80000000|141)</td><td>组名不存在</td></tr>
     * <tr><td>NET_GROUP_RIGHTOVER</td><td>(0x80000000|142)</td><td>组的权限超出权限列表范围</td></tr>
     * <tr><td>NET_GROUP_HAVEUSER</td><td>(0x80000000|143)</td><td>组下有用户，不能删除</td></tr>
     * <tr><td>NET_GROUP_RIGHTUSE</td><td>_EC(144</td><td>组的某个权限被用户使用，不能出除</td></tr>
     * <tr><td>NET_GROUP_SAMENAME</td><td>(0x80000000|145)</td><td>新组名同已有组名重复</td></tr>
     * <tr><td>NET_USER_EXIST</td><td>(0x80000000|146)</td><td>用户已存在</td></tr>
     * <tr><td>NET_USER_NOEXIST</td><td>(0x80000000|147)</td><td>用户不存在</td></tr>
     * <tr><td>NET_USER_RIGHTOVER</td><td>(0x80000000|148)</td><td>用户权限超出组权限</td></tr>
     * <tr><td>NET_USER_PWD</td><td>(0x80000000|149)</td><td>保留帐号，不容许修改密码</td></tr>
     * <tr><td>NET_USER_FLASEPWD</td><td>(0x80000000|150)</td><td>密码不正确</td></tr>
     * <tr><td>NET_USER_NOMATCHING</td><td>(0x80000000|151)</td><td>密码不匹配</td></tr>
     * <tr><td>NET_ERROR_GETCFG_ETHERNET</td><td>(0x80000000|300)</td><td>获取网卡配置失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_WLAN</td><td>(0x80000000|301)</td><td>获取无线网络信息失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_WLANDEV</td><td>(0x80000000|302)</td><td>获取无线网络设备失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_REGISTER</td><td>(0x80000000|303)</td><td>获取主动注册参数失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_CAMERA</td><td>(0x80000000|304)</td><td>获取摄像头属性失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_INFRARED</td><td>(0x80000000|305)</td><td>获取红外报警配置失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_SOUNDALARM</td><td>(0x80000000|306)</td><td>获取音频报警配置失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_STORAGE</td><td>(0x80000000|307)</td><td>获取存储位置配置失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_MAIL</td><td>(0x80000000|308)</td><td>获取邮件配置失败</td></tr>
     * <tr><td>NET_CONFIG_DEVBUSY</td><td>(0x80000000|309)</td><td>暂时无法设置</td></tr>
     * <tr><td>NET_CONFIG_DATAILLEGAL</td><td>(0x80000000|310)</td><td>配置数据不合法</td></tr>
     * <tr><td>NET_ERROR_GETCFG_DST</td><td>(0x80000000|311)</td><td>获取夏令时配置失败</td></tr>
     * <tr><td>NET_ERROR_SETCFG_DST</td><td>(0x80000000|312)</td><td>设置夏令时配置失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_VIDEO_OSD</td><td>(0x80000000|313)</td><td>获取视频OSD叠加配置失败</td></tr>
     * <tr><td>NET_ERROR_SETCFG_VIDEO_OSD</td><td>(0x80000000|314)</td><td>设置视频OSD叠加配置失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_GPRSCDMA</td><td>(0x80000000|315)</td><td>获取CDMA\GPRS网络配置失败</td></tr>
     * <tr><td>NET_ERROR_SETCFG_GPRSCDMA</td><td>(0x80000000|316)</td><td>设置CDMA\GPRS网络配置失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_IPFILTER</td><td>(0x80000000|317)</td><td>获取IP过滤配置失败</td></tr>
     * <tr><td>NET_ERROR_SETCFG_IPFILTER</td><td>(0x80000000|318)</td><td>设置IP过滤配置失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_TALKENCODE</td><td>(0x80000000|319)</td><td>获取语音对讲编码配置失败</td></tr>
     * <tr><td>NET_ERROR_SETCFG_TALKENCODE</td><td>(0x80000000|320)</td><td>设置语音对讲编码配置失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_RECORDLEN</td><td>(0x80000000|321)</td><td>获取录像打包长度配置失败</td></tr>
     * <tr><td>NET_ERROR_SETCFG_RECORDLEN</td><td>(0x80000000|322)</td><td>设置录像打包长度配置失败</td></tr>
     * <tr><td>NET_DONT_SUPPORT_SUBAREA</td><td>(0x80000000|323)</td><td>不支持网络硬盘分区</td></tr>
     * <tr><td>NET_ERROR_GET_AUTOREGSERVER</td><td>(0x80000000|324)</td><td>获取设备上主动注册服务器信息失败</td></tr>
     * <tr><td>NET_ERROR_CONTROL_AUTOREGISTER</td><td>(0x80000000|325)</td><td>主动注册重定向注册错误</td></tr>
     * <tr><td>NET_ERROR_DISCONNECT_AUTOREGISTER</td><td>(0x80000000|326)</td><td>断开主动注册服务器错误</td></tr>
     * <tr><td>NET_ERROR_GETCFG_MMS</td><td>(0x80000000|327)</td><td>获取mms配置失败</td></tr>
     * <tr><td>NET_ERROR_SETCFG_MMS</td><td>(0x80000000|328)</td><td>设置mms配置失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_SMSACTIVATION</td><td>(0x80000000|329)</td><td>获取短信激活无线连接配置失败</td></tr>
     * <tr><td>NET_ERROR_SETCFG_SMSACTIVATION</td><td>(0x80000000|330)</td><td>设置短信激活无线连接配置失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_DIALINACTIVATION</td><td>(0x80000000|331)</td><td>获取拨号激活无线连接配置失败</td></tr>
     * <tr><td>NET_ERROR_SETCFG_DIALINACTIVATION</td><td>(0x80000000|332)</td><td>设置拨号激活无线连接配置失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_VIDEOOUT</td><td>(0x80000000|333)</td><td>查询视频输出参数配置失败</td></tr>
     * <tr><td>NET_ERROR_SETCFG_VIDEOOUT</td><td>(0x80000000|334)</td><td>设置视频输出参数配置失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_OSDENABLE</td><td>(0x80000000|335)</td><td>获取osd叠加使能配置失败</td></tr>
     * <tr><td>NET_ERROR_SETCFG_OSDENABLE</td><td>(0x80000000|336)</td><td>设置osd叠加使能配置失败</td></tr>
     * <tr><td>NET_ERROR_SETCFG_ENCODERINFO</td><td>(0x80000000|337)</td><td>设置数字通道前端编码接入配置失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_TVADJUST</td><td>(0x80000000|338)</td><td>获取TV调节配置失败</td></tr>
     * <tr><td>NET_ERROR_SETCFG_TVADJUST</td><td>(0x80000000|339)</td><td>设置TV调节配置失败</td></tr>
     * <tr><td>NET_ERROR_CONNECT_FAILED</td><td>(0x80000000|340)</td><td>请求建立连接失败</td></tr>
     * <tr><td>NET_ERROR_SETCFG_BURNFILE</td><td>(0x80000000|341)</td><td>请求刻录文件上传失败</td></tr>
     * <tr><td>NET_ERROR_SNIFFER_GETCFG</td><td>(0x80000000|342)</td><td>获取抓包配置信息失败</td></tr>
     * <tr><td>NET_ERROR_SNIFFER_SETCFG</td><td>(0x80000000|343)</td><td>设置抓包配置信息失败</td></tr>
     * <tr><td>NET_ERROR_DOWNLOADRATE_GETCFG</td><td>(0x80000000|344)</td><td>查询下载限制信息失败</td></tr>
     * <tr><td>NET_ERROR_DOWNLOADRATE_SETCFG</td><td>(0x80000000|345)</td><td>设置下载限制信息失败</td></tr>
     * <tr><td>NET_ERROR_SEARCH_TRANSCOM</td><td>(0x80000000|346)</td><td>查询串口参数失败</td></tr>
     * <tr><td>NET_ERROR_GETCFG_POINT</td><td>(0x80000000|347)</td><td>获取预制点信息错误</td></tr>
     * <tr><td>NET_ERROR_SETCFG_POINT</td><td>(0x80000000|348)</td><td>设置预制点信息错误</td></tr>
     * <tr><td>NET_SDK_LOGOUT_ERROR</td><td>(0x80000000|349)</td><td>SDK没有正常登出设备</td></tr>
     * <tr><td>NET_ERROR_GET_VEHICLE_CFG</td><td>(0x80000000|350)</td><td>获取车载配置失败</td></tr>
     * <tr><td>NET_ERROR_SET_VEHICLE_CFG</td><td>(0x80000000|351)</td><td>设置车载配置失败</td></tr>
     * <tr><td>NET_ERROR_GET_ATM_OVERLAY_CFG</td><td>(0x80000000|352)</td><td>获取atm叠加配置失败</td></tr>
     * <tr><td>NET_ERROR_SET_ATM_OVERLAY_CFG</td><td>(0x80000000|353)</td><td>设置atm叠加配置失败</td></tr>
     * <tr><td>NET_ERROR_GET_ATM_OVERLAY_ABILITY</td><td>(0x80000000|354)</td><td>获取atm叠加能力失败</td></tr>
     * <tr><td>NET_ERROR_GET_DECODER_TOUR_CFG</td><td>(0x80000000|355)</td><td>获取解码器解码轮巡配置失败</td></tr>
     * <tr><td>NET_ERROR_SET_DECODER_TOUR_CFG</td><td>(0x80000000|356)</td><td>设置解码器解码轮巡配置失败</td></tr>
     * <tr><td>NET_ERROR_CTRL_DECODER_TOUR</td><td>(0x80000000|357)</td><td>控制解码器解码轮巡失败</td></tr>
     * <tr><td>NET_GROUP_OVERSUPPORTNUM</td><td>(0x80000000|358)</td><td>超出设备支持最大用户组数目</td></tr>
     * <tr><td>NET_USER_OVERSUPPORTNUM</td><td>(0x80000000|359)</td><td>超出设备支持最大用户数目</td></tr>
     * <tr><td>NET_ERROR_GET_SIP_CFG</td><td>(0x80000000|368)</td><td>获取SIP配置失败</td></tr>
     * <tr><td>NET_ERROR_SET_SIP_CFG</td><td>(0x80000000|369)</td><td>设置SIP配置失败</td></tr>
     * <tr><td>NET_ERROR_GET_SIP_ABILITY</td><td>(0x80000000|370)</td><td>获取SIP能力失败</td></tr>
     * <tr><td>NET_ERROR_GET_WIFI_AP_CFG</td><td>(0x80000000|371)</td><td>获取WIFI      ap配置失败</td></tr>
     * <tr><td>NET_ERROR_SET_WIFI_AP_CFG</td><td>(0x80000000|372)</td><td>设置WIFI      ap配置失败</td></tr>
     * <tr><td>NET_ERROR_GET_DECODE_POLICY</td><td>(0x80000000|373)</td><td>获取解码策略配置失败</td></tr>
     * <tr><td>NET_ERROR_SET_DECODE_POLICY</td><td>(0x80000000|374)</td><td>设置解码策略配置失败</td></tr>
     * <tr><td>NET_ERROR_TALK_REJECT</td><td>(0x80000000|375)</td><td>拒绝对讲</td></tr>
     * <tr><td>NET_ERROR_TALK_OPENED</td><td>(0x80000000|376)</td><td>对讲被其他客户端打开</td></tr>
     * <tr><td>NET_ERROR_TALK_RESOURCE_CONFLICIT</td><td>(0x80000000|377)</td><td>资源冲突</td></tr>
     * <tr><td>NET_ERROR_TALK_UNSUPPORTED_ENCODE</td><td>(0x80000000|378)</td><td>不支持的语音编码格式</td></tr>
     * <tr><td>NET_ERROR_TALK_RIGHTLESS</td><td>(0x80000000|379)</td><td>无权限</td></tr>
     * <tr><td>NET_ERROR_TALK_FAILED</td><td>(0x80000000|380)</td><td>请求对讲失败</td></tr>
     * <tr><td>NET_ERROR_GET_MACHINE_CFG</td><td>(0x80000000|381)</td><td>获取机器相关配置失败</td></tr>
     * <tr><td>NET_ERROR_SET_MACHINE_CFG</td><td>(0x80000000|382)</td><td>设置机器相关配置失败</td></tr>
     * <tr><td>NET_ERROR_GET_DATA_FAILED</td><td>(0x80000000|383)</td><td>设备无法获取当前请求数据</td></tr>
     * <tr><td>NET_ERROR_MAC_VALIDATE_FAILED</td><td>(0x80000000|384)</td><td>MAC地址验证失败</td></tr>
     * <tr><td>NET_ERROR_GET_INSTANCE</td><td>(0x80000000|385)</td><td>获取服务器实例失败</td></tr>
     * <tr><td>NET_ERROR_JSON_REQUEST</td><td>(0x80000000|386)</td><td>生成的jason字符串错误</td></tr>
     * <tr><td>NET_ERROR_JSON_RESPONSE</td><td>(0x80000000|387)</td><td>响应的jason字符串错误</td></tr>
     * <tr><td>NET_ERROR_VERSION_HIGHER</td><td>(0x80000000|388)</td><td>协议版本低于当前使用的版本</td></tr>
     * <tr><td>NET_SPARE_NO_CAPACITY</td><td>(0x80000000|389)</td><td>热备操作失败, 容量不足</td></tr>
     * <tr><td>NET_ERROR_SOURCE_IN_USE</td><td>(0x80000000|390)</td><td>显示源被其他输出占用</td></tr>
     * <tr><td>NET_ERROR_REAVE</td><td>(0x80000000|391)</td><td>高级用户抢占低级用户资源</td></tr>
     * <tr><td>NET_ERROR_NETFORBID</td><td>(0x80000000|392)</td><td>禁止入网</td></tr>
     * </tbody>
     * </table>
     *
     * @return 返回错误码，具体参见错误码表。
     */
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
    NativeLong CLIENT_LoginEx(String pchDVRIP, short wDVRPort, String pchUserName, String pchPassword, int nSpecCap,
                              Pointer pCapParam, NET_DEVICEINFO.ByReference lpDeviceInfo, IntByReference error);

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
     * 设置动态子连接断线回调函数，目前SVR设备的监视和回放是短连接的。
     * <p>一般在程序初始化的时候设置该回调函数，对枚举中的子链接断线回调，客户可根据回调句柄知道是哪个子链接断线回调。</p>
     *
     * @param cbSubDisConnect 子链接断线回调函数
     * @param dwUser          用户自定义参数
     */
    void CLIENT_SetSubconnCallBack(SubDisConnectCallBack cbSubDisConnect, NativeLong dwUser);


    /**
     * 打开实时监视，若返回0表示打开失败
     *
     * @param lLoginID     CLIENT_Login的返回值
     * @param nChannelID   实时监视通道号，如果rType为RType_Multiplay该参数保留。
     *                     当rType为RType_Multiplay_1~RType_Multiplay_16时，nChannelID决定了预览的画面，
     *                     如当RType_Multiplay_4时，通道为4或5或6或7表示预览第5到第7通道的四画面预览
     * @param hWnd         窗口句柄。值为0（NULL）时对数据不解码不显示图像
     * @param rType        值定义类型{@link DH_RealPlayType}，如下表：
     *                     <table>
     *                     <thead>
     *                     <tr><th>类型</th><th>代表含义</th></tr>
     *                     </thead>
     *                     <tbody>
     *                     <tr><td>{@link DH_RealPlayType#DH_RType_Realplay}</td><td>实时预览</td></tr>
     *                     <tr><td>{@link DH_RealPlayType#DH_RType_Multiplay}</td><td>多画面预览</td></tr>
     *                     <tr><td>{@link DH_RealPlayType#DH_RType_Realplay_0}</td><td>实时监视-主码流，等同于DH_RType_Realplay</td></tr>
     *                     <tr><td>{@link DH_RealPlayType#DH_RType_Realplay_1}</td><td>实时监视-从码流1</td></tr>
     *                     <tr><td>{@link DH_RealPlayType#DH_RType_Realplay_2}</td><td>实时监视-从码流2</td></tr>
     *                     <tr><td>{@link DH_RealPlayType#DH_RType_Realplay_3}</td><td>实时监视-从码流3</td></tr>
     *                     <tr><td>{@link DH_RealPlayType#DH_RType_Multiplay_1}</td><td>多画面预览－1画面</td></tr>
     *                     <tr><td>{@link DH_RealPlayType#DH_RType_Multiplay_4}</td><td>多画面预览－4画面</td></tr>
     *                     <tr><td>{@link DH_RealPlayType#DH_RType_Multiplay_8}</td><td>多画面预览－8画面</td></tr>
     *                     <tr><td>{@link DH_RealPlayType#DH_RType_Multiplay_9}</td><td>多画面预览－9画面</td></tr>
     *                     <tr><td>{@link DH_RealPlayType#DH_RType_Multiplay_16}</td><td>多画面预览－16画面</td></tr>
     *                     <tr><td>{@link DH_RealPlayType#DH_RType_Multiplay_6}</td><td>多画面预览－6画面</td></tr>
     *                     <tr><td>{@link DH_RealPlayType#DH_RType_Multiplay_12}</td><td>多画面预览－12画面</td></tr>
     *                     </tbody>
     *                     </table>
     * @param cbRealData   实时监视数据回调函数，见 #CLIENT_SetRealDataCallBackEx
     * @param cbDisconnect 视频监视断开回调函数
     * @param dwUser       用户自定义数据，在回调中可以使用
     * @param dwWaitTime   等待时间
     * @return 失败返回0，成功返回实时监视ID(实时监视句柄)，将作为相关函数的参数。
     */
    NativeLong CLIENT_StartRealPlay(NativeLong lLoginID, int nChannelID, Pointer hWnd, DH_RealPlayType rType,
                                    RealDataCallBackEx cbRealData, RealPlayDisConnectCallBack cbDisconnect,
                                    NativeLong dwUser, int dwWaitTime);


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

    /**
     * 重启前端设备
     *
     * @param lLoginID {@link #CLIENT_LoginEx}的返回值
     * @return 成功返回TRUE，失败返回FALSE。
     */
    int CLIENT_RebootDev(NativeLong lLoginID);

    /**
     * 关闭前端设备
     *
     * @param lLoginID {@link #CLIENT_LoginEx}的返回值
     * @return 成功返回TRUE，失败返回FALSE。
     */
    int CLIENT_ShutDownDev(NativeLong lLoginID);
}
