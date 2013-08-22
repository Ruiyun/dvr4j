package com.dahua.netsdk.linux;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

/**
 * 回调音频数据帧的帧参数结构体
 */
public class tagCBPCMDataParam extends Structure {
    /**
     * 声道数
     */
    public byte channels;

    /**
     * 采样 0 - 8000, 1 - 11025, 2 - 16000, 3 - 22050, 4 - 32000, 5 - 44100, 6 - 48000
     */
    public byte samples;

    /**
     * 采样深度 取值8或者16等。直接表示
     */
    public byte depth;

    /**
     * 0 - 指示无符号，1-指示有符号
     */
    public byte param1;

    /**
     * 保留
     */
    public int reserved;

    public tagCBPCMDataParam() {
        super();
    }

    protected List<?> getFieldOrder() {
        return Arrays.asList("channels", "samples", "depth", "param1", "reserved");
    }

    public tagCBPCMDataParam(byte channels, byte samples, byte depth, byte param1, int reserved) {
        super();
        this.channels = channels;
        this.samples = samples;
        this.depth = depth;
        this.param1 = param1;
        this.reserved = reserved;
    }

    public static class ByReference extends tagCBPCMDataParam implements Structure.ByReference {
    }

    public static class ByValue extends tagCBPCMDataParam implements Structure.ByValue {
    }

}
