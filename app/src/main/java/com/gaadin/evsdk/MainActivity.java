package com.gaadin.evsdk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.android.volley.VolleyError;
import com.gaadin.evsdk.evsetdetails.InterfaceEvseTransFetech;
import com.gaadin.evsdk.jwt.EvseTokenGen;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity implements InterfaceEvseTransFetech {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new EvseTokenGen(this,1,"",this,"");
    }

    @Override
    public void evseTransFetech(JSONObject object, int tag) {

    }

    @Override
    public void evseTransOnError(VolleyError error, int requestTag) {

    }


}