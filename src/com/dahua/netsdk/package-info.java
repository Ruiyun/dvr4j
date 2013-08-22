/**
 * 包括浙江大华在各个平台下的netsdk封装
 * <p/>
 * <h1>大华DVR netsdk 编程导引</h1>
 * <br/>
 * <h2>1.监视预览模块流程</h2>
 * <ul>
 * <li>实时监视预览支持TCP、UDP、MULTICAST网络传输模式。</li>
 * <li>实时预览时，除SVR设备之外，其他设备不支持同一用户登陆ID同时请求同一通道的码流。</li>
 * </ul>
 * <br/>
 * <p style="text-align:center"><img src="doc-files/realplayflow.jpg"/></p>
 * <ul>
 * <li>方式一：在预览接口{@link com.dahua.netsdk.linux.DahuaNetSDKLibrary#CLIENT_RealPlayEx}中的播放窗口句柄为有效句柄，
 * 则由SDK实现解码功能。</li>
 * <li>方式二：用户可以通过设置预览接口{@link com.dahua.netsdk.linux.DahuaNetSDKLibrary#CLIENT_RealPlayEx}中的播放窗口句柄为NULL，
 * 并通过调用设置实时监视数据回调接口（{@link com.dahua.netsdk.linux.DahuaNetSDKLibrary#CLIENT_SetRealDataCallBackEx}），
 * 获取码流数据进行后续解码播放处理。</li>
 * </ul>
 */
package com.dahua.netsdk;
