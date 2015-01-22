package com.example.studyjamtest;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by snigavig on 22.01.15.
 */
public class PrefsManager {
    private static final String IS_LOGIN_KEY = "IS_RUNNING";
    private static final String LOGIN_KEY = "LOGIN";
    private static final String PASSWORD_KEY = "PASSWORD";
    private SharedPreferences prefs;
    public PrefsManager(Context context) {
        prefs = PreferenceManager.getDefaultSharedPreferences(context);

    }
    public void setIsLogin(Boolean value) {
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean(IS_LOGIN_KEY, value);
        editor.apply();
    }

    public void setLogin(String value) {
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(LOGIN_KEY, value);
        editor.apply();
    }

    public void setPassword(String value) {
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(PASSWORD_KEY, value);
        editor.apply();
    }

    public String getLogin() {
        return prefs.getString(LOGIN_KEY, "");
    }
}
