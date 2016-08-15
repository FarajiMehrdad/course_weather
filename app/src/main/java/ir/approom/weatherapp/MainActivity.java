package ir.approom.weatherapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (findViewById(R.id.container) != null){

            DetailWeatherFragment fragment = new DetailWeatherFragment();
            getSupportFragmentManager().beginTransaction().
                    add(R.id.container , fragment).commit();

        }



    }
}
