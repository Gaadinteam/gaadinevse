package com.gaadin.evsdk.evselist;

import com.android.volley.VolleyError;

import org.json.JSONObject;

public interface InterfaceEvselist {
    void Evselist(JSONObject object, int tag);

    void EvselistOnError(VolleyError error, int requestTag);
}
