package com.example.pizzaaarecipe.ui;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.pizzaaarecipe.R;
import com.example.pizzaaarecipe.classes.Produit;
import com.example.pizzaaarecipe.service.ProduitService;

public class PizzaDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_detail);

        long pizzaId = getIntent().getLongExtra("pizza_id", -1);

        ProduitService service = ProduitService.getInstance();
        Produit pizzaTrouvee = service.trouverParId(pizzaId);

        ImageView imagePizza = findViewById(R.id.imagePizza);
        TextView titrePizza = findViewById(R.id.titrePizza);
        TextView infosPizza = findViewById(R.id.infosPizza);
        TextView texteIngredients = findViewById(R.id.texteIngredients);
        TextView texteDescription = findViewById(R.id.texteDescription);
        TextView texteEtapes = findViewById(R.id.texteEtapes);

        if (pizzaTrouvee != null) {
            imagePizza.setImageResource(pizzaTrouvee.getImageId());
            titrePizza.setText(pizzaTrouvee.getTitre());
            infosPizza.setText(pizzaTrouvee.getTempsPreparation() + " • " + pizzaTrouvee.getTarif() + " €");
            texteIngredients.setText(pizzaTrouvee.getListeIngredients());
            texteDescription.setText(pizzaTrouvee.getResume());
            texteEtapes.setText(pizzaTrouvee.getEtapes());
        } else {
            titrePizza.setText("Pizza non trouvée !");
        }
    }
}