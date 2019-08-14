package com.sematec.sematecandroidbasicmordad98;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TestHTMLActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_html);


        TextView txtMessage = findViewById(R.id.txtMessage);

        txtMessage.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
    }
}
