package com.rodgar00.petmatch;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DogResponse {

    @SerializedName("message")
    private String imageUrl;

    @SerializedName("status")
    private String status;

    public String getImageUrl() {
        return imageUrl;
    }

    public String getStatus() {
        return status;
    }
}
