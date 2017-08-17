package com.wauoen.allowreparenttest;

import android.app.ActivityManager;
import android.content.Context;

import java.util.List;

/**
 * Created by wauoen on 2017/8/17.
 */
public class Utils {

    private void printTaskInfo(Context context) {


        ActivityManager activityManager = (ActivityManager) context.getSystemService(context.ACTIVITY_SERVICE);
        List<ActivityManager.AppTask> tasks = activityManager.getRunningTasks();
        for (ActivityManager.AppTask task: tasks) {

           activityManager.getRunningTasks(Integer.MAX_VALUE).get(0).;
        }
    }
}
