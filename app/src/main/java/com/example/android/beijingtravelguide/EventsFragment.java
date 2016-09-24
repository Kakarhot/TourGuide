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
public class EventsFragment extends Fragment {


    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location(this.getString(R.string.ditan_temple_fair), this.getString(R.string.ditan_temple_description), this.getString(R.string.ditan_temple_hours)));
        locations.add(new Location(this.getString(R.string.art_798), this.getString(R.string.art_798_description), this.getString(R.string.art_798_hours)));
        locations.add(new Location(this.getString(R.string.mid_autumn_festival), this.getString(R.string.mid_autumn_festival_description), this.getString(R.string.mid_autumn_hours)));
        locations.add(new Location(this.getString(R.string.great_wall_marathon), this.getString(R.string.great_wall_marathon_description), this.getString(R.string.great_wall_marathon_hours)));

        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), locations, R.color.category_events);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
