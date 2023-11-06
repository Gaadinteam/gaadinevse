package com.gaadin.evsdk.evsestart;

import android.content.Context;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class EvseStart {
    private InterfaceEvsestart onListerner;
    private int requestMethod;
    private Context context;
    private String jwt ;
    private RequestQueue requestQueue;

    public EvseStart(InterfaceEvsestart listener, int requestTag, String urls, Context context, String jwt,StartModel startModel

                     ) {
        onListerner = listener;
        requestMethod = Request.Method.POST;
        this.context = context;
        this.jwt=jwt;
        try{

            JSONObject jsonObject =new JSONObject();

            jsonObject.put("customer_name",startModel.getCustomerName());
            jsonObject.put("email",startModel.getEmail());
            jsonObject.put("mobile",startModel.getMobile());
            jsonObject.put("userid",startModel.getUserid());
            jsonObject.put("stationid",startModel.getStationid());
            jsonObject.put("location",startModel.getLocation());
            jsonObject.put("city",startModel.getCity());
            jsonObject.put("state",startModel.getState());
            jsonObject.put("country",startModel.getCountry());
            jsonObject.put("evse_id",startModel.getEvseId());
            jsonObject.put("portno",startModel.getPortno());
            jsonObject.put("port",startModel.getPort());
            jsonObject.put("voltage",startModel.getVoltage());
            jsonObject.put("amperage",startModel.getAmperage());
            jsonObject.put("time_unit",startModel.getTimeUnit());
            jsonObject.put("time_price",startModel.getTimePrice());
            jsonObject.put("kwh_unit",startModel.getKwhUnit());
            jsonObject.put("kwh_price",startModel.getKwhPrice());
            jsonObject.put("publish_allowed_to",startModel.getPublishAllowedTo());
            jsonObject.put("operator",startModel.getOperator());
            jsonObject.put("make",startModel.getMake());
            jsonObject.put("standard",startModel.getStandard());
            jsonObject.put("calcuated_amount",startModel.getCalcuatedAmount());
            jsonObject.put("charge_time_value",startModel.getChargeTimeValue());
            jsonObject.put("charging_time_unit",startModel.getChargingTimeUnit());
            jsonObject.put("promo_code",startModel.getPromoCode());
            jsonObject.put("chargertype",startModel.getChargertype());
            jsonObject.put("accounttype",startModel.getAccounttype());
            jsonObject.put("format",startModel.getFormat());
            fetchJSONDataFromWebService(urls+"/charging/secure/api/v1/price/time", null, requestTag);



        }catch (JSONException e){

        }

    }

    private void fetchJSONDataFromWebService(String URL, JSONObject jsonPayload, final int requestTag) {


        JsonObjectRequest jsonObjReq = new JsonObjectRequest(requestMethod, URL, jsonPayload,

                response -> onListerner.evsestart(response, requestTag),
                error -> onListerner.evsestartOnError(error, requestTag)) {

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
