package me.rokevin.android.superptr;

import android.app.Application;

import me.rokevin.android.lib.helper.util.RLog;

/**
 * Created by luokaiwen on 16/11/29.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        RLog.isDebug(BuildConfig.APPLICATION_ID, BuildConfig.DEBUG);
    }
}
