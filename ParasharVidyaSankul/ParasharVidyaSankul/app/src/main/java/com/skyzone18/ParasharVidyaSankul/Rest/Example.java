package com.skyzone18.ParasharVidyaSankul.Rest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by kevalt on 2/20/2018.
 */

public class Example {
    @SerializedName("Sucess")
    @Expose
    private String sucess;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;

    public String getSucess() {
        return sucess;
    }

    public void setSucess(String sucess) {
        this.sucess = sucess;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

}

