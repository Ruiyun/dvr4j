#ifndef _HC_NET_SDK_H_
#define _HC_NET_SDK_H_

#define NET_DVR_API extern "C"
#define __stdcall
#define CALLBACK

#define DWORD   unsigned int
#define WORD    unsigned short
#define USHORT  unsigned short
#define LONG    int
#define UINT    unsigned int
#define UINT64  unsigned long long
#define BOOL    int
#define BYTE    unsigned char
#define LPVOID  void*
#define HANDLE  void*
#define LPDWORD unsigned int*
#define HWND    unsigned int

/*******************全局错误码 begin**********************/
#define NET_DVR_NOERROR                            0   //没有错误
#define NET_DVR_PASSWORD_ERROR                     1   //用户名密码错误
#define NET_DVR_NOENOUGHPRI                        2   //权限不足
#define NET_DVR_NOINIT                             3   //没有初始化
#define NET_DVR_CHANNEL_ERROR                      4   //通道号错误
#define NET_DVR_OVER_MAXLINK                       5   //连接到DVR的客户端个数超过最大
#define NET_DVR_VERSIONNOMATCH                     6   //版本不匹配
#define NET_DVR_NETWORK_FAIL_CONNECT               7   //连接服务器失败
#define NET_DVR_NETWORK_SEND_ERROR                 8   //向服务器发送失败
#define NET_DVR_NETWORK_RECV_ERROR                 9   //从服务器接收数据失败
#define NET_DVR_NETWORK_RECV_TIMEOUT               10  //从服务器接收数据超时
#define NET_DVR_NETWORK_ERRORDATA                  11  //传送的数据有误
#define NET_DVR_ORDER_ERROR                        12  //调用次序错误
#define NET_DVR_OPERNOPERMIT                       13  //无此权限
#define NET_DVR_COMMANDTIMEOUT                     14  //DVR命令执行超时
#define NET_DVR_ERRORSERIALPORT                    15  //串口号错误
#define NET_DVR_ERRORALARMPORT                     16  //报警端口错误
#define NET_DVR_PARAMETER_ERROR                    17  //参数错误
#define NET_DVR_CHAN_EXCEPTION                     18  //服务器通道处于错误状态
#define NET_DVR_NODISK                             19  //没有硬盘
#define NET_DVR_ERRORDISKNUM                       20  //硬盘号错误
#define NET_DVR_DISK_FULL                          21  //服务器硬盘满
#define NET_DVR_DISK_ERROR                         22  //服务器硬盘出错
#define NET_DVR_NOSUPPORT                          23  //服务器不支持
#define NET_DVR_BUSY                               24  //服务器忙
#define NET_DVR_MODIFY_FAIL                        25  //服务器修改不成功
#define NET_DVR_PASSWORD_FORMAT_ERROR              26  //密码输入格式不正确
#define NET_DVR_DISK_FORMATING                     27  //硬盘正在格式化，不能启动操作
#define NET_DVR_DVRNORESOURCE                      28  //DVR资源不足
#define NET_DVR_DVROPRATEFAILED                    29  //DVR操作失败
#define NET_DVR_OPENHOSTSOUND_FAIL                 30  //打开PC声音失败
#define NET_DVR_DVRVOICEOPENED                     31  //服务器语音对讲被占用
#define NET_DVR_TIMEINPUTERROR                     32  //时间输入不正确
#define NET_DVR_NOSPECFILE                         33  //回放时服务器没有指定的文件
#define NET_DVR_CREATEFILE_ERROR                   34  //创建文件出错
#define NET_DVR_FILEOPENFAIL                       35  //打开文件出错
#define NET_DVR_OPERNOTFINISH                      36  //上次的操作还没有完成
#define NET_DVR_GETPLAYTIMEFAIL                    37  //获取当前播放的时间出错
#define NET_DVR_PLAYFAIL                           38  //播放出错
#define NET_DVR_FILEFORMAT_ERROR                   39  //文件格式不正确
#define NET_DVR_DIR_ERROR                          40  //路径错误
#define NET_DVR_ALLOC_RESOURCE_ERROR               41  //资源分配错误
#define NET_DVR_AUDIO_MODE_ERROR                   42  //声卡模式错误
#define NET_DVR_NOENOUGH_BUF                       43  //缓冲区太小
#define NET_DVR_CREATESOCKET_ERROR                 44  //创建SOCKET出错
#define NET_DVR_SETSOCKET_ERROR                    45  //设置SOCKET出错
#define NET_DVR_MAX_NUM                            46  //个数达到最大
#define NET_DVR_USERNOTEXIST                       47  //用户不存在
#define NET_DVR_WRITEFLASHERROR                    48  //写FLASH出错
#define NET_DVR_UPGRADEFAIL                        49  //DVR升级失败
#define NET_DVR_CARDHAVEINIT                       50  //解码卡已经初始化过
#define NET_DVR_PLAYERFAILED                       51  //调用播放库中某个函数失败
#define NET_DVR_MAX_USERNUM                        52  //设备端用户数达到最大
#define NET_DVR_GETLOCALIPANDMACFAIL               53  //获得客户端的IP地址或物理地址失败
#define NET_DVR_NOENCODEING                        54  //该通道没有编码
#define NET_DVR_IPMISMATCH                         55  //IP地址不匹配
#define NET_DVR_MACMISMATCH                        56  //MAC地址不匹配
#define NET_DVR_UPGRADELANGMISMATCH                57  //升级文件语言不匹配
#define NET_DVR_MAX_PLAYERPORT                     58  //播放器路数达到最大
#define NET_DVR_NOSPACEBACKUP                      59  //备份设备中没有足够空间进行备份
#define NET_DVR_NODEVICEBACKUP                     60  //没有找到指定的备份设备
#define NET_DVR_PICTURE_BITS_ERROR                 61  //图像素位数不符，限24色
#define NET_DVR_PICTURE_DIMENSION_ERROR            62  //图片高*宽超限， 限128*256
#define NET_DVR_PICTURE_SIZ_ERROR                  63  //图片大小超限，限100K
#define NET_DVR_LOADPLAYERSDKFAILED                64  //载入当前目录下Player Sdk出错
#define NET_DVR_LOADPLAYERSDKPROC_ERROR            65  //找不到Player Sdk中某个函数入口
#define NET_DVR_LOADDSSDKFAILED                    66  //载入当前目录下DSsdk出错
#define NET_DVR_LOADDSSDKPROC_ERROR                67  //找不到DsSdk中某个函数入口
#define NET_DVR_DSSDK_ERROR                        68  //调用硬解码库DsSdk中某个函数失败
#define NET_DVR_VOICEMONOPOLIZE                    69  //声卡被独占
#define NET_DVR_JOINMULTICASTFAILED                70  //加入多播组失败
#define NET_DVR_CREATEDIR_ERROR                    71  //建立日志文件目录失败
#define NET_DVR_BINDSOCKET_ERROR                   72  //绑定套接字失败
#define NET_DVR_SOCKETCLOSE_ERROR                  73  //socket连接中断，此错误通常是由于连接中断或目的地不可达
#define NET_DVR_USERID_ISUSING                     74  //注销时用户ID正在进行某操作
#define NET_DVR_SOCKETLISTEN_ERROR                 75  //监听失败
#define NET_DVR_PROGRAM_EXCEPTION                  76  //程序异常
#define NET_DVR_WRITEFILE_FAILED                   77  //写文件失败
#define NET_DVR_FORMAT_READONLY                    78  //禁止格式化只读硬盘
#define NET_DVR_WITHSAMEUSERNAME                   79  //用户配置结构中存在相同的用户名
#define NET_DVR_DEVICETYPE_ERROR                   80  //导入参数时设备型号不匹配
#define NET_DVR_LANGUAGE_ERROR                     81  //导入参数时语言不匹配
#define NET_DVR_PARAVERSION_ERROR                  82  //导入参数时软件版本不匹配
#define NET_DVR_IPCHAN_NOTALIVE                    83  //预览时外接IP通道不在线
#define NET_DVR_RTSP_SDK_ERROR                     84  //加载高清IPC通讯库StreamTransClient.dll失败
#define NET_DVR_CONVERT_SDK_ERROR                  85  //加载转码库失败
#define NET_DVR_IPC_COUNT_OVERFLOW                 86  //超出最大的ip接入通道数
#define NET_DVR_MAX_ADD_NUM                        87  //添加标签(一个文件片段64)等个数达到最大
#define NET_DVR_PARAMMODE_ERROR                    88  //图像增强仪，参数模式错误（用于硬件设置时，客户端进行软件设置时错误值）
#define NET_DVR_CODESPITTER_OFFLINE                89  //视频综合平台，码分器不在线
#define NET_DVR_BACKUP_COPYING                     90  //设备正在备份
#define NET_DVR_CHAN_NOTSUPPORT                    91  //通道不支持该操作
#define NET_DVR_CALLINEINVALID                     92  //高度线位置太集中或长度线不够倾斜
#define NET_DVR_CALCANCELCONFLICT                  93  //取消标定冲突，如果设置了规则及全局的实际大小尺寸过滤
#define NET_DVR_CALPOINTOUTRANGE                   94  //标定点超出范围
#define NET_DVR_FILTERRECTINVALID                  95  //尺寸过滤器不符合要求
#define NET_DVR_DDNS_DEVOFFLINE                    96  //设备没有注册到ddns上
#define NET_DVR_DDNS_INTER_ERROR                   97  //DDNS 服务器内部错误
#define NET_DVR_FUNCTION_NOT_SUPPORT_OS            98  //此功能不支持该操作系统
#define NET_DVR_ALIAS_DUPLICATE                    150 //别名重复 //2011-08-31 通过别名或者序列号来访问设备的新版本ddns的配置
#define NET_DVR_DEV_NET_OVERFLOW                   800 //网络流量超过设备能力上限
#define NET_DVR_STATUS_RECORDFILE_WRITING_NOT_LOCK 801 //录像文件在录像，无法被锁定
#define NET_DVR_STATUS_CANT_FORMAT_LITTLE_DISK     802 //由于硬盘太小无法格式化

// RTSP 错误码
#define NET_DVR_RTSP_ERROR_NOENOUGHPRI    401  //无权限：服务器返回401时，转成这个错误码
#define NET_DVR_RTSP_ERROR_ALLOC_RESOURCE 402  //分配资源失败
#define NET_DVR_RTSP_ERROR_PARAMETER      403  //参数错误
#define NET_DVR_RTSP_ERROR_FORCE_STOP     406  //用户中途强行退出
#define NET_DVR_RTSP_GETPORTFAILED        407  //rtsp 得到端口错误

#define NET_DVR_RTSP_DESCRIBERROR         410  //rtsp decribe 交互错误
#define NET_DVR_RTSP_DESCRIBESENDTIMEOUT  411  //rtsp decribe 发送超时
#define NET_DVR_RTSP_DESCRIBESENDERROR    412  //rtsp decribe 发送失败
#define NET_DVR_RTSP_DESCRIBERECVTIMEOUT  413  //rtsp decribe 接收超时
#define NET_DVR_RTSP_DESCRIBERECVDATALOST 414  //rtsp decribe 接收数据错误
#define NET_DVR_RTSP_DESCRIBERECVERROR    415  //rtsp decribe 接收失败
#define NET_DVR_RTSP_DESCRIBESERVERERR    416  //rtsp decribe 服务器返回401:用户名密码错误或者无权限,或者 501:设备内部资源分配失败

#define NET_DVR_RTSP_SETUPSENDTIMEOUT     421  //rtsp setup 发送超时
#define NET_DVR_RTSP_SETUPSENDERROR       422  //rtsp setup 发送错误
#define NET_DVR_RTSP_SETUPRECVTIMEOUT     423  //rtsp setup 接收超时
#define NET_DVR_RTSP_SETUPRECVDATALOST    424  //rtsp setup 接收数据错误
#define NET_DVR_RTSP_SETUPRECVERROR       425  //rtsp setup 接收失败
#define NET_DVR_RTSP_OVER_MAX_CHAN        426  //rtsp setup 服务器返回401,501等错误,超过最大连接数

#define NET_DVR_RTSP_PLAYSENDTIMEOUT      431  //rtsp play 发送超时
#define NET_DVR_RTSP_PLAYSENDERROR        432  //rtsp play 发送错误
#define NET_DVR_RTSP_PLAYRECVTIMEOUT      433  //rtsp play 接收超时
#define NET_DVR_RTSP_PLAYRECVDATALOST     434  //rtsp play 接收数据错误
#define NET_DVR_RTSP_PLAYRECVERROR        435  //rtsp play 接收失败
#define NET_DVR_RTSP_PLAYSERVERERR        436  //rtsp play 服务器返回401,501等错误

#define NET_DVR_RTSP_TEARDOWNSENDTIMEOUT  441  //rtsp teardown 发送超时
#define NET_DVR_RTSP_TEARDOWNSENDERROR    442  //rtsp teardown 发送错误
#define NET_DVR_RTSP_TEARDOWNRECVTIMEOUT  443  //rtsp teardown 接收超时
#define NET_DVR_RTSP_TEARDOWNRECVDATALOST 444  //rtsp teardown 接收数据错误
#define NET_DVR_RTSP_TEARDOWNRECVERROR    445  //rtsp teardown 接收失败
#define NET_DVR_RTSP_TEARDOWNSERVERERR    446  //rtsp teardown 服务器返回401,501等错误
/*******************全局错误码 end**********************/

#define SERIALNO_LEN 48      //序列号长度

#define TRUE  1
#define FALSE 0

/********************预览回调函数*********************/
#define NET_DVR_SYSHEAD         1   //系统头数据
#define NET_DVR_STREAMDATA      2   //视频流数据（包括复合流和音视频分开的视频流数据）
#define NET_DVR_AUDIOSTREAMDATA 3   //音频流数据
#define NET_DVR_STD_VIDEODATA   4   //标准视频流数据
#define NET_DVR_STD_AUDIODATA   5   //标准音频流数据
#define NET_DVR_CHANGE_FORWARD  10  //码流改变为正放
#define NET_DVR_CHANGE_REVERSE  11  //码流改变为倒放
#define NET_DVR_PRIVATE_DATA    112 //私有数据,包括智能信息

/// Structs
// NET_DVR_Login_V30()参数结构
typedef struct
{
    BYTE sSerialNumber[SERIALNO_LEN];  //序列号
    BYTE byAlarmInPortNum;   //报警输入个数
    BYTE byAlarmOutPortNum;  //报警输出个数
    BYTE byDiskNum;        //硬盘个数
    BYTE byDVRType;        //设备类型, 1:DVR 2:ATM DVR 3:DVS ......
    BYTE byChanNum;        //模拟通道个数
    BYTE byStartChan;      //起始通道号,例如DVS-1,DVR - 1
    BYTE byAudioChanNum;   //语音通道数
    BYTE byIPChanNum;      //最大数字通道个数
    BYTE byZeroChanNum;    //零通道编码个数 //2010-01-16
    BYTE byMainProto;      //主码流传输协议类型 0-private, 1-rtsp
    BYTE bySubProto;       //子码流传输协议类型0-private, 1-rtsp
    BYTE bySupport;        //能力，位与结果为0表示不支持，1表示支持，
                           //bySupport & 0x1, 表示是否支持智能搜索
                           //bySupport & 0x2, 表示是否支持备份
                           //bySupport & 0x4, 表示是否支持压缩参数能力获取
                           //bySupport & 0x8, 表示是否支持多网卡
                           //bySupport & 0x10, 表示支持远程SADP
                           //bySupport & 0x20, 表示支持Raid卡功能
                           //bySupport & 0x40, 表示支持IPSAN 目录查找
                           //bySupport & 0x80, 表示支持rtp over rtsp
    BYTE bySupport1;       //能力集扩充，位与结果为0表示不支持，1表示支持
                           //bySupport1 & 0x1, 表示是否支持snmp v30
                           //bySupport1 & 0x2, 支持区分回放和下载
                           //bySupport1 & 0x4, 是否支持布防优先级
                           //bySupport1 & 0x8, 智能设备是否支持布防时间段扩展
                           //bySupport1 & 0x10, 表示是否支持多磁盘数（超过33个）
    BYTE byRes1;
    WORD wDevType;         //设备型号
    BYTE byRes2[16];       //保留
} NET_DVR_DEVICEINFO_V30, *LPNET_DVR_DEVICEINFO_V30;

//软解码预览参数
typedef struct
{
    LONG lChannel; //通道号
    LONG lLinkMode; //最高位(31)为0表示主码流，为1表示子，0－30位表示码流连接方式: 0：TCP方式,1：UDP方式,2：多播方式,3 - RTP方式，4-RTP/RTSP,5-RSTP/HTTP
    HWND hPlayWnd; //播放窗口的句柄,为NULL表示不播放图象
    char *sMultiCastIP; //多播组地址
} NET_DVR_CLIENTINFO, *LPNET_DVR_CLIENTINFO;

/// Callbacks
typedef void (CALLBACK * RealDataCallBack_V30)(LONG lRealHandle, DWORD dwDataType, BYTE *pBuffer, DWORD dwBufSize, void *pUser)

/// Functions
NET_DVR_API DWORD __stdcall NET_DVR_GetLastError();
NET_DVR_API BOOL __stdcall NET_DVR_Init();
NET_DVR_API BOOL __stdcall NET_DVR_Cleanup();

NET_DVR_API LONG __stdcall NET_DVR_Login_V30(char *sDVRIP, WORD wDVRPort, char *sUserName, char *sPassword, LPNET_DVR_DEVICEINFO_V30 lpDeviceInfo);
NET_DVR_API BOOL __stdcall NET_DVR_Logout(LONG lUserID);
NET_DVR_API BOOL __stdcall NET_DVR_Logout_V30(LONG lUserID);

NET_DVR_API LONG __stdcall NET_DVR_RealPlay_V30(LONG lUserID, LPNET_DVR_CLIENTINFO lpClientInfo, RealDataCallBack_V30 fRealDataCallBack_V30 = NULL, void *pUser = NULL, BOOL bBlocked = FALSE);
NET_DVR_API BOOL __stdcall NET_DVR_StopRealPlay(LONG lRealHandle);

#endif // _HC_NET_SDK_H_
