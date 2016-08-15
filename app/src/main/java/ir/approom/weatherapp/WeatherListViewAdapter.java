package ir.approom.weatherapp;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by MehrdadFaraji on 8/15/16 AD.
 */
public class WeatherListViewAdapter extends BaseAdapter {

    Context mContext;
    public WeatherListViewAdapter(Context context){

        this.mContext = context;
    }

    @Override
    public int getCount() {
        return 7;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {


        Log.d("Adapter listview" , "getView func called and infalte the layout");
        View rootView = LayoutInflater.from(mContext).inflate(R.layout.item_weather_day,viewGroup, false);


        return rootView;
    }
}
