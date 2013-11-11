package com.dahua.netsdk.linux.callback;

import com.sun.jna.Callback;
import com.sun.jna.NativeLong;

/**
 * 网络连接恢复回调函数原形
 */
public interface HaveReConnectCallBack extends Callback {
    /**
     * @param lLoginID 登陆句柄
     * @param pchDVRIP 当前设备IP地址
     * @param nDVRPort 当前设备端口号
     * @param dwUser   用户自定义数据
     */
    void invoke(NativeLong lLoginID, String pchDVRIP, int nDVRPort, NativeLong dwUser);
}
