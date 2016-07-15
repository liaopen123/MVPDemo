package view.com.example.liaopenghui.mvpdemo.model.bean;

import view.com.example.liaopenghui.mvpdemo.presenter.OnWeatherStateListener;

/**
 * Created by liaopenghui on 16/7/13.
 */
public interface WeatherModel {
    void load(String city, OnWeatherStateListener listener);

}
