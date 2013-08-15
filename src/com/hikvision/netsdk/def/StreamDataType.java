package com.hikvision.netsdk.def;

/**
 * 预览回调数据类型
 */
public abstract class StreamDataType {
    /**
     * 系统头数据
     */
    public static final int NET_DVR_SYSHEAD = 1;

    /**
     * 视频流数据（包括复合流和音视频分开的视频流数据）
     */
    public static final int NET_DVR_STREAMDATA = 2;

    /**
     * 音频流数据
     */
    public static final int NET_DVR_AUDIOSTREAMDATA = 3;

    /**
     * 标准视频流数据
     */
    public static final int NET_DVR_STD_VIDEODATA = 4;

    /**
     * 标准音频流数据
     */
    public static final int NET_DVR_STD_AUDIODATA = 5;

    /**
     * 码流改变为正放
     */
    public static final int NET_DVR_CHANGE_FORWARD = 10;

    /**
     * 码流改变为倒放
     */
    public static final int NET_DVR_CHANGE_REVERSE = 11;

    /**
     * 私有数据,包括智能信息
     */
    public static final int NET_DVR_PRIVATE_DATA = 112;
}
