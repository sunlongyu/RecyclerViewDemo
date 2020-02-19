package com.example.recyclerviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder> {

    private Context context;

    private List<String> dataSource;

    public MyRecyclerViewAdapter(Context context) {
        this.context = context;
    }

    public List<String> getDataSource() {
        return dataSource;
    }

    public void setDataSource(List<String> dataSource) {
        this.dataSource = dataSource;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.my_item_view, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        int i = setIconId(position);
        holder.imageView.setImageResource(i);
        holder.textView.setText(dataSource.get(position));
    }

    /**
     * 设置布局的图片路径
     *
     * @param position
     */
    private int setIconId(int position) {
        switch (position % 3) {
            case 0:
                return R.drawable.a;
            case 1:
                return R.drawable.b;
            case 2:
                return R.drawable.c;
        }
        return 0;
    }

    @Override
    public int getItemCount() {
        return dataSource.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}
