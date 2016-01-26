package com.jikexueyuan.animationlinearlayout;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LayoutAnimationController;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;

/**
 * 为布局添加动画效果
 */
public class AnimationFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        View v = inflater.inflate(R.layout.animation_fragment,null);
        //牵转为线性布局
        LinearLayout v = (LinearLayout) inflater.inflate(R.layout.animation_fragment, null);

        //缩放动画
        ScaleAnimation sa = new ScaleAnimation(0, 1, 0, 1);

        //持续时间500毫秒
        sa.setDuration(500);

        //sa:动画，0 默认所有原件一起显示
        //LayoutAnimationController lac = new LayoutAnimationController(sa, 0);

        //sa:动画，0.5f: 一个原件出来一半时，另外一个原件开始出现
        LayoutAnimationController lac = new LayoutAnimationController(sa, 0.5f);

        //设置效果顺序,随机顺序
        //lac.setOrder(LayoutAnimationController.ORDER_RANDOM);

        //设置效果顺序,倒序
        lac.setOrder(LayoutAnimationController.ORDER_REVERSE);

        //为布局添加动画
        v.setLayoutAnimation(lac);

        return v;
    }
}
