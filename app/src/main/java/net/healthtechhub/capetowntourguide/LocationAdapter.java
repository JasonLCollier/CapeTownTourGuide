package net.healthtechhub.capetowntourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link LocationAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Location} objects.
 */
public class LocationAdapter extends ArrayAdapter<Location> {

    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;

    /**
     * Create a new {@link LocationAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param locations is the list of {@link Location}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of locations
     */
    public LocationAdapter(Context context, ArrayList<Location> locations, int colorResourceId) {
        super(context, 0, locations);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.location_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Location currentLocation = getItem(position);

        // Find and set the TextView in the location_item.xml layout with the ID location_name.
        TextView nameTextView = listItemView.findViewById(R.id.location_name);
        nameTextView.setText(currentLocation.getNameID());

        // Find an set the TextView in the location_item.xml layout with the ID location_address.
        TextView defaultTextView = listItemView.findViewById(R.id.location_address);
        defaultTextView.setText(currentLocation.getAddressID());

        // Find the ImageView in the location_item.xml layout with the ID image.
        ImageView imageView = listItemView.findViewById(R.id.picture);
        // Check if an image is provided for this word or not
        if (currentLocation.hasImage()) {
            imageView.setImageResource(currentLocation.getImageResourceId());
        } else {
            imageView.setImageResource(R.drawable.no_picture);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.location_item_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
