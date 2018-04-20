package com.vibs.firebasedemo;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class FireInstanceIdService extends FirebaseInstanceIdService {

    final static String REG_TOKEN = "REG_TOKEN";

    @Override
    public void onTokenRefresh() {
        String recentToken = FirebaseInstanceId.getInstance().getToken();
        Log.e(REG_TOKEN,REG_TOKEN +recentToken);
    }
}
