package com.ultimateswan.weathertoday;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    private ListView lv;
    private View v;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
            v = inflater.inflate(R.layout.fragment_main, container, false);
            lv = (ListView)v.findViewById(R.id.listview_forecast);
        String[] forecastArray = {
                "Today - Sunny - 88/63",
                "Tommorow - Foggy - 88/66",
                "Weds - Cloudy - 72/60",
                "Thursday - Foggy - 70/61",
                "Friday - Rainy - 75/62",
                "Sat - Sunny - 76/64"
        };
        List<String> weekForecast = new ArrayList<String >(
                Arrays.asList(forecastArray));
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity()
                ,R.layout.list_item_forecast,R.id.list_item_forecast_textview,weekForecast);

        lv.setAdapter(adapter);
        return v;
    }
}
