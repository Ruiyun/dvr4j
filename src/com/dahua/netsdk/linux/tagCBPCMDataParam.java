package com.dahua.netsdk.linux;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

public class tagCBPCMDataParam extends Structure {
	/** \u58f0\u9053\u6570 */
	public byte channels;
	/** \u91c7\u6837 0 - 8000, 1 - 11025, 2 - 16000, 3 - 22050, 4 - 32000, 5 - 44100, 6 - 48000 */
	public byte samples;
	/** \u91c7\u6837\u6df1\u5ea6 \u53d6\u503c8\u6216\u800516\u7b49\u3002\u76f4\u63a5\u8868\u793a */
	public byte depth;
	/** 0 - \u6307\u793a\u65e0\u7b26\u53f7\uff0c1-\u6307\u793a\u6709\u7b26\u53f7 */
	public byte param1;
	/** \u4fdd\u7559 */
	public int reserved;
	public tagCBPCMDataParam() {
		super();
	}
	protected List<? > getFieldOrder() {
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
		
	};
	public static class ByValue extends tagCBPCMDataParam implements Structure.ByValue {
		
	};
}
