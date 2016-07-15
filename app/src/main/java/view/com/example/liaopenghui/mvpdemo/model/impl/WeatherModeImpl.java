package view.com.example.liaopenghui.mvpdemo.model.impl;

import view.com.example.liaopenghui.mvpdemo.model.bean.Weather;
import view.com.example.liaopenghui.mvpdemo.model.bean.WeatherModel;
import view.com.example.liaopenghui.mvpdemo.presenter.OnWeatherStateListener;

/**
 * Created by liaopenghui on 16/7/13.
 */
public class WeatherModeImpl implements WeatherModel {
    public boolean isSuccess = false;
    @Override
    public void load(String city, OnWeatherStateListener listener) {
        if(isSuccess){
            Weather weather = new Weather();
            weather.setCity("北京,得到的CityNo:"+city);
            weather.setCityid("001");
            weather.setNjd("天气好的不得了 啊啊啊啊啊啊 啊啊");
            listener.onSuccess(weather);
        }else{
            listener.onError("网络错误");
        }
    }
}
