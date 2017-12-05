package com.example.mct.retrofittry02;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by MCT on 12/5/2017.
 */

public interface Api {

    String BASE_URL =  "https://simplifiedcoding.net/demos/";

    @GET("marvel")
    Call<List<Hero>> getHeros();


}
