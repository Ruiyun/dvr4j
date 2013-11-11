package com.dahua.netsdk.def;

/**
 * 接口类型，对应CLIENT_SetSubconnCallBack接口
 */
public interface DH_InterfaceType {
    /**
     * 未知接口
     */
    public static final int DH_INTERFACE_OTHER = 0;

    /**
     * 实时监视接口
     */
    public static final int DH_INTERFACE_REALPLAY = 1;

    /**
     * 多画面预览接口
     */
    public static final int DH_INTERFACE_PREVIEW = 2;

    /**
     * 回放接口
     */
    public static final int DH_INTERFACE_PLAYBACK = 3;

    /**
     * 下载接口
     */
    public static final int DH_INTERFACE_DOWNLOAD = 4;

    /**
     * 下载智能图片接口
     */
    public static final int DH_INTERFACE_REALLOADPIC = 5;
}
