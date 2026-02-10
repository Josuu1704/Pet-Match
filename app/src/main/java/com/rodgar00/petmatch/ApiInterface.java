package com.rodgar00.petmatch;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Path;

public interface ApiInterface {

    @GET("api/adoptados/")
    Call<List<DogModel>> getAdoptados();

    @GET("api/encontrados/")
    Call<List<DogModel>> getEncontrados();

    @GET("api/perdidos/")
    Call<List<DogModel>> getPerdidos();

    @GET("api/favoritos/")
    Call<List<DogModel>> getFavoritos();
}
