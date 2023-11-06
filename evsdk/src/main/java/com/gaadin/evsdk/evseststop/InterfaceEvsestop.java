package com.gaadin.evsdk.evseststop;

import com.android.volley.VolleyError;

import org.json.JSONObject;

public interface InterfaceEvsestop {
    void evseStop(JSONObject object, int tag);

    void evseStopOnError(VolleyError error, int requestTag);
}
