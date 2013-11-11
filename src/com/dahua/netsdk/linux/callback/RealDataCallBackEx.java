package com.dahua.netsdk.linux.callback;

import com.sun.jna.Callback;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;

/**
 * 实时监视数据回调函数原形--扩展
 */
public interface RealDataCallBackEx extends Callback {
    /**
     * @param lRealHandle 实时监视ID
     * @param dwDataType  标识回调出来的数据类型，只有dwFlag设置标识的数据才会回调出来：
     *                    <table>
     *                    <thead>
     *                    <tr><th>dwDataType</th><th>数据类型</th></tr>
     *                    </thead>
     *                    <tbody>
     *                    <tr><td>0</td><td>原始数据(与SaveRealData保存的数据一致)</td></tr>
     *                    <tr><td>1</td><td>帧数据</td></tr>
     *                    <tr><td>2</td><td>yuv数据</td></tr>
     *                    <tr><td>3</td><td>pcm音频数据</td></tr>
     *                    </tbody>
     *                    </table>
     * @param pBuffer     回调数据，根据数据类型的不同每次回调不同的长度的数据，除类型0，其他数据类型都是按帧，
     *                    每次回调一帧数据
     * @param dwBufSize   回调数据的长度，根据不同的类型，长度也不同(单位字节)
     * @param param       回调数据参数结构体，根据不同的类型，参数结构也不一致，
     *                    当类型为0(原始数据)和2(YUV数据) 时为0。
     *                    当回调的数据类型为帧数据时param为一个{@link com.dahua.netsdk.linux.tagVideoFrameParam}结构体指针。
     *                    当数据类型是PCM数据的时候param也是一个{@link com.dahua.netsdk.linux.tagCBPCMDataParam}结构体指针
     * @param dwUser      用户数据，就是上面输入的用户数据
     */
    void invoke(NativeLong lRealHandle, int dwDataType, Pointer pBuffer, int dwBufSize, Pointer param,
                NativeLong dwUser);
}