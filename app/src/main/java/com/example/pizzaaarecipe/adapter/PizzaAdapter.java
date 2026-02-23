package com.example.pizzaaarecipe.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pizzaaarecipe.R;
import com.example.pizzaaarecipe.classes.Produit;

import java.util.List;

public class PizzaAdapter extends BaseAdapter {

    private final Context contexte;
    private final List<Produit> listePizzas;

    public PizzaAdapter(Context contexte, List<Produit> listePizzas) {
        this.contexte = contexte;
        this.listePizzas = listePizzas;
    }

    @Override
    public int getCount() {
        return listePizzas.size();
    }

    @Override
    public Object getItem(int position) {
        return listePizzas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return listePizzas.get(position).getIdentifiant();
    }

    @Override
    public View getView(int position, View vueReutilisee, ViewGroup parent) {
        if (vueReutilisee == null) {
            vueReutilisee = LayoutInflater.from(contexte).inflate(R.layout.row_pizza, parent, false);
        }

        ImageView imageView = vueReutilisee.findViewById(R.id.imagePizza);
        TextView texteNom = vueReutilisee.findViewById(R.id.textNom);
        TextView texteDetails = vueReutilisee.findViewById(R.id.textDetails);

        Produit pizzaCourante = listePizzas.get(position);

        imageView.setImageResource(pizzaCourante.getImageId());
        texteNom.setText(pizzaCourante.getTitre());
        texteDetails.setText(pizzaCourante.getTempsPreparation() + " • " + pizzaCourante.getTarif() + " €");

        return vueReutilisee;
    }
}