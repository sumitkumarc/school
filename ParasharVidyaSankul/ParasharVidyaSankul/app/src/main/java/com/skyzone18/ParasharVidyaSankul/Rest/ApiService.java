package com.skyzone18.ParasharVidyaSankul.Rest;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by sumit on 2/2/2018.
 */

public interface ApiService {
    @GET("AppServices/AppWebService.asmx/Catagory")
    Call<Example> getAllCategory();

    @FormUrlEncoded
    @POST("AppServices/AppWebService.asmx/PhotoGallary")
    Call<Example> getAllPhoto(@Field("CatagoryId") String image_id);


    @GET("AppServices/AppWebService.asmx/Notice")
    Call<Example> GetNotice();


    @GET("AppServices/AppWebService.asmx/GetStandard")
    Call<Example> GetStandard();

    @GET("AppServices/AppWebService.asmx/GetSection")
    Call<Example> GetSection();

    @GET("AppServices/AppWebService.asmx/News")
    Call<Example> GetNews();

    @GET("AppServices/AppWebService.asmx/Assignment")
    Call<Example> GetAssignment();

    @GET("AppServices/AppWebService.asmx/Event")
    Call<Example> GetEvent();

    @GET("AppServices/AppWebService.asmx/Slider")
    Call<Example> GetSlider();

    @GET("AppServices/AppWebService.asmx/Staff")
    Call<Example> GetStaff();


    @GET("AppServices/AppWebService.asmx/Calander")
    Call<Example> GetCalander();

    @GET("AppServices/AppWebService.asmx/Video")
    Call<Example> GetVideo();

    @GET("AppServices/AppWebService.asmx/ToDayEvent")
    Call<Example> GetTodayEvent();


    @GET("AppServices/AppWebService.asmx/ToDayNews")
    Call<Example> Getodaynews();

    @GET("AppServices/AppWebService.asmx/RankerStudent")
    Call<Example> GetSchoolRanker();


    @GET("AppServices/AppWebService.asmx/Medium")
    Call<Example> GetMedium();

    @FormUrlEncoded
    @POST("AppServices/AppWebService.asmx/Standard_Div")
    Call<Example> GetStandard(@Field("MediumId") String stdid);

    @FormUrlEncoded
    @POST("AppServices/AppWebService.asmx/HomeWork")
    Call<Example> GetHWork(@Field("StdId") String Stdname);


    @GET("AppServices/AppWebService.asmx/Calander")
    Call<Example> getcalnder();

    @FormUrlEncoded
    @POST("AppServices/AppWebService.asmx/TimeTable")
    Call<Example> GetTimeTable(@Field("StdId")String stdid);
}
