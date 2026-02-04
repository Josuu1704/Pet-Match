package com.rodgar00.petmatch;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class DogRecycler extends RecyclerView.Adapter<DogRecycler.DogViewHolder> {

    Context context;
    ArrayList<DogModel> dogModels;

    public DogRecycler(Context context, ArrayList<DogModel> dogModels) {
        this.context = context;
        this.dogModels = dogModels;
    }

    @NonNull
    @Override
    public DogViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.tarjeta, parent, false);
        return new DogViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DogViewHolder holder, int position) {
        holder.breedText.setText(dogModels.get(position).getBreed());

        Glide.with(context)
                .load(dogModels.get(position).getImageUrl())
                .centerCrop()
                .into(holder.dogImage);
    }

    @Override
    public int getItemCount() {
        return dogModels.size();
    }

    static class DogViewHolder extends RecyclerView.ViewHolder {

        TextView breedText;
        ImageView dogImage;

        public DogViewHolder(@NonNull View itemView) {
            super(itemView);
            breedText = itemView.findViewById(R.id.textoTarjetaCharacter);
            dogImage = itemView.findViewById(R.id.imagenTarjetaCharacter);
        }
    }
}
