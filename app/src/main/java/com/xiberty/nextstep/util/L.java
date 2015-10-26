package com.xiberty.nextstep.util;

import android.util.Log;

public class L {

    public static final boolean DEBUG = true;
    public static final String TAG_DEBUG = "NextStep";

    public static void i(Object object, String message, String data) {
        if (DEBUG) {
            Log.i(TAG_DEBUG, "[" + object.getClass().getSimpleName() + "] " + message + ":\n" + data);
        }
    }

    public static void i(Object object, String message, int data) {
        if (DEBUG) {
            Log.i(TAG_DEBUG, "[" + object.getClass().getSimpleName() + "] " + message + ":\n" + data);
        }
    }

    public static void i(Object object, String message, boolean data) {
        if (DEBUG) {
            Log.i(TAG_DEBUG, "[" + object.getClass().getSimpleName() + "] " + message + ":\n" + data);
        }
    }

    public static void i(Object object, String message) {
        if (DEBUG) {
            Log.i(TAG_DEBUG, "[" + object.getClass().getSimpleName() + "] " + message);
        }
    }

    public static void e(Object object, String message, String data) {
        if (DEBUG) {
            Log.e(TAG_DEBUG, "[" + object.getClass().getSimpleName() + "] " + message + ":\n" + data);
        }
    }

    public static void e(Object object, String message) {
        if (DEBUG) {
            Log.e(TAG_DEBUG, "[" + object.getClass().getSimpleName() + "] " + message);
        }
    }

    public static void v(Object object, String message, String data) {
        if (DEBUG) {
            Log.v(TAG_DEBUG, "[" + object.getClass().getSimpleName() + "] " + message + ":\n" + data);
        }
    }

    public static void v(Object object, String message) {
        if (DEBUG) {
            Log.v(TAG_DEBUG, "[" + object.getClass().getSimpleName() + "] " + message);
        }
    }
}