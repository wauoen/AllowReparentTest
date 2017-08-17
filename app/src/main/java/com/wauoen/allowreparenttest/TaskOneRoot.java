package com.wauoen.allowreparenttest;

import android.app.ActivityManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TaskOneRoot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printTaskInfo(TaskOneRoot.this);
            }
        });
    }

    private void printTaskInfo(Context context) {


        ActivityManager a = (ActivityManager) context.getSystemService(ACTIVITY_SERVICE);
        a.getAppTasks();



    }

}
