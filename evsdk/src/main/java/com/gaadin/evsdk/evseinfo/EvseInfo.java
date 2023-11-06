package com.gaadin.evsdk.evseinfo;

import android.content.Context;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class EvseInfo {
    private InterfaceEvseInfo onListerner;
    private int requestMethod;
    private Context context;
    private String jwt ;
    private RequestQueue requestQueue;

    public EvseInfo(InterfaceEvseInfo listener, int requestTag,String urls, Context context, String jwt, String evseId) {
        onListerner = listener;
        requestMethod = Request.Method.GET;
        this.context = context;
        this.jwt=jwt;

        fetchJSONDataFromWebService(urls+"/station/secure/api/v1/station?stationid="+evseId, null, requestTag);
    }

    private void fetchJSONDataFromWebService(String URL, JSONObject jsonPayload, final int requestTag) {


        JsonObjectRequest jsonObjReq = new JsonObjectRequest(requestMethod, URL, jsonPayload,

                response -> onListerner.evseInfo(response, requestTag),
                error -> onListerner.evseInfoOnError(error, requestTag)) {

            @Override
            public Map<String, String> getHeaders() {
                return getCustomHeaders();
            }


        };
        jsonObjReq.setTag(requestTag);




        jsonObjReq.setRetryPolicy(new DefaultRetryPolicy(1200000,0,DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        addToRequestQueue(jsonObjReq);
    }


    private HashMap<String, String> getCustomHeaders() {
        HashMap<String, String> customHeaders = new HashMap<String, String>();
        customHeaders.put("Accept", "'application/json");
        customHeaders.put("Authorization", "basic " +jwt);
        customHeaders.put("Content-Type", "application/json; charset=utf-8");


        return customHeaders;
    }


    public RequestQueue getRequestQueue() {
        if (requestQueue == null) {
            requestQueue = Volley.newRequestQueue(context);
        }
        return requestQueue;
    }

    public <T> void addToRequestQueue(Request<T> req) {
        getRequestQueue().add(req);
    }

}
