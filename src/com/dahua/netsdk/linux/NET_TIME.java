package com.dahua.netsdk.linux;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

/**
 * 时间
 */
public class NET_TIME extends Structure {
    /**
     * 年
     */
    public int dwYear;

    /**
     * 月
     */
    public int dwMonth;

    /**
     * 日
     */
    public int dwDay;

    /**
     * 时
     */
    public int dwHour;

    /**
     * 分
     */
    public int dwMinute;

    /**
     * 秒
     */
    public int dwSecond;

    public NET_TIME() {
        super();
    }

    protected List<?> getFieldOrder() {
        return Arrays.asList("dwYear", "dwMonth", "dwDay", "dwHour", "dwMinute", "dwSecond");
    }

    public NET_TIME(int dwYear, int dwMonth, int dwDay, int dwHour, int dwMinute, int dwSecond) {
        super();
        this.dwYear = dwYear;
        this.dwMonth = dwMonth;
        this.dwDay = dwDay;
        this.dwHour = dwHour;
        this.dwMinute = dwMinute;
        this.dwSecond = dwSecond;
    }

    public static class ByReference extends NET_TIME implements Structure.ByReference {
    }

    public static class ByValue extends NET_TIME implements Structure.ByValue {
    }

}
