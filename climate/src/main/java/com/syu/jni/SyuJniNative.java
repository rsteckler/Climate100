package com.syu.jni;

public class SyuJniNative {

    private static final SyuJniNative INSTANCE = new SyuJniNative();

    static {
        System.loadLibrary("syu_jni");
    }

    private SyuJniNative() {}

    public static SyuJniNative getInstance() {
        return INSTANCE;
    }

    public native int syu_jni_command(int i, Object obj, Object obj2);
}
