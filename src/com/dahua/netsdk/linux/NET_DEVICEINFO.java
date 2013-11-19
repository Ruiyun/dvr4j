package com.dahua.netsdk.linux;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;
import com.dahua.netsdk.def.DH_NetDeviceType;

/**
 * 设备信息
 */
public class NET_DEVICEINFO extends Structure {
    /**
     * 序列号
     */
    public byte[] sSerialNumber = new byte[48];

    /**
     * DVR报警输入个数
     */
    public byte byAlarmInPortNum;

    /**
     * DVR报警输出个数
     */
    public byte byAlarmOutPortNum;

    /**
     * DVR硬盘个数
     */
    public byte byDiskNum;

    /**
     * DVR类型, 见{@link DH_NetDeviceType}
     */
    public byte byDVRType;

    /**
     * DVR通道个数
     */
    public byte byChanNum;

    public NET_DEVICEINFO() {
        super();
    }

    protected List<?> getFieldOrder() {
        return Arrays.asList("sSerialNumber", "byAlarmInPortNum", "byAlarmOutPortNum", "byDiskNum", "byDVRType", "byChanNum");
    }

    public NET_DEVICEINFO(byte sSerialNumber[], byte byAlarmInPortNum, byte byAlarmOutPortNum, byte byDiskNum, byte byDVRType, byte byChanNum) {
        super();
        if ((sSerialNumber.length != this.sSerialNumber.length))
            throw new IllegalArgumentException("Wrong array size !");
        this.sSerialNumber = sSerialNumber;
        this.byAlarmInPortNum = byAlarmInPortNum;
        this.byAlarmOutPortNum = byAlarmOutPortNum;
        this.byDiskNum = byDiskNum;
        this.byDVRType = byDVRType;
        this.byChanNum = byChanNum;
    }

    public static class ByReference extends NET_DEVICEINFO implements Structure.ByReference {
    }

    public static class ByValue extends NET_DEVICEINFO implements Structure.ByValue {
    }

}
