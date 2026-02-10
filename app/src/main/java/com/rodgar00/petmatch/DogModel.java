package com.rodgar00.petmatch;

import com.google.gson.annotations.SerializedName;

public class DogModel {

    @SerializedName("id")
    private int id;

    @SerializedName("nombre")
    private String nombre;

    @SerializedName("edad")
    private int edad;

    @SerializedName("localizacion")
    private String localizacion;

    @SerializedName("categoria")
    private String categoria;

    @SerializedName("descripcion")
    private String descripcion;

    @SerializedName("duenyo")
    private String duenyo;

    @SerializedName("slug")
    private String slug;

    @SerializedName("imagen")
    private String imagen;

    @SerializedName("es_refugio_texto")
    private String esRefugio;

    // Constructor para URL simple (puede usarse en mocks)
    public DogModel(String nombre, String imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
    }

    // Getters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getLocalizacion() { return localizacion; }
    public String getCategoria() { return categoria; }
    public String getDescripcion() { return descripcion; }
    public String getDuenyo() { return duenyo; }
    public String getSlug() { return slug; }
    public String getImagen() { return imagen; }
    public String getEsRefugio() { return esRefugio; }
}
