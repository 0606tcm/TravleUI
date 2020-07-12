package com.example.tcm.muke;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.tcm.muke.fragment.FindFragment;
import com.example.tcm.muke.fragment.MainFragment;
import com.example.tcm.muke.fragment.MeFragment;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    protected LinearLayout mMenuMain;
    protected LinearLayout mMenuFind;
    protected LinearLayout mMenuMe;
    protected MainFragment mMainFragment = new MainFragment();//首页
    protected FindFragment mFindFragment = new FindFragment();//发现
    protected MeFragment mMeFragment = new MeFragment();//我的

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        //获取管理类
        this.getSupportFragmentManager()
                .beginTransaction()//开启事务
                .add(R.id.container_content, mMainFragment)
                .add(R.id.container_content, mFindFragment).hide(mFindFragment)
                .add(R.id.container_content, mMeFragment).hide(mMeFragment)

        //事务添加  默认:显示首页,其他页面,隐藏
        //提交
            .commit();
    }

    //初始化视图

    public  void initView(){
        mMenuMain = (LinearLayout)this.findViewById(R.id.menu_main);
        mMenuFind = (LinearLayout)this.findViewById(R.id.menu_find);
        mMenuMe = (LinearLayout)this.findViewById(R.id.menu_me);

        mMenuMain.setOnClickListener(this);
        mMenuFind.setOnClickListener(this);
        mMenuMe.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        switch(view.getId()){
            case R.id.menu_main://首页
                this.getSupportFragmentManager()
                        .beginTransaction()//开启事务
                        .show(mMainFragment)
                        .hide(mFindFragment)
                        .hide(mMeFragment)
                        //事务添加  默认:显示首页,其他页面,隐藏
                        //提交
                        .commit();
                break;
            case R.id.menu_find://发现
                this.getSupportFragmentManager()
                        .beginTransaction()//开启事务
                        .show(mFindFragment)
                        .hide(mMainFragment)
                        .hide(mMeFragment)
                        //事务添加  默认:显示首页,其他页面,隐藏
                        //提交
                        .commit();
                break;
            case R.id.menu_me://我的
                this.getSupportFragmentManager()
                        .beginTransaction()//开启事务
                        .show(mMeFragment)
                        .hide(mFindFragment)
                        .hide(mMainFragment)
                        //事务添加  默认:显示首页,其他页面,隐藏
                        //提交
                        .commit();
                break;


        }


    }


}
