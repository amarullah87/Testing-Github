package com.amarullah87.projectlatihan.utils;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by apandhis on 13/08/17.
 */

public class FirebaseInstanceIDService extends FirebaseInstanceIdService {



    @Override
    public void onTokenRefresh() {
        //super.onTokenRefresh();
        String token = FirebaseInstanceId.getInstance().getToken();
        Log.e("My Token", token);

        registerToken(token);
    }

    private void registerToken(String token) {
        //Handling Token Register
    }
}
