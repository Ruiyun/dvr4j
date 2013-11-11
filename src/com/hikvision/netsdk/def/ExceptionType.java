package com.hikvision.netsdk.def;

public class ExceptionType {
    /**
     * 用户交互时异常（注册心跳超时，心跳间隔为2分钟）
     */
    public static final int EXCEPTION_EXCHANGE = 0x8000;

    /**
     * 语音对讲异常
     */
    public static final int EXCEPTION_AUDIOEXCHANGE = 0x8001;

    /**
     * 报警异常
     */
    public static final int EXCEPTION_ALARM = 0x8002;

    /**
     * 网络预览异常
     */
    public static final int EXCEPTION_PREVIEW = 0x8003;

    /**
     * 透明通道异常
     */
    public static final int EXCEPTION_SERIAL = 0x8004;

    /**
     * 预览时重连
     */
    public static final int EXCEPTION_RECONNECT = 0x8005;

    /**
     * 报警时重连
     */
    public static final int EXCEPTION_ALARMRECONNECT = 0x8006;

    /**
     * 透明通道重连
     */
    public static final int EXCEPTION_SERIALRECONNECT = 0x8007;

    /**
     * 透明通道重连成功
     */
    public static final int SERIAL_RECONNECTSUCCESS = 0x8008;

    /**
     * 回放异常
     */
    public static final int EXCEPTION_PLAYBACK = 0x8010;

    /**
     * 硬盘格式化
     */
    public static final int EXCEPTION_DISKFMT = 0x8011;

    /**
     * 被动解码异常
     */
    public static final int EXCEPTION_PASSIVEDECODE = 0x8012;

    /**
     * 邮件测试异常
     */
    public static final int EXCEPTION_EMAILTEST = 0x8013;

    /**
     * 备份异常
     */
    public static final int EXCEPTION_BACKUP = 0x8014;

    /**
     * 预览时重连成功
     */
    public static final int PREVIEW_RECONNECTSUCCESS = 0x8015;

    /**
     * 报警时重连成功
     */
    public static final int ALARM_RECONNECTSUCCESS = 0x8016;

    /**
     * 用户交互恢复
     */
    public static final int RESUME_EXCHANGE = 0x8017;

    /**
     * 网络流量检测异常
     */
    public static final int NETWORK_FLOWTEST_EXCEPTION = 0x8018;

    /**
     * 图片预览重连
     */
    public static final int EXCEPTION_PICPREVIEWRECONNECT = 0x8019;

    /**
     * 图片预览重连成功
     */
    public static final int PICPREVIEW_RECONNECTSUCCESS = 0x8020;

    /**
     * 图片预览异常
     */
    public static final int EXCEPTION_PICPREVIEW = 0x8021;

    /**
     * 推模式设备注册成功
     */
    public static final int SUCCESS_PUSHDEVLOGON = 0x8030;
}
