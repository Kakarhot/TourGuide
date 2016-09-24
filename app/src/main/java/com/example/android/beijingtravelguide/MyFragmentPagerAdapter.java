package com.example.android.beijingtravelguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by wenshuo on 2016/9/23.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;


    public MyFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new AttractionsFragment();
            case 1:
                return new HistoricalSitesFragment();
            case 2:
                return new EventsFragment();
            default:
                return new RestaurantsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
            return mContext.getString(R.string.category_attractions);
        else if (position == 1)
            return mContext.getString(R.string.category_historical_site);
        else if (position == 2)
            return mContext.getString(R.string.category_events);
        else
            return mContext.getString(R.string.category_restaurants);
    }
}

