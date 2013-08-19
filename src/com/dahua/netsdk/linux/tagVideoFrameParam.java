package com.dahua.netsdk.linux;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

public class tagVideoFrameParam extends Structure {
	/** \u7f16\u7801\u7c7b\u578b */
	public byte encode;
	/** I = 0, P =  1, B =  2... */
	public byte frametype;
	/** PAL - 0, NTSC - 1 */
	public byte format;
	/** CIF - 0, HD1 - 1, 2CIF - 2, D1 - 3, VGA - 4, QCIF - 5, QVGA - 6 , */
	public byte size;
	/**
	 * SVCD - 7, QQVGA - 8, SVGA - 9, XVGA - 10, WXGA - 11, SXGA - 12, WSXGA - 13, UXGA - 14, WUXGA - 15, LFT - 16, 720 - 17, 1080 - 18<br>
	 * \u5982\u679c\u662fH264\u7f16\u7801\u5219\u603b\u4e3a0\uff0cMPEG4\u8fd9\u91cc\u603b\u662f\u586b\u5199FOURCC('X','V','I','D');
	 */
	public int fourcc;
	/** \u4fdd\u7559 */
	public int reserved;
	/** \u65f6\u95f4\u4fe1\u606f */
	public NET_TIME struTime;
	public tagVideoFrameParam() {
		super();
	}
	protected List<? > getFieldOrder() {
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
		
	};
	public static class ByValue extends tagVideoFrameParam implements Structure.ByValue {
		
	};
}
