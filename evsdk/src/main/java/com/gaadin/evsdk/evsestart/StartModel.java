package com.gaadin.evsdk.evsestart;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StartModel {
    @SerializedName("customer_name")
    @Expose
    private String customerName;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("mobile")
    @Expose
    private Integer mobile;
    @SerializedName("userid")
    @Expose
    private String userid;
    @SerializedName("stationid")
    @Expose
    private String stationid;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("evse_id")
    @Expose
    private String evseId;
    @SerializedName("portno")
    @Expose
    private Integer portno;
    @SerializedName("port")
    @Expose
    private String port;
    @SerializedName("voltage")
    @Expose
    private Integer voltage;
    @SerializedName("amperage")
    @Expose
    private Integer amperage;
    @SerializedName("time_unit")
    @Expose
    private String timeUnit;
    @SerializedName("time_price")
    @Expose
    private Double timePrice;
    @SerializedName("kwh_unit")
    @Expose
    private String kwhUnit;
    @SerializedName("kwh_price")
    @Expose
    private Double kwhPrice;
    @SerializedName("publish_allowed_to")
    @Expose
    private String publishAllowedTo;
    @SerializedName("operator")
    @Expose
    private String operator;
    @SerializedName("make")
    @Expose
    private String make;
    @SerializedName("standard")
    @Expose
    private String standard;
    @SerializedName("format")
    @Expose
    private String format;
    @SerializedName("calcuated_amount")
    @Expose
    private Integer calcuatedAmount;
    @SerializedName("charge_time_value")
    @Expose
    private Integer chargeTimeValue;
    @SerializedName("charging_time_unit")
    @Expose
    private String chargingTimeUnit;
    @SerializedName("promo_code")
    @Expose
    private String promoCode;
    @SerializedName("chargertype")
    @Expose
    private String chargertype;
    @SerializedName("accounttype")
    @Expose
    private String accounttype;


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getMobile() {
        return mobile;
    }

    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getStationid() {
        return stationid;
    }

    public void setStationid(String stationid) {
        this.stationid = stationid;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEvseId() {
        return evseId;
    }

    public void setEvseId(String evseId) {
        this.evseId = evseId;
    }

    public Integer getPortno() {
        return portno;
    }

    public void setPortno(Integer portno) {
        this.portno = portno;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public Integer getVoltage() {
        return voltage;
    }

    public void setVoltage(Integer voltage) {
        this.voltage = voltage;
    }

    public Integer getAmperage() {
        return amperage;
    }

    public void setAmperage(Integer amperage) {
        this.amperage = amperage;
    }

    public String getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
    }

    public Double getTimePrice() {
        return timePrice;
    }

    public void setTimePrice(Double timePrice) {
        this.timePrice = timePrice;
    }

    public String getKwhUnit() {
        return kwhUnit;
    }

    public void setKwhUnit(String kwhUnit) {
        this.kwhUnit = kwhUnit;
    }

    public Double getKwhPrice() {
        return kwhPrice;
    }

    public void setKwhPrice(Double kwhPrice) {
        this.kwhPrice = kwhPrice;
    }

    public String getPublishAllowedTo() {
        return publishAllowedTo;
    }

    public void setPublishAllowedTo(String publishAllowedTo) {
        this.publishAllowedTo = publishAllowedTo;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Integer getCalcuatedAmount() {
        return calcuatedAmount;
    }

    public void setCalcuatedAmount(Integer calcuatedAmount) {
        this.calcuatedAmount = calcuatedAmount;
    }

    public Integer getChargeTimeValue() {
        return chargeTimeValue;
    }

    public void setChargeTimeValue(Integer chargeTimeValue) {
        this.chargeTimeValue = chargeTimeValue;
    }

    public String getChargingTimeUnit() {
        return chargingTimeUnit;
    }

    public void setChargingTimeUnit(String chargingTimeUnit) {
        this.chargingTimeUnit = chargingTimeUnit;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    public String getChargertype() {
        return chargertype;
    }

    public void setChargertype(String chargertype) {
        this.chargertype = chargertype;
    }

    public String getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype;
    }

}
