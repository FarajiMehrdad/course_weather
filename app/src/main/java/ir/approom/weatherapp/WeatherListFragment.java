package ir.approom.weatherapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by MehrdadFaraji on 8/15/16 AD.
 */
public class WeatherListFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_weather_listview ,container , false);

        ListView listView = (ListView) rootView.findViewById(R.id.listView);
        WeatherListViewAdapter adapter = new WeatherListViewAdapter(getContext());
        listView.setAdapter(adapter);

        return  rootView;
    }
}
