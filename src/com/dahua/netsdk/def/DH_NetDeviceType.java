package com.dahua.netsdk.def;

/**
 * 设备类型
 */
public abstract class DH_NetDeviceType {

    public static final int NET_PRODUCT_NONE = 0;
    /**
     * 非实时MACE
     */
    public static final int NET_DVR_NONREALTIME_MACE = 1;

    /**
     * 非实时
     */
    public static final int NET_DVR_NONREALTIME = 2;

    /**
     * 网络视频服务器
     */
    public static final int NET_NVS_MPEG1 = 3;

    /**
     * MPEG1二路录像机
     */
    public static final int NET_DVR_MPEG1_2 = 4;

    /**
     * MPEG1八路录像机
     */
    public static final int NET_DVR_MPEG1_8 = 5;

    /**
     * MPEG4八路录像机
     */
    public static final int NET_DVR_MPEG4_8 = 6;

    /**
     * MPEG4十六路录像机
     */
    public static final int NET_DVR_MPEG4_16 = 7;

    /**
     * LB系列录像机
     */
    public static final int NET_DVR_MPEG4_SX2 = 8;

    /**
     * GB系列录像机
     */
    public static final int NET_DVR_MEPG4_ST2 = 9;

    /**
     * HB系列录像机
     */
    public static final int NET_DVR_MEPG4_SH2 = 10;

    /**
     * GBE系列录像机
     */
    public static final int NET_DVR_MPEG4_GBE = 11;

    /**
     * II代网络视频服务器
     */
    public static final int NET_DVR_MPEG4_NVSII = 12;

    /**
     * 新标准配置协议
     */
    public static final int NET_DVR_STD_NEW = 13;

    /**
     * DDNS服务器
     */
    public static final int NET_DVR_DDNS = 14;

    /**
     * ATM机
     */
    public static final int NET_DVR_ATM = 15;

    /**
     * 二代非实时NB系列机器
     */
    public static final int NET_NB_SERIAL = 16;

    /**
     * LN系列产品
     */
    public static final int NET_LN_SERIAL = 17;

    /**
     * BAV系列产品
     */
    public static final int NET_BAV_SERIAL = 18;

    /**
     * SDIP系列产品
     */
    public static final int NET_SDIP_SERIAL = 19;

    /**
     * IPC系列产品
     */
    public static final int NET_IPC_SERIAL = 20;

    /**
     * NVS B系列
     */
    public static final int NET_NVS_B = 21;

    /**
     * NVS H系列
     */
    public static final int NET_NVS_C = 22;

    /**
     * NVS S系列
     */
    public static final int NET_NVS_S = 23;

    /**
     * NVS E系列
     */
    public static final int NET_NVS_E = 24;

    /**
     * 从QueryDevState中查询设备类型,以字符串格式
     */
    public static final int NET_DVR_NEW_PROTOCOL = 25;

    /**
     * 解码器
     */
    public static final int NET_NVD_SERIAL = 26;

    /**
     * N5
     */
    public static final int NET_DVR_N5 = 27;

    /**
     * 混合DVR
     */
    public static final int NET_DVR_MIX_DVR = 28;

    /**
     * SVR系列
     */
    public static final int NET_SVR_SERIAL = 29;

    /**
     * SVR-BS
     */
    public static final int NET_SVR_BS = 30;

    /**
     * NVR系列
     */
    public static final int NET_NVR_SERIAL = 31;

    /**
     * N51
     */
    public static final int NET_DVR_N51 = 32;

    /**
     * ITSE 智能分析盒
     */
    public static final int NET_ITSE_SERIAL = 33;

    /**
     * 智能交通像机设备
     */
    public static final int NET_ITC_SERIAL = 34;

    /**
     * 雷达测速仪HWS
     */
    public static final int NET_HWS_SERIAL = 35;

    /**
     * 便携式音视频录像机
     */
    public static final int NET_PVR_SERIAL = 36;

    /**
     * IVS（智能视频服务器系列）
     */
    public static final int NET_IVS_SERIAL = 37;

    /**
     * 通用智能视频侦测服务器
     */
    public static final int NET_IVS_B = 38;

    /**
     * 人脸识别服务器
     */
    public static final int NET_IVS_F = 39;

    /**
     * 视频质量诊断服务器
     */
    public static final int NET_IVS_V = 40;

    /**
     * 矩阵
     */
    public static final int NET_MATRIX_SERIAL = 41;

    /**
     * N52
     */
    public static final int NET_DVR_N52 = 42;

    /**
     * N56
     */
    public static final int NET_DVR_N56 = 43;

    /**
     * ESS
     */
    public static final int NET_ESS_SERIAL = 44;

    /**
     * 人数统计服务器
     */
    public static final int NET_IVS_PC = 45;

    /**
     * pc-nvr
     */
    public static final int NET_PC_NVR = 46;

    /**
     * 大屏控制器
     */
    public static final int NET_DSCON = 47;

    /**
     * 网络视频存储服务器
     */
    public static final int NET_EVS = 48;

    /**
     * 嵌入式智能分析视频系统
     */
    public static final int NET_EIVS = 49;

    public static String description(int code) {
        switch (code) {
            case NET_PRODUCT_NONE: return "未知型号设备";
            case NET_DVR_NONREALTIME_MACE: return "非实时MACE";
            case NET_DVR_NONREALTIME: return "非实时";
            case NET_NVS_MPEG1: return "网络视频服务器";
            case NET_DVR_MPEG1_2: return "MPEG1二路录像机";
            case NET_DVR_MPEG1_8: return "MPEG1八路录像机";
            case NET_DVR_MPEG4_8: return "MPEG4八路录像机";
            case NET_DVR_MPEG4_16: return "MPEG4十六路录像机";
            case NET_DVR_MPEG4_SX2: return "LB系列录像机";
            case NET_DVR_MEPG4_ST2: return "GB系列录像机";
            case NET_DVR_MEPG4_SH2: return "HB系列录像机";
            case NET_DVR_MPEG4_GBE: return "GBE系列录像机";
            case NET_DVR_MPEG4_NVSII: return "II代网络视频服务器";
            case NET_DVR_STD_NEW: return "新标准配置协议";
            case NET_DVR_DDNS: return "DDNS服务器";
            case NET_DVR_ATM: return "ATM机";
            case NET_NB_SERIAL: return "二代非实时NB系列机器";
            case NET_LN_SERIAL: return "LN系列产品";
            case NET_BAV_SERIAL: return "BAV系列产品";
            case NET_SDIP_SERIAL: return "SDIP系列产品";
            case NET_IPC_SERIAL: return "IPC系列产品";
            case NET_NVS_B: return "NVS B系列";
            case NET_NVS_C: return "NVS H系列";
            case NET_NVS_S: return "NVS S系列";
            case NET_NVS_E: return "NVS E系列";
            case NET_DVR_NEW_PROTOCOL: return "从QueryDevState中查询设备类型,以字符串格式";
            case NET_NVD_SERIAL: return "解码器";
            case NET_DVR_N5: return "N5";
            case NET_DVR_MIX_DVR: return "混合DVR";
            case NET_SVR_SERIAL: return "SVR系列";
            case NET_SVR_BS: return "SVR-BS";
            case NET_NVR_SERIAL: return "NVR系列";
            case NET_DVR_N51: return "N51";
            case NET_ITSE_SERIAL: return "ITSE 智能分析盒";
            case NET_ITC_SERIAL: return "智能交通像机设备";
            case NET_HWS_SERIAL: return "雷达测速仪HWS";
            case NET_PVR_SERIAL: return "便携式音视频录像机";
            case NET_IVS_SERIAL: return "IVS（智能视频服务器系列）";
            case NET_IVS_B: return "通用智能视频侦测服务器";
            case NET_IVS_F: return "人脸识别服务器";
            case NET_IVS_V: return "视频质量诊断服务器";
            case NET_MATRIX_SERIAL: return "矩阵";
            case NET_DVR_N52: return "N52";
            case NET_DVR_N56: return "N56";
            case NET_ESS_SERIAL: return "ESS";
            case NET_IVS_PC: return "人数统计服务器";
            case NET_PC_NVR: return "pc-nvr";
            case NET_DSCON: return "大屏控制器";
            case NET_EVS: return "网络视频存储服务器";
            case NET_EIVS: return "嵌入式智能分析视频系统";
            default: return "未知型号设备";
        }
    }
}
