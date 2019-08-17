package com.sematec.sematecandroidbasicmordad98;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TestRecyclerAdapter extends RecyclerView.Adapter<TestRecyclerAdapter.TestRecyclerViewHolder> {

    TestRecyclerActivity myActivity;
    List<String> myList;
    public TestRecyclerAdapter(List<String> list,TestRecyclerActivity activity) {
        myList = list;
        myActivity = activity;
    }

    @NonNull
    @Override
    public TestRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.test_recycler_item, parent, false);
        TestRecyclerViewHolder holder = new TestRecyclerViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull TestRecyclerViewHolder holder, int position) {

        String name = myList.get(position);
        holder.txtName.setText(name);
    }

    @Override
    public int getItemCount() {
        return myList.size();
    }

    class TestRecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView txtName;

        public TestRecyclerViewHolder(@NonNull View itemView ) {
            super(itemView);

            txtName = itemView.findViewById(R.id.txtName);

            
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {




                }
            });

        }
    }
}
