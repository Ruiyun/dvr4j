package com.dahua.netsdk.linux.callback;

import com.sun.jna.Callback;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.dahua.netsdk.def.DH_RealplayDisconnectEventType;

/**
 * 视频监视断开回调函数原形
 */
public interface RealPlayDisConnectCallBack extends Callback {
    /**
     * @param lOperateHandle 监控句柄
     * @param dwEventType    事件类型，EM_REALPLAY_DISCONNECT_EVENT_TYPE，见下表：
     *                       <table>
     *                       <thead>
     *                       <tr><th>类型</th><th>值</th><th>含义</th></tr>
     *                       </thead>
     *                       <tbody>
     *                       <tr><td>{@link DH_RealplayDisconnectEventType#DISCONNECT_EVENT_REAVE}</td><td>0</td><td>表示高级用户抢占低级用户资源</td></tr>
     *                       <tr><td>{@link DH_RealplayDisconnectEventType#DISCONNECT_EVENT_NETFORBID}</td><td>1</td><td>禁止入网</td></tr>
     *                       <tr><td>{@link DH_RealplayDisconnectEventType#DISCONNECT_EVENT_SUBCONNECT}</td><td>2</td><td>动态子链接断开</td></tr>
     *                       </tbody>
     *                       </table>
     * @param param          事件参数，此参数暂时没有用到
     * @param dwUser         用户数据，就是上面输入的用户数据
     */
    void invoke(NativeLong lOperateHandle, int dwEventType, Pointer param, NativeLong dwUser);
}
