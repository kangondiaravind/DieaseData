package com.aravind.dieasedata;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("/bins/wzbuz")
    Call<List<DieaseDetail>> getDieaseDetails();
}
