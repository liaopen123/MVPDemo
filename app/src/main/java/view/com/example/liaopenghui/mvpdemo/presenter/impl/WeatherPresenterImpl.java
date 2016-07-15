package view.com.example.liaopenghui.mvpdemo.presenter.impl;

import android.content.Context;

import view.com.example.liaopenghui.mvpdemo.model.bean.Weather;
import view.com.example.liaopenghui.mvpdemo.model.impl.WeatherModeImpl;
import view.com.example.liaopenghui.mvpdemo.presenter.OnWeatherStateListener;
import view.com.example.liaopenghui.mvpdemo.presenter.WeatherPresenter;
import view.com.example.liaopenghui.mvpdemo.ui.view.WeatherView;

/**
 * Created by liaopenghui on 16/7/13.
 */
public class WeatherPresenterImpl implements WeatherPresenter ,OnWeatherStateListener{
    private final WeatherView weatherView;
    private final WeatherModeImpl weatherMode;

    public WeatherPresenterImpl(WeatherView weatherView){
        this.weatherView=  weatherView;
        weatherMode = new WeatherModeImpl();

    }
    @Override
    public void getWeather(String cityNo) {
        weatherView.showLoading();
        weatherMode.load(cityNo,this);
    }

    @Override
    public void onSuccess(Weather weather) {
        weatherView.hideLoading();
        weatherView.onSuccess(weather);
    }

    @Override
    public void onError(String errorMessage) {
        weatherView.hideLoading();
        weatherView.onError(errorMessage);
    }
}
