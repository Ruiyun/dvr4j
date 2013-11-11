#ifndef DHNETSDK_H
#define DHNETSDK_H

#if (defined(WIN32) || defined(WIN64))
#include <windows.h>
#ifdef DHNETSDK_EXPORTS

#ifndef CLIENT_API
#define CLIENT_API __declspec(dllexport)
#endif

#else

#ifndef CLIENT_API
#define CLIENT_API __declspec(dllimport)
#endif

#endif #ifdef DHNETSDK_EXPORTS

#define CALLBACK __stdcall
#define CALL_METHOD __stdcall  //__cdecl

#define INT64 __int64

#ifndef LLONG
#ifdef WIN32
#define LLONG LONG
#else //WIN64
#define LLONG INT64
#endif
#endif

#ifndef LDWORD
#ifdef WIN32
#define LDWORD DWORD
#else //WIN64
#define LDWORD INT64
#endif
#endif

#else    //linux

#define CLIENT_API extern "C"
#define CALL_METHOD
#define CALLBACK

#define WORD    unsigned short
#define DWORD   unsigned int
#define LONG    int
#define LPDWORD DWORD*
#define BOOL    int
#define TRUE    1
#define FALSE   0
#define BYTE    unsigned char
#define UINT    unsigned int
#define HDC     void*
#define HWND    void*
#define LPVOID  void*
#define NULL    0
#define LLONG   long
#define INT64   long long
#define LDWORD  long


#ifndef MAX_PATH
#define MAX_PATH 260
#endif

#define DH_SERIALNO_LEN 48      // 设备序列号字符长度

// 错误类型代号，对应CLIENT_GetLastError接口的返回值
#define _EC(x)                            (0x80000000|x)
#define NET_NOERROR                       0 // 没有错误
#define NET_ERROR                         -1 // 未知错误
#define NET_SYSTEM_ERROR                  _EC(1) // Windows系统出错
#define NET_NETWORK_ERROR                 _EC(2) // 网络错误，可能是因为网络超时
#define NET_DEV_VER_NOMATCH               _EC(3) // 设备协议不匹配
#define NET_INVALID_HANDLE                _EC(4) // 句柄无效
#define NET_OPEN_CHANNEL_ERROR            _EC(5) // 打开通道失败
#define NET_CLOSE_CHANNEL_ERROR           _EC(6) // 关闭通道失败
#define NET_ILLEGAL_PARAM                 _EC(7) // 用户参数不合法
#define NET_SDK_INIT_ERROR                _EC(8) // SDK初始化出错
#define NET_SDK_UNINIT_ERROR              _EC(9) // SDK清理出错
#define NET_RENDER_OPEN_ERROR             _EC(10) // 申请render资源出错
#define NET_DEC_OPEN_ERROR                _EC(11) // 打开解码库出错
#define NET_DEC_CLOSE_ERROR               _EC(12) // 关闭解码库出错
#define NET_MULTIPLAY_NOCHANNEL           _EC(13) // 多画面预览中检测到通道数为0
#define NET_TALK_INIT_ERROR               _EC(14) // 录音库初始化失败
#define NET_TALK_NOT_INIT                 _EC(15) // 录音库未经初始化
#define NET_TALK_SENDDATA_ERROR           _EC(16) // 发送音频数据出错
#define NET_REAL_ALREADY_SAVING           _EC(17) // 实时数据已经处于保存状态
#define NET_NOT_SAVING                    _EC(18) // 未保存实时数据
#define NET_OPEN_FILE_ERROR               _EC(19) // 打开文件出错
#define NET_PTZ_SET_TIMER_ERROR           _EC(20) // 启动云台控制定时器失败
#define NET_RETURN_DATA_ERROR             _EC(21) // 对返回数据的校验出错
#define NET_INSUFFICIENT_BUFFER           _EC(22) // 没有足够的缓存
#define NET_NOT_SUPPORTED                 _EC(23) // 当前SDK未支持该功能
#define NET_NO_RECORD_FOUND               _EC(24) // 查询不到录象
#define NET_NOT_AUTHORIZED                _EC(25) // 无操作权限
#define NET_NOT_NOW                       _EC(26) // 暂时无法执行
#define NET_NO_TALK_CHANNEL               _EC(27) // 未发现对讲通道
#define NET_NO_AUDIO                      _EC(28) // 未发现音频
#define NET_NO_INIT                       _EC(29) // 网络SDK未经初始化
#define NET_DOWNLOAD_END                  _EC(30) // 下载已结束
#define NET_EMPTY_LIST                    _EC(31) // 查询结果为空
#define NET_ERROR_GETCFG_SYSATTR          _EC(32) // 获取系统属性配置失败
#define NET_ERROR_GETCFG_SERIAL           _EC(33) // 获取序列号失败
#define NET_ERROR_GETCFG_GENERAL          _EC(34) // 获取常规属性失败
#define NET_ERROR_GETCFG_DSPCAP           _EC(35) // 获取DSP能力描述失败
#define NET_ERROR_GETCFG_NETCFG           _EC(36) // 获取网络配置失败
#define NET_ERROR_GETCFG_CHANNAME         _EC(37) // 获取通道名称失败
#define NET_ERROR_GETCFG_VIDEO            _EC(38) // 获取视频属性失败
#define NET_ERROR_GETCFG_RECORD           _EC(39) // 获取录象配置失败
#define NET_ERROR_GETCFG_PRONAME          _EC(40) // 获取解码器协议名称失败
#define NET_ERROR_GETCFG_FUNCNAME         _EC(41) // 获取232串口功能名称失败
#define NET_ERROR_GETCFG_485DECODER       _EC(42) // 获取解码器属性失败
#define NET_ERROR_GETCFG_232COM           _EC(43) // 获取232串口配置失败
#define NET_ERROR_GETCFG_ALARMIN          _EC(44) // 获取外部报警输入配置失败
#define NET_ERROR_GETCFG_ALARMDET         _EC(45) // 获取动态检测报警失败
#define NET_ERROR_GETCFG_SYSTIME          _EC(46) // 获取设备时间失败
#define NET_ERROR_GETCFG_PREVIEW          _EC(47) // 获取预览参数失败
#define NET_ERROR_GETCFG_AUTOMT           _EC(48) // 获取自动维护配置失败
#define NET_ERROR_GETCFG_VIDEOMTRX        _EC(49) // 获取视频矩阵配置失败
#define NET_ERROR_GETCFG_COVER            _EC(50) // 获取区域遮挡配置失败
#define NET_ERROR_GETCFG_WATERMAKE        _EC(51) // 获取图象水印配置失败
#define NET_ERROR_SETCFG_GENERAL          _EC(55) // 修改常规属性失败
#define NET_ERROR_SETCFG_NETCFG           _EC(56) // 修改网络配置失败
#define NET_ERROR_SETCFG_CHANNAME         _EC(57) // 修改通道名称失败
#define NET_ERROR_SETCFG_VIDEO            _EC(58) // 修改视频属性失败
#define NET_ERROR_SETCFG_RECORD           _EC(59) // 修改录象配置失败
#define NET_ERROR_SETCFG_485DECODER       _EC(60) // 修改解码器属性失败
#define NET_ERROR_SETCFG_232COM           _EC(61) // 修改232串口配置失败
#define NET_ERROR_SETCFG_ALARMIN          _EC(62) // 修改外部输入报警配置失败
#define NET_ERROR_SETCFG_ALARMDET         _EC(63) // 修改动态检测报警配置失败
#define NET_ERROR_SETCFG_SYSTIME          _EC(64) // 修改设备时间失败
#define NET_ERROR_SETCFG_PREVIEW          _EC(65) // 修改预览参数失败
#define NET_ERROR_SETCFG_AUTOMT           _EC(66) // 修改自动维护配置失败
#define NET_ERROR_SETCFG_VIDEOMTRX        _EC(67) // 修改视频矩阵配置失败
#define NET_ERROR_SETCFG_COVER            _EC(68) // 修改区域遮挡配置失败
#define NET_ERROR_SETCFG_WATERMAKE        _EC(69) // 修改图象水印配置失败
#define NET_ERROR_SETCFG_WLAN             _EC(70) // 修改无线网络信息失败
#define NET_ERROR_SETCFG_WLANDEV          _EC(71) // 选择无线网络设备失败
#define NET_ERROR_SETCFG_REGISTER         _EC(72) // 修改主动注册参数配置失败
#define NET_ERROR_SETCFG_CAMERA           _EC(73) // 修改摄像头属性配置失败
#define NET_ERROR_SETCFG_INFRARED         _EC(74) // 修改红外报警配置失败
#define NET_ERROR_SETCFG_SOUNDALARM       _EC(75) // 修改音频报警配置失败
#define NET_ERROR_SETCFG_STORAGE          _EC(76) // 修改存储位置配置失败
#define NET_AUDIOENCODE_NOTINIT           _EC(77) // 音频编码接口没有成功初始化
#define NET_DATA_TOOLONGH                 _EC(78) // 数据过长
#define NET_UNSUPPORTED                   _EC(79) // 设备不支持该操作
#define NET_DEVICE_BUSY                   _EC(80) // 设备资源不足
#define NET_SERVER_STARTED                _EC(81) // 服务器已经启动
#define NET_SERVER_STOPPED                _EC(82) // 服务器尚未成功启动
#define NET_LISTER_INCORRECT_SERIAL       _EC(83) // 输入序列号有误
#define NET_QUERY_DISKINFO_FAILED         _EC(84) // 获取硬盘信息失败
#define NET_ERROR_GETCFG_SESSION          _EC(85) // 获取连接Session信息
#define NET_USER_FLASEPWD_TRYTIME         _EC(86) // 输入密码错误超过限制次数
#define NET_LOGIN_ERROR_PASSWORD          _EC(100) // 密码不正确
#define NET_LOGIN_ERROR_USER              _EC(101) // 帐户不存在
#define NET_LOGIN_ERROR_TIMEOUT           _EC(102) // 等待登录返回超时
#define NET_LOGIN_ERROR_RELOGGIN          _EC(103) // 帐号已登录
#define NET_LOGIN_ERROR_LOCKED            _EC(104) // 帐号已被锁定
#define NET_LOGIN_ERROR_BLACKLIST         _EC(105) // 帐号已被列为黑名单
#define NET_LOGIN_ERROR_BUSY              _EC(106) // 资源不足，系统忙
#define NET_LOGIN_ERROR_CONNECT           _EC(107) // 登录设备超时，请检查网络并重试
#define NET_LOGIN_ERROR_NETWORK           _EC(108) // 网络连接失败
#define NET_LOGIN_ERROR_SUBCONNECT        _EC(109) // 登录设备成功，但无法创建视频通道，请检查网络状况
#define NET_LOGIN_ERROR_MAXCONNECT        _EC(110) // 超过最大连接数
#define NET_LOGIN_ERROR_PROTOCOL3_ONLY    _EC(111) // 只支持3代协议
#define NET_LOGIN_ERROR_UKEY_LOST         _EC(112) // 未插入U盾或U盾信息错误
#define NET_LOGIN_ERROR_NO_AUTHORIZED     _EC(113) // 客户端IP地址没有登录权限
#define NET_RENDER_SOUND_ON_ERROR         _EC(120) // Render库打开音频出错
#define NET_RENDER_SOUND_OFF_ERROR        _EC(121) // Render库关闭音频出错
#define NET_RENDER_SET_VOLUME_ERROR       _EC(122) // Render库控制音量出错
#define NET_RENDER_ADJUST_ERROR           _EC(123) // Render库设置画面参数出错
#define NET_RENDER_PAUSE_ERROR            _EC(124) // Render库暂停播放出错
#define NET_RENDER_SNAP_ERROR             _EC(125) // Render库抓图出错
#define NET_RENDER_STEP_ERROR             _EC(126) // Render库步进出错
#define NET_RENDER_FRAMERATE_ERROR        _EC(127) // Render库设置帧率出错
#define NET_GROUP_EXIST                   _EC(140) // 组名已存在
#define NET_GROUP_NOEXIST                 _EC(141) // 组名不存在
#define NET_GROUP_RIGHTOVER               _EC(142) // 组的权限超出权限列表范围
#define NET_GROUP_HAVEUSER                _EC(143) // 组下有用户，不能删除
#define NET_GROUP_RIGHTUSE                _EC(144) // 组的某个权限被用户使用，不能出除
#define NET_GROUP_SAMENAME                _EC(145) // 新组名同已有组名重复
#define NET_USER_EXIST                    _EC(146) // 用户已存在
#define NET_USER_NOEXIST                  _EC(147) // 用户不存在
#define NET_USER_RIGHTOVER                _EC(148) // 用户权限超出组权限
#define NET_USER_PWD                      _EC(149) // 保留帐号，不容许修改密码
#define NET_USER_FLASEPWD                 _EC(150) // 密码不正确
#define NET_USER_NOMATCHING               _EC(151) // 密码不匹配
#define NET_USER_INUSE                    _EC(152) // 账号正在使用中
#define NET_ERROR_GETCFG_ETHERNET         _EC(300) // 获取网卡配置失败
#define NET_ERROR_GETCFG_WLAN             _EC(301) // 获取无线网络信息失败
#define NET_ERROR_GETCFG_WLANDEV          _EC(302) // 获取无线网络设备失败
#define NET_ERROR_GETCFG_REGISTER         _EC(303) // 获取主动注册参数失败
#define NET_ERROR_GETCFG_CAMERA           _EC(304) // 获取摄像头属性失败
#define NET_ERROR_GETCFG_INFRARED         _EC(305) // 获取红外报警配置失败
#define NET_ERROR_GETCFG_SOUNDALARM       _EC(306) // 获取音频报警配置失败
#define NET_ERROR_GETCFG_STORAGE          _EC(307) // 获取存储位置配置失败
#define NET_ERROR_GETCFG_MAIL             _EC(308) // 获取邮件配置失败
#define NET_CONFIG_DEVBUSY                _EC(309) // 暂时无法设置
#define NET_CONFIG_DATAILLEGAL            _EC(310) // 配置数据不合法
#define NET_ERROR_GETCFG_DST              _EC(311) // 获取夏令时配置失败
#define NET_ERROR_SETCFG_DST              _EC(312) // 设置夏令时配置失败
#define NET_ERROR_GETCFG_VIDEO_OSD        _EC(313) // 获取视频OSD叠加配置失败
#define NET_ERROR_SETCFG_VIDEO_OSD        _EC(314) // 设置视频OSD叠加配置失败
#define NET_ERROR_GETCFG_GPRSCDMA         _EC(315) // 获取CDMA\GPRS网络配置失败
#define NET_ERROR_SETCFG_GPRSCDMA         _EC(316) // 设置CDMA\GPRS网络配置失败
#define NET_ERROR_GETCFG_IPFILTER         _EC(317) // 获取IP过滤配置失败
#define NET_ERROR_SETCFG_IPFILTER         _EC(318) // 设置IP过滤配置失败
#define NET_ERROR_GETCFG_TALKENCODE       _EC(319) // 获取语音对讲编码配置失败
#define NET_ERROR_SETCFG_TALKENCODE       _EC(320) // 设置语音对讲编码配置失败
#define NET_ERROR_GETCFG_RECORDLEN        _EC(321) // 获取录像打包长度配置失败
#define NET_ERROR_SETCFG_RECORDLEN        _EC(322) // 设置录像打包长度配置失败
#define NET_DONT_SUPPORT_SUBAREA          _EC(323) // 不支持网络硬盘分区
#define NET_ERROR_GET_AUTOREGSERVER       _EC(324) // 获取设备上主动注册服务器信息失败
#define NET_ERROR_CONTROL_AUTOREGISTER    _EC(325) // 主动注册重定向注册错误
#define NET_ERROR_DISCONNECT_AUTOREGISTER _EC(326) // 断开主动注册服务器错误
#define NET_ERROR_GETCFG_MMS              _EC(327) // 获取mms配置失败
#define NET_ERROR_SETCFG_MMS              _EC(328) // 设置mms配置失败
#define NET_ERROR_GETCFG_SMSACTIVATION    _EC(329) // 获取短信激活无线连接配置失败
#define NET_ERROR_SETCFG_SMSACTIVATION    _EC(330) // 设置短信激活无线连接配置失败
#define NET_ERROR_GETCFG_DIALINACTIVATION _EC(331) // 获取拨号激活无线连接配置失败
#define NET_ERROR_SETCFG_DIALINACTIVATION _EC(332) // 设置拨号激活无线连接配置失败
#define NET_ERROR_GETCFG_VIDEOOUT         _EC(333) // 查询视频输出参数配置失败
#define NET_ERROR_SETCFG_VIDEOOUT         _EC(334) // 设置视频输出参数配置失败
#define NET_ERROR_GETCFG_OSDENABLE        _EC(335) // 获取osd叠加使能配置失败
#define NET_ERROR_SETCFG_OSDENABLE        _EC(336) // 设置osd叠加使能配置失败
#define NET_ERROR_SETCFG_ENCODERINFO      _EC(337) // 设置数字通道前端编码接入配置失败
#define NET_ERROR_GETCFG_TVADJUST         _EC(338) // 获取TV调节配置失败
#define NET_ERROR_SETCFG_TVADJUST         _EC(339) // 设置TV调节配置失败
#define NET_ERROR_CONNECT_FAILED          _EC(340) // 请求建立连接失败
#define NET_ERROR_SETCFG_BURNFILE         _EC(341) // 请求刻录文件上传失败
#define NET_ERROR_SNIFFER_GETCFG          _EC(342) // 获取抓包配置信息失败
#define NET_ERROR_SNIFFER_SETCFG          _EC(343) // 设置抓包配置信息失败
#define NET_ERROR_DOWNLOADRATE_GETCFG     _EC(344) // 查询下载限制信息失败
#define NET_ERROR_DOWNLOADRATE_SETCFG     _EC(345) // 设置下载限制信息失败
#define NET_ERROR_SEARCH_TRANSCOM         _EC(346) // 查询串口参数失败
#define NET_ERROR_GETCFG_POINT            _EC(347) // 获取预制点信息错误
#define NET_ERROR_SETCFG_POINT            _EC(348) // 设置预制点信息错误
#define NET_SDK_LOGOUT_ERROR              _EC(349) // SDK没有正常登出设备
#define NET_ERROR_GET_VEHICLE_CFG         _EC(350) // 获取车载配置失败
#define NET_ERROR_SET_VEHICLE_CFG         _EC(351) // 设置车载配置失败
#define NET_ERROR_GET_ATM_OVERLAY_CFG     _EC(352) // 获取atm叠加配置失败
#define NET_ERROR_SET_ATM_OVERLAY_CFG     _EC(353) // 设置atm叠加配置失败
#define NET_ERROR_GET_ATM_OVERLAY_ABILITY _EC(354) // 获取atm叠加能力失败
#define NET_ERROR_GET_DECODER_TOUR_CFG    _EC(355) // 获取解码器解码轮巡配置失败
#define NET_ERROR_SET_DECODER_TOUR_CFG    _EC(356) // 设置解码器解码轮巡配置失败
#define NET_ERROR_CTRL_DECODER_TOUR       _EC(357) // 控制解码器解码轮巡失败
#define NET_GROUP_OVERSUPPORTNUM          _EC(358) // 超出设备支持最大用户组数目
#define NET_USER_OVERSUPPORTNUM           _EC(359) // 超出设备支持最大用户数目
#define NET_ERROR_GET_SIP_CFG             _EC(368) // 获取SIP配置失败
#define NET_ERROR_SET_SIP_CFG             _EC(369) // 设置SIP配置失败
#define NET_ERROR_GET_SIP_ABILITY         _EC(370) // 获取SIP能力失败
#define NET_ERROR_GET_WIFI_AP_CFG         _EC(371) // 获取WIFI ap配置失败
#define NET_ERROR_SET_WIFI_AP_CFG         _EC(372) // 设置WIFI ap配置失败
#define NET_ERROR_GET_DECODE_POLICY       _EC(373) // 获取解码策略配置失败
#define NET_ERROR_SET_DECODE_POLICY       _EC(374) // 设置解码策略配置失败
#define NET_ERROR_TALK_REJECT             _EC(375) // 拒绝对讲
#define NET_ERROR_TALK_OPENED             _EC(376) // 对讲被其他客户端打开
#define NET_ERROR_TALK_RESOURCE_CONFLICIT _EC(377) // 资源冲突
#define NET_ERROR_TALK_UNSUPPORTED_ENCODE _EC(378) // 不支持的语音编码格式
#define NET_ERROR_TALK_RIGHTLESS          _EC(379) // 无权限
#define NET_ERROR_TALK_FAILED             _EC(380) // 请求对讲失败
#define NET_ERROR_GET_MACHINE_CFG         _EC(381) // 获取机器相关配置失败
#define NET_ERROR_SET_MACHINE_CFG         _EC(382) // 设置机器相关配置失败
#define NET_ERROR_GET_DATA_FAILED         _EC(383) // 设备无法获取当前请求数据
#define NET_ERROR_MAC_VALIDATE_FAILED     _EC(384) // MAC地址验证失败
#define NET_ERROR_GET_INSTANCE            _EC(385) // 获取服务器实例失败
#define NET_ERROR_JSON_REQUEST            _EC(386) // 生成的jason字符串错误
#define NET_ERROR_JSON_RESPONSE           _EC(387) // 响应的jason字符串错误
#define NET_ERROR_VERSION_HIGHER          _EC(388) // 协议版本低于当前使用的版本
#define NET_SPARE_NO_CAPACITY             _EC(389) // 热备操作失败, 容量不足
#define NET_ERROR_SOURCE_IN_USE           _EC(390) // 显示源被其他输出占用
#define NET_ERROR_REAVE                   _EC(391) // 高级用户抢占低级用户资源
#define NET_ERROR_NETFORBID               _EC(392) // 禁止入网
#define NET_ERROR_SENIOR_VALIDATE_FAILED  _EC(398) // 高级校验失败

// 预览类型，对应CLIENT_RealPlayEx接口
typedef enum _RealPlayType
{
    DH_RType_Realplay = 0,      // 实时预览
    DH_RType_Multiplay,         // 多画面预览

    DH_RType_Realplay_0,        // 实时监视-主码流，等同于DH_RType_Realplay
    DH_RType_Realplay_1,        // 实时监视-从码流1
    DH_RType_Realplay_2,        // 实时监视-从码流2
    DH_RType_Realplay_3,        // 实时监视-从码流3

    DH_RType_Multiplay_1,       // 多画面预览－1画面
    DH_RType_Multiplay_4,       // 多画面预览－4画面
    DH_RType_Multiplay_8,       // 多画面预览－8画面
    DH_RType_Multiplay_9,       // 多画面预览－9画面
    DH_RType_Multiplay_16,      // 多画面预览－16画面
    DH_RType_Multiplay_6,       // 多画面预览－6画面
    DH_RType_Multiplay_12,      // 多画面预览－12画面
} DH_RealPlayType;

enum NET_DEVICE_TYPE
{
    NET_PRODUCT_NONE          = 0,
    NET_DVR_NONREALTIME_MACE, // 非实时MACE
    NET_DVR_NONREALTIME,      // 非实时
    NET_NVS_MPEG1,            // 网络视频服务器
    NET_DVR_MPEG1_2,          // MPEG1二路录像机
    NET_DVR_MPEG1_8,          // MPEG1八路录像机
    NET_DVR_MPEG4_8,          // MPEG4八路录像机
    NET_DVR_MPEG4_16,         // MPEG4十六路录像机
    NET_DVR_MPEG4_SX2,        // LB系列录像机
    NET_DVR_MEPG4_ST2,        // GB系列录像机
    NET_DVR_MEPG4_SH2,        // HB系列录像机
    NET_DVR_MPEG4_GBE,        // GBE系列录像机
    NET_DVR_MPEG4_NVSII,      // II代网络视频服务器
    NET_DVR_STD_NEW,          // 新标准配置协议
    NET_DVR_DDNS,             // DDNS服务器
    NET_DVR_ATM,              // ATM机
    NET_NB_SERIAL,            // 二代非实时NB系列机器
    NET_LN_SERIAL,            // LN系列产品
    NET_BAV_SERIAL,           // BAV系列产品
    NET_SDIP_SERIAL,          // SDIP系列产品
    NET_IPC_SERIAL,           // IPC系列产品
    NET_NVS_B,                // NVS B系列
    NET_NVS_C,                // NVS H系列
    NET_NVS_S,                // NVS S系列
    NET_NVS_E,                // NVS E系列
    NET_DVR_NEW_PROTOCOL,     // 从QueryDevState中查询设备类型,以字符串格式
    NET_NVD_SERIAL,           // 解码器
    NET_DVR_N5,               // N5
    NET_DVR_MIX_DVR,          // 混合DVR
    NET_SVR_SERIAL,           // SVR系列
    NET_SVR_BS,               // SVR-BS
    NET_NVR_SERIAL,           // NVR系列
    NET_DVR_N51,              // N51
    NET_ITSE_SERIAL,          // ITSE 智能分析盒
    NET_ITC_SERIAL,           // 智能交通像机设备
    NET_HWS_SERIAL,           // 雷达测速仪HWS
    NET_PVR_SERIAL,           // 便携式音视频录像机
    NET_IVS_SERIAL,           // IVS（智能视频服务器系列）
    NET_IVS_B,                // 通用智能视频侦测服务器
    NET_IVS_F,                // 人脸识别服务器
    NET_IVS_V,                // 视频质量诊断服务器
    NET_MATRIX_SERIAL,        // 矩阵
    NET_DVR_N52,              // N52
    NET_DVR_N56,              // N56
    NET_ESS_SERIAL,           // ESS
    NET_IVS_PC,               // 人数统计服务器
    NET_PC_NVR,               // pc-nvr
    NET_DSCON,                // 大屏控制器
    NET_EVS,                  // 网络视频存储服务器
    NET_EIVS,                 // 嵌入式智能分析视频系统
};

// 视频监视断开事件类型
typedef enum _EM_REALPLAY_DISCONNECT_EVENT_TYPE
{
	DISCONNECT_EVENT_REAVE,                     // 表示高级用户抢占低级用户资源
	DISCONNECT_EVENT_NETFORBID,                 // 禁止入网
	DISCONNECT_EVENT_SUBCONNECT,                // 动态子链接断开
}EM_REALPLAY_DISCONNECT_EVENT_TYPE;

// Structs
// 时间
typedef struct
{
    DWORD dwYear;   // 年
    DWORD dwMonth;  // 月
    DWORD dwDay;    // 日
    DWORD dwHour;   // 时
    DWORD dwMinute; // 分
    DWORD dwSecond; // 秒
} NET_TIME, *LPNET_TIME;

// 设备信息
typedef struct
{
    BYTE sSerialNumber[DH_SERIALNO_LEN]; // 序列号
    BYTE byAlarmInPortNum;      // DVR报警输入个数
    BYTE byAlarmOutPortNum;     // DVR报警输出个数
    BYTE byDiskNum;             // DVR硬盘个数
    BYTE byDVRType;             // DVR类型, 见枚举DHDEV_DEVICE_TYPE
    BYTE byChanNum;             // DVR通道个数
} NET_DEVICEINFO, *LPNET_DEVICEINFO;

// 回调视频数据帧的帧参数结构体
typedef struct _tagVideoFrameParam
{
    BYTE     encode;    // 编码类型
    BYTE     frametype; // I = 0, P =  1, B =  2...
    BYTE     format;    // PAL - 0, NTSC - 1
    BYTE     size;      // CIF - 0, HD1 - 1, 2CIF - 2, D1 - 3, VGA - 4, QCIF - 5, QVGA - 6 ,
                        // SVCD - 7, QQVGA - 8, SVGA - 9, XVGA - 10, WXGA - 11, SXGA - 12, WSXGA - 13, UXGA - 14, WUXGA - 15, LFT - 16, 720 - 17, 1080 - 18
    DWORD    fourcc;    // 如果是H264编码则总为0，MPEG4这里总是填写FOURCC('X','V','I','D');
    DWORD    reserved;  // 保留
    NET_TIME struTime;  // 时间信息
} tagVideoFrameParam;

// 回调音频数据帧的帧参数结构体
typedef struct _tagCBPCMDataParam
{
    BYTE  channels; // 声道数
    BYTE  samples;  // 采样 0 - 8000, 1 - 11025, 2 - 16000, 3 - 22050, 4 - 32000, 5 - 44100, 6 - 48000
    BYTE  depth;    // 采样深度 取值8或者16等。直接表示
    BYTE  param1;   // 0 - 指示无符号，1-指示有符号
    DWORD reserved; // 保留
} tagCBPCMDataParam;

// Callbacks
// 网络连接断开回调函数原形
typedef void (CALLBACK *DisConnectCallBack)(LLONG lLoginID, char *pchDVRIP, LONG nDVRPort, LDWORD dwUser);

// 网络连接恢复回调函数原形
typedef void (CALLBACK *HaveReConnectCallBack)(LLONG lLoginID, char *pchDVRIP, LONG nDVRPort, LDWORD dwUser);

// 实时监视数据回调函数原形--扩展
typedef void (CALLBACK *RealDataCallBackEx)(LLONG lRealHandle, DWORD dwDataType, BYTE *pBuffer, DWORD dwBufSize, LONG param, LDWORD dwUser);

// 视频监视断开回调函数原形,
typedef void (CALLBACK *RealPlayDisConnectCallBack)(LLONG lOperateHandle, EM_REALPLAY_DISCONNECT_EVENT_TYPE dwEventType, void* param, LDWORD dwUser);

// 动态子连接断开回调函数原形
typedef void (CALLBACK *SubDisConnectCallBack(EM_INTERFACE_TYPE emInterfaceType, BOOL bOnline, LLONG lOperateHandle, LLONG lLoginID, LDWORD dwUser);

// Functions
// SDK初始化
CLIENT_API BOOL CALL_METHOD CLIENT_Init(DisConnectCallBack cbDisConnect, LDWORD dwUser);

// SDK退出清理
CLIENT_API void CALL_METHOD CLIENT_Cleanup();

// 返回函数执行失败代码
CLIENT_API DWORD CALL_METHOD CLIENT_GetLastError(void);

// 设置连接设备超时时间和尝试次数
CLIENT_API void CALL_METHOD CLIENT_SetConnectTime(int nWaitTime, int nTryTimes);

// 设置动态子连接断线回调函数，目前SVR设备的监视和回放是短连接的。
CLIENT_API void CALL_METHOD CLIENT_SetSubconnCallBack(SubDisConnectCallBack cbSubDisConnect, LDWORD dwUser);

// 向设备注册
// 扩展接口；nSpecCap  = 0为TCP方式下的登入，nSpecCap = 2为主动注册的登入，nSpecCap = 3为组播方式下的登入，
//           nSpecCap  = 4为UDP方式下的登入，nSpecCap = 6为只建主连接下的登入，nSpecCap = 7为SSL加密
//           nSpecCap  = 8为成都佳发登陆
//           nSpecCap  = 9为登录远程设备，这个时候void* pCapParam填入远程设备的名字的字符串
//           nSpecCap  = 12为LDAP方式登录
//           nSpecCap  = 13为AD方式登录
CLIENT_API LLONG CALL_METHOD CLIENT_LoginEx(char *pchDVRIP, WORD wDVRPort, char *pchUserName, char *pchPassword, int nSpecCap, void* pCapParam, LPNET_DEVICEINFO lpDeviceInfo, int *error = 0);

// 向设备注销
CLIENT_API BOOL CALL_METHOD CLIENT_Logout(LLONG lLoginID);

// 设置断线重连成功回调函数，设置后SDK内部断线自动重连
CLIENT_API void CALL_METHOD CLIENT_SetAutoReconnect(HaveReConnectCallBack cbAutoConnect, LDWORD dwUser);

// 开始实时监视--扩展
CLIENT_API LLONG CALL_METHOD CLIENT_RealPlayEx(LLONG lLoginID, int nChannelID, HWND hWnd, DH_RealPlayType rType = DH_RType_Realplay);

//打开实时监视，若返回0表示打开失败
CLIENT_API LLONG CALL_METHOD CLIENT_StartRealPlay(LLONG lLoginID, int nChannelID, HWND hWnd, DH_RealPlayType rType, RealDataCallBackEx cbRealData, fRealPlayDisConnect cbDisconnect, LDWORD dwUser, DWORD dwWaitTime = 10000);

// 停止实时预览--扩展
CLIENT_API BOOL CALL_METHOD CLIENT_StopRealPlayEx(LLONG lRealHandle);

// 设置实时监视数据回调--扩展
CLIENT_API BOOL CALL_METHOD CLIENT_SetRealDataCallBackEx(LLONG lRealHandle, RealDataCallBackEx cbRealData, LDWORD dwUser, DWORD dwFlag);

// 重启设备
CLIENT_API BOOL CALL_METHOD CLIENT_RebootDev(LLONG lLoginID);

// 关闭设备
CLIENT_API BOOL CALL_METHOD CLIENT_ShutDownDev(LLONG lLoginID);

#endif // DHNETSDK_H
