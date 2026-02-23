package com.example.pizzaaarecipe.classes;

public class Produit {
    private static long compteur = 1000;

    private long identifiant;
    private String titre;
    private double tarif;
    private int imageId;
    private String tempsPreparation;
    private String listeIngredients;
    private String resume;
    private String etapes;

    public Produit() {
        this.identifiant = compteur++;
    }

    public Produit(String titre, double tarif, int imageId, String tempsPreparation,
                   String listeIngredients, String resume, String etapes) {
        this.identifiant = compteur++;
        this.titre = titre;
        this.tarif = tarif;
        this.imageId = imageId;
        this.tempsPreparation = tempsPreparation;
        this.listeIngredients = listeIngredients;
        this.resume = resume;
        this.etapes = etapes;
    }

    public long getIdentifiant() { return identifiant; }
    public String getTitre() { return titre; }
    public void setTitre(String titre) { this.titre = titre; }
    public double getTarif() { return tarif; }
    public void setTarif(double tarif) { this.tarif = tarif; }
    public int getImageId() { return imageId; }
    public void setImageId(int imageId) { this.imageId = imageId; }
    public String getTempsPreparation() { return tempsPreparation; }
    public void setTempsPreparation(String tempsPreparation) { this.tempsPreparation = tempsPreparation; }
    public String getListeIngredients() { return listeIngredients; }
    public void setListeIngredients(String listeIngredients) { this.listeIngredients = listeIngredients; }
    public String getResume() { return resume; }
    public void setResume(String resume) { this.resume = resume; }
    public String getEtapes() { return etapes; }
    public void setEtapes(String etapes) { this.etapes = etapes; }

    @Override
    public String toString() {
        return titre + " : " + tarif + " €";
    }
}