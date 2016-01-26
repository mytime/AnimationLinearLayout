package com.jikexueyuan.animationlinearlayout;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //帧对象
    private Fragment fragment;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //实例化帧对象
        fragment = new AnimationFragment();

        //获得帧管理器
        FragmentManager fm = getFragmentManager();

        //开始帧事务
        FragmentTransaction ft = fm.beginTransaction();

        //加载事务对象
        //flAnimation 帧布局，
        //fragment帧对象
        ft.replace(R.id.flAnimation,fragment);

        //提交事务
        ft.commit();

    }
}
