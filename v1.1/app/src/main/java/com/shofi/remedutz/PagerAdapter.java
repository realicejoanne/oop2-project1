package com.shofi.remedutz;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    public  PagerAdapter (FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new SundaKunoFragment();
            case 1:
                return  new SundaBakuFragment();
            default:
                return new SundaKunoFragment();
        }
    }


    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Sunda Kuno";
            case 1:
                return "Sunda Baku";
            default:
                return "Sunda Kuno";
        }
    }
}
