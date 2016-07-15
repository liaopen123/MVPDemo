package view.com.example.liaopenghui.mvpdemo.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import view.com.example.liaopenghui.mvpdemo.R;
import view.com.example.liaopenghui.mvpdemo.model.bean.Weather;
import view.com.example.liaopenghui.mvpdemo.presenter.impl.WeatherPresenterImpl;
import view.com.example.liaopenghui.mvpdemo.ui.view.WeatherView;

public class MainActivity extends AppCompatActivity implements WeatherView, View.OnClickListener {

    private static final String TAG = "MainActivity";
    private EditText cityNOInput;
    private TextView city;
    private WeatherPresenterImpl weatherPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
         cityNOInput = (EditText) findViewById(R.id.et_city_no);
         city = (TextView) findViewById(R.id.tv_city);
        findViewById(R.id.btn_go).setOnClickListener(this);

         weatherPresenter = new WeatherPresenterImpl(this);
    }

    @Override
    public void showLoading() {
        Log.e(TAG,"showLoading");
    }

    @Override
    public void hideLoading() {
        Log.e(TAG,"hideloading");
    }

    @Override
    public void onSuccess(Weather weather) {
        city.setText(weather.toString());
    }

    @Override
    public void onError(String erroMessage) {
        city.setText(erroMessage);
    }


    @Override
    public void onClick(View view) {
        weatherPresenter.getWeather(cityNOInput.getText().toString().trim());
    }
}
