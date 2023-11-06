package com.gaadin.evsdk.evsestart;

import com.android.volley.VolleyError;

import org.json.JSONObject;

public interface InterfaceEvsestart {
    void evsestart(JSONObject object, int tag);

    void evsestartOnError(VolleyError error, int requestTag);
}
