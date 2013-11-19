package com.dahua.netsdk.def;

/**
 * 视频监视断开事件类型
 */
public abstract class DH_RealplayDisconnectEventType {
    /**
     * 表示高级用户抢占低级用户资源
     */
    public static final int DISCONNECT_EVENT_REAVE = 0;

    /**
     * 禁止入网
     */
    public static final int DISCONNECT_EVENT_NETFORBID = 1;

    /**
     * 动态子链接断开
     */
    public static final int DISCONNECT_EVENT_SUBCONNECT = 2;
}
