package com.skyzone18.ParasharVidyaSankul.Rest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by kevalt on 2/20/2018.
 */

public class Datum {


    @SerializedName("vcode")
    @Expose
    private String vcode;

    public String getVcode() {
        return vcode;
    }

    public void setVcode(String vcode) {
        this.vcode = vcode;
    }
    // slider


    @SerializedName("Imagepath")
    @Expose
    private String imagepath;

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

    // staff

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("quali")
    @Expose
    private String quali;
    @SerializedName("StaffTypeId")
    @Expose
    private String staffTypeId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuali() {
        return quali;
    }

    public void setQuali(String quali) {
        this.quali = quali;
    }



    public String getStaffTypeId() {
        return staffTypeId;
    }

    public void setStaffTypeId(String staffTypeId) {
        this.staffTypeId = staffTypeId;
    }


    //  event time

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("place")
    @Expose
    private String place;
    @SerializedName("eventdate")
    @Expose
    private String eventdate;
    @SerializedName("eventtime")
    @Expose
    private String eventtime;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getEventdate() {
        return eventdate;
    }

    public void setEventdate(String eventdate) {
        this.eventdate = eventdate;
    }

    public String getEventtime() {
        return eventtime;
    }

    public void setEventtime(String eventtime) {
        this.eventtime = eventtime;
    }

    //  get all catagory

    @SerializedName("CatagoryId")
    @Expose
    private String catagoryId;


    public String getCatagoryId() {
        return catagoryId;
    }

    public void setCatagoryId(String catagoryId) {
        this.catagoryId = catagoryId;
    }


    ///  news

    @SerializedName("detail")
    @Expose
    private String detail;
    @SerializedName("NewsImage")
    @Expose
    private String newsImage;



    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getNewsImage() {
        return newsImage;
    }

    public void setNewsImage(String newsImage) {
        this.newsImage = newsImage;
    }

    // assimant


    @SerializedName("tital")
    @Expose
    private String tital;
    @SerializedName("submitiondate")
    @Expose
    private String submitiondate;
    @SerializedName("assignments")
    @Expose
    private String assignments;

    public String getTital() {
        return tital;
    }

    public void setTital(String tital) {
        this.tital = tital;
    }

    public String getSubmitiondate() {
        return submitiondate;
    }

    public void setSubmitiondate(String submitiondate) {
        this.submitiondate = submitiondate;
    }

    public String getAssignments() {
        return assignments;
    }

    public void setAssignments(String assignments) {
        this.assignments = assignments;
    }


    // ranker studant

    @SerializedName("std")
    @Expose
    private String std;
    @SerializedName("year")
    @Expose
    private String year;
    @SerializedName("percentage")
    @Expose
    private String percentage;




    public String getStd() {
        return std;
    }

    public void setStd(String std) {
        this.std = std;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }




    // Medium
    @SerializedName("MediumId")
    @Expose
    private String mediumId;


    public String getMediumId() {
        return mediumId;
    }

    public void setMediumId(String mediumId) {
        this.mediumId = mediumId;
    }

    @SerializedName("StdId")
    @Expose
    private String stdId;


    public String getStdId() {
        return stdId;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    @SerializedName("sub")
    @Expose
    private String sub;



    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }




}
