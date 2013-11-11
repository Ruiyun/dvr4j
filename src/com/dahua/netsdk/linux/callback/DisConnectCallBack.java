package com.dahua.netsdk.linux.callback;

import com.sun.jna.Callback;
import com.sun.jna.NativeLong;

/**
 * 网络连接断开回调函数原形
 */
public interface DisConnectCallBack extends Callback {
    /**
     * @param lLoginID 登陆句柄
     * @param pchDVRIP 设备IP
     * @param nDVRPort 端口
     * @param dwUser   用户数据，就是上面输入的用户数据
     */
    void invoke(NativeLong lLoginID, String pchDVRIP, int nDVRPort, NativeLong dwUser);
}