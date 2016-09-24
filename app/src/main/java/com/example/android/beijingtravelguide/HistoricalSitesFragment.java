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
public class HistoricalSitesFragment extends Fragment {


    public HistoricalSitesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location(this.getString(R.string.the_forbidden_city), this.getString(R.string.the_forbidden_city_description), this.getString(R.string.the_forbidden_city_hours), R.drawable.forbidden_city));
        locations.add(new Location(this.getString(R.string.summer_palace), this.getString(R.string.summer_palace_description), this.getString(R.string.summer_palace_hours), R.drawable.summer_palace));
        locations.add(new Location(this.getString(R.string.lugou_bridge), this.getString(R.string.lugou_bridge_description), this.getString(R.string.lugou_bridge_hours), R.drawable.lugou_bridge));
        locations.add(new Location(this.getString(R.string.temple_of_heaven), this.getString(R.string.temple_of_heaven_description), this.getString(R.string.temple_of_heaven_hours), R.drawable.temple_of_heaven));

        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), locations, R.color.category_historical_sites);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
