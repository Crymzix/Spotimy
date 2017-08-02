package com.chrisli.spotimy.managers;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import java.util.Set;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Chris Li on 2017-08-01.
 */
@Singleton
public class PreferenceManager {

    private static final String TAG = PreferenceManager.class.getSimpleName();

    private static final String PREFERENCE_NAME = "SPOTIMY";

    public static final String SPOTIFY_ACCESS_TOKEN_KEY = "spotify_access_token";

    private SharedPreferences mSharedPreferences;

    @Inject
    public PreferenceManager(Context context) {
        this.mSharedPreferences = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
    }

    public boolean put(String key, Object value) {
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        if (value instanceof String) {
            editor.putString(key, (String) value);
        } else if (value instanceof Integer) {
            editor.putInt(key, (Integer) value);
        } else if (value instanceof Boolean) {
            editor.putBoolean(key, (Boolean) value);
        } else if (value instanceof Long) {
            editor.putLong(key, (Long) value);
        } else if (value instanceof Float) {
            editor.putFloat(key, (Float) value);
        } else if (value instanceof Set) {
            editor.putStringSet(key, (Set) value);
        }
        return editor.commit();
    }

    public String get(String key, String defaultValue) {
        String result = defaultValue;
        try {
            result = mSharedPreferences.getString(key, defaultValue);
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
        }
        return result;
    }

    public int get(String key, int defValue) {
        int result = defValue;
        try {
            result = mSharedPreferences.getInt(key, defValue);
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
        }
        return result;
    }

    public float get(String key, float defValue) {
        float result = defValue;
        try {
            result = mSharedPreferences.getFloat(key, defValue);
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
        }
        return result;
    }

    public long get(String key, long defValue) {
        long result = defValue;
        try {
            result = mSharedPreferences.getLong(key, defValue);
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
        }
        return result;
    }

    public boolean get(String key, boolean defValue) {
        boolean result = defValue;
        try {
            result = mSharedPreferences.getBoolean(key, defValue);
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
        }
        return result;
    }

    public Set<String> get(String Key) {
        Set<String> result = null;
        try {
            result = mSharedPreferences.getStringSet(Key, null);
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
        }
        return result;
    }

}
