package net.healthtechhub.capetowntourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class TrailsFragment extends Fragment {

    public TrailsFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.lions_name, R.string.lions_address));
        locations.add(new Location(R.string.devils_name, R.string.devils_address));
        locations.add(new Location(R.string.skeleton_name, R.string.skeleton_address));
        locations.add(new Location(R.string.kasteelspoort_name, R.string.kasteelspoort_address));
        locations.add(new Location(R.string.chapmans_name, R.string.chapmans_address));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.colorAccent);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = rootView.findViewById(R.id.list_view);

        // Make the {@link ListView} use the {@link LocationAdapter}
        listView.setAdapter(adapter);

        return rootView;
    }
}
