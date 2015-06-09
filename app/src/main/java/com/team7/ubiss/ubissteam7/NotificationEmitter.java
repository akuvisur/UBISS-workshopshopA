package com.team7.ubiss.ubissteam7;

import android.app.Notification;

/**
 * Created by Aku on 9.6.2015.
 */
public class NotificationEmitter {
    public static final int PRIORITY_LEVEL_ZERO = 0;

    public NotificationEmitter() {
            // do nothing
        }

    public void emit(Notification n) {
        // get current notification level for this moment
        int priority = ContextAnalyzer.analyze(n);
        // emit the corresponding notification type with the content
    }

}
