package com.rodgar00.petmatch;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


import android.view.inputmethod.EditorInfo;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextInputEditText searchBar;
    RecyclerView recyclerView;
    DogRecycler adapter;
    ArrayList<DogModel> dogList = new ArrayList<>();
    ApiInterface api;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchBar = findViewById(R.id.searchBar);
        recyclerView = findViewById(R.id.characterRecycler);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new DogRecycler(this, dogList);
        recyclerView.setAdapter(adapter);

        api = ApiClient.getClient().create(ApiInterface.class);

        searchBar.setOnEditorActionListener((v, actionId, event) -> {
            if (actionId == EditorInfo.IME_ACTION_SEARCH) {

                String breed = searchBar.getText()
                        .toString()
                        .trim()
                        .toLowerCase();

                if (!breed.isEmpty()) {
                    buscarPerro(breed);
                }
                return true;
            }
            return false;
        });
    }

    private void buscarPerro(String breed) {

        api.getDogByBreed(breed).enqueue(new Callback<DogResponse>() {
            @Override
            public void onResponse(Call<DogResponse> call, Response<DogResponse> response) {

                if (response.isSuccessful() && response.body() != null) {

                    dogList.clear();
                    dogList.add(new DogModel(breed, response.body().getImageUrl()));
                    adapter.notifyDataSetChanged();

                } else {
                    Toast.makeText(MainActivity.this,
                            "Raza no encontrada 🐕",
                            Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<DogResponse> call, Throwable t) {
                Toast.makeText(MainActivity.this,
                        "Error de conexión",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
