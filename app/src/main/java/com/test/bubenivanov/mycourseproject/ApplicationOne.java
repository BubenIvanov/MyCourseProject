package com.test.bubenivanov.mycourseproject;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.widget.EditText;

/**
 * Created by Buben Ivanov on 26.01.2017.
 */

public class ApplicationOne extends Application {

    public static final String APP_PREFERENCES = "myAccounts";
    private SharedPreferences preferences;
    public static final String APP_PREF_NAME = "name";
    public static final String APP_PREF_EMAIL = "email";
    public static final String APP_PREF_PASS = "pass";

    void PutInPref(EditText name,EditText email,EditText password){
        preferences= getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);

        SharedPreferences.Editor editor =preferences.edit();
        editor.putString(APP_PREF_NAME,name.getText().toString());
        editor.putString(APP_PREF_EMAIL,email.getText().toString());
        editor.putString(APP_PREF_PASS,password.getText().toString());
        editor.apply();
    }

}
