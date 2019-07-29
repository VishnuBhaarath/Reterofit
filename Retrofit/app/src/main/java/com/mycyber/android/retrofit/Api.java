package com.mycyber.android.retrofit;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface Api {

    String BASE_URL = "https://data.police.uk/api/";

    @GET("forces")
    Call<List<Hero>> getHeroes();
}
