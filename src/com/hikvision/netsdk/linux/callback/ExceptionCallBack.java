package com.hikvision.netsdk.linux.callback;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.hikvision.netsdk.def.ExceptionType;

public interface ExceptionCallBack extends Callback {
    /**
     * @param dwType  异常或重连等消息的类型，见下文的异常消息宏定义表：
     *                <table>
     *                <thead>
     *                <tr><th>类型</th><th>值</th><th>含义</th></tr>
     *                </thead>
     *                <tbody>
     *                <tr><td>{@link ExceptionType#EXCEPTION_EXCHANGE}</td><td>0x8000</td><td>用户交互时异常（注册心跳超时，心跳间隔为2分钟）</td></tr>
     *                <tr><td>{@link ExceptionType#EXCEPTION_AUDIOEXCHANGE}</td><td>0x8001</td><td>语音对讲异常</td></tr>
     *                <tr><td>{@link ExceptionType#EXCEPTION_ALARM}</td><td>0x8002</td><td>报警异常</td></tr>
     *                <tr><td>{@link ExceptionType#EXCEPTION_PREVIEW}</td><td>0x8003</td><td>网络预览异常</td></tr>
     *                <tr><td>{@link ExceptionType#EXCEPTION_SERIAL}</td><td>0x8004</td><td>透明通道异常</td></tr>
     *                <tr><td>{@link ExceptionType#EXCEPTION_RECONNECT}</td><td>0x8005</td><td>预览时重连</td></tr>
     *                <tr><td>{@link ExceptionType#EXCEPTION_ALARMRECONNECT}</td><td>0x8006</td><td>报警时重连</td></tr>
     *                <tr><td>{@link ExceptionType#EXCEPTION_SERIALRECONNECT}</td><td>0x8007</td><td>透明通道重连</td></tr>
     *                <tr><td>{@link ExceptionType#SERIAL_RECONNECTSUCCESS}</td><td>0x8008</td><td>透明通道重连成功</td></tr>
     *                <tr><td>{@link ExceptionType#EXCEPTION_PLAYBACK}</td><td>0x8010</td><td>回放异常</td></tr>
     *                <tr><td>{@link ExceptionType#EXCEPTION_DISKFMT}</td><td>0x8011</td><td>硬盘格式化</td></tr>
     *                <tr><td>{@link ExceptionType#EXCEPTION_PASSIVEDECODE}</td><td>0x8012</td><td>被动解码异常</td></tr>
     *                <tr><td>{@link ExceptionType#EXCEPTION_EMAILTEST}</td><td>0x8013</td><td>邮件测试异常</td></tr>
     *                <tr><td>{@link ExceptionType#EXCEPTION_BACKUP}</td><td>0x8014</td><td>备份异常</td></tr>
     *                <tr><td>{@link ExceptionType#PREVIEW_RECONNECTSUCCESS}</td><td>0x8015</td><td>预览时重连成功</td></tr>
     *                <tr><td>{@link ExceptionType#ALARM_RECONNECTSUCCESS}</td><td>0x8016</td><td>报警时重连成功</td></tr>
     *                <tr><td>{@link ExceptionType#RESUME_EXCHANGE}</td><td>0x8017</td><td>用户交互恢复</td></tr>
     *                <tr><td>{@link ExceptionType#NETWORK_FLOWTEST_EXCEPTION}</td><td>0x8018</td><td>网络流量检测异常</td></tr>
     *                <tr><td>{@link ExceptionType#EXCEPTION_PICPREVIEWRECONNECT}</td><td>0x8019</td><td>图片预览重连</td></tr>
     *                <tr><td>{@link ExceptionType#PICPREVIEW_RECONNECTSUCCESS}</td><td>0x8020</td><td>图片预览重连成功</td></tr>
     *                <tr><td>{@link ExceptionType#EXCEPTION_PICPREVIEW}</td><td>0x8021</td><td>图片预览异常</td></tr>
     *                <tr><td>{@link ExceptionType#SUCCESS_PUSHDEVLOGON}</td><td>0x8030</td><td>推模式设备注册成功</td></tr>
     *                </tbody>
     *                </table>
     * @param lUserID 登录ID
     * @param lHandle 出现异常的相应类型的句柄
     * @param pUser   用户数据
     */
    void invoke(int dwType, int lUserID, int lHandle, Pointer pUser);
}
