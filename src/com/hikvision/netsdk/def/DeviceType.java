package com.hikvision.netsdk.def;

/**
 * 海康设备类型定义
 */
public abstract class DeviceType {
    /**
     * 尚未定义的dvr类型
     */
    public static final int DVR = 1;

    /**
     * ATM DVR
     */
    public static final int ATMDVR = 2;

    /**
     * DVS
     */
    public static final int DVS = 3;

    /**
     * 6001D
     */
    public static final int DEC = 4;

    /**
     * 6001F
     */
    public static final int ENC_DEC = 5;

    /**
     * 8000HC
     */
    public static final int DVR_HC = 6;

    /**
     * 8000HT
     */
    public static final int DVR_HT = 7;

    /**
     * 8000HF
     */
    public static final int DVR_HF = 8;

    /**
     * 8000HS DVR(no audio)
     */
    public static final int DVR_HS = 9;

    /**
     * 8016HTS DVR(no audio)
     */
    public static final int DVR_HTS = 10;

    /**
     * HB DVR(SATA HD)
     */
    public static final int DVR_HB = 11;

    /**
     * 8000HCS DVR
     */
    public static final int DVR_HCS = 12;

    /**
     * 带ATA硬盘的DVS
     */
    public static final int DVS_A = 13;

    /**
     * 8000HC-S
     */
    public static final int DVR_HC_S = 14;

    /**
     * 8000HT-S
     */
    public static final int DVR_HT_S = 15;

    /**
     * 8000HF-S
     */
    public static final int DVR_HF_S = 16;

    /**
     * 8000HS-S
     */
    public static final int DVR_HS_S = 17;

    /**
     * ATM-S
     */
    public static final int ATMDVR_S = 18;

    /**
     * 7000H系列
     */
    public static final int DVR_7000H = 19;

    /**
     * 多路解码器
     */
    public static final int DEC_MAT = 20;

    /**
     * mobile DVR
     */
    public static final int DVR_MOBILE = 21;

    /**
     * 8000HD-S
     */
    public static final int DVR_HD_S = 22;

    /**
     * 8000HD-SL
     */
    public static final int DVR_HD_SL = 23;

    /**
     * 8000HC-SL
     */
    public static final int DVR_HC_SL = 24;

    /**
     * 8000HS_ST
     */
    public static final int DVR_HS_ST = 25;

    /**
     * 6000HW
     */
    public static final int DVS_HW = 26;

    /**
     * 多路解码器
     */
    public static final int DS630X_D = 27;

    /**
     * 640X高清解码器
     */
    public static final int DS640X_HD = 28;

    /**
     * 610X解码器
     */
    public static final int DS610X_D = 29;

    /**
     * IP 摄像机
     */
    public static final int IPCAM = 30;

    /**
     * 852F&852MF
     */
    public static final int MEGA_IPCAM = 31;

    /**
     * 862MF可以接入9000设备
     */
    public static final int IPCAM_X62MF = 32;

    /**
     * 智能高清网络摄像机
     */
    public static final int ITCCAM = 35;

    /**
     * 智能分析高清网络摄像机
     */
    public static final int IVS_IPCAM = 36;

    /**
     * 一体机
     */
    public static final int ZOOMCAM = 38;

    /**
     * IP 标清球机
     */
    public static final int IPDOME = 40;

    /**
     * IP 200万高清球机
     */
    public static final int IPDOME_MEGA200 = 41;

    /**
     * IP 130万高清球机
     */
    public static final int IPDOME_MEGA130 = 42;

    /**
     * IP 高清智能快球
     */
    public static final int IPDOME_AI = 43;

    /**
     * 红外热成像摄像机
     */
    public static final int TII_IPCAM = 44;

    /**
     * IP 模块
     */
    public static final int IPMOD = 50;

    /**
     * 6501 车牌
     */
    public static final int IDS6501_HF_P = 60;

    /**
     * 智能ATM
     */
    public static final int IDS6101_HF_A = 61;

    /**
     * 双机跟踪：DS6002-HF/B
     */
    public static final int IDS6002_HF_B = 62;

    /**
     * 行为分析：DS6101-HF/B DS6101-HF/B_SATA
     */
    public static final int IDS6101_HF_B = 63;

    /**
     * 智能分析仪IVMS
     */
    public static final int IDS52XX = 64;

    /**
     * 9000智能
     */
    public static final int IDS90XX = 65;

    /**
     * 海鑫人脸识别 ATM
     */
    public static final int IDS8104_AHL_S_HX = 66;

    /**
     * 私有人脸识别 ATM
     */
    public static final int IDS8104_AHL_S_H = 67;

    /**
     * 9100智能
     */
    public static final int IDS91XX = 68;

    /**
     * 智能行为IP摄像机
     */
    public static final int IIP_CAM_B = 69;

    /**
     * 智能人脸IP摄像机
     */
    public static final int IIP_CAM_F = 70;

    /**
     * DS71XXH_S
     */
    public static final int DS71XX_H = 71;

    /**
     * DS72XXH_S
     */
    public static final int DS72XX_H_S = 72;

    /**
     * DS73XXH_S
     */
    public static final int DS73XX_H_S = 73;

    /**
     * DS72XX_HF_S
     */
    public static final int DS72XX_HF_S = 74;

    /**
     * DS73XX_HFI_S
     */
    public static final int DS73XX_HFI_S = 75;

    /**
     * DVR,e.g. DS7604_HI_S
     */
    public static final int DS76XX_H_S = 76;

    /**
     * NVR,e.g. DS7604_NI_S
     */
    public static final int DS76XX_N_S = 77;

    /**
     * DS81XX_HS_S
     */
    public static final int DS81XX_HS_S = 81;

    /**
     * DS81XX_HL_S
     */
    public static final int DS81XX_HL_S = 82;

    /**
     * DS81XX_HC_S
     */
    public static final int DS81XX_HC_S = 83;

    /**
     * DS81XX_HD_S
     */
    public static final int DS81XX_HD_S = 84;

    /**
     * DS81XX_HE_S
     */
    public static final int DS81XX_HE_S = 85;

    /**
     * DS81XX_HF_S
     */
    public static final int DS81XX_HF_S = 86;

    /**
     * DS81XX_AH_S
     */
    public static final int DS81XX_AH_S = 87;

    /**
     * DS81XX_AHF_S
     */
    public static final int DS81XX_AHF_S = 88;

    /**
     * DS90XX_HF_S
     */
    public static final int DS90XX_HF_S = 90;

    /**
     * DS91XX_HF_S
     */
    public static final int DS91XX_HF_S = 91;

    /**
     * 91XXHD-S(MD)
     */
    public static final int DS91XX_HD_S = 92;

    /**
     * 9000智能 ATM
     */
    public static final int IDS90XX_A = 93;

    /**
     * 9100智能 ATM
     */
    public static final int IDS91XX_A = 94;

    /**
     * DS95XX_N_S NVR 不带任何输出
     */
    public static final int DS95XX_N_S = 95;

    /**
     * DS96XX_N_SH NVR
     */
    public static final int DS96XX_N_SH = 96;

    /**
     * DS90XX_HF_SH
     */
    public static final int DS90XX_HF_SH = 97;

    /**
     * DS91XX_HF_SH
     */
    public static final int DS91XX_HF_SH = 98;

    /**
     * 视频综合平台设备型号(X:编码板片数，Y:解码板片数)
     */
    public static final int DS_B10_XY = 100;

    /**
     * 视频综合平台内部编码器
     */
    public static final int DS_6504HF_B10 = 101;

    /**
     * 视频综合平台内部解码器
     */
    public static final int DS_6504D_B10 = 102;

    /**
     * 视频综合平台内部码分器
     */
    public static final int DS_1832_B10 = 103;

    /**
     * 视频综合平台内部光纤板
     */
    public static final int DS_6401HFH_B10 = 104;

    /**
     * 65XXHC DVS
     */
    public static final int DS_65XXHC = 105;

    /**
     * 65XXHC-SATA DVS
     */
    public static final int DS_65XXHC_S = 106;

    /**
     * 65XXHF DVS
     */
    public static final int DS_65XXHF = 107;

    /**
     * 65XXHF-SATA DVS
     */
    public static final int DS_65XXHF_S = 108;

    /**
     * 65 rack DVS
     */
    public static final int DS_6500HF_B = 109;

    /**
     * iVMS-6200(/C)
     */
    public static final int IVMS_6200_C = 110;

    /**
     * iVMS-6200(/B)
     */
    public static final int IVMS_6200_B = 111;

    /**
     * 72XXHV_ST15 DVR
     */
    public static final int DS_72XXHV_ST15 = 112;

    /**
     * 72XXHV_ST20 DVR
     */
    public static final int DS_72XXHV_ST20 = 113;

    /**
     * IVMS-6200(/T)
     */
    public static final int IVMS_6200_T = 114;

    /**
     * IVMS-6200(/BP)
     */
    public static final int IVMS_6200_BP = 115;

    /**
     * DS_81XXHC_ST
     */
    public static final int DS_81XXHC_ST = 116;

    /**
     * DS_81XXHS_ST
     */
    public static final int DS_81XXHS_ST = 117;

    /**
     * DS_81XXAH_ST
     */
    public static final int DS_81XXAH_ST = 118;

    /**
     * DS_81XXAHF_ST
     */
    public static final int DS_81XXAHF_ST = 119;

    /**
     * 66XX DVS
     */
    public static final int DS_66XXDVS = 120;

    /**
     * 视频综合平台内部报警器
     */
    public static final int DS_1964_B10 = 121;

    /**
     * 视频综合平台内部级联输入
     */
    public static final int DS_B10N04_IN = 122;

    /**
     * 视频综合平台内部级联输出
     */
    public static final int DS_B10N04_OUT = 123;

    /**
     * 视频综合平台内部智能
     */
    public static final int DS_B10N04_INTEL = 124;

    /**
     * V6高清
     */
    public static final int DS_6408HFH_B10E_RM = 125;

    /**
     * V6级联不带DSP
     */
    public static final int DS_B10N64F1_RTM = 126;

    /**
     * V6级联带DSP
     */
    public static final int DS_B10N64F1D_RTM = 127;

    /**
     * 视频综合平台子域控制器
     */
    public static final int DS_B10_SDS = 128;

    /**
     * 视频综合平台域控制器
     */
    public static final int DS_B10_DS = 129;

    /**
     * VGA高清编码器
     */
    public static final int DS_6401HFH_B10V = 130;

    /**
     * 视频综合平台内部标清解码器
     */
    public static final int DS_6504D_B10B = 131;

    /**
     * 视频综合平台内部高清解码器
     */
    public static final int DS_6504D_B10H = 132;

    /**
     * 视频综合平台内部VGA解码器
     */
    public static final int DS_6504D_B10V = 133;

    /**
     * 视频综合平台SDI子板
     */
    public static final int DS_6408HFH_B10S = 134;

    /**
     * 矩阵接入网关
     */
    public static final int DS_18XX_N = 135;

    /**
     * 网络码分类产品
     */
    public static final int DS_18XX_PTZ = 141;

    /**
     * 通用报警主机类产品
     */
    public static final int DS_19AXX = 142;

    /**
     * 家用报警主机
     */
    public static final int DS_19BXX = 143;

    /**
     * 自助银行报警主机
     */
    public static final int DS_19CXX = 144;

    /**
     * 动环监控报警主机
     */
    public static final int DS_19DXX = 145;

    /**
     * 1900系列报警主机
     */
    public static final int DS_19XX = 146;

    /**
     * 视频报警主机
     */
    public static final int DS_19SXX = 147;

    /**
     * CS类产品 //防护舱
     */
    public static final int DS_1HXX = 148;

    /**
     * 多屏控制器
     */
    public static final int DS_C10H = 161;

    /**
     * BNC处理器
     */
    public static final int DS_C10N_BI = 162;

    /**
     * rbg处理器
     */
    public static final int DS_C10N_DI = 163;

    /**
     * 码流处理器
     */
    public static final int DS_C10N_SI = 164;

    /**
     * 显示处理器
     */
    public static final int DS_C10N_DO = 165;

    /**
     * 分布式服务器
     */
    public static final int DS_C10N_SERVER = 166;

    /**
     * 8104ATM
     */
    public static final int IDS_8104_AHFL_S_H = 171;

    /**
     * 65 ATM
     */
    public static final int IDS_65XX_HF_A = 172;

    /**
     * 9000 智能RH
     */
    public static final int IDS90XX_HF_RH = 173;

    /**
     * 9100 智能RH设备
     */
    public static final int IDS91XX_HF_RH = 174;

    /**
     * 65 行为分析
     */
    public static final int IDS_65XX_HF_B = 175;

    /**
     * 65 车牌识别
     */
    public static final int IDS_65XX_HF_P = 176;

    /**
     * IVMS-6200(/F)
     */
    public static final int IVMS_6200_F = 177;

    /**
     * iVMS-6200(/A)
     */
    public static final int IVMS_6200_A = 178;

    /**
     * IVMS-6200(/F_S)人脸后检索分析仪
     */
    public static final int IVMS_6200_F_S = 179;

    /**
     * 9000 RH    648
     */
    public static final int DS90XX_HF_RH = 181;

    /**
     * 9100 RH设备 648
     */
    public static final int DS91XX_HF_RH = 182;

    /**
     * 78系列设备 6446
     */
    public static final int DS78XX_S = 183;

    /**
     * 81 Resolution 960 KY2011
     */
    public static final int DS81XXHW_S = 185;

    /**
     * DS81XXHW_ST  KY2011
     */
    public static final int DS81XXHW_ST = 186;

    /**
     * DS91XXHW_ST  KY2011
     */
    public static final int DS91XXHW_ST = 187;

    /**
     * DS91XX_ST netra
     */
    public static final int DS91XX_ST = 188;

    /**
     * DS81XX_ST netra
     */
    public static final int DS81XX_ST = 189;

    /**
     * DS81XXHDI_ST,DS81XXHE_ST ky2012
     */
    public static final int DS81XXHX_ST = 190;

    /**
     * DS73XXHI_ST ky2012
     */
    public static final int DS73XXHX_ST = 191;

    /**
     * 审讯81SH,81SHF
     */
    public static final int DS81XX_SH = 192;

    /**
     * 审讯81SNL
     */
    public static final int DS81XX_SN = 193;

    /**
     * NVR:DS96xxN_ST
     */
    public static final int DS96XXN_ST = 194;

    /**
     * NVR:DS86xxN_ST
     */
    public static final int DS86XXN_ST = 195;

    /**
     * DVR:DS80xxHF_ST
     */
    public static final int DS80XXHF_ST = 196;

    /**
     * DVR:DS90xxHF_ST
     */
    public static final int DS90XXHF_ST = 197;

    /**
     * NVR:DS76xxN_ST
     */
    public static final int DS76XXN_ST = 198;

    /**
     * NVR:DS_9664N_RX
     */
    public static final int DS_9664N_RX = 199;

    /**
     * 编码卡服务器
     */
    public static final int ENCODER_SERVER = 200;

    /**
     * 解码卡服务器
     */
    public static final int DECODER_SERVER = 201;

    /**
     * PCNVR存储服务器
     */
    public static final int PCNVR_SERVER = 202;

    /**
     * 邦诺CVR，他给自己定的类型为DVR_S-1
     */
    public static final int CVR_SERVER = 203;

    /**
     * 91系列HD-SDI高清DVR
     */
    public static final int DS_91XXHFH_ST = 204;

    /**
     * 66高清编码器
     */
    public static final int DS_66XXHFH = 205;

    /**
     * 终端服务器
     */
    public static final int TRAFFIC_TS_SERVER = 210;

    /**
     * 视频分析记录仪
     */
    public static final int TRAFFIC_VAR = 211;

    /**
     * 视频综合平台设备型号
     */
    public static final int DS_B11_M_CLASS = 301;

    /**
     * 视频综合平台设备型号
     */
    public static final int DS_B12_M_CLASS = 302;

    /**
     * 视频综合平台内部编码器
     */
    public static final int DS_6504HF_B11_CLASS = 303;

    /**
     * 视频综合平台内部编码器
     */
    public static final int DS_6504HF_B12_CLASS = 304;

    /**
     * VGA高清
     */
    public static final int DS_6401HFH_B11V_CLASS = 305;

    /**
     * VGA高清
     */
    public static final int DS_6401HFH_B12V_CLASS = 306;

    /**
     * SDI
     */
    public static final int DS_6408HFH_B11S_CLASS = 307;

    /**
     * SDI
     */
    public static final int DS_6408HFH_B12S_CLASS = 308;

    /**
     * 视频综合平台内部高清解码器
     */
    public static final int DS_6504D_B11H_CLASS = 309;

    /**
     * 视频综合平台内部标清解码器
     */
    public static final int DS_6504D_B11B_CLASS = 310;

    /**
     * 视频综合平台内部标清解码器
     */
    public static final int DS_6504D_B12B_CLASS = 311;

    /**
     * 视频综合平台内部VGA解码器
     */
    public static final int DS_6504D_B11V_CLASS = 312;

    /**
     * 视频综合平台内部VGA解码器
     */
    public static final int DS_6504D_B12V_CLASS = 313;

    /**
     * B10 RGB高清
     */
    public static final int DS_6401HFH_B10R_CLASS = 314;

    /**
     * B10 DVI高清
     */
    public static final int DS_6401HFH_B10D_CLASS = 315;

    /**
     * B10 HDMI高清
     */
    public static final int DS_6401HFH_B10H_CLASS = 316;

    /**
     * B11 RGB高清
     */
    public static final int DS_6401HFH_B11R_CLASS = 317;

    /**
     * B11 DVI高清
     */
    public static final int DS_6401HFH_B11D_CLASS = 318;

    /**
     * B11 HDMI高清
     */
    public static final int DS_6401HFH_B11H_CLASS = 319;

    /**
     * B12 RGB高清
     */
    public static final int DS_6401HFH_B12R_CLASS = 320;

    /**
     * B12 DVI高清
     */
    public static final int DS_6401HFH_B12D_CLASS = 321;

    /**
     * B12 HDMI高清
     */
    public static final int DS_6401HFH_B12H_CLASS = 322;

    /**
     * 64-T高清解码器
     */
    public static final int DS64XXHD_T = 701;

    /**
     * 65系列万能解码板
     */
    public static final int DS_6516D_B10 = 702;

    /**
     * 65万能解码器
     */
    public static final int DS_65XXD = 703;

    /**
     * 63-T标清解码器
     */
    public static final int DS63XXD_T = 704;

    /**
     * DS90XXHW_ST混合DVR
     */
    public static final int DS90XXHW_ST = 2001;

    /**
     * DS-72xxHV_SH, DS-72xxHF-SH
     */
    public static final int DS72XXHX_SH = 2002;

    /**
     * DS-92XX-HF-ST
     */
    public static final int DS_92XX_HF_ST = 2003;

    /**
     * NETRET_9100DVR_HF_XT
     */
    public static final int DS_91XX_HF_XT = 2004;

    /**
     * NETRET_9000DVR_HF_XT
     */
    public static final int DS_90XX_HF_XT = 2005;

    /**
     * Netra NVR DS-77XXHF-ST
     */
    public static final int DS_77XXN_ST = 2201;

    /**
     * Netra 95XXN_ST NVR
     */
    public static final int DS_95XX_N_ST = 2202;

    /**
     * Netra 85XXN_ST NVR
     */
    public static final int DS_85XX_N_ST = 2203;

    /**
     * NETRET_9600NVR_N_XT
     */
    public static final int DS_96XX_N_XT = 2204;

    /**
     * NETRET_7600NVR_N_SE
     */
    public static final int DS_76XX_N_SE = 2205;

    /**
     * PCNVR_IVMS_4200
     */
    public static final int PCNVR_IVMS_4200 = 2301;

    public static String description(int code) {
        switch (code) {
            case DVR: return "尚未定义的dvr类型";
            case ATMDVR: return "ATM DVR";
            case DVS: return "DVS";
            case DEC: return "6001D";
            case ENC_DEC: return "6001F";
            case DVR_HC: return "8000HC";
            case DVR_HT: return "8000HT";
            case DVR_HF: return "8000HF";
            case DVR_HS: return "8000HS DVR(no audio)";
            case DVR_HTS: return "8016HTS DVR(no audio)";
            case DVR_HB: return "HB DVR(SATA HD)";
            case DVR_HCS: return "8000HCS DVR";
            case DVS_A: return "带ATA硬盘的DVS";
            case DVR_HC_S: return "8000HC-S";
            case DVR_HT_S: return "8000HT-S";
            case DVR_HF_S: return "8000HF-S";
            case DVR_HS_S: return "8000HS-S";
            case ATMDVR_S: return "ATM-S";
            case DVR_7000H: return "7000H系列";
            case DEC_MAT: return "多路解码器";
            case DVR_MOBILE: return "mobile DVR";
            case DVR_HD_S: return "8000HD-S";
            case DVR_HD_SL: return "8000HD-SL";
            case DVR_HC_SL: return "8000HC-SL";
            case DVR_HS_ST: return "8000HS_ST";
            case DVS_HW: return "6000HW";
            case DS630X_D: return "多路解码器";
            case DS640X_HD: return "640X高清解码器";
            case DS610X_D: return "610X解码器";
            case IPCAM: return "IP 摄像机";
            case MEGA_IPCAM: return "852F&852MF";
            case IPCAM_X62MF: return "862MF可以接入9000设备";
            case ITCCAM: return "智能高清网络摄像机";
            case IVS_IPCAM: return "智能分析高清网络摄像机";
            case ZOOMCAM: return "一体机";
            case IPDOME: return "IP 标清球机";
            case IPDOME_MEGA200: return "IP 200万高清球机";
            case IPDOME_MEGA130: return "IP 130万高清球机";
            case IPDOME_AI: return "IP 高清智能快球";
            case TII_IPCAM: return "红外热成像摄像机";
            case IPMOD: return "IP 模块";
            case IDS6501_HF_P: return "6501 车牌";
            case IDS6101_HF_A: return "智能ATM";
            case IDS6002_HF_B: return "双机跟踪：DS6002-HF/B";
            case IDS6101_HF_B: return "行为分析：DS6101-HF/B DS6101-HF/B_SATA";
            case IDS52XX: return "智能分析仪IVMS";
            case IDS90XX: return "9000智能";
            case IDS8104_AHL_S_HX: return "海鑫人脸识别 ATM";
            case IDS8104_AHL_S_H: return "私有人脸识别 ATM";
            case IDS91XX: return "9100智能";
            case IIP_CAM_B: return "智能行为IP摄像机";
            case IIP_CAM_F: return "智能人脸IP摄像机";
            case DS71XX_H: return "DS71XXH_S";
            case DS72XX_H_S: return "DS72XXH_S";
            case DS73XX_H_S: return "DS73XXH_S";
            case DS72XX_HF_S: return "DS72XX_HF_S";
            case DS73XX_HFI_S: return "DS73XX_HFI_S";
            case DS76XX_H_S: return "DVR,e.g. DS7604_HI_S";
            case DS76XX_N_S: return "NVR,e.g. DS7604_NI_S";
            case DS81XX_HS_S: return "DS81XX_HS_S";
            case DS81XX_HL_S: return "DS81XX_HL_S";
            case DS81XX_HC_S: return "DS81XX_HC_S";
            case DS81XX_HD_S: return "DS81XX_HD_S";
            case DS81XX_HE_S: return "DS81XX_HE_S";
            case DS81XX_HF_S: return "DS81XX_HF_S";
            case DS81XX_AH_S: return "DS81XX_AH_S";
            case DS81XX_AHF_S: return "DS81XX_AHF_S";
            case DS90XX_HF_S: return "DS90XX_HF_S";
            case DS91XX_HF_S: return "DS91XX_HF_S";
            case DS91XX_HD_S: return "91XXHD-S(MD)";
            case IDS90XX_A: return "9000智能 ATM";
            case IDS91XX_A: return "9100智能 ATM";
            case DS95XX_N_S: return "DS95XX_N_S NVR 不带任何输出";
            case DS96XX_N_SH: return "DS96XX_N_SH NVR";
            case DS90XX_HF_SH: return "DS90XX_HF_SH";
            case DS91XX_HF_SH: return "DS91XX_HF_SH";
            case DS_B10_XY: return "视频综合平台设备型号(X:编码板片数，Y:解码板片数)";
            case DS_6504HF_B10: return "视频综合平台内部编码器";
            case DS_6504D_B10: return "视频综合平台内部解码器";
            case DS_1832_B10: return "视频综合平台内部码分器";
            case DS_6401HFH_B10: return "视频综合平台内部光纤板";
            case DS_65XXHC: return "65XXHC DVS";
            case DS_65XXHC_S: return "65XXHC-SATA DVS";
            case DS_65XXHF: return "65XXHF DVS";
            case DS_65XXHF_S: return "65XXHF-SATA DVS";
            case DS_6500HF_B: return "65 rack DVS";
            case IVMS_6200_C: return "iVMS-6200(/C)";
            case IVMS_6200_B: return "iVMS-6200(/B)";
            case DS_72XXHV_ST15: return "72XXHV_ST15 DVR";
            case DS_72XXHV_ST20: return "72XXHV_ST20 DVR";
            case IVMS_6200_T: return "IVMS-6200(/T)";
            case IVMS_6200_BP: return "IVMS-6200(/BP)";
            case DS_81XXHC_ST: return "DS_81XXHC_ST";
            case DS_81XXHS_ST: return "DS_81XXHS_ST";
            case DS_81XXAH_ST: return "DS_81XXAH_ST";
            case DS_81XXAHF_ST: return "DS_81XXAHF_ST";
            case DS_66XXDVS: return "66XX DVS";
            case DS_1964_B10: return "视频综合平台内部报警器";
            case DS_B10N04_IN: return "视频综合平台内部级联输入";
            case DS_B10N04_OUT: return "视频综合平台内部级联输出";
            case DS_B10N04_INTEL: return "视频综合平台内部智能";
            case DS_6408HFH_B10E_RM: return "V6高清";
            case DS_B10N64F1_RTM: return "V6级联不带DSP";
            case DS_B10N64F1D_RTM: return "V6级联带DSP";
            case DS_B10_SDS: return "视频综合平台子域控制器";
            case DS_B10_DS: return "视频综合平台域控制器";
            case DS_6401HFH_B10V: return "VGA高清编码器";
            case DS_6504D_B10B: return "视频综合平台内部标清解码器";
            case DS_6504D_B10H: return "视频综合平台内部高清解码器";
            case DS_6504D_B10V: return "视频综合平台内部VGA解码器";
            case DS_6408HFH_B10S: return "视频综合平台SDI子板";
            case DS_18XX_N: return "矩阵接入网关";
            case DS_18XX_PTZ: return "网络码分类产品";
            case DS_19AXX: return "通用报警主机类产品";
            case DS_19BXX: return "家用报警主机";
            case DS_19CXX: return "自助银行报警主机";
            case DS_19DXX: return "动环监控报警主机";
            case DS_19XX: return "1900系列报警主机";
            case DS_19SXX: return "视频报警主机";
            case DS_1HXX: return "CS类产品 //防护舱";
            case DS_C10H: return "多屏控制器";
            case DS_C10N_BI: return "BNC处理器";
            case DS_C10N_DI: return "rbg处理器";
            case DS_C10N_SI: return "码流处理器";
            case DS_C10N_DO: return "显示处理器";
            case DS_C10N_SERVER: return "分布式服务器";
            case IDS_8104_AHFL_S_H: return "8104ATM";
            case IDS_65XX_HF_A: return "65 ATM";
            case IDS90XX_HF_RH: return "9000 智能RH";
            case IDS91XX_HF_RH: return "9100 智能RH设备";
            case IDS_65XX_HF_B: return "65 行为分析";
            case IDS_65XX_HF_P: return "65 车牌识别";
            case IVMS_6200_F: return "IVMS-6200(/F)";
            case IVMS_6200_A: return "iVMS-6200(/A)";
            case IVMS_6200_F_S: return "IVMS-6200(/F_S)人脸后检索分析仪";
            case DS90XX_HF_RH: return "9000 RH    648";
            case DS91XX_HF_RH: return "9100 RH设备 648";
            case DS78XX_S: return "78系列设备 6446";
            case DS81XXHW_S: return "81 Resolution 960 KY2011";
            case DS81XXHW_ST: return "DS81XXHW_ST  KY2011";
            case DS91XXHW_ST: return "DS91XXHW_ST  KY2011";
            case DS91XX_ST: return "DS91XX_ST netra";
            case DS81XX_ST: return "DS81XX_ST netra";
            case DS81XXHX_ST: return "DS81XXHDI_ST,DS81XXHE_ST ky2012";
            case DS73XXHX_ST: return "DS73XXHI_ST ky2012";
            case DS81XX_SH: return "审讯81SH,81SHF";
            case DS81XX_SN: return "审讯81SNL";
            case DS96XXN_ST: return "NVR:DS96xxN_ST";
            case DS86XXN_ST: return "NVR:DS86xxN_ST";
            case DS80XXHF_ST: return "DVR:DS80xxHF_ST";
            case DS90XXHF_ST: return "DVR:DS90xxHF_ST";
            case DS76XXN_ST: return "NVR:DS76xxN_ST";
            case DS_9664N_RX: return "NVR:DS_9664N_RX";
            case ENCODER_SERVER: return "编码卡服务器";
            case DECODER_SERVER: return "解码卡服务器";
            case PCNVR_SERVER: return "PCNVR存储服务器";
            case CVR_SERVER: return "邦诺CVR，他给自己定的类型为DVR_S-1";
            case DS_91XXHFH_ST: return "91系列HD-SDI高清DVR";
            case DS_66XXHFH: return "66高清编码器";
            case TRAFFIC_TS_SERVER: return "终端服务器";
            case TRAFFIC_VAR: return "视频分析记录仪";
            case DS_B11_M_CLASS: return "视频综合平台设备型号";
            case DS_B12_M_CLASS: return "视频综合平台设备型号";
            case DS_6504HF_B11_CLASS: return "视频综合平台内部编码器";
            case DS_6504HF_B12_CLASS: return "视频综合平台内部编码器";
            case DS_6401HFH_B11V_CLASS: return "VGA高清";
            case DS_6401HFH_B12V_CLASS: return "VGA高清";
            case DS_6408HFH_B11S_CLASS: return "SDI";
            case DS_6408HFH_B12S_CLASS: return "SDI";
            case DS_6504D_B11H_CLASS: return "视频综合平台内部高清解码器";
            case DS_6504D_B11B_CLASS: return "视频综合平台内部标清解码器";
            case DS_6504D_B12B_CLASS: return "视频综合平台内部标清解码器";
            case DS_6504D_B11V_CLASS: return "视频综合平台内部VGA解码器";
            case DS_6504D_B12V_CLASS: return "视频综合平台内部VGA解码器";
            case DS_6401HFH_B10R_CLASS: return "B10 RGB高清";
            case DS_6401HFH_B10D_CLASS: return "B10 DVI高清";
            case DS_6401HFH_B10H_CLASS: return "B10 HDMI高清";
            case DS_6401HFH_B11R_CLASS: return "B11 RGB高清";
            case DS_6401HFH_B11D_CLASS: return "B11 DVI高清";
            case DS_6401HFH_B11H_CLASS: return "B11 HDMI高清";
            case DS_6401HFH_B12R_CLASS: return "B12 RGB高清";
            case DS_6401HFH_B12D_CLASS: return "B12 DVI高清";
            case DS_6401HFH_B12H_CLASS: return "B12 HDMI高清";
            case DS64XXHD_T: return "64-T高清解码器";
            case DS_6516D_B10: return "65系列万能解码板";
            case DS_65XXD: return "65万能解码器";
            case DS63XXD_T: return "63-T标清解码器";
            case DS90XXHW_ST: return "DS90XXHW_ST混合DVR";
            case DS72XXHX_SH: return "DS-72xxHV_SH, DS-72xxHF-SH";
            case DS_92XX_HF_ST: return "DS-92XX-HF-ST";
            case DS_91XX_HF_XT: return "NETRET_9100DVR_HF_XT";
            case DS_90XX_HF_XT: return "NETRET_9000DVR_HF_XT";
            case DS_77XXN_ST: return "Netra NVR DS-77XXHF-ST";
            case DS_95XX_N_ST: return "Netra 95XXN_ST NVR";
            case DS_85XX_N_ST: return "Netra 85XXN_ST NVR";
            case DS_96XX_N_XT: return "NETRET_9600NVR_N_XT";
            case DS_76XX_N_SE: return "NETRET_7600NVR_N_SE";
            case PCNVR_IVMS_4200: return "PCNVR_IVMS_4200";
            default: return "尚未定义的dvr类型";
        }
    }
}
