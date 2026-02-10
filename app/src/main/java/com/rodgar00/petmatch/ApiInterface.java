package com.rodgar00.petmatch;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("adoptados/")
    Call<List<DogModel>> getAdoptados();

    @GET("encontrados/")
    Call<List<DogModel>> getEncontrados();

    @GET("perdidos/")
    Call<List<DogModel>> getPerdidos();

    @GET("favoritos/")
    Call<List<DogModel>> getFavoritos();
}
