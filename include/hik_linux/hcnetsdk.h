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

#define SERIALNO_LEN 48      //序列号长度

#define TRUE  1
#define FALSE 0

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

/********************预览回调函数*********************/
#define NET_DVR_SYSHEAD         1   //系统头数据
#define NET_DVR_STREAMDATA      2   //视频流数据（包括复合流和音视频分开的视频流数据）
#define NET_DVR_AUDIOSTREAMDATA 3   //音频流数据
#define NET_DVR_STD_VIDEODATA   4   //标准视频流数据
#define NET_DVR_STD_AUDIODATA   5   //标准音频流数据
#define NET_DVR_CHANGE_FORWARD  10  //码流改变为正放
#define NET_DVR_CHANGE_REVERSE  11  //码流改变为倒放
#define NET_DVR_PRIVATE_DATA    112 //私有数据,包括智能信息
/******************** 设备类型 end *********************/

/******************** 设备类型 *********************/
#define DVR                    1     //对尚未定义的dvr类型返回NETRET_DVR
#define ATMDVR                 2     //atm dvr
#define DVS                    3     //DVS
#define DEC                    4     //6001D
#define ENC_DEC                5     //6001F
#define DVR_HC                 6     //8000HC
#define DVR_HT                 7     //8000HT
#define DVR_HF                 8     //8000HF
#define DVR_HS                 9     //8000HS DVR(no audio)
#define DVR_HTS                10    //8016HTS DVR(no audio)
#define DVR_HB                 11    //HB DVR(SATA HD)
#define DVR_HCS                12    //8000HCS DVR
#define DVS_A                  13    //带ATA硬盘的DVS
#define DVR_HC_S               14    //8000HC-S
#define DVR_HT_S               15    //8000HT-S
#define DVR_HF_S               16    //8000HF-S
#define DVR_HS_S               17    //8000HS-S
#define ATMDVR_S               18    //ATM-S
#define DVR_7000H              19    //7000H系列
#define DEC_MAT                20    //多路解码器
#define DVR_MOBILE             21    //mobile DVR
#define DVR_HD_S               22    //8000HD-S
#define DVR_HD_SL              23    //8000HD-SL
#define DVR_HC_SL              24    //8000HC-SL
#define DVR_HS_ST              25    //8000HS_ST
#define DVS_HW                 26    //6000HW
#define DS630X_D               27    //多路解码器
#define DS640X_HD              28    //640X高清解码器
#define DS610X_D               29    //610X解码器
#define IPCAM                  30    //IP 摄像机
#define MEGA_IPCAM             31    //852F&852MF
#define IPCAM_X62MF            32    //862MF可以接入9000设备
#define ITCCAM                 35    //智能高清网络摄像机
#define IVS_IPCAM              36    //智能分析高清网络摄像机
#define ZOOMCAM                38    //一体机
#define IPDOME                 40    //IP 标清球机
#define IPDOME_MEGA200         41    //IP 200万高清球机
#define IPDOME_MEGA130         42    //IP 130万高清球机
#define IPDOME_AI              43    //IP 高清智能快球
#define TII_IPCAM              44    //红外热成像摄像机
#define IPMOD                  50    //IP 模块
#define IDS6501_HF_P           60    //6501 车牌
#define IDS6101_HF_A           61    //智能ATM
#define IDS6002_HF_B           62    //双机跟踪：DS6002-HF/B
#define IDS6101_HF_B           63    //行为分析：DS6101-HF/B DS6101-HF/B_SATA
#define IDS52XX                64    //智能分析仪IVMS
#define IDS90XX                65    //9000智能
#define IDS8104_AHL_S_HX       66    //海鑫人脸识别 ATM
#define IDS8104_AHL_S_H        67    //私有人脸识别 ATM
#define IDS91XX                68    //9100智能
#define IIP_CAM_B              69    //智能行为IP摄像机
#define IIP_CAM_F              70    //智能人脸IP摄像机
#define DS71XX_H               71    //DS71XXH_S
#define DS72XX_H_S             72    //DS72XXH_S
#define DS73XX_H_S             73    //DS73XXH_S
#define DS72XX_HF_S            74    //DS72XX_HF_S
#define DS73XX_HFI_S           75    //DS73XX_HFI_S
#define DS76XX_H_S             76    //DVR,e.g. DS7604_HI_S
#define DS76XX_N_S             77    //NVR,e.g. DS7604_NI_S
#define DS81XX_HS_S            81    //DS81XX_HS_S
#define DS81XX_HL_S            82    //DS81XX_HL_S
#define DS81XX_HC_S            83    //DS81XX_HC_S
#define DS81XX_HD_S            84    //DS81XX_HD_S
#define DS81XX_HE_S            85    //DS81XX_HE_S
#define DS81XX_HF_S            86    //DS81XX_HF_S
#define DS81XX_AH_S            87    //DS81XX_AH_S
#define DS81XX_AHF_S           88    //DS81XX_AHF_S
#define DS90XX_HF_S            90    //DS90XX_HF_S
#define DS91XX_HF_S            91    //DS91XX_HF_S
#define DS91XX_HD_S            92    //91XXHD-S(MD)
#define IDS90XX_A              93    //9000智能 ATM
#define IDS91XX_A              94    //9100智能 ATM
#define DS95XX_N_S             95    //DS95XX_N_S NVR 不带任何输出
#define DS96XX_N_SH            96    //DS96XX_N_SH NVR
#define DS90XX_HF_SH           97    //DS90XX_HF_SH
#define DS91XX_HF_SH           98    //DS91XX_HF_SH
#define DS_B10_XY              100   //视频综合平台设备型号(X:编码板片数，Y:解码板片数)
#define DS_6504HF_B10          101   //视频综合平台内部编码器
#define DS_6504D_B10           102   //视频综合平台内部解码器
#define DS_1832_B10            103   //视频综合平台内部码分器
#define DS_6401HFH_B10         104   //视频综合平台内部光纤板
#define DS_65XXHC              105   //65XXHC DVS
#define DS_65XXHC_S            106   //65XXHC-SATA DVS
#define DS_65XXHF              107   //65XXHF DVS
#define DS_65XXHF_S            108   //65XXHF-SATA DVS
#define DS_6500HF_B            109   //65 rack DVS
#define IVMS_6200_C            110   //iVMS-6200(/C)
#define IVMS_6200_B            111   //iVMS-6200(/B)
#define DS_72XXHV_ST15         112   //72XXHV_ST15 DVR
#define DS_72XXHV_ST20         113   //72XXHV_ST20 DVR
#define IVMS_6200_T            114   //IVMS-6200(/T)
#define IVMS_6200_BP           115   //IVMS-6200(/BP)
#define DS_81XXHC_ST           116   //DS_81XXHC_ST
#define DS_81XXHS_ST           117   //DS_81XXHS_ST
#define DS_81XXAH_ST           118   //DS_81XXAH_ST
#define DS_81XXAHF_ST          119   //DS_81XXAHF_ST
#define DS_66XXDVS             120   //66XX DVS

#define DS_1964_B10            121   //视频综合平台内部报警器
#define DS_B10N04_IN           122   //视频综合平台内部级联输入
#define DS_B10N04_OUT          123   //视频综合平台内部级联输出
#define DS_B10N04_INTEL        124   //视频综合平台内部智能
#define DS_6408HFH_B10E_RM     125   //V6高清
#define DS_B10N64F1_RTM        126   //V6级联不带DSP
#define DS_B10N64F1D_RTM       127   //V6级联带DSP
#define DS_B10_SDS             128   //视频综合平台子域控制器
#define DS_B10_DS              129   //视频综合平台域控制器
#define DS_6401HFH_B10V        130   //VGA高清编码器
#define DS_6504D_B10B          131   //视频综合平台内部标清解码器
#define DS_6504D_B10H          132   //视频综合平台内部高清解码器
#define DS_6504D_B10V          133   //视频综合平台内部VGA解码器
#define DS_6408HFH_B10S        134   //视频综合平台SDI子板
#define DS_18XX_N              135   //矩阵接入网关

#define DS_18XX_PTZ            141   //网络码分类产品
#define DS_19AXX               142   //通用报警主机类产品
#define DS_19BXX               143   //家用报警主机
#define DS_19CXX               144   //自助银行报警主机
#define DS_19DXX               145   //动环监控报警主机
#define DS_19XX                146   //1900系列报警主机
#define DS_19SXX               147   //视频报警主机
#define DS_1HXX                148   //CS类产品 //防护舱

//2011-11-30
#define DS_C10H                161   //多屏控制器
#define DS_C10N_BI             162   //BNC处理器
#define DS_C10N_DI             163   //rbg处理器
#define DS_C10N_SI             164   //码流处理器
#define DS_C10N_DO             165   //显示处理器
#define DS_C10N_SERVER         166   //分布式服务器

#define IDS_8104_AHFL_S_H      171   //8104ATM
#define IDS_65XX_HF_A          172   //65 ATM
#define IDS90XX_HF_RH          173   //9000 智能RH
#define IDS91XX_HF_RH          174   //9100 智能RH设备
#define IDS_65XX_HF_B          175   //65 行为分析
#define IDS_65XX_HF_P          176   //65 车牌识别
#define IVMS_6200_F            177   //IVMS-6200(/F)
#define IVMS_6200_A            178   //iVMS-6200(/A)
#define IVMS_6200_F_S          179   //IVMS-6200(/F_S)人脸后检索分析仪

#define DS90XX_HF_RH           181   //9000 RH    648
#define DS91XX_HF_RH           182   //9100 RH设备 648
#define DS78XX_S               183   //78系列设备 6446
#define DS81XXHW_S             185   //81 Resolution 960 KY2011
#define DS81XXHW_ST            186   //DS81XXHW_ST  KY2011
#define DS91XXHW_ST            187   //DS91XXHW_ST  KY2011
#define DS91XX_ST              188   //DS91XX_ST netra
#define DS81XX_ST              189   //DS81XX_ST netra
#define DS81XXHX_ST            190   //DS81XXHDI_ST,DS81XXHE_ST ky2012
#define DS73XXHX_ST            191   //DS73XXHI_ST ky2012
#define DS81XX_SH              192   //审讯81SH,81SHF
#define DS81XX_SN              193   //审讯81SNL

#define DS96XXN_ST             194   //NVR:DS96xxN_ST
#define DS86XXN_ST             195   //NVR:DS86xxN_ST
#define DS80XXHF_ST            196   //DVR:DS80xxHF_ST
#define DS90XXHF_ST            197   //DVR:DS90xxHF_ST
#define DS76XXN_ST             198   //NVR:DS76xxN_ST

#define DS_9664N_RX            199   //NVR:DS_9664N_RX
#define ENCODER_SERVER         200   //编码卡服务器
#define DECODER_SERVER         201   //解码卡服务器
#define PCNVR_SERVER           202   //PCNVR存储服务器
#define CVR_SERVER             203   //邦诺CVR，他给自己定的类型为DVR_S-1
#define DS_91XXHFH_ST          204   //91系列HD-SDI高清DVR
#define DS_66XXHFH             205   //66高清编码器
#define TRAFFIC_TS_SERVER      210   //终端服务器
#define TRAFFIC_VAR            211   //视频分析记录仪
#define DS_B11_M_CLASS         301   //视频综合平台设备型号
#define DS_B12_M_CLASS         302   //视频综合平台设备型号
#define DS_6504HF_B11_CLASS    303   //视频综合平台内部编码器
#define DS_6504HF_B12_CLASS    304   //视频综合平台内部编码器
#define DS_6401HFH_B11V_CLASS  305   //VGA高清
#define DS_6401HFH_B12V_CLASS  306   //VGA高清
#define DS_6408HFH_B11S_CLASS  307   //SDI
#define DS_6408HFH_B12S_CLASS  308   //SDI
#define DS_6504D_B11H_CLASS    309   //视频综合平台内部高清解码器
#define DS_6504D_B11B_CLASS    310   //视频综合平台内部标清解码器
#define DS_6504D_B12B_CLASS    311   //视频综合平台内部标清解码器
#define DS_6504D_B11V_CLASS    312   //视频综合平台内部VGA解码器
#define DS_6504D_B12V_CLASS    313   //视频综合平台内部VGA解码器
//B10新增
#define DS_6401HFH_B10R_CLASS  314   //B10 RGB高清
#define DS_6401HFH_B10D_CLASS  315   //B10 DVI高清
#define DS_6401HFH_B10H_CLASS  316   //B10 HDMI高清
//B11新增
#define DS_6401HFH_B11R_CLASS  317   //B11 RGB高清
#define DS_6401HFH_B11D_CLASS  318   //B11 DVI高清
#define DS_6401HFH_B11H_CLASS  319   //B11 HDMI高清
//B12新增
#define DS_6401HFH_B12R_CLASS  320   //B12 RGB高清
#define DS_6401HFH_B12D_CLASS  321   //B12 DVI高清
#define DS_6401HFH_B12H_CLASS  322   //B12 HDMI高清

#define DS64XXHD_T             701   //64-T高清解码器
#define DS_6516D_B10           702   //65系列万能解码板
#define DS_65XXD               703   //65万能解码器
#define DS63XXD_T              704   //63-T标清解码器

//DVR
#define DS90XXHW_ST            2001  //DS90XXHW_ST混合DVR
#define DS72XXHX_SH            2002  //DS-72xxHV_SH, DS-72xxHF-SH
#define DS_92XX_HF_ST          2003  //DS-92XX-HF-ST
#define DS_91XX_HF_XT          2004  //NETRET_9100DVR_HF_XT
#define DS_90XX_HF_XT          2005  //NETRET_9000DVR_HF_XT

//NVR
#define DS_77XXN_ST            2201  //Netra NVR DS-77XXHF-ST
#define DS_95XX_N_ST           2202  //Netra 95XXN_ST NVR
#define DS_85XX_N_ST           2203  //Netra 85XXN_ST NVR
#define DS_96XX_N_XT           2204  //NETRET_9600NVR_N_XT
#define DS_76XX_N_SE           2205  //NETRET_7600NVR_N_SE

//PCNVR
#define PCNVR_IVMS_4200        2301  //PCNVR_IVMS_4200
/******************** 设备类型 end *********************/

/// Structs
// NET_DVR_Login_V30()参数结构
typedef struct
{
    BYTE sSerialNumber[SERIALNO_LEN]; //序列号
    BYTE byAlarmInPortNum;            //报警输入个数
    BYTE byAlarmOutPortNum;           //报警输出个数
    BYTE byDiskNum;                   //硬盘个数
    BYTE byDVRType;                   //设备类型, 1:DVR 2:ATM DVR 3:DVS ......
    BYTE byChanNum;                   //模拟通道个数
    BYTE byStartChan;                 //起始通道号,例如DVS-1,DVR - 1
    BYTE byAudioChanNum;              //语音通道数
    BYTE byIPChanNum;                 //最大数字通道个数
    BYTE byZeroChanNum;               //零通道编码个数 //2010-01-16
    BYTE byMainProto;                 //主码流传输协议类型 0-private, 1-rtsp
    BYTE bySubProto;                  //子码流传输协议类型0-private, 1-rtsp
    BYTE bySupport;                   //能力，位与结果为0表示不支持，1表示支持，
                                      //bySupport & 0x1, 表示是否支持智能搜索
                                      //bySupport & 0x2, 表示是否支持备份
                                      //bySupport & 0x4, 表示是否支持压缩参数能力获取
                                      //bySupport & 0x8, 表示是否支持多网卡
                                      //bySupport & 0x10, 表示支持远程SADP
                                      //bySupport & 0x20, 表示支持Raid卡功能
                                      //bySupport & 0x40, 表示支持IPSAN 目录查找
                                      //bySupport & 0x80, 表示支持rtp over rtsp
    BYTE bySupport1;                  //能力集扩充，位与结果为0表示不支持，1表示支持
                                      //bySupport1 & 0x1, 表示是否支持snmp v30
                                      //bySupport1 & 0x2, 支持区分回放和下载
                                      //bySupport1 & 0x4, 是否支持布防优先级
                                      //bySupport1 & 0x8, 智能设备是否支持布防时间段扩展
                                      //bySupport1 & 0x10, 表示是否支持多磁盘数（超过33个）
    BYTE byRes1;
    WORD wDevType;                    //设备型号
    BYTE byRes2[16];                  //保留
} NET_DVR_DEVICEINFO_V30, *LPNET_DVR_DEVICEINFO_V30;

//软解码预览参数
typedef struct
{
    LONG lChannel;      //通道号
    LONG lLinkMode;     //最高位(31)为0表示主码流，为1表示子，0－30位表示码流连接方式: 0：TCP方式,1：UDP方式,2：多播方式,3 - RTP方式，4-RTP/RTSP,5-RSTP/HTTP
    HWND hPlayWnd;      //播放窗口的句柄,为NULL表示不播放图象
    char *sMultiCastIP; //多播组地址
} NET_DVR_CLIENTINFO, *LPNET_DVR_CLIENTINFO;

//DVR设备参数
typedef struct
{
    DWORD dwSize;
    BYTE sDVRName[NAME_LEN];          //DVR名称
    DWORD dwDVRID;                    //DVR ID,用于遥控器 //V1.4(0-99), V1.5(0-255)
    DWORD dwRecycleRecord;            //是否循环录像,0:不是; 1:是
    BYTE sSerialNumber[SERIALNO_LEN]; //序列号
    DWORD dwSoftwareVersion;          //软件版本号,高16位是主版本,低16位是次版本
    DWORD dwSoftwareBuildDate;        //软件生成日期,0xYYYYMMDD
    DWORD dwDSPSoftwareVersion;       //DSP软件版本,高16位是主版本,低16位是次版本
    DWORD dwDSPSoftwareBuildDate;     //DSP软件生成日期,0xYYYYMMDD
    DWORD dwPanelVersion;             //前面板版本,高16位是主版本,低16位是次版本
    DWORD dwHardwareVersion;          //硬件版本,高16位是主版本,低16位是次版本
    BYTE byAlarmInPortNum;            //DVR报警输入个数
    BYTE byAlarmOutPortNum;           //DVR报警输出个数
    BYTE byRS232Num;                  //DVR 232串口个数
    BYTE byRS485Num;                  //DVR 485串口个数
    BYTE byNetworkPortNum;            //网络口个数
    BYTE byDiskCtrlNum;               //DVR 硬盘控制器个数
    BYTE byDiskNum;                   //DVR 硬盘个数
    BYTE byDVRType;                   //DVR类型, 1:DVR 2:ATM DVR 3:DVS ......
    BYTE byChanNum;                   //DVR 通道个数
    BYTE byStartChan;                 //起始通道号,例如DVS-1,DVR - 1
    BYTE byDecordChans;               //DVR 解码路数
    BYTE byVGANum;                    //VGA口的个数
    BYTE byUSBNum;                    //USB口的个数
    BYTE byAuxoutNum;                 //辅口的个数
    BYTE byAudioNum;                  //语音口的个数
    BYTE byIPChanNum;                 //最大数字通道数
    BYTE byZeroChanNum;               //零通道编码个数
    BYTE bySupport;                   //能力，位与结果为0表示不支持，1表示支持，
                                      //bySupport & 0x1, 表示是否支持智能搜索
                                      //bySupport & 0x2, 表示是否支持备份
                                      //bySupport & 0x4, 表示是否支持压缩参数能力获取
                                      //bySupport & 0x8, 表示是否支持多网卡
                                      //bySupport & 0x10, 表示支持远程SADP
                                      //bySupport & 0x20, 表示支持Raid卡功能
                                      //bySupport & 0x40, 表示支持IPSAN搜索
                                      //bySupport & 0x80, 表示支持rtp over rtsp
    BYTE byEsataUseage;               //Esata的默认用途，0-默认备份，1-默认录像
    BYTE byIPCPlug;                   //0-关闭即插即用，1-打开即插即用
    BYTE byStorageMode;               //0-盘组模式,1-磁盘配额, 2抽帧模式
    BYTE bySupport1;                  //能力，位与结果为0表示不支持，1表示支持
                                      //bySupport1 & 0x1, 支持 SNMP v30
                                      //bySupport1 & 0x2, 支持区分回放和下载
                                      //bySupport1 & 0x4, 是否支持布防优先级
    WORD wDevType;                    //设备型号
    BYTE byDevTypeName[24];           //设备型号名称
    BYTE byRes2[16];                  //保留
}

/// Callbacks
typedef void (CALLBACK * RealDataCallBack_V30)(LONG lRealHandle, DWORD dwDataType, BYTE *pBuffer, DWORD dwBufSize, void *pUser)
typedef void (CALLBACK * RealDataCallBack)(LONG lRealHandle, DWORD dwDataType, BYTE *pBuffer, DWORD dwBufSize, DWORD dwUser)
typedef void (CALLBACK * ExceptionCallBack)(DWORD dwType, LONG lUserID, LONG lHandle, void *pUser)

/// Functions
NET_DVR_API DWORD __stdcall NET_DVR_GetLastError();
NET_DVR_API char* __stdcall NET_DVR_GetErrorMsg(LONG *pErrorNo = NULL);

NET_DVR_API BOOL __stdcall NET_DVR_Init();
NET_DVR_API BOOL __stdcall NET_DVR_Cleanup();

NET_DVR_API BOOL __stdcall NET_DVR_SetReconnect(DWORD dwInterval, BOOL bEnableRecon);

NET_DVR_API BOOL __stdcall NET_DVR_SetExceptionCallBack_V30(UINT reserved1, void *reserved2, ExceptionCallBack fExceptionCallBack, void *pUser);

NET_DVR_API LONG __stdcall NET_DVR_Login_V30(char *sDVRIP, WORD wDVRPort, char *sUserName, char *sPassword, LPNET_DVR_DEVICEINFO_V30 lpDeviceInfo);
NET_DVR_API BOOL __stdcall NET_DVR_Logout(LONG lUserID);
NET_DVR_API BOOL __stdcall NET_DVR_Logout_V30(LONG lUserID);

NET_DVR_API LONG __stdcall NET_DVR_RealPlay_V30(LONG lUserID, LPNET_DVR_CLIENTINFO lpClientInfo, RealDataCallBack_V30 fRealDataCallBack_V30 = NULL, void *pUser = NULL, BOOL bBlocked = FALSE);
NET_DVR_API BOOL __stdcall NET_DVR_StopRealPlay(LONG lRealHandle);

NET_DVR_API BOOL __stdcall NET_DVR_SetRealDataCallBack(LONG lRealHandle, RealDataCallBack fRealDataCallBack, DWORD dwUser);
NET_DVR_API BOOL __stdcall NET_DVR_SetStandardDataCallBack(LONG lRealHandle, RealDataCallBack fRealDataCallBack, DWORD dwUser);

//重启
NET_DVR_API BOOL __stdcall NET_DVR_RebootDVR(LONG lUserID);
//关闭DVR
NET_DVR_API BOOL __stdcall NET_DVR_ShutDownDVR(LONG lUserID);

//获取设备参数配置
NET_DVR_API BOOL __stdcall NET_DVR_GetDVRConfig(LONG lUserID, DWORD dwCommand, LONG lChannel, LPVOID lpOutBuffer, DWORD dwOutBufferSize, LPDWORD lpBytesReturned);

#endif // _HC_NET_SDK_H_
