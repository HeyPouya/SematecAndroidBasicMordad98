package com.sematec.sematecandroidbasicmordad98;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TestPagerAdapter extends FragmentPagerAdapter {

    public TestPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                TestFragment fragment = new TestFragment();
                return fragment;
            case 1:
                TestNewFragment newFragment = new TestNewFragment();
                return newFragment;
            default:
                TestFragment fragment1 = new TestFragment();
                return fragment1;

        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "First Fragment";
            case 1:
                return "Second Fragment";
            default:
                return "Unkown Fragment";
        }
    }
}
