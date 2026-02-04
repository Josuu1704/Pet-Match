package com.rodgar00.petmatch;

public class DogModel {
    private String breed;
    private String imageUrl;

    public DogModel(String breed, String imageUrl) {
        this.breed = breed;
        this.imageUrl = imageUrl;
    }

    public String getBreed() {
        return breed;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
