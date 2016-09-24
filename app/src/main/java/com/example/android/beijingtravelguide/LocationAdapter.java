package com.example.android.beijingtravelguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    private int mColor;


    public LocationAdapter(Activity context, ArrayList<Location> locations, int color) {
        super(context, 0, locations);
        mColor = color;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Location location = getItem(position);

        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        titleView.setText(location.getTitle());

        TextView descriptionView = (TextView) listItemView.findViewById(R.id.description);
        descriptionView.setText(location.getDescription());

        TextView openHourView = (TextView) listItemView.findViewById(R.id.open_hour);
        openHourView.setText(location.getOpenHours());

        ImageView image = (ImageView) listItemView.findViewById(R.id.image);
        if (!location.hasImage())
            image.setVisibility(View.GONE);
        else
            image.setImageResource(location.getImageResourceId());

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColor);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
