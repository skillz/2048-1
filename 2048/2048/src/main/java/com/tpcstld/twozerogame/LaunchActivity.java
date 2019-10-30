package com.tpcstld.twozerogame;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.InstanceIdResult;
import com.skillz.Skillz;
import com.skillz.SkillzActivity;
import com.google.firebase.iid.FirebaseInstanceId;

public class LaunchActivity extends SkillzActivity {
    @Override
    public void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);

        FirebaseInstanceId.getInstance().getInstanceId()
                .addOnCompleteListener(task -> {
                    if (!task.isSuccessful()) {
                        Log.w("FIREBASE", "getInstanceId failed", task.getException());
                        return;
                    }

                    // Get new Instance ID token
                    String token = task.getResult().getToken();

                    // Log and toast
                    Log.d("FIREBASE", token);
                });

        setContentView(R.layout.skillz_activity);
        Skillz.launch(this);
    }
}
