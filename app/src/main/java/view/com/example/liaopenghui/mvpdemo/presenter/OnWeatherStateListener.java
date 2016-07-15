package view.com.example.liaopenghui.mvpdemo.presenter;

import view.com.example.liaopenghui.mvpdemo.model.bean.Weather;

/**
 * Created by liaopenghui on 16/7/13.
 */
public interface OnWeatherStateListener {
    void onSuccess(Weather weather);
    void onError(String errorMessage);
}
