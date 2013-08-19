package com.dahua.netsdk.def;

/**
 * 预览类型，对应CLIENT_RealPlayEx接口
 */
public interface DH_RealPlayType {
    /**
     * 实时预览
     */
    public static final int DH_RType_Realplay = 0;

    /**
     * 多画面预览
     */
    public static final int DH_RType_Multiplay = 1;

    /**
     * 实时监视-主码流，等同于DH_RType_Realplay
     */
    public static final int DH_RType_Realplay_0 = 2;

    /**
     * 实时监视-从码流1
     */
    public static final int DH_RType_Realplay_1 = 3;

    /**
     * 实时监视-从码流2
     */
    public static final int DH_RType_Realplay_2 = 4;

    /**
     * 实时监视-从码流3
     */
    public static final int DH_RType_Realplay_3 = 5;

    /**
     * 多画面预览－1画面
     */
    public static final int DH_RType_Multiplay_1 = 6;

    /**
     * 多画面预览－4画面
     */
    public static final int DH_RType_Multiplay_4 = 7;

    /**
     * 多画面预览－8画面
     */
    public static final int DH_RType_Multiplay_8 = 8;

    /**
     * 多画面预览－9画面
     */
    public static final int DH_RType_Multiplay_9 = 9;

    /**
     * 多画面预览－16画面
     */
    public static final int DH_RType_Multiplay_16 = 10;

    /**
     * 多画面预览－6画面
     */
    public static final int DH_RType_Multiplay_6 = 11;

    /**
     * 多画面预览－12画面
     */
    public static final int DH_RType_Multiplay_12 = 12;
}
