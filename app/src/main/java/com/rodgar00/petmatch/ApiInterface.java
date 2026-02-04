package com.rodgar00.petmatch;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("breed/{breed}/images/random")
    Call<DogResponse> getDogByBreed(
            @Path("breed") String breed
    );
}
