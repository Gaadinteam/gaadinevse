package com.gaadin.evsdk.jwt;

import com.android.volley.VolleyError;

import org.json.JSONObject;

public interface InterfaceEvseJWTToken {
    void evseTokenGenrate(JSONObject object, int tag);

    void evseTokennError(VolleyError error, int requestTag);
}
