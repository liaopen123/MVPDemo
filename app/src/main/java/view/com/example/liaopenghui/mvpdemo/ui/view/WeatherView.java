package view.com.example.liaopenghui.mvpdemo.ui.view;

import view.com.example.liaopenghui.mvpdemo.model.bean.Weather;

/**
 * Created by liaopenghui on 16/7/13.
 */
public interface WeatherView {
    public void showLoading();
    public void hideLoading();
    public void onSuccess(Weather weather);
    public void onError(String erroMessage);
}
