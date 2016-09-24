package com.example.android.beijingtravelguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location(this.getString(R.string.bird_nest),this.getString(R.string.bird_nest_description),this.getString(R.string.bird_nest_hours), R.drawable.bird_nest_stadium));
        locations.add(new Location(this.getString(R.string.xiangshan_park),this.getString(R.string.xiangshan_park_description),this.getString(R.string.xiangshan_park_hours),R.drawable.xiangshan_park));
        locations.add(new Location(this.getString(R.string.tiananmen_square),this.getString(R.string.tiananmen_square_description),this.getString(R.string.tiananmen_square_hours),R.drawable.tiananmen_square));
        locations.add(new Location(this.getString(R.string.water_cube),this.getString(R.string.water_cube_description), this.getString(R.string.water_cube_hours),R.drawable.water_cube));
        locations.add(new Location(this.getString(R.string.wangfujing_street), this.getString(R.string.wangfujing_street_description),this.getString(R.string.wangfujing_street_hours), R.drawable.wangfujing_street));


        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), locations, R.color.category_attractions);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);


        return rootView;
    }

}
