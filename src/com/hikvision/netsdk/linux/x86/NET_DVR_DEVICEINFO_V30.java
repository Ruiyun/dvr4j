package com.hikvision.netsdk.linux.x86;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

/**
 * 设备参数结构体。
 * <p>如果byDVRType是0，则接口中解析wDevType作为设备型号；
 * 如果byDVRType非0，则接口中byDVRType和wDevType值相等，都是byDVRType。推荐使用wDevType作为设备类型。</p>
 */
public class NET_DVR_DEVICEINFO_V30 extends Structure {
    /**
     * 序列号
     */
    public byte[] sSerialNumber = new byte[48];

    /**
     * 报警输入个数
     */
    public byte byAlarmInPortNum;

    /**
     * 报警输出个数
     */
    public byte byAlarmOutPortNum;

    /**
     * 硬盘个数
     */
    public byte byDiskNum;

    /**
     * 设备类型，详见下表
     * <table>
     * <thead>
     * <tr><th>定义</th><th>值</th><th>设备类型</th></tr>
     * </thead>
     * <tbody>
     * <tr><td>DVR</td><td>1</td><td>尚未定义的DVR类型</td></tr>
     * <tr><td>ATMDVR</td><td>2</td><td>ATM DVR</td></tr>
     * <tr><td>DVS</td><td>3</td><td>DVS</td></tr>
     * <tr><td>DEC</td><td>4</td><td>6001D</td></tr>
     * <tr><td>ENC_DEC</td><td>5</td><td>6001F</td></tr>
     * <tr><td>DVR_HC</td><td>6</td><td>8000HC</td></tr>
     * <tr><td>DVR_HT</td><td>7</td><td>8000HT</td></tr>
     * <tr><td>DVR_HF</td><td>8</td><td>8000HF</td></tr>
     * <tr><td>DVR_HS</td><td>9</td><td>8000HS DVR(no audio)</td></tr>
     * <tr><td>DVR_HTS</td><td>10</td><td>8016HTS DVR(no audio)</td></tr>
     * <tr><td>DVR_HB</td><td>11</td><td>HB DVR(SATA HD)</td></tr>
     * <tr><td>DVR_HCS</td><td>12</td><td>8000HCS DVR</td></tr>
     * <tr><td>DVS_A</td><td>13</td><td>带ATA硬盘的DVS</td></tr>
     * <tr><td>DVR_HC_S</td><td>14</td><td>8000HC-S</td></tr>
     * <tr><td>DVR_HT_S</td><td>15</td><td>8000HT-S</td></tr>
     * <tr><td>DVR_HF_S</td><td>16</td><td>8000HF-S</td></tr>
     * <tr><td>DVR_HS_S</td><td>17</td><td>8000HS-S</td></tr>
     * <tr><td>ATMDVR_S</td><td>18</td><td>ATM-S</td></tr>
     * <tr><td>DVR_7000H</td><td>19</td><td>7000H系列</td></tr>
     * <tr><td>DEC_MAT</td><td>20</td><td>多路解码器</td></tr>
     * <tr><td>DVR_MOBILE</td><td>21</td><td>mobile DVR</td></tr>
     * <tr><td>DVR_HD_S</td><td>22</td><td>8000HD-S</td></tr>
     * <tr><td>DVR_HD_SL</td><td>23</td><td>8000HD-SL</td></tr>
     * <tr><td>DVR_HC_SL</td><td>24</td><td>8000HC-SL</td></tr>
     * <tr><td>DVR_HS_ST</td><td>25</td><td>8000HS_ST</td></tr>
     * <tr><td>DVS_HW</td><td>26</td><td>6000HW</td></tr>
     * <tr><td>DS630X_D</td><td>27</td><td>多路解码器</td></tr>
     * <tr><td>DS640X_HD</td><td>28</td><td>640X高清解码器</td></tr>
     * <tr><td>DS610X_D</td><td>29</td><td>610X解码器</td></tr>
     * <tr><td>IPCAM</td><td>30</td><td>IP 摄像机</td></tr>
     * <tr><td>MEGA_IPCAM</td><td>31</td><td>X52MF系列摄像机</td></tr>
     * <tr><td>IPCAM_X62MF</td><td>32</td><td>X62MF系列摄像机</td></tr>
     * <tr><td>ITCCAM</td><td>35</td><td>智能高清IPC</td></tr>
     * <tr><td>IVS_IPCAM</td><td>36</td><td>智能分析高清网络摄像机(人脸抓拍机)</td></tr>
     * <tr><td>ZOOMCAM</td><td>38</td><td>一体机</td></tr>
     * <tr><td>IPDOME</td><td>40</td><td>IP标清快球</td></tr>
     * <tr><td>IPDOME_MEGA200</td><td>41</td><td>IP 200万高清快球</td></tr>
     * <tr><td>IPDOME_MEGA130</td><td>42</td><td>IP 130万高清快球</td></tr>
     * <tr><td>TII_IPCAM</td><td>44</td><td>红外热成像摄像机</td></tr>
     * <tr><td>IPMOD</td><td>50</td><td>IP 模块</td></tr>
     * <tr><td>IDS6501_HF_P</td><td>60</td><td>6501 车牌识别</td></tr>
     * <tr><td>IDS6101_HF_A</td><td>61</td><td>智能ATM</td></tr>
     * <tr><td>IDS6002_HF_B</td><td>62</td><td>双摄像机跟踪：DS6002-HF/B</td></tr>
     * <tr><td>IDS6101_HF_B</td><td>63</td><td>行为分析：DS6101-HF/B</td></tr>
     * <tr><td>IDS52XX</td><td>64</td><td>智能分析仪</td></tr>
     * <tr><td>IDS90XX</td><td>65</td><td>9000智能</td></tr>
     * <tr><td>IDS8104_AHL_S_HX</td><td>66</td><td>海鑫人脸识别 ATM</td></tr>
     * <tr><td>IDS8104_AHL_S_H</td><td>67</td><td>私有人脸识别 ATM</td></tr>
     * <tr><td>IDS91XX</td><td>68</td><td>9100智能</td></tr>
     * <tr><td>IIP_CAM_B</td><td>69</td><td>智能行为IP摄像机</td></tr>
     * <tr><td>DS71XX_H</td><td>71</td><td>DS71XXH_S</td></tr>
     * <tr><td>DS72XX_H_S</td><td>72</td><td>DS72XXH_S</td></tr>
     * <tr><td>DS73XX_H_S</td><td>73</td><td>DS73XXH_S</td></tr>
     * <tr><td>DS72XX_HF_S</td><td>74</td><td>DS72XX_HF_S</td></tr>
     * <tr><td>DS73XX_HFI_S</td><td>75</td><td>DS73XX_HFI_S</td></tr>
     * <tr><td>DS76XX_H_S</td><td>76</td><td>DS76XX_H_S</td></tr>
     * <tr><td>DS76XX_N_S</td><td>77</td><td>DS76XX_N_S</td></tr>
     * <tr><td>DS81XX_HS_S</td><td>81</td><td>DS81XX_HS_S</td></tr>
     * <tr><td>DS81XX_HL_S</td><td>82</td><td>DS81XX_HL_S</td></tr>
     * <tr><td>DS81XX_HC_S</td><td>83</td><td>DS81XX_HC_S</td></tr>
     * <tr><td>DS81XX_HD_S</td><td>84</td><td>DS81XX_HD_S</td></tr>
     * <tr><td>DS81XX_HE_S</td><td>85</td><td>DS81XX_HE_S</td></tr>
     * <tr><td>DS81XX_HF_S</td><td>86</td><td>DS81XX_HF_S</td></tr>
     * <tr><td>DS81XX_AH_S</td><td>87</td><td>DS81XX_AH_S</td></tr>
     * <tr><td>DS81XX_AHF_S</td><td>88</td><td>DS81XX_AHF_S</td></tr>
     * <tr><td>DS90XX_HF_S</td><td>90</td><td>DS90XX_HF_S</td></tr>
     * <tr><td>DS91XX_HF_S</td><td>91</td><td>DS91XX_HF_S</td></tr>
     * <tr><td>DS91XX_HD_S</td><td>92</td><td>91XXHD-S(MD)</td></tr>
     * <tr><td>IDS90XX_A</td><td>93</td><td>9000智能 ATM</td></tr>
     * <tr><td>IDS91XX_A</td><td>94</td><td>9100智能 ATM</td></tr>
     * <tr><td>DS95XX_N_S</td><td>95</td><td>DS95XXN-S NVR</td></tr>
     * <tr><td>DS96XX_N_SH</td><td>96</td><td>DS96XXN-SH NVR</td></tr>
     * <tr><td>DS90XX_HF_SH</td><td>97</td><td>DS90XX_HF_SH</td></tr>
     * <tr><td>DS91XX_HF_SH</td><td>98</td><td>DS91XX_HF_SH</td></tr>
     * <tr><td>DS_65XXHC</td><td>105</td><td>65XXHC DVS</td></tr>
     * <tr><td>DS_65XXHC_S</td><td>106</td><td>65XXHC-SATA DVS</td></tr>
     * <tr><td>DS_65XXHF</td><td>107</td><td>65XXHF DVS</td></tr>
     * <tr><td>DS_65XXHF_S</td><td>108</td><td>65XXHF-SATA DVS</td></tr>
     * <tr><td>DS_6500HF_B</td><td>109</td><td>65 rack DVS</td></tr>
     * <tr><td>IVMS_6200_C</td><td>110</td><td>iVMS-6200(/C) 人流量统计</td></tr>
     * <tr><td>IVMS_6200_B</td><td>111</td><td>IVMS_6200_B 行为分析</td></tr>
     * <tr><td>DS_72XXHV_ST15</td><td>112</td><td>72XXHV_ST15 DVR</td></tr>
     * <tr><td>DS_72XXHV_ST20</td><td>113</td><td>72XXHV_ST20 DVR</td></tr>
     * <tr><td>IVMS_6200_T</td><td>114</td><td>IVMS-6200(/T)</td></tr>
     * <tr><td>IVMS_6200_BP</td><td>115</td><td>IVMS-6200(/BP)</td></tr>
     * <tr><td>DS_81XXHC_ST</td><td>116</td><td>DS_81XXHC_ST</td></tr>
     * <tr><td>DS_81XXHS_ST</td><td>117</td><td>DS_81XXHS_ST</td></tr>
     * <tr><td>DS_81XXAH_ST</td><td>118</td><td>DS_81XXAH_ST</td></tr>
     * <tr><td>DS_81XXAHF_ST</td><td>119</td><td>DS_81XXAHF_ST</td></tr>
     * <tr><td>DS_66XXDVS</td><td>120</td><td>DS_66XXDVS</td></tr>
     * <tr><td>DS_19AXX</td><td>142</td><td>通用报警主机类产品</td></tr>
     * <tr><td>DS_19CXX</td><td>144</td><td>自助银行报警主机</td></tr>
     * <tr><td>DS_19DXX</td><td>145</td><td>动环监控报警主机</td></tr>
     * <tr><td>DS_19XX</td><td>146</td><td>1900系列报警主机</td></tr>
     * <tr><td>DS_1HXX</td><td>148</td><td>ATM防护舱控制器</td></tr>
     * <tr><td>DS_C10H</td><td>161</td><td>多屏控制器</td></tr>
     * <tr><td>DS_C10N_BI</td><td>162</td><td>BNC处理器</td></tr>
     * <tr><td>DS_C10N_DI</td><td>163</td><td>RGB处理器</td></tr>
     * <tr><td>DS_C10N_SI</td><td>164</td><td>码流处理器</td></tr>
     * <tr><td>DS_C10N_DO</td><td>165</td><td>显示处理器</td></tr>
     * <tr><td>DS_C10N_SERVER</td><td>166</td><td>分布式服务器</td></tr>
     * <tr><td>IDS_8104_AHFL_S_H</td><td>171</td><td>8104ATM</td></tr>
     * <tr><td>IDS_65XX_HF_A</td><td>172</td><td>65 ATM</td></tr>
     * <tr><td>IDS90XX_HF_RH</td><td>173</td><td>9000 智能RH</td></tr>
     * <tr><td>IDS91XX_HF_RH</td><td>174</td><td>9100 智能RH设备</td></tr>
     * <tr><td>IDS_65XX_HF_B</td><td>175</td><td>65 行为分析</td></tr>
     * <tr><td>IDS_65XX_HF_P</td><td>176</td><td>65 车牌识别</td></tr>
     * <tr><td>DS90XX_HF_RH</td><td>181</td><td>DS90XX_HF_RH</td></tr>
     * <tr><td>DS91XX_HF_RH</td><td>182</td><td>9100 RH设备</td></tr>
     * <tr><td>DS78XX_S</td><td>183</td><td>78系列设备</td></tr>
     * <tr><td>DS81XXHW_S</td><td>185</td><td>DVR_81XXHW_S</td></tr>
     * <tr><td>DS81XXHW_ST</td><td>186</td><td>DVR_81XXHW_ST</td></tr>
     * <tr><td>DS91XXHW_ST</td><td>187</td><td>DVR_91XXHW_ST</td></tr>
     * <tr><td>DS91XX_ST</td><td>188</td><td>DVR_91XX_ST</td></tr>
     * <tr><td>DS81XX_ST</td><td>189</td><td>DVR_81XX_ST</td></tr>
     * <tr><td>DS81XXH_ST</td><td>190</td><td>DS81XXHDI_ST,DS81XXHE_ST</td></tr>
     * <tr><td>DS73XXH_ST</td><td>191</td><td>DS73XXHI_ST</td></tr>
     * <tr><td>DS81XX_SH</td><td>192</td><td>审讯81SH，81SHF</td></tr>
     * <tr><td>DS81XX_SN</td><td>193</td><td>审讯81SNL</td></tr>
     * <tr><td>DS96XXN_ST</td><td>194</td><td>NVR：DS96xxN_ST</td></tr>
     * <tr><td>DS86XXN_ST</td><td>195</td><td>NVR：DS86xxN_ST</td></tr>
     * <tr><td>DS80XXHF_ST</td><td>196</td><td>DS80xxHF_ST</td></tr>
     * <tr><td>DS90XXHF_ST</td><td>197</td><td>DS90xxHF_ST</td></tr>
     * <tr><td>DS76XXN_ST</td><td>198</td><td>NVR：DS76xxN_ST</td></tr>
     * <tr><td>DS_9664N_RX</td><td>199</td><td>NVR：DS-9664N-RH、DS-9664N-RT</td></tr>
     * <tr><td>ENCODER_SERVER</td><td>200</td><td>编码卡服务器</td></tr>
     * <tr><td>DECODER_SERVER</td><td>201</td><td>解码卡服务器</td></tr>
     * <tr><td>PCNVR_SERVER</td><td>202</td><td>PCNVR存储服务器</td></tr>
     * <tr><td>CVR_SERVER</td><td>203</td><td>CVR</td></tr>
     * <tr><td>DS_91XXHFH_ST</td><td>204</td><td>高清DVR：DS_91xxHFH_ST</td></tr>
     * <tr><td>DS64XXHD_T</td><td>701</td><td>64-T高清解码器</td></tr>
     * <tr><td>DS90XXHW_ST</td><td>2001</td><td>混合DVR：DS90XXHW_ST</td></tr>
     * <tr><td>DS72XXHX_SH</td><td>2002</td><td>DS-72xxHV-SH，DS-72xxHF-SH</td></tr>
     * <tr><td>DS_92XX_HF_ST</td><td>2003</td><td>DS-92XXHF-ST</td></tr>
     * <tr><td>DS_91XX_HF_XT</td><td>2004</td><td>Netra DVR: DS-91xxHF-XT</td></tr>
     * <tr><td>DS_90XX_HF_XT</td><td>2005</td><td>Netra 混合DVR: DS-90xxHF-XT</td></tr>
     * <tr><td>DS_77XXN_ST</td><td>2201</td><td>Netra NVR: DS-77xxN-ST</td></tr>
     * <tr><td>DS_95XX_N_ST</td><td>2202</td><td>Netra NVR: DS-95xxN-ST</td></tr>
     * <tr><td>DS_85XX_N_ST</td><td>2203</td><td>Netra NVR: DS-85xxN-ST</td></tr>
     * <tr><td>DS_96XX_N_XT</td><td>2204</td><td>Netra NVR: DS-96xxN-XT</td></tr>
     * </tbody>
     * </table>
     */
    public byte byDVRType;

    /**
     * 设备模拟通道个数
     */
    public byte byChanNum;

    /**
     * 起始通道号，目前设备通道号从1开始
     */
    public byte byStartChan;

    /**
     * 设备语音通道数
     */
    public byte byAudioChanNum;

    /**
     * 设备最大数字通道个数
     */
    public byte byIPChanNum;

    /**
     * 零通道编码个数
     */
    public byte byZeroChanNum;

    /**
     * 主码流传输协议类型：0-private，1-rtsp
     */
    public byte byMainProto;

    /**
     * 子码流传输协议类型：0-private，1-rtsp
     */
    public byte bySubProto;

    /**
     * 能力，位与结果为0表示不支持，1表示支持
     * <ul>
     * <li>bySupport & 0x1，表示是否支持智能搜索</li>
     * <li>bySupport & 0x2，表示是否支持备份</li>
     * <li>bySupport & 0x4，表示是否支持压缩参数能力获取</li>
     * <li>bySupport & 0x8, 表示是否支持双网卡</li>
     * <li>bySupport & 0x10, 表示支持远程SADP</li>
     * <li>bySupport & 0x20, 表示支持Raid卡功能</li>
     * <li>bySupport & 0x40, 表示支持IPSAN目录查找</li>
     * <li>bySupport & 0x80, 表示支持rtp over rtsp</li>
     * </ul>
     */
    public byte bySupport;

    /**
     * 能力集扩充，位与结果为0表示不支持，1表示支持
     * <ul>
     * <li>bySupport1 & 0x1, 表示是否支持snmp v30</li>
     * <li>bySupport1 & 0x2, 表示是否支持区分回放和下载</li>
     * <li>bySupport1 & 0x4, 表示是否支持布防优先级</li>
     * <li>bySupport1 & 0x8, 表示智能设备是否支持布防时间段扩展</li>
     * </ul>
     */
    public byte bySupport1;

    /**
     * 保留，置为0
     */
    public byte byRes1;

    /**
     * 设备型号
     */
    public short wDevType;

    /**
     * 保留，置为0
     */
    public byte[] byRes2 = new byte[16];

    public NET_DVR_DEVICEINFO_V30() {
        super();
    }

    protected List<?> getFieldOrder() {
        return Arrays.asList("sSerialNumber", "byAlarmInPortNum", "byAlarmOutPortNum", "byDiskNum", "byDVRType", "byChanNum", "byStartChan", "byAudioChanNum", "byIPChanNum", "byZeroChanNum", "byMainProto", "bySubProto", "bySupport", "bySupport1", "byRes1", "wDevType", "byRes2");
    }

    public static class ByReference extends NET_DVR_DEVICEINFO_V30 implements Structure.ByReference {

    }

    public static class ByValue extends NET_DVR_DEVICEINFO_V30 implements Structure.ByValue {

    }
}
