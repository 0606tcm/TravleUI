package com.example.tcm.muke.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by tcm on 2020/7/8.
 */

public class MainHeaderAdAdpter extends PagerAdapter {

    protected Context context;
    protected List<ImageView> images;

    public  MainHeaderAdAdpter(Context context,List<ImageView> images){

        this.context=context;
        this.images = images;
    }
    @Override
    public int getCount(){
//如果集合不为空,直接返回集合的大小
        return  null!=images?images.size():0;

    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(images.get(position));
        return images.get(position);
    }



    @Override
    public boolean isViewFromObject(View view,Object object){


        return view==object;
    }
    @Override
    public void destroyItem(ViewGroup container,int position,Object object){

        container.removeView(images.get(position));

    }

}
