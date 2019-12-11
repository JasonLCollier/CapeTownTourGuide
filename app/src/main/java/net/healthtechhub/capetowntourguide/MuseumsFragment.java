package net.healthtechhub.capetowntourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumsFragment extends Fragment {
    public MuseumsFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.zeitz_name, R.string.zeitz_address));
        locations.add(new Location(R.string.district_six_name, R.string.district_six_address));
        locations.add(new Location(R.string.heart_name, R.string.heart_address));
        locations.add(new Location(R.string.jewish_name, R.string.jewish_address));
        locations.add(new Location(R.string.diamond_name, R.string.diamond_address));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.colorAccent);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = rootView.findViewById(R.id.list_view);

        // Make the {@link ListView} use the {@link LocationAdapter}
        listView.setAdapter(adapter);

        return rootView;
    }
}
