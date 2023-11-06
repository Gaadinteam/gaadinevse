package com.gaadin.evsdk.evseinfo;

import com.android.volley.VolleyError;

import org.json.JSONObject;

public interface InterfaceEvseInfo {
    void evseInfo(JSONObject object, int tag);

    void evseInfoOnError(VolleyError error, int requestTag);
}
