package com.hikvision.netsdk.linux.x86;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

/**
 * 预览参数结构体。
 */
public class NET_DVR_CLIENTINFO extends Structure {
    /**
     * 通道号，1~32表示模拟通道1~32，9000系列混合型DVR和NVR等设备的IP通道从33开始。
     */
    public int lChannel;

    /**
     * 最高位(31)为0表示主码流，为1表示子码流；0～30位表示连接方式：0－TCP方式，1－UDP方式，2－多播方式
     * <p>例如子码流TCP连接，则lLinkMode=0x80000000</p>
     */
    public int lLinkMode;

    /**
     * 播放窗口的句柄，为NULL表示不显示图像
     */
    public int hPlayWnd;

    /**
     * 多播组地址
     */
    public String sMultiCastIP;

    public NET_DVR_CLIENTINFO() {
        super();
    }

    protected List<?> getFieldOrder() {
        return Arrays.asList("lChannel", "lLinkMode", "hPlayWnd", "sMultiCastIP");
    }

    public NET_DVR_CLIENTINFO(int lChannel, int lLinkMode, int hPlayWnd, String sMultiCastIP) {
        super();
        this.lChannel = lChannel;
        this.lLinkMode = lLinkMode;
        this.hPlayWnd = hPlayWnd;
        this.sMultiCastIP = sMultiCastIP;
    }

    public static class ByReference extends NET_DVR_CLIENTINFO implements Structure.ByReference {

    }

    public static class ByValue extends NET_DVR_CLIENTINFO implements Structure.ByValue {

    }
}
