package com.aska.rio.cobafirebase;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by rio on 7/29/16.
 */
public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
    private static final String TAG = "MyFirebaseIDService";

    @Override
    public void onTokenRefresh() {

        //Mendapatkan registrasi token
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();

        //Log untuk melihat token
        Log.d("token Firebase", refreshedToken);

        kirimRegistrasi();
    }

    //Ini digunakan untuk mengirim token ke server kita
    private void kirimRegistrasi() {

    }
}
