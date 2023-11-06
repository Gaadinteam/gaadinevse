package com.gaadin.evsdk.evsetdetails;

import com.android.volley.VolleyError;

import org.json.JSONObject;

public interface InterfaceEvseTransFetech {
    void evseTransFetech(JSONObject object, int tag);

    void evseTransOnError(VolleyError error, int requestTag);
}
