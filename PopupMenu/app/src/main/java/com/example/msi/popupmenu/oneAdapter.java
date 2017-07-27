package com.example.msi.popupmenu;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by M.S.I on 7/26/2017.
 */

public class oneAdapter extends RecyclerView.Adapter<oneAdapter.ViewHolder> {

    Context context;
    List<twoAdapter> twoAdapters;
    int layout;

    public oneAdapter(Context context, List<twoAdapter> twoAdapters, int layout) {
        this.context = context;
        this.twoAdapters = twoAdapters;
        this.layout = layout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        LinearLayoutManager  layoutManager= new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false);
             holder.recyclerView1.setAdapter(twoAdapters.get(position));
             holder.recyclerView1.setLayoutManager(layoutManager);

    }

    @Override
    public int getItemCount() {
        return twoAdapters.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public RecyclerView recyclerView1;
        public ViewHolder(View itemView) {
            super(itemView);
            recyclerView1 = (RecyclerView) itemView.findViewById(R.id.horizontal_recycler);
//            LinearLayoutManager  layoutManager= new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false);
//            recyclerView.setLayoutManager(layoutManager);

        }
    }
}
