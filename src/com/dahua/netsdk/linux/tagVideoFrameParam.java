package com.dahua.netsdk.linux;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

/**
 * 回调视频数据帧的帧参数结构体
 */
public class tagVideoFrameParam extends Structure {
    /**
     * 编码类型
     */
    public byte encode;

    /**
     * I = 0, P =  1, B =  2...
     */
    public byte frametype;

    /**
     * PAL - 0, NTSC - 1
     */
    public byte format;

    /**
     * CIF - 0, HD1 - 1, 2CIF - 2, D1 - 3, VGA - 4, QCIF - 5, QVGA - 6 ,
     * SVCD - 7, QQVGA - 8, SVGA - 9, XVGA - 10, WXGA - 11, SXGA - 12, WSXGA - 13, UXGA - 14, WUXGA - 15, LFT - 16, 720 - 17, 1080 - 18
     */
    public byte size;

    /**
     * 如果是H264编码则总为0，MPEG4这里总是填写FOURCC('X','V','I','D')
     */
    public int fourcc;

    /**
     * 保留
     */
    public int reserved;

    /**
     * 时间信息
     */
    public NET_TIME struTime;

    public tagVideoFrameParam() {
        super();
    }

    protected List<?> getFieldOrder() {
        return Arrays.asList("encode", "frametype", "format", "size", "fourcc", "reserved", "struTime");
    }

    public tagVideoFrameParam(byte encode, byte frametype, byte format, byte size, int fourcc, int reserved, NET_TIME struTime) {
        super();
        this.encode = encode;
        this.frametype = frametype;
        this.format = format;
        this.size = size;
        this.fourcc = fourcc;
        this.reserved = reserved;
        this.struTime = struTime;
    }

    public static class ByReference extends tagVideoFrameParam implements Structure.ByReference {
    }

    public static class ByValue extends tagVideoFrameParam implements Structure.ByValue {
    }

}
