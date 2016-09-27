package com.vb.sharedpreferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et_ad,et_yas;
    private String ad;
    private int yas;
    private static final String MY_PREFS_NAME="kayit";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        set();

    }


    private void set() {
        et_ad= (EditText) findViewById(R.id.et_ad);
        et_yas= (EditText) findViewById(R.id.et_yas);

    }

    public void trying(View view) {
        ad=et_ad.getText().toString();
        yas=Integer.parseInt(et_yas.getText().toString());
        register();
    }

    private void register() {
        SharedPreferences mPrefs = getSharedPreferences("IDvalue", 0);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString("ad", ad);
        editor.putInt("yas",yas);
        editor.commit();

        next();
    }

    private void next() {
        startActivity(new Intent(this,SeconActvityVb.class));
    }

}
