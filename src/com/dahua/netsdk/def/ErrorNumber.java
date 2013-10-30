package com.dahua.netsdk.def;

/**
 * 大华错误号定义
 */
public abstract class ErrorNumber {

    /**
     * 没有错误
     */
    public static final int NET_NOERROR = 0;

    /**
     * 未知错误
     */
    public static final int NET_ERROR = -1;

    /**
     * Windows系统出错
     */
    public static final int NET_SYSTEM_ERROR = (0x80000000 | 1);

    /**
     * 网络错误，可能是因为网络超时
     */
    public static final int NET_NETWORK_ERROR = (0x80000000 | 2);

    /**
     * 设备协议不匹配
     */
    public static final int NET_DEV_VER_NOMATCH = (0x80000000 | 3);

    /**
     * 句柄无效
     */
    public static final int NET_INVALID_HANDLE = (0x80000000 | 4);

    /**
     * 打开通道失败
     */
    public static final int NET_OPEN_CHANNEL_ERROR = (0x80000000 | 5);

    /**
     * 关闭通道失败
     */
    public static final int NET_CLOSE_CHANNEL_ERROR = (0x80000000 | 6);

    /**
     * 用户参数不合法
     */
    public static final int NET_ILLEGAL_PARAM = (0x80000000 | 7);

    /**
     * SDK初始化出错
     */
    public static final int NET_SDK_INIT_ERROR = (0x80000000 | 8);

    /**
     * SDK清理出错
     */
    public static final int NET_SDK_UNINIT_ERROR = (0x80000000 | 9);

    /**
     * 申请render资源出错
     */
    public static final int NET_RENDER_OPEN_ERROR = (0x80000000 | 10);

    /**
     * 打开解码库出错
     */
    public static final int NET_DEC_OPEN_ERROR = (0x80000000 | 11);

    /**
     * 关闭解码库出错
     */
    public static final int NET_DEC_CLOSE_ERROR = (0x80000000 | 12);

    /**
     * 多画面预览中检测到通道数为0
     */
    public static final int NET_MULTIPLAY_NOCHANNEL = (0x80000000 | 13);

    /**
     * 录音库初始化失败
     */
    public static final int NET_TALK_INIT_ERROR = (0x80000000 | 14);

    /**
     * 录音库未经初始化
     */
    public static final int NET_TALK_NOT_INIT = (0x80000000 | 15);

    /**
     * 发送音频数据出错
     */
    public static final int NET_TALK_SENDDATA_ERROR = (0x80000000 | 16);

    /**
     * 实时数据已经处于保存状态
     */
    public static final int NET_REAL_ALREADY_SAVING = (0x80000000 | 17);

    /**
     * 未保存实时数据
     */
    public static final int NET_NOT_SAVING = (0x80000000 | 18);

    /**
     * 打开文件出错
     */
    public static final int NET_OPEN_FILE_ERROR = (0x80000000 | 19);

    /**
     * 启动云台控制定时器失败
     */
    public static final int NET_PTZ_SET_TIMER_ERROR = (0x80000000 | 20);

    /**
     * 对返回数据的校验出错
     */
    public static final int NET_RETURN_DATA_ERROR = (0x80000000 | 21);

    /**
     * 没有足够的缓存
     */
    public static final int NET_INSUFFICIENT_BUFFER = (0x80000000 | 22);

    /**
     * 当前SDK未支持该功能
     */
    public static final int NET_NOT_SUPPORTED = (0x80000000 | 23);

    /**
     * 查询不到录象
     */
    public static final int NET_NO_RECORD_FOUND = (0x80000000 | 24);

    /**
     * 无操作权限
     */
    public static final int NET_NOT_AUTHORIZED = (0x80000000 | 25);

    /**
     * 暂时无法执行
     */
    public static final int NET_NOT_NOW = (0x80000000 | 26);

    /**
     * 未发现对讲通道
     */
    public static final int NET_NO_TALK_CHANNEL = (0x80000000 | 27);

    /**
     * 未发现音频
     */
    public static final int NET_NO_AUDIO = (0x80000000 | 28);

    /**
     * 网络SDK未经初始化
     */
    public static final int NET_NO_INIT = (0x80000000 | 29);

    /**
     * 下载已结束
     */
    public static final int NET_DOWNLOAD_END = (0x80000000 | 30);

    /**
     * 查询结果为空
     */
    public static final int NET_EMPTY_LIST = (0x80000000 | 31);

    /**
     * 获取系统属性配置失败
     */
    public static final int NET_ERROR_GETCFG_SYSATTR = (0x80000000 | 32);

    /**
     * 获取序列号失败
     */
    public static final int NET_ERROR_GETCFG_SERIAL = (0x80000000 | 33);

    /**
     * 获取常规属性失败
     */
    public static final int NET_ERROR_GETCFG_GENERAL = (0x80000000 | 34);

    /**
     * 获取DSP能力描述失败
     */
    public static final int NET_ERROR_GETCFG_DSPCAP = (0x80000000 | 35);

    /**
     * 获取网络配置失败
     */
    public static final int NET_ERROR_GETCFG_NETCFG = (0x80000000 | 36);

    /**
     * 获取通道名称失败
     */
    public static final int NET_ERROR_GETCFG_CHANNAME = (0x80000000 | 37);

    /**
     * 获取视频属性失败
     */
    public static final int NET_ERROR_GETCFG_VIDEO = (0x80000000 | 38);

    /**
     * 获取录象配置失败
     */
    public static final int NET_ERROR_GETCFG_RECORD = (0x80000000 | 39);

    /**
     * 获取解码器协议名称失败
     */
    public static final int NET_ERROR_GETCFG_PRONAME = (0x80000000 | 40);

    /**
     * 获取232串口功能名称失败
     */
    public static final int NET_ERROR_GETCFG_FUNCNAME = (0x80000000 | 41);

    /**
     * 获取解码器属性失败
     */
    public static final int NET_ERROR_GETCFG_485DECODER = (0x80000000 | 42);

    /**
     * 获取232串口配置失败
     */
    public static final int NET_ERROR_GETCFG_232COM = (0x80000000 | 43);

    /**
     * 获取外部报警输入配置失败
     */
    public static final int NET_ERROR_GETCFG_ALARMIN = (0x80000000 | 44);

    /**
     * 获取动态检测报警失败
     */
    public static final int NET_ERROR_GETCFG_ALARMDET = (0x80000000 | 45);

    /**
     * 获取设备时间失败
     */
    public static final int NET_ERROR_GETCFG_SYSTIME = (0x80000000 | 46);

    /**
     * 获取预览参数失败
     */
    public static final int NET_ERROR_GETCFG_PREVIEW = (0x80000000 | 47);

    /**
     * 获取自动维护配置失败
     */
    public static final int NET_ERROR_GETCFG_AUTOMT = (0x80000000 | 48);

    /**
     * 获取视频矩阵配置失败
     */
    public static final int NET_ERROR_GETCFG_VIDEOMTRX = (0x80000000 | 49);

    /**
     * 获取区域遮挡配置失败
     */
    public static final int NET_ERROR_GETCFG_COVER = (0x80000000 | 50);

    /**
     * 获取图象水印配置失败
     */
    public static final int NET_ERROR_GETCFG_WATERMAKE = (0x80000000 | 51);

    /**
     * 修改常规属性失败
     */
    public static final int NET_ERROR_SETCFG_GENERAL = (0x80000000 | 55);

    /**
     * 修改网络配置失败
     */
    public static final int NET_ERROR_SETCFG_NETCFG = (0x80000000 | 56);

    /**
     * 修改通道名称失败
     */
    public static final int NET_ERROR_SETCFG_CHANNAME = (0x80000000 | 57);

    /**
     * 修改视频属性失败
     */
    public static final int NET_ERROR_SETCFG_VIDEO = (0x80000000 | 58);

    /**
     * 修改录象配置失败
     */
    public static final int NET_ERROR_SETCFG_RECORD = (0x80000000 | 59);

    /**
     * 修改解码器属性失败
     */
    public static final int NET_ERROR_SETCFG_485DECODER = (0x80000000 | 60);

    /**
     * 修改232串口配置失败
     */
    public static final int NET_ERROR_SETCFG_232COM = (0x80000000 | 61);

    /**
     * 修改外部输入报警配置失败
     */
    public static final int NET_ERROR_SETCFG_ALARMIN = (0x80000000 | 62);

    /**
     * 修改动态检测报警配置失败
     */
    public static final int NET_ERROR_SETCFG_ALARMDET = (0x80000000 | 63);

    /**
     * 修改设备时间失败
     */
    public static final int NET_ERROR_SETCFG_SYSTIME = (0x80000000 | 64);

    /**
     * 修改预览参数失败
     */
    public static final int NET_ERROR_SETCFG_PREVIEW = (0x80000000 | 65);

    /**
     * 修改自动维护配置失败
     */
    public static final int NET_ERROR_SETCFG_AUTOMT = (0x80000000 | 66);

    /**
     * 修改视频矩阵配置失败
     */
    public static final int NET_ERROR_SETCFG_VIDEOMTRX = (0x80000000 | 67);

    /**
     * 修改区域遮挡配置失败
     */
    public static final int NET_ERROR_SETCFG_COVER = (0x80000000 | 68);

    /**
     * 修改图象水印配置失败
     */
    public static final int NET_ERROR_SETCFG_WATERMAKE = (0x80000000 | 69);

    /**
     * 修改无线网络信息失败
     */
    public static final int NET_ERROR_SETCFG_WLAN = (0x80000000 | 70);

    /**
     * 选择无线网络设备失败
     */
    public static final int NET_ERROR_SETCFG_WLANDEV = (0x80000000 | 71);

    /**
     * 修改主动注册参数配置失败
     */
    public static final int NET_ERROR_SETCFG_REGISTER = (0x80000000 | 72);

    /**
     * 修改摄像头属性配置失败
     */
    public static final int NET_ERROR_SETCFG_CAMERA = (0x80000000 | 73);

    /**
     * 修改红外报警配置失败
     */
    public static final int NET_ERROR_SETCFG_INFRARED = (0x80000000 | 74);

    /**
     * 修改音频报警配置失败
     */
    public static final int NET_ERROR_SETCFG_SOUNDALARM = (0x80000000 | 75);

    /**
     * 修改存储位置配置失败
     */
    public static final int NET_ERROR_SETCFG_STORAGE = (0x80000000 | 76);

    /**
     * 音频编码接口没有成功初始化
     */
    public static final int NET_AUDIOENCODE_NOTINIT = (0x80000000 | 77);

    /**
     * 数据过长
     */
    public static final int NET_DATA_TOOLONGH = (0x80000000 | 78);

    /**
     * 设备不支持该操作
     */
    public static final int NET_UNSUPPORTED = (0x80000000 | 79);

    /**
     * 设备资源不足
     */
    public static final int NET_DEVICE_BUSY = (0x80000000 | 80);

    /**
     * 服务器已经启动
     */
    public static final int NET_SERVER_STARTED = (0x80000000 | 81);

    /**
     * 服务器尚未成功启动
     */
    public static final int NET_SERVER_STOPPED = (0x80000000 | 82);

    /**
     * 输入序列号有误
     */
    public static final int NET_LISTER_INCORRECT_SERIAL = (0x80000000 | 83);

    /**
     * 获取硬盘信息失败
     */
    public static final int NET_QUERY_DISKINFO_FAILED = (0x80000000 | 84);

    /**
     * 获取连接Session信息
     */
    public static final int NET_ERROR_GETCFG_SESSION = (0x80000000 | 85);

    /**
     * 输入密码错误超过限制次数
     */
    public static final int NET_USER_FLASEPWD_TRYTIME = (0x80000000 | 86);

    /**
     * 密码不正确
     */
    public static final int NET_LOGIN_ERROR_PASSWORD = (0x80000000 | 100);

    /**
     * 帐户不存在
     */
    public static final int NET_LOGIN_ERROR_USER = (0x80000000 | 101);

    /**
     * 等待登录返回超时
     */
    public static final int NET_LOGIN_ERROR_TIMEOUT = (0x80000000 | 102);

    /**
     * 帐号已登录
     */
    public static final int NET_LOGIN_ERROR_RELOGGIN = (0x80000000 | 103);

    /**
     * 帐号已被锁定
     */
    public static final int NET_LOGIN_ERROR_LOCKED = (0x80000000 | 104);

    /**
     * 帐号已被列为黑名单
     */
    public static final int NET_LOGIN_ERROR_BLACKLIST = (0x80000000 | 105);

    /**
     * 资源不足，系统忙
     */
    public static final int NET_LOGIN_ERROR_BUSY = (0x80000000 | 106);

    /**
     * 登录设备超时，请检查网络并重试
     */
    public static final int NET_LOGIN_ERROR_CONNECT = (0x80000000 | 107);

    /**
     * 网络连接失败
     */
    public static final int NET_LOGIN_ERROR_NETWORK = (0x80000000 | 108);

    /**
     * 登录设备成功，但无法创建视频通道，请检查网络状况
     */
    public static final int NET_LOGIN_ERROR_SUBCONNECT = (0x80000000 | 109);

    /**
     * 超过最大连接数
     */
    public static final int NET_LOGIN_ERROR_MAXCONNECT = (0x80000000 | 110);

    /**
     * 只支持3代协议
     */
    public static final int NET_LOGIN_ERROR_PROTOCOL3_ONLY = (0x80000000 | 111);

    /**
     * 未插入U盾或U盾信息错误
     */
    public static final int NET_LOGIN_ERROR_UKEY_LOST = (0x80000000 | 112);

    /**
     * 客户端IP地址没有登录权限
     */
    public static final int NET_LOGIN_ERROR_NO_AUTHORIZED = (0x80000000 | 113);

    /**
     * Render库打开音频出错
     */
    public static final int NET_RENDER_SOUND_ON_ERROR = (0x80000000 | 120);

    /**
     * Render库关闭音频出错
     */
    public static final int NET_RENDER_SOUND_OFF_ERROR = (0x80000000 | 121);

    /**
     * Render库控制音量出错
     */
    public static final int NET_RENDER_SET_VOLUME_ERROR = (0x80000000 | 122);

    /**
     * Render库设置画面参数出错
     */
    public static final int NET_RENDER_ADJUST_ERROR = (0x80000000 | 123);

    /**
     * Render库暂停播放出错
     */
    public static final int NET_RENDER_PAUSE_ERROR = (0x80000000 | 124);

    /**
     * Render库抓图出错
     */
    public static final int NET_RENDER_SNAP_ERROR = (0x80000000 | 125);

    /**
     * Render库步进出错
     */
    public static final int NET_RENDER_STEP_ERROR = (0x80000000 | 126);

    /**
     * Render库设置帧率出错
     */
    public static final int NET_RENDER_FRAMERATE_ERROR = (0x80000000 | 127);

    /**
     * 组名已存在
     */
    public static final int NET_GROUP_EXIST = (0x80000000 | 140);

    /**
     * 组名不存在
     */
    public static final int NET_GROUP_NOEXIST = (0x80000000 | 141);

    /**
     * 组的权限超出权限列表范围
     */
    public static final int NET_GROUP_RIGHTOVER = (0x80000000 | 142);

    /**
     * 组下有用户，不能删除
     */
    public static final int NET_GROUP_HAVEUSER = (0x80000000 | 143);

    /**
     * 组的某个权限被用户使用，不能出除
     */
    public static final int NET_GROUP_RIGHTUSE = (0x80000000 | 144);

    /**
     * 新组名同已有组名重复
     */
    public static final int NET_GROUP_SAMENAME = (0x80000000 | 145);

    /**
     * 用户已存在
     */
    public static final int NET_USER_EXIST = (0x80000000 | 146);

    /**
     * 用户不存在
     */
    public static final int NET_USER_NOEXIST = (0x80000000 | 147);

    /**
     * 用户权限超出组权限
     */
    public static final int NET_USER_RIGHTOVER = (0x80000000 | 148);

    /**
     * 保留帐号，不容许修改密码
     */
    public static final int NET_USER_PWD = (0x80000000 | 149);

    /**
     * 密码不正确
     */
    public static final int NET_USER_FLASEPWD = (0x80000000 | 150);

    /**
     * 密码不匹配
     */
    public static final int NET_USER_NOMATCHING = (0x80000000 | 151);

    /**
     * 账号正在使用中
     */
    public static final int NET_USER_INUSE = (0x80000000 | 152);

    /**
     * 获取网卡配置失败
     */
    public static final int NET_ERROR_GETCFG_ETHERNET = (0x80000000 | 300);

    /**
     * 获取无线网络信息失败
     */
    public static final int NET_ERROR_GETCFG_WLAN = (0x80000000 | 301);

    /**
     * 获取无线网络设备失败
     */
    public static final int NET_ERROR_GETCFG_WLANDEV = (0x80000000 | 302);

    /**
     * 获取主动注册参数失败
     */
    public static final int NET_ERROR_GETCFG_REGISTER = (0x80000000 | 303);

    /**
     * 获取摄像头属性失败
     */
    public static final int NET_ERROR_GETCFG_CAMERA = (0x80000000 | 304);

    /**
     * 获取红外报警配置失败
     */
    public static final int NET_ERROR_GETCFG_INFRARED = (0x80000000 | 305);

    /**
     * 获取音频报警配置失败
     */
    public static final int NET_ERROR_GETCFG_SOUNDALARM = (0x80000000 | 306);

    /**
     * 获取存储位置配置失败
     */
    public static final int NET_ERROR_GETCFG_STORAGE = (0x80000000 | 307);

    /**
     * 获取邮件配置失败
     */
    public static final int NET_ERROR_GETCFG_MAIL = (0x80000000 | 308);

    /**
     * 暂时无法设置
     */
    public static final int NET_CONFIG_DEVBUSY = (0x80000000 | 309);

    /**
     * 配置数据不合法
     */
    public static final int NET_CONFIG_DATAILLEGAL = (0x80000000 | 310);

    /**
     * 获取夏令时配置失败
     */
    public static final int NET_ERROR_GETCFG_DST = (0x80000000 | 311);

    /**
     * 设置夏令时配置失败
     */
    public static final int NET_ERROR_SETCFG_DST = (0x80000000 | 312);

    /**
     * 获取视频OSD叠加配置失败
     */
    public static final int NET_ERROR_GETCFG_VIDEO_OSD = (0x80000000 | 313);

    /**
     * 设置视频OSD叠加配置失败
     */
    public static final int NET_ERROR_SETCFG_VIDEO_OSD = (0x80000000 | 314);

    /**
     * 获取CDMA\GPRS网络配置失败
     */
    public static final int NET_ERROR_GETCFG_GPRSCDMA = (0x80000000 | 315);

    /**
     * 设置CDMA\GPRS网络配置失败
     */
    public static final int NET_ERROR_SETCFG_GPRSCDMA = (0x80000000 | 316);

    /**
     * 获取IP过滤配置失败
     */
    public static final int NET_ERROR_GETCFG_IPFILTER = (0x80000000 | 317);

    /**
     * 设置IP过滤配置失败
     */
    public static final int NET_ERROR_SETCFG_IPFILTER = (0x80000000 | 318);

    /**
     * 获取语音对讲编码配置失败
     */
    public static final int NET_ERROR_GETCFG_TALKENCODE = (0x80000000 | 319);

    /**
     * 设置语音对讲编码配置失败
     */
    public static final int NET_ERROR_SETCFG_TALKENCODE = (0x80000000 | 320);

    /**
     * 获取录像打包长度配置失败
     */
    public static final int NET_ERROR_GETCFG_RECORDLEN = (0x80000000 | 321);

    /**
     * 设置录像打包长度配置失败
     */
    public static final int NET_ERROR_SETCFG_RECORDLEN = (0x80000000 | 322);

    /**
     * 不支持网络硬盘分区
     */
    public static final int NET_DONT_SUPPORT_SUBAREA = (0x80000000 | 323);

    /**
     * 获取设备上主动注册服务器信息失败
     */
    public static final int NET_ERROR_GET_AUTOREGSERVER = (0x80000000 | 324);

    /**
     * 主动注册重定向注册错误
     */
    public static final int NET_ERROR_CONTROL_AUTOREGISTER = (0x80000000 | 325);

    /**
     * 断开主动注册服务器错误
     */
    public static final int NET_ERROR_DISCONNECT_AUTOREGISTER = (0x80000000 | 326);

    /**
     * 获取mms配置失败
     */
    public static final int NET_ERROR_GETCFG_MMS = (0x80000000 | 327);

    /**
     * 设置mms配置失败
     */
    public static final int NET_ERROR_SETCFG_MMS = (0x80000000 | 328);

    /**
     * 获取短信激活无线连接配置失败
     */
    public static final int NET_ERROR_GETCFG_SMSACTIVATION = (0x80000000 | 329);

    /**
     * 设置短信激活无线连接配置失败
     */
    public static final int NET_ERROR_SETCFG_SMSACTIVATION = (0x80000000 | 330);

    /**
     * 获取拨号激活无线连接配置失败
     */
    public static final int NET_ERROR_GETCFG_DIALINACTIVATION = (0x80000000 | 331);

    /**
     * 设置拨号激活无线连接配置失败
     */
    public static final int NET_ERROR_SETCFG_DIALINACTIVATION = (0x80000000 | 332);

    /**
     * 查询视频输出参数配置失败
     */
    public static final int NET_ERROR_GETCFG_VIDEOOUT = (0x80000000 | 333);

    /**
     * 设置视频输出参数配置失败
     */
    public static final int NET_ERROR_SETCFG_VIDEOOUT = (0x80000000 | 334);

    /**
     * 获取osd叠加使能配置失败
     */
    public static final int NET_ERROR_GETCFG_OSDENABLE = (0x80000000 | 335);

    /**
     * 设置osd叠加使能配置失败
     */
    public static final int NET_ERROR_SETCFG_OSDENABLE = (0x80000000 | 336);

    /**
     * 设置数字通道前端编码接入配置失败
     */
    public static final int NET_ERROR_SETCFG_ENCODERINFO = (0x80000000 | 337);

    /**
     * 获取TV调节配置失败
     */
    public static final int NET_ERROR_GETCFG_TVADJUST = (0x80000000 | 338);

    /**
     * 设置TV调节配置失败
     */
    public static final int NET_ERROR_SETCFG_TVADJUST = (0x80000000 | 339);

    /**
     * 请求建立连接失败
     */
    public static final int NET_ERROR_CONNECT_FAILED = (0x80000000 | 340);

    /**
     * 请求刻录文件上传失败
     */
    public static final int NET_ERROR_SETCFG_BURNFILE = (0x80000000 | 341);

    /**
     * 获取抓包配置信息失败
     */
    public static final int NET_ERROR_SNIFFER_GETCFG = (0x80000000 | 342);

    /**
     * 设置抓包配置信息失败
     */
    public static final int NET_ERROR_SNIFFER_SETCFG = (0x80000000 | 343);

    /**
     * 查询下载限制信息失败
     */
    public static final int NET_ERROR_DOWNLOADRATE_GETCFG = (0x80000000 | 344);

    /**
     * 设置下载限制信息失败
     */
    public static final int NET_ERROR_DOWNLOADRATE_SETCFG = (0x80000000 | 345);

    /**
     * 查询串口参数失败
     */
    public static final int NET_ERROR_SEARCH_TRANSCOM = (0x80000000 | 346);

    /**
     * 获取预制点信息错误
     */
    public static final int NET_ERROR_GETCFG_POINT = (0x80000000 | 347);

    /**
     * 设置预制点信息错误
     */
    public static final int NET_ERROR_SETCFG_POINT = (0x80000000 | 348);

    /**
     * SDK没有正常登出设备
     */
    public static final int NET_SDK_LOGOUT_ERROR = (0x80000000 | 349);

    /**
     * 获取车载配置失败
     */
    public static final int NET_ERROR_GET_VEHICLE_CFG = (0x80000000 | 350);

    /**
     * 设置车载配置失败
     */
    public static final int NET_ERROR_SET_VEHICLE_CFG = (0x80000000 | 351);

    /**
     * 获取atm叠加配置失败
     */
    public static final int NET_ERROR_GET_ATM_OVERLAY_CFG = (0x80000000 | 352);

    /**
     * 设置atm叠加配置失败
     */
    public static final int NET_ERROR_SET_ATM_OVERLAY_CFG = (0x80000000 | 353);

    /**
     * 获取atm叠加能力失败
     */
    public static final int NET_ERROR_GET_ATM_OVERLAY_ABILITY = (0x80000000 | 354);

    /**
     * 获取解码器解码轮巡配置失败
     */
    public static final int NET_ERROR_GET_DECODER_TOUR_CFG = (0x80000000 | 355);

    /**
     * 设置解码器解码轮巡配置失败
     */
    public static final int NET_ERROR_SET_DECODER_TOUR_CFG = (0x80000000 | 356);

    /**
     * 控制解码器解码轮巡失败
     */
    public static final int NET_ERROR_CTRL_DECODER_TOUR = (0x80000000 | 357);

    /**
     * 超出设备支持最大用户组数目
     */
    public static final int NET_GROUP_OVERSUPPORTNUM = (0x80000000 | 358);

    /**
     * 超出设备支持最大用户数目
     */
    public static final int NET_USER_OVERSUPPORTNUM = (0x80000000 | 359);

    /**
     * 获取SIP配置失败
     */
    public static final int NET_ERROR_GET_SIP_CFG = (0x80000000 | 368);

    /**
     * 设置SIP配置失败
     */
    public static final int NET_ERROR_SET_SIP_CFG = (0x80000000 | 369);

    /**
     * 获取SIP能力失败
     */
    public static final int NET_ERROR_GET_SIP_ABILITY = (0x80000000 | 370);

    /**
     * 获取WIFI ap配置失败
     */
    public static final int NET_ERROR_GET_WIFI_AP_CFG = (0x80000000 | 371);

    /**
     * 设置WIFI ap配置失败
     */
    public static final int NET_ERROR_SET_WIFI_AP_CFG = (0x80000000 | 372);

    /**
     * 获取解码策略配置失败
     */
    public static final int NET_ERROR_GET_DECODE_POLICY = (0x80000000 | 373);

    /**
     * 设置解码策略配置失败
     */
    public static final int NET_ERROR_SET_DECODE_POLICY = (0x80000000 | 374);

    /**
     * 拒绝对讲
     */
    public static final int NET_ERROR_TALK_REJECT = (0x80000000 | 375);

    /**
     * 对讲被其他客户端打开
     */
    public static final int NET_ERROR_TALK_OPENED = (0x80000000 | 376);

    /**
     * 资源冲突
     */
    public static final int NET_ERROR_TALK_RESOURCE_CONFLICIT = (0x80000000 | 377);

    /**
     * 不支持的语音编码格式
     */
    public static final int NET_ERROR_TALK_UNSUPPORTED_ENCODE = (0x80000000 | 378);

    /**
     * 无权限
     */
    public static final int NET_ERROR_TALK_RIGHTLESS = (0x80000000 | 379);

    /**
     * 请求对讲失败
     */
    public static final int NET_ERROR_TALK_FAILED = (0x80000000 | 380);

    /**
     * 获取机器相关配置失败
     */
    public static final int NET_ERROR_GET_MACHINE_CFG = (0x80000000 | 381);

    /**
     * 设置机器相关配置失败
     */
    public static final int NET_ERROR_SET_MACHINE_CFG = (0x80000000 | 382);

    /**
     * 设备无法获取当前请求数据
     */
    public static final int NET_ERROR_GET_DATA_FAILED = (0x80000000 | 383);

    /**
     * MAC地址验证失败
     */
    public static final int NET_ERROR_MAC_VALIDATE_FAILED = (0x80000000 | 384);

    /**
     * 获取服务器实例失败
     */
    public static final int NET_ERROR_GET_INSTANCE = (0x80000000 | 385);

    /**
     * 生成的jason字符串错误
     */
    public static final int NET_ERROR_JSON_REQUEST = (0x80000000 | 386);

    /**
     * 响应的jason字符串错误
     */
    public static final int NET_ERROR_JSON_RESPONSE = (0x80000000 | 387);

    /**
     * 协议版本低于当前使用的版本
     */
    public static final int NET_ERROR_VERSION_HIGHER = (0x80000000 | 388);

    /**
     * 热备操作失败, 容量不足
     */
    public static final int NET_SPARE_NO_CAPACITY = (0x80000000 | 389);

    /**
     * 显示源被其他输出占用
     */
    public static final int NET_ERROR_SOURCE_IN_USE = (0x80000000 | 390);

    /**
     * 高级用户抢占低级用户资源
     */
    public static final int NET_ERROR_REAVE = (0x80000000 | 391);

    /**
     * 禁止入网
     */
    public static final int NET_ERROR_NETFORBID = (0x80000000 | 392);

    /**
     * 高级校验失败
     */
    public static final int NET_ERROR_SENIOR_VALIDATE_FAILED = (0x80000000 | 398);

    public static String description(int num) {
        switch (num) {
            case NET_NOERROR: return "没有错误";
            case NET_ERROR: return "未知错误";
            case NET_SYSTEM_ERROR: return "Windows系统出错";
            case NET_NETWORK_ERROR: return "网络错误，可能是因为网络超时";
            case NET_DEV_VER_NOMATCH: return "设备协议不匹配";
            case NET_INVALID_HANDLE: return "句柄无效";
            case NET_OPEN_CHANNEL_ERROR: return "打开通道失败";
            case NET_CLOSE_CHANNEL_ERROR: return "关闭通道失败";
            case NET_ILLEGAL_PARAM: return "用户参数不合法";
            case NET_SDK_INIT_ERROR: return "SDK初始化出错";
            case NET_SDK_UNINIT_ERROR: return "SDK清理出错";
            case NET_RENDER_OPEN_ERROR: return "申请render资源出错";
            case NET_DEC_OPEN_ERROR: return "打开解码库出错";
            case NET_DEC_CLOSE_ERROR: return "关闭解码库出错";
            case NET_MULTIPLAY_NOCHANNEL: return "多画面预览中检测到通道数为0";
            case NET_TALK_INIT_ERROR: return "录音库初始化失败";
            case NET_TALK_NOT_INIT: return "录音库未经初始化";
            case NET_TALK_SENDDATA_ERROR: return "发送音频数据出错";
            case NET_REAL_ALREADY_SAVING: return "实时数据已经处于保存状态";
            case NET_NOT_SAVING: return "未保存实时数据";
            case NET_OPEN_FILE_ERROR: return "打开文件出错";
            case NET_PTZ_SET_TIMER_ERROR: return "启动云台控制定时器失败";
            case NET_RETURN_DATA_ERROR: return "对返回数据的校验出错";
            case NET_INSUFFICIENT_BUFFER: return "没有足够的缓存";
            case NET_NOT_SUPPORTED: return "当前SDK未支持该功能";
            case NET_NO_RECORD_FOUND: return "查询不到录象";
            case NET_NOT_AUTHORIZED: return "无操作权限";
            case NET_NOT_NOW: return "暂时无法执行";
            case NET_NO_TALK_CHANNEL: return "未发现对讲通道";
            case NET_NO_AUDIO: return "未发现音频";
            case NET_NO_INIT: return "网络SDK未经初始化";
            case NET_DOWNLOAD_END: return "下载已结束";
            case NET_EMPTY_LIST: return "查询结果为空";
            case NET_ERROR_GETCFG_SYSATTR: return "获取系统属性配置失败";
            case NET_ERROR_GETCFG_SERIAL: return "获取序列号失败";
            case NET_ERROR_GETCFG_GENERAL: return "获取常规属性失败";
            case NET_ERROR_GETCFG_DSPCAP: return "获取DSP能力描述失败";
            case NET_ERROR_GETCFG_NETCFG: return "获取网络配置失败";
            case NET_ERROR_GETCFG_CHANNAME: return "获取通道名称失败";
            case NET_ERROR_GETCFG_VIDEO: return "获取视频属性失败";
            case NET_ERROR_GETCFG_RECORD: return "获取录象配置失败";
            case NET_ERROR_GETCFG_PRONAME: return "获取解码器协议名称失败";
            case NET_ERROR_GETCFG_FUNCNAME: return "获取232串口功能名称失败";
            case NET_ERROR_GETCFG_485DECODER: return "获取解码器属性失败";
            case NET_ERROR_GETCFG_232COM: return "获取232串口配置失败";
            case NET_ERROR_GETCFG_ALARMIN: return "获取外部报警输入配置失败";
            case NET_ERROR_GETCFG_ALARMDET: return "获取动态检测报警失败";
            case NET_ERROR_GETCFG_SYSTIME: return "获取设备时间失败";
            case NET_ERROR_GETCFG_PREVIEW: return "获取预览参数失败";
            case NET_ERROR_GETCFG_AUTOMT: return "获取自动维护配置失败";
            case NET_ERROR_GETCFG_VIDEOMTRX: return "获取视频矩阵配置失败";
            case NET_ERROR_GETCFG_COVER: return "获取区域遮挡配置失败";
            case NET_ERROR_GETCFG_WATERMAKE: return "获取图象水印配置失败";
            case NET_ERROR_SETCFG_GENERAL: return "修改常规属性失败";
            case NET_ERROR_SETCFG_NETCFG: return "修改网络配置失败";
            case NET_ERROR_SETCFG_CHANNAME: return "修改通道名称失败";
            case NET_ERROR_SETCFG_VIDEO: return "修改视频属性失败";
            case NET_ERROR_SETCFG_RECORD: return "修改录象配置失败";
            case NET_ERROR_SETCFG_485DECODER: return "修改解码器属性失败";
            case NET_ERROR_SETCFG_232COM: return "修改232串口配置失败";
            case NET_ERROR_SETCFG_ALARMIN: return "修改外部输入报警配置失败";
            case NET_ERROR_SETCFG_ALARMDET: return "修改动态检测报警配置失败";
            case NET_ERROR_SETCFG_SYSTIME: return "修改设备时间失败";
            case NET_ERROR_SETCFG_PREVIEW: return "修改预览参数失败";
            case NET_ERROR_SETCFG_AUTOMT: return "修改自动维护配置失败";
            case NET_ERROR_SETCFG_VIDEOMTRX: return "修改视频矩阵配置失败";
            case NET_ERROR_SETCFG_COVER: return "修改区域遮挡配置失败";
            case NET_ERROR_SETCFG_WATERMAKE: return "修改图象水印配置失败";
            case NET_ERROR_SETCFG_WLAN: return "修改无线网络信息失败";
            case NET_ERROR_SETCFG_WLANDEV: return "选择无线网络设备失败";
            case NET_ERROR_SETCFG_REGISTER: return "修改主动注册参数配置失败";
            case NET_ERROR_SETCFG_CAMERA: return "修改摄像头属性配置失败";
            case NET_ERROR_SETCFG_INFRARED: return "修改红外报警配置失败";
            case NET_ERROR_SETCFG_SOUNDALARM: return "修改音频报警配置失败";
            case NET_ERROR_SETCFG_STORAGE: return "修改存储位置配置失败";
            case NET_AUDIOENCODE_NOTINIT: return "音频编码接口没有成功初始化";
            case NET_DATA_TOOLONGH: return "数据过长";
            case NET_UNSUPPORTED: return "设备不支持该操作";
            case NET_DEVICE_BUSY: return "设备资源不足";
            case NET_SERVER_STARTED: return "服务器已经启动";
            case NET_SERVER_STOPPED: return "服务器尚未成功启动";
            case NET_LISTER_INCORRECT_SERIAL: return "输入序列号有误";
            case NET_QUERY_DISKINFO_FAILED: return "获取硬盘信息失败";
            case NET_ERROR_GETCFG_SESSION: return "获取连接Session信息";
            case NET_USER_FLASEPWD_TRYTIME: return "输入密码错误超过限制次数";
            case NET_LOGIN_ERROR_PASSWORD: return "密码不正确";
            case NET_LOGIN_ERROR_USER: return "帐户不存在";
            case NET_LOGIN_ERROR_TIMEOUT: return "等待登录返回超时";
            case NET_LOGIN_ERROR_RELOGGIN: return "帐号已登录";
            case NET_LOGIN_ERROR_LOCKED: return "帐号已被锁定";
            case NET_LOGIN_ERROR_BLACKLIST: return "帐号已被列为黑名单";
            case NET_LOGIN_ERROR_BUSY: return "资源不足，系统忙";
            case NET_LOGIN_ERROR_CONNECT: return "登录设备超时，请检查网络并重试";
            case NET_LOGIN_ERROR_NETWORK: return "网络连接失败";
            case NET_LOGIN_ERROR_SUBCONNECT: return "登录设备成功，但无法创建视频通道，请检查网络状况";
            case NET_LOGIN_ERROR_MAXCONNECT: return "超过最大连接数";
            case NET_LOGIN_ERROR_PROTOCOL3_ONLY: return "只支持3代协议";
            case NET_LOGIN_ERROR_UKEY_LOST: return "未插入U盾或U盾信息错误";
            case NET_LOGIN_ERROR_NO_AUTHORIZED: return "客户端IP地址没有登录权限";
            case NET_RENDER_SOUND_ON_ERROR: return "Render库打开音频出错";
            case NET_RENDER_SOUND_OFF_ERROR: return "Render库关闭音频出错";
            case NET_RENDER_SET_VOLUME_ERROR: return "Render库控制音量出错";
            case NET_RENDER_ADJUST_ERROR: return "Render库设置画面参数出错";
            case NET_RENDER_PAUSE_ERROR: return "Render库暂停播放出错";
            case NET_RENDER_SNAP_ERROR: return "Render库抓图出错";
            case NET_RENDER_STEP_ERROR: return "Render库步进出错";
            case NET_RENDER_FRAMERATE_ERROR: return "Render库设置帧率出错";
            case NET_GROUP_EXIST: return "组名已存在";
            case NET_GROUP_NOEXIST: return "组名不存在";
            case NET_GROUP_RIGHTOVER: return "组的权限超出权限列表范围";
            case NET_GROUP_HAVEUSER: return "组下有用户，不能删除";
            case NET_GROUP_RIGHTUSE: return "组的某个权限被用户使用，不能出除";
            case NET_GROUP_SAMENAME: return "新组名同已有组名重复";
            case NET_USER_EXIST: return "用户已存在";
            case NET_USER_NOEXIST: return "用户不存在";
            case NET_USER_RIGHTOVER: return "用户权限超出组权限";
            case NET_USER_PWD: return "保留帐号，不容许修改密码";
            case NET_USER_FLASEPWD: return "密码不正确";
            case NET_USER_NOMATCHING: return "密码不匹配";
            case NET_USER_INUSE: return "账号正在使用中";
            case NET_ERROR_GETCFG_ETHERNET: return "获取网卡配置失败";
            case NET_ERROR_GETCFG_WLAN: return "获取无线网络信息失败";
            case NET_ERROR_GETCFG_WLANDEV: return "获取无线网络设备失败";
            case NET_ERROR_GETCFG_REGISTER: return "获取主动注册参数失败";
            case NET_ERROR_GETCFG_CAMERA: return "获取摄像头属性失败";
            case NET_ERROR_GETCFG_INFRARED: return "获取红外报警配置失败";
            case NET_ERROR_GETCFG_SOUNDALARM: return "获取音频报警配置失败";
            case NET_ERROR_GETCFG_STORAGE: return "获取存储位置配置失败";
            case NET_ERROR_GETCFG_MAIL: return "获取邮件配置失败";
            case NET_CONFIG_DEVBUSY: return "暂时无法设置";
            case NET_CONFIG_DATAILLEGAL: return "配置数据不合法";
            case NET_ERROR_GETCFG_DST: return "获取夏令时配置失败";
            case NET_ERROR_SETCFG_DST: return "设置夏令时配置失败";
            case NET_ERROR_GETCFG_VIDEO_OSD: return "获取视频OSD叠加配置失败";
            case NET_ERROR_SETCFG_VIDEO_OSD: return "设置视频OSD叠加配置失败";
            case NET_ERROR_GETCFG_GPRSCDMA: return "获取CDMA\\GPRS网络配置失败";
            case NET_ERROR_SETCFG_GPRSCDMA: return "设置CDMA\\GPRS网络配置失败";
            case NET_ERROR_GETCFG_IPFILTER: return "获取IP过滤配置失败";
            case NET_ERROR_SETCFG_IPFILTER: return "设置IP过滤配置失败";
            case NET_ERROR_GETCFG_TALKENCODE: return "获取语音对讲编码配置失败";
            case NET_ERROR_SETCFG_TALKENCODE: return "设置语音对讲编码配置失败";
            case NET_ERROR_GETCFG_RECORDLEN: return "获取录像打包长度配置失败";
            case NET_ERROR_SETCFG_RECORDLEN: return "设置录像打包长度配置失败";
            case NET_DONT_SUPPORT_SUBAREA: return "不支持网络硬盘分区";
            case NET_ERROR_GET_AUTOREGSERVER: return "获取设备上主动注册服务器信息失败";
            case NET_ERROR_CONTROL_AUTOREGISTER: return "主动注册重定向注册错误";
            case NET_ERROR_DISCONNECT_AUTOREGISTER: return "断开主动注册服务器错误";
            case NET_ERROR_GETCFG_MMS: return "获取mms配置失败";
            case NET_ERROR_SETCFG_MMS: return "设置mms配置失败";
            case NET_ERROR_GETCFG_SMSACTIVATION: return "获取短信激活无线连接配置失败";
            case NET_ERROR_SETCFG_SMSACTIVATION: return "设置短信激活无线连接配置失败";
            case NET_ERROR_GETCFG_DIALINACTIVATION: return "获取拨号激活无线连接配置失败";
            case NET_ERROR_SETCFG_DIALINACTIVATION: return "设置拨号激活无线连接配置失败";
            case NET_ERROR_GETCFG_VIDEOOUT: return "查询视频输出参数配置失败";
            case NET_ERROR_SETCFG_VIDEOOUT: return "设置视频输出参数配置失败";
            case NET_ERROR_GETCFG_OSDENABLE: return "获取osd叠加使能配置失败";
            case NET_ERROR_SETCFG_OSDENABLE: return "设置osd叠加使能配置失败";
            case NET_ERROR_SETCFG_ENCODERINFO: return "设置数字通道前端编码接入配置失败";
            case NET_ERROR_GETCFG_TVADJUST: return "获取TV调节配置失败";
            case NET_ERROR_SETCFG_TVADJUST: return "设置TV调节配置失败";
            case NET_ERROR_CONNECT_FAILED: return "请求建立连接失败";
            case NET_ERROR_SETCFG_BURNFILE: return "请求刻录文件上传失败";
            case NET_ERROR_SNIFFER_GETCFG: return "获取抓包配置信息失败";
            case NET_ERROR_SNIFFER_SETCFG: return "设置抓包配置信息失败";
            case NET_ERROR_DOWNLOADRATE_GETCFG: return "查询下载限制信息失败";
            case NET_ERROR_DOWNLOADRATE_SETCFG: return "设置下载限制信息失败";
            case NET_ERROR_SEARCH_TRANSCOM: return "查询串口参数失败";
            case NET_ERROR_GETCFG_POINT: return "获取预制点信息错误";
            case NET_ERROR_SETCFG_POINT: return "设置预制点信息错误";
            case NET_SDK_LOGOUT_ERROR: return "SDK没有正常登出设备";
            case NET_ERROR_GET_VEHICLE_CFG: return "获取车载配置失败";
            case NET_ERROR_SET_VEHICLE_CFG: return "设置车载配置失败";
            case NET_ERROR_GET_ATM_OVERLAY_CFG: return "获取atm叠加配置失败";
            case NET_ERROR_SET_ATM_OVERLAY_CFG: return "设置atm叠加配置失败";
            case NET_ERROR_GET_ATM_OVERLAY_ABILITY: return "获取atm叠加能力失败";
            case NET_ERROR_GET_DECODER_TOUR_CFG: return "获取解码器解码轮巡配置失败";
            case NET_ERROR_SET_DECODER_TOUR_CFG: return "设置解码器解码轮巡配置失败";
            case NET_ERROR_CTRL_DECODER_TOUR: return "控制解码器解码轮巡失败";
            case NET_GROUP_OVERSUPPORTNUM: return "超出设备支持最大用户组数目";
            case NET_USER_OVERSUPPORTNUM: return "超出设备支持最大用户数目";
            case NET_ERROR_GET_SIP_CFG: return "获取SIP配置失败";
            case NET_ERROR_SET_SIP_CFG: return "设置SIP配置失败";
            case NET_ERROR_GET_SIP_ABILITY: return "获取SIP能力失败";
            case NET_ERROR_GET_WIFI_AP_CFG: return "获取WIFI ap配置失败";
            case NET_ERROR_SET_WIFI_AP_CFG: return "设置WIFI ap配置失败";
            case NET_ERROR_GET_DECODE_POLICY: return "获取解码策略配置失败";
            case NET_ERROR_SET_DECODE_POLICY: return "设置解码策略配置失败";
            case NET_ERROR_TALK_REJECT: return "拒绝对讲";
            case NET_ERROR_TALK_OPENED: return "对讲被其他客户端打开";
            case NET_ERROR_TALK_RESOURCE_CONFLICIT: return "资源冲突";
            case NET_ERROR_TALK_UNSUPPORTED_ENCODE: return "不支持的语音编码格式";
            case NET_ERROR_TALK_RIGHTLESS: return "无权限";
            case NET_ERROR_TALK_FAILED: return "请求对讲失败";
            case NET_ERROR_GET_MACHINE_CFG: return "获取机器相关配置失败";
            case NET_ERROR_SET_MACHINE_CFG: return "设置机器相关配置失败";
            case NET_ERROR_GET_DATA_FAILED: return "设备无法获取当前请求数据";
            case NET_ERROR_MAC_VALIDATE_FAILED: return "MAC地址验证失败";
            case NET_ERROR_GET_INSTANCE: return "获取服务器实例失败";
            case NET_ERROR_JSON_REQUEST: return "生成的jason字符串错误";
            case NET_ERROR_JSON_RESPONSE: return "响应的jason字符串错误";
            case NET_ERROR_VERSION_HIGHER: return "协议版本低于当前使用的版本";
            case NET_SPARE_NO_CAPACITY: return "热备操作失败, 容量不足";
            case NET_ERROR_SOURCE_IN_USE: return "显示源被其他输出占用";
            case NET_ERROR_REAVE: return "高级用户抢占低级用户资源";
            case NET_ERROR_NETFORBID: return "禁止入网";
            case NET_ERROR_SENIOR_VALIDATE_FAILED: return "高级校验失败";
            default: return "未知错误";
        }
    }
}
