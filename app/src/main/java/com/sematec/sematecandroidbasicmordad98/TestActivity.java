package com.sematec.sematecandroidbasicmordad98;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        TextView txtName = findViewById(R.id.txtName);
        final EditText edtName = findViewById(R.id.edtName);
        Button btnFinish = findViewById(R.id.btnFinish);

        Intent i = getIntent();
        String age = i.getStringExtra("age");

        txtName.setText(age);


        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("name", name);
                setResult(Activity.RESULT_OK, intent);

                finish();

            }
        });


    }
}
