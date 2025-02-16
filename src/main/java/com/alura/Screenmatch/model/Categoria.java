package com.alura.Screenmatch.model;

public enum Categoria {
    ACCION("Action", "Acción"),
    ROMANCE("Romance", "Romance"),
    DRAMA("Drama", "Drama"),
    COMEDIA("Comedy", "Comedia"),
    CRIMEN("Crime", "Crimen"),
    ANIMACION("Animation", "Animación"),
    AVENTURA("Adventure", "Aventura");

    private String categoriaOmdb;
    private String categoriaEspañol;

    Categoria(String categoriaOmdb, String categoriaEspañol){
        this.categoriaOmdb = categoriaOmdb;
        this.categoriaEspañol = categoriaEspañol;
    }

    public static Categoria fromString(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaOmdb.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Ninguna categoria encontrada: " + text);
    }

    public static Categoria fromEspañol(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaEspañol.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Ninguna categoria encontrada: " + text);
    }



}
