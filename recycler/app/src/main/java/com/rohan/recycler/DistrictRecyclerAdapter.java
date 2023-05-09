package com.rohan.recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class DistrictRecyclerAdapter extends RecyclerView.Adapter<DistrictRecyclerAdapter.ViewHolder>  {
    Context context;
    ArrayList<DistrictModel>dataArray;
    public DistrictRecyclerAdapter(Context context,ArrayList<DistrictModel>dataArray){
        this.dataArray=dataArray;
        this.context=context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,
                parent,false);
        return new ViewHolder(view);
    }
    //layout repeat content view show garna


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DistrictModel item=dataArray.get(position);
        holder.district_name.setText(item.getDistrictname());
        holder.district_population.setText(item.getPopulation() + "");
        holder.district_temp.setText(item.getAvgTemperature() + "");
        holder.district_area.setText(item.getArea() + "");

    }

    @Override
    public int getItemCount() {
        return dataArray.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView district_name,district_population,district_temp,district_area;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            district_name=itemView.findViewById(R.id.district_name);
            district_population=itemView.findViewById(R.id.district_population);
            district_temp=itemView.findViewById(R.id.district_temp);
            district_area=itemView.findViewById(R.id.district_area);

        }
    }

    //todo 1 extends RecyclerView.Adapter<ContactRecyclerAdapter.ViewHolder>



    // todo 7 ccts

    // todo 6 constructor    context, array object

    //todo 3 implement 1 oncreateviewholder


    //todo 4 implement 2 onbindviewholder


    //todo 5 implement 3 getitemcount



    //todo 2 implement viewholder
}
