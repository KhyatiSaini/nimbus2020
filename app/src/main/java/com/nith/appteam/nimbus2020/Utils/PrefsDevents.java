package com.nith.appteam.nimbus2020.Utils;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

public class PrefsDevents {

    SharedPreferences sharedPreferences;

    public PrefsDevents(Activity activity) {
        sharedPreferences = activity.getPreferences(Context.MODE_PRIVATE);

    }

    public void getSearch(String search) {
        sharedPreferences.edit().putString("search", search).commit();

    }

    public String getSearch() {
        return sharedPreferences.getString("search", "departmentEvents");
    }
}


