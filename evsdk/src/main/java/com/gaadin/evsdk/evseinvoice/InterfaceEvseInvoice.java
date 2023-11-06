package com.gaadin.evsdk.evseinvoice;

import com.android.volley.VolleyError;

import org.json.JSONObject;

public interface InterfaceEvseInvoice {
    void evseInvoice(JSONObject object, int tag);

    void evseInvoiceOnError(VolleyError error, int requestTag);
}
