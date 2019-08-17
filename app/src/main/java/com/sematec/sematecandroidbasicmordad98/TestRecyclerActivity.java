package com.sematec.sematecandroidbasicmordad98;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TestRecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_recycler);


        RecyclerView recycler = findViewById(R.id.recycler);

        List<String> list = new ArrayList<>();
        list.add("Pouya Heydari");
        list.add("Fateme Afrashi");
        list.add("Javad Barqamadi");
        list.add("Mehri Jamshidi");
        list.add("Ali Khakbaz");
        list.add("Mahsa Zolqadri");
        list.add("Yasaman Rafiee");
        list.add("Kiarash Shadloo");
        list.add("Sadaf Farhood");
        list.add("Fateme Mohammadi");
        list.add("Hanie Moenian");
        list.add("Sepehr Kashani");
        list.add("Yasaman Karimi");



        TestRecyclerAdapter adapter = new TestRecyclerAdapter(list,this);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(TestRecyclerActivity.this, RecyclerView.VERTICAL, false));


    }
}
