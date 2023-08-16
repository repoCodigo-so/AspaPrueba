package com.example.aspaprueba;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ColorAdapter extends RecyclerView.Adapter<ColorAdapter.ColorViewHolder> {
    private List<ColorItem> colorItems;

    public ColorAdapter(List<ColorItem> colorItems) {
        this.colorItems = colorItems;
    }

    @NonNull
    @Override
    public ColorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.color_item, parent, false);
        return new ColorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ColorViewHolder holder, int position) {
        ColorItem colorItem = colorItems.get(position);
        holder.colorView.setBackgroundResource(colorItem.getColorResId());
        holder.colorName.setText(colorItem.getColorName());
    }

    @Override
    public int getItemCount() {
        return colorItems.size();
    }

    static class ColorViewHolder extends RecyclerView.ViewHolder {
        View colorView;
        TextView colorName;

        public ColorViewHolder(@NonNull View itemView) {
            super(itemView);
            colorView = itemView.findViewById(R.id.color_view);
            colorName = itemView.findViewById(R.id.color_name);
        }
    }
}

