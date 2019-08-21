package com.sematec.sematecandroidbasicmordad98;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TestHandlerActivity extends AppCompatActivity {


    Boolean hasUserClickedOnBackBtn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_handler);
    }


    @Override
    public void onBackPressed() {
        if (hasUserClickedOnBackBtn == true) {
            super.onBackPressed();
        } else {
            Toast.makeText(this, "Please press back again", Toast.LENGTH_SHORT).show();
            hasUserClickedOnBackBtn = true;

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    hasUserClickedOnBackBtn = false;
                }
            }, 2500);
        }
    }
}
