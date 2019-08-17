package com.sematec.sematecandroidbasicmordad98;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class TestThreadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_thread);


        String name = Thread.currentThread().getName();
        Log.d("MYTAG", name);



        new Thread(new Runnable() {
            @Override
            public void run() {

                String name = Thread.currentThread().getName();
                Log.d("MYTAG", name);

            }
        }).start();

    }
}
