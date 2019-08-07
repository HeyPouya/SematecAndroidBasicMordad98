package com.sematec.sematecandroidbasicmordad98;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView txtName;
String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_test);

        Log.d("MYTAG", "onCreate");


        txtName = findViewById(R.id.txtName);
        Button btnCreate = findViewById(R.id.btnCreate);
        final EditText edtNumber = findViewById(R.id.edtNumber);


        txtName.setText("Pouya");


        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String number = edtNumber.getText().toString();

                Intent i = new Intent(MainActivity.this, TestActivity.class);
                i.putExtra("age", number);
                startActivityForResult(i, 1);

            }
        });


    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (requestCode == 1483) {
            if (resultCode == Activity.RESULT_OK) {
                name = data.getStringExtra("name");
                txtName.setText(name);
            }
        }
    }
}
