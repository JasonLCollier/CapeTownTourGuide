package net.healthtechhub.capetowntourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class BeachesFragment extends Fragment {
    public BeachesFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.boulders_name, R.string.boulders_address,
                R.drawable.boulders_beach));
        locations.add(new Location(R.string.camps_bay_name, R.string.camps_bay_address,
                R.drawable.camps_bay_beach));
        locations.add(new Location(R.string.clifton_4th_name, R.string.clifton_4th_address,
                R.drawable.clifton_4th_beach));
        locations.add(new Location(R.string.fish_hoek_name, R.string.fish_hoek_address,
                R.drawable.fish_hoek_beach));
        locations.add(new Location(R.string.glen_name, R.string.glen_address,
                R.drawable.glen_beach));
        locations.add(new Location(R.string.hout_bay_name, R.string.hout_bay_address,
                R.drawable.hout_bay_beach));
        locations.add(new Location(R.string.llandudno_name, R.string.llandudno_address,
                R.drawable.llandudno_beach));
        locations.add(new Location(R.string.muizenberg_name, R.string.muizenberg_address,
                R.drawable.muizenberg_beach));
        locations.add(new Location(R.string.queens_name, R.string.queens_address,
                R.drawable.queens_beach));
        locations.add(new Location(R.string.strand_name, R.string.strand_address,
                R.drawable.strand_beach));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.colorAccent);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = rootView.findViewById(R.id.list_view);

        // Make the {@link ListView} use the {@link LocationAdapter}
        listView.setAdapter(adapter);

        return rootView;
    }
}
