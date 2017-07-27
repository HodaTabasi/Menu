package com.example.msi.popupmenu;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by M.S.I on 7/27/2017.
 */

public class SameOneAdapter extends RecyclerView.Adapter<SameOneAdapter.VH> {

    Context context;
    List<Category> categories;
    int layout;

    public SameOneAdapter(Context context, List<Category> categories, int layout) {
        this.context = context;
        this.categories = categories;
        this.layout = layout;
    }

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(layout,parent,false);
        return new VH(view);
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {
        LinearLayoutManager layoutManager= new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false);
        holder.recyclerView1.setLayoutManager(layoutManager);
        twoAdapter adapter = new twoAdapter(context,categories.get(position).getGames());
        holder.recyclerView1.setAdapter(adapter);

    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public class VH extends RecyclerView.ViewHolder {
        public RecyclerView recyclerView1;
        public VH(View itemView) {
            super(itemView);
            recyclerView1 = (RecyclerView) itemView.findViewById(R.id.horizontal_recycler);
        }
    }
}
