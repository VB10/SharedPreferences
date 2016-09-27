package com.vb.sharedpreferences;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

public class SeconActvityVb extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secon_actvity_vb);
        
        load();
    }

    private void load() {
        SharedPreferences mPrefs = getSharedPreferences("IDvalue",0);
        String str1 = mPrefs.getString("ad","");
        int str2=mPrefs.getInt("yas",1);
        if (str1.equals("") || str2==1) {
            Toast.makeText(this, "Hata", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Calisti..", Toast.LENGTH_LONG).show();
        }
    }
}
