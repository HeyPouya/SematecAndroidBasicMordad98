package com.sematec.sematecandroidbasicmordad98;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TestSharedPrefrencesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_shared_prefrences);


        TextView txtName = findViewById(R.id.txtName);
        final EditText edtName = findViewById(R.id.edtName);
        Button btnSave = findViewById(R.id.btnSave);

        String name = PreferenceManager.getDefaultSharedPreferences(TestSharedPrefrencesActivity.this)
                .getString("name", "Unkown User name!");

        txtName.setText(name);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                PreferenceManager.getDefaultSharedPreferences(TestSharedPrefrencesActivity.this)
                        .edit()
                        .putString("name", name)
                        .apply();
            }
        });
    }
}
