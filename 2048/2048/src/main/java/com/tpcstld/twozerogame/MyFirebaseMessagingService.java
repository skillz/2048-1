package com.tpcstld.twozerogame;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;

public class MyFirebaseMessagingService extends FirebaseMessagingService
{
    @Override
    public void onNewToken(String s) {
        super.onNewToken(s);

        Log.d("FIREBASE", "Refreshed token: " + s);
    }
}
