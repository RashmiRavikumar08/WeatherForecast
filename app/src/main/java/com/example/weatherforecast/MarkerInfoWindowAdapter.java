package com.example.weatherforecast;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

import org.w3c.dom.Text;

public class MarkerInfoWindowAdapter implements GoogleMap.InfoWindowAdapter {

    private Context context;
    String temparature,humidity,pressure,temp,press,humi;
    long sunrise,sunset;
    TextView tv_temparature,tv_pressure,tv_humidity;
    SharedPreferences sp;

    public MarkerInfoWindowAdapter(Context context,String temp,String press,String humi){
        this.context = context.getApplicationContext();
        this.temparature = temp;
        this.pressure = press;
        this.humidity = humi;
    }
    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }

    @SuppressLint("WrongConstant")
    @Override
    public View getInfoContents(Marker marker) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v =  inflater.inflate(R.layout.map_marker_info_window, null);
        tv_temparature =  v.findViewById(R.id.tv_temparature);
        tv_pressure =  v.findViewById(R.id.tv_pressure);
        tv_humidity =  v.findViewById(R.id.tv_humidity);

        tv_temparature.setText(temparature);
        tv_pressure.setText(pressure);
        tv_humidity.setText(humidity);

        return v;
    }
}
