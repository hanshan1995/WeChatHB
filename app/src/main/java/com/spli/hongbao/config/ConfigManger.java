package com.spli.hongbao.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class ConfigManger {
    private static final ConfigManger OUR_INSTANCE=new ConfigManger();
    private SharedPreferences preferences;
    public ConfigManger(){

    }
    public void init(Context context){
        preferences= PreferenceManager.getDefaultSharedPreferences(context);
    }
    public static ConfigManger getInstance(){
        return OUR_INSTANCE;
    }
    public int getOpenDelayTime() {
        return Integer.parseInt(preferences.getString("edit_time_preference", "151"));
    }

    public int getClickDelayTime() {
        return Integer.parseInt(preferences.getString("edit_click_time_preference", "201"));
    }
}
