package com.example.pandroid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class listAdapter extends RecyclerView.Adapter {
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.week_item,parent,false);
        return new ListViewHodler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ListViewHodler) holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return data.calories.length;
    }
    public class ListViewHodler extends RecyclerView.ViewHolder implements View.OnClickListener{
private TextView textView,datetext,stepstxt,watertext,timetxt;
 public  ListViewHodler(View itemView){
     super(itemView);
     textView=itemView.findViewById(R.id.mytxtv);
     datetext=itemView.findViewById(R.id.date);
     stepstxt=itemView.findViewById(R.id.mytxtvsteps);
     watertext=itemView.findViewById(R.id.mytxtvwater);
     timetxt=itemView.findViewById(R.id.mytxtvtime);
     itemView.setOnClickListener(this);
 }

 public void bindView(int positiion){
     textView.setText(data.calories[positiion]+" calories");
     datetext.setText(data.dates[positiion]);
     stepstxt.setText(data.steps[positiion]+" steps");
     watertext.setText(data.water[positiion]+"m water break");
     timetxt.setText(data.time[positiion]+" minutes");
 }
 public void onClick(View view){

 }

    }
}
