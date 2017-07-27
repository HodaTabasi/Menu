package com.example.msi.popupmenu;

import android.content.Context;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by M.S.I on 7/26/2017.
 */

public class twoAdapter extends RecyclerView.Adapter<twoAdapter.ViewHolder> {
    Context context;
//    int layout;
    List<Game> games;

    public twoAdapter(Context context, List<Game> games) {
        this.context = context;
        this.games = new ArrayList<>();
        this.games.addAll(games);
        
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
            holder.imageView.setImageResource(games.get(position).getImage());
            holder.textView1.setText(games.get(position).getName());
            holder.textView2.setText(games.get(position).getRange()+"");
//            holder.imageView2.setOnClickListener(null);

            holder.imageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    PopupMenu menu = new PopupMenu(context,v, Gravity.END);
                    menu.getMenuInflater().inflate(R.menu.my_menu,menu.getMenu());

//                    menu.setOnMenuItemClickListener(null);

                    menu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                        @Override
                        public boolean onMenuItemClick(MenuItem item) {
                            switch (item.getItemId()){
                                case R.id.add:
                                    Toast.makeText(context, "Add To Favourite", Toast.LENGTH_SHORT).show();
                                    break;
                                case R.id.delete:
                                    games.remove(position);
                                    notifyDataSetChanged();
                                    break;
                                case R.id.Installed:
                                    Toast.makeText(context, "Wil Be Install", Toast.LENGTH_SHORT).show();
                                    break;
                            }
                            return false;
                        }
                    });
                    menu.show();
                }
            });
    }

    @Override
    public int getItemCount() {
        return games.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView ,imageView2;
        TextView textView1,textView2;
        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.image);
            imageView2 = (ImageView) itemView.findViewById(R.id.imageView2);
            textView1 = (TextView) itemView.findViewById(R.id.textView);
            textView2= (TextView) itemView.findViewById(R.id.textView2);
        }
    }
}
