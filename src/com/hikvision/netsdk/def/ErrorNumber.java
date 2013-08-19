package com.hikvision.netsdk.def;

/**
 * 海康SDK错误号定义
 */
public abstract class ErrorNumber {
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
}
