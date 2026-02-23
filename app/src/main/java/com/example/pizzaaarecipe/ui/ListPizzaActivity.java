package com.example.pizzaaarecipe.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pizzaaarecipe.R;
import com.example.pizzaaarecipe.adapter.PizzaAdapter;
import com.example.pizzaaarecipe.classes.Produit;
import com.example.pizzaaarecipe.service.ProduitService;

import java.util.List;

public class ListPizzaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pizza);

        ListView listeView = findViewById(R.id.listePizzas);

        ProduitService service = ProduitService.getInstance();
        List<Produit> listePizzas = service.listerTout();

        PizzaAdapter adaptateur = new PizzaAdapter(this, listePizzas);
        listeView.setAdapter(adaptateur);

        listeView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intention = new Intent(ListPizzaActivity.this, PizzaDetailActivity.class);
                intention.putExtra("pizza_id", id);
                startActivity(intention);
            }
        });
    }
}