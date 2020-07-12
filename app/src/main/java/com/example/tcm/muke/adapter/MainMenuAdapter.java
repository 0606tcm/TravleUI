package com.example.tcm.muke.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tcm.muke.R;
import com.example.tcm.muke.entity.Menu;

import java.util.List;

/**
 * Created by tcm on 2020/7/9.;
 * 菜单适配器
 */

public class MainMenuAdapter extends RecyclerView.Adapter<MainMenuAdapter.MainMenuViewholder>{


    protected Context context;
    protected List<Menu> menus;
    public MainMenuAdapter(Context context, List<Menu> menus){
            this.context = context;
            this.menus=menus;

    }
    @Override
    public MainMenuViewholder onCreateViewHolder(ViewGroup parent,int viewType){
        return new MainMenuViewholder(LayoutInflater.from(context).inflate(R.layout.item_main_menu,null));

    }

    @Override
    public void onBindViewHolder(MainMenuViewholder holder,int position){
        Menu menu = menus.get(position);
        holder.mImgMenIcon.setImageResource(menu.icon);
        holder.mTextMenuName.setText(menu.menuName);

    }
    @Override
    public int getItemCount(){
        return null!=menus?menus.size():0;
    }
    class MainMenuViewholder extends RecyclerView.ViewHolder{

        public ImageView mImgMenIcon;
        public TextView mTextMenuName;
        public MainMenuViewholder(View itemView){
            super(itemView);
            mImgMenIcon = itemView.findViewById(R.id.img_menu_icon);
            mTextMenuName = itemView.findViewById(R.id.txt_menu_name);
        }
}


}
