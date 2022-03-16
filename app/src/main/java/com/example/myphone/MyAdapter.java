package com.example.myphone;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {
Context mycontext;
int totalTabs;
    public MyAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        this.totalTabs=totalTabs;
        mycontext=context;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                image1fragment fragment1=new image1fragment();
                return fragment1;

            case 1:
                image2fragment fragment2=new image2fragment();
                return fragment2;

            case 2:
                image3fragment fragment3=new image3fragment();
                return fragment3;

        }
        return null;
    }


}
