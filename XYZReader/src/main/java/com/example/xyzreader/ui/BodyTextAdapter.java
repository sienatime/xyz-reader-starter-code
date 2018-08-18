package com.example.xyzreader.ui;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.xyzreader.R;

import java.util.ArrayList;

public class BodyTextAdapter extends RecyclerView.Adapter {
    private ArrayList<String> items = new ArrayList<>();

    public BodyTextAdapter(ArrayList<String> items) {
        this.items = items;
    }
    public BodyTextAdapter() {}

    public void setItems(ArrayList<String> items) {
        this.items.addAll(items);
        notifyDataSetChanged();
    }

    @Override
    public BodyTextViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_body_text, parent, false);
        return new BodyTextViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((BodyTextViewHolder) holder).bind(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class BodyTextViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        BodyTextViewHolder(View itemView) {
            super(itemView);
            this.textView = (TextView) itemView;
        }

        void bind(String bodyText) {
            textView.setText(bodyText);
        }
    }
}
