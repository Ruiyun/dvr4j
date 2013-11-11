package com.hikvision.netsdk.linux.callback;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.hikvision.netsdk.def.StreamDataType;

/**
 * 适用于{@link com.hikvision.netsdk.linux.HikNetSDKLibrary#NET_DVR_SetRealDataCallBack}和{@link com.hikvision.netsdk.linux.HikNetSDKLibrary#NET_DVR_SetStandardDataCallBack}的码流数据回调接口
 */
public interface RealDataCallBack extends Callback {
    /**
     * @param lRealHandle 当前的预览句柄
     * @param dwDataType  数据类型
     *                    <table>
     *                    <thead>
     *                    <tr><th>类型</th><th>值</th><th>含义</th></tr>
     *                    </thead>
     *                    <tbody>
     *                    <tr><td>{@link StreamDataType#NET_DVR_SYSHEAD}</td><td>1</td><td>系统头数据</td></tr>
     *                    <tr><td>{@link StreamDataType#NET_DVR_STREAMDATA}</td><td>2</td><td>流数据（包括复合流或音视频分开的视频流数据）</td></tr>
     *                    <tr><td>{@link StreamDataType#NET_DVR_AUDIOSTREAMDATA}</td><td>3</td><td>音频数据</td></tr>
     *                    <tr><td>{@link StreamDataType#NET_DVR_STD_VIDEODATA}</td><td>4</td><td>标准视频流数据</td></tr>
     *                    <tr><td>{@link StreamDataType#NET_DVR_STD_AUDIODATA}</td><td>5</td><td>标准音频流数据</td></tr>
     *                    <tr><td>{@link StreamDataType#NET_DVR_PRIVATE_DATA}</td><td>112</td><td>私有数据,包括智能信息</td></tr>
     *                    </tbody>
     *                    </table>
     * @param pBuffer     存放数据的缓冲区指针
     * @param dwBufSize   缓冲区大小
     * @param dwUser      用户数据
     */
    void invoke(int lRealHandle, int dwDataType, Pointer pBuffer, int dwBufSize, int dwUser);
}
