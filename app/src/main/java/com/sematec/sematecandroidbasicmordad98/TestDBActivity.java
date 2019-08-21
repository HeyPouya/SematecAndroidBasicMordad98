package com.sematec.sematecandroidbasicmordad98;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TestDBActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_db);

        Button btnInsert = findViewById(R.id.btnInsert);
        Button btnGet = findViewById(R.id.btnGet);


        final TestSqliteDbHandler handler = new TestSqliteDbHandler(TestDBActivity.this, "sematec", null, 1);


        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handler.insertIntoDB("Pouya", "Heydari", 17);
            }
        });

        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String names = handler.getAllStudentsName();
                Toast.makeText(TestDBActivity.this, names, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
