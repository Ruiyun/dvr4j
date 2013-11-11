package com.dahua.netsdk.linux.callback;

import com.sun.jna.Callback;
import com.sun.jna.NativeLong;
import com.dahua.netsdk.def.DH_InterfaceType;

/**
 * 动态子连接断开回调函数原形
 */
public interface SubDisConnectCallBack extends Callback {
    /**
     * @param emInterfaceType 接口类型，见下表
     *                        <table>
     *                        <thead>
     *                        <tr><th>类型</th><th>值</th><th>含义</th></tr>
     *                        </thead>
     *                        <tbody>
     *                        <tr><td>{@link DH_InterfaceType#DH_INTERFACE_OTHER}</td><td>0</td><td>未知接口</td></tr>
     *                        <tr><td>{@link DH_InterfaceType#DH_INTERFACE_REALPLAY}</td><td>1</td><td>实时监视接口</td></tr>
     *                        <tr><td>{@link DH_InterfaceType#DH_INTERFACE_PREVIEW}</td><td>2</td><td>多画面预览接口</td></tr>
     *                        <tr><td>{@link DH_InterfaceType#DH_INTERFACE_PLAYBACK}</td><td>3</td><td>回放接口</td></tr>
     *                        <tr><td>{@link DH_InterfaceType#DH_INTERFACE_DOWNLOAD}</td><td>4</td><td>下载接口</td></tr>
     *                        <tr><td>{@link DH_InterfaceType#DH_INTERFACE_REALLOADPIC}</td><td>5</td><td>下载智能图片接口</td></tr>
     *                        </tbody>
     *                        </table>
     * @param bOnline         是否在线
     * @param lOperateHandle  接口返回的操作句柄，如#CLIENT_RealPlay返回的播放句柄
     * @param lLoginID        登陆句柄
     * @param dwUser          用户自定义参数
     */
    void invoke(int emInterfaceType, int bOnline, NativeLong lOperateHandle, NativeLong lLoginID,
                NativeLong dwUser);
}
