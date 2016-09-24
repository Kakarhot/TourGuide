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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }

     @Override
     public View onCreateView(LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
         View rootView = inflater.inflate(R.layout.location_list, container, false);

         final ArrayList<Location> locations = new ArrayList<>();

         locations.add(new Location(this.getString(R.string.quanjude_roast_duck),this.getString(R.string.quanjude_roast_duck_description),this.getString(R.string.quanjude_roast_duck_hours)));
         locations.add(new Location(this.getString(R.string.jin_ding_xuan),this.getString(R.string.jin_ding_xuan_description),this.getString(R.string.jin_ding_xuan_hours)));
         locations.add(new Location(this.getString(R.string.da_zhai_men),this.getString(R.string.da_zhai_men_description),this.getString(R.string.da_zhai_men_hours)));
         locations.add(new Location(this.getString(R.string.longfusi_food_street),this.getString(R.string.longfusi_food_street_description),this.getString(R.string.longfusi_food_street_hours)));

         LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), locations, R.color.category_restaurants);
         ListView listView = (ListView) rootView.findViewById(R.id.list);
         listView.setAdapter(itemsAdapter);

         return rootView;
     }

}
