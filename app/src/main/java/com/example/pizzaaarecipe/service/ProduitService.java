package com.example.pizzaaarecipe.service;

import com.example.pizzaaarecipe.classes.Produit;
import com.example.pizzaaarecipe.dao.Repository;
import com.example.pizzaaarecipe.R;

import java.util.ArrayList;

public class ProduitService implements Repository<Produit> {

    private static ProduitService instance;
    private final ArrayList<Produit> catalogue = new ArrayList<>();

    private ProduitService() {
        remplirCatalogue();
    }

    public static ProduitService getInstance() {
        if (instance == null) {
            instance = new ProduitService();
        }
        return instance;
    }

    private void remplirCatalogue() {
        // Pizza 1 - Barbecued Chicken
        catalogue.add(new Produit("BARBECUED CHICKEN PIZZA", 3.0,
                R.mipmap.pizza1, "35 min",
                "- 2 poitrines de poulet\n- 1/4 c. à café de poivre\n- 1 tasse de sauce barbecue\n- 1 pâte à pizza\n- 2 c. à café d'huile d'olive\n- 2 tasses de fromage Gouda\n- 1 oignon rouge\n- 1/4 tasse de coriandre",
                "Pizza au poulet barbecue simple et rapide.",
                "ÉTAPE 1: Griller le poulet.\nÉTAPE 2: Garnir et cuire."));

        // Pizza 2 - Bruschetta Pizza
        catalogue.add(new Produit("BRUSCHETTA PIZZA", 5.0,
                R.mipmap.pizza2, "35 min",
                "- 250g de saucisse\n- 1 croûte à pizza\n- 180g de pepperoni\n- 2 tasses de mozzarella\n- 1.5 tasse de tomates\n- 1/2 tasse de basilic\n- 1 c. à soupe d'huile d'olive\n- 2 gousses d'ail",
                "Pizza généreuse aux saveurs italiennes.",
                "ÉTAPE 1: Cuire la saucisse.\nÉTAPE 2: Garnir et cuire."));

        // Pizza 3 - Spinach Pizza
        catalogue.add(new Produit("SPINACH PIZZA", 2.0,
                R.mipmap.pizza3, "25 min",
                "- 1 pâte à pizza\n- 1/2 tasse de sauce Alfredo\n- 2 tomates\n- 4 tasses d'épinards\n- 2 tasses de fromage italien",
                "Pizza crémeuse aux épinards et tomates.",
                "ÉTAPE 1: Étaler la pâte.\nÉTAPE 2: Ajouter la garniture.\nÉTAPE 3: Cuire."));

        // Pizza 4 - Deep-Dish Sausage Pizza
        catalogue.add(new Produit("DEEP-DISH SAUSAGE PIZZA", 8.0,
                R.mipmap.pizza4, "45 min",
                "- 7g de levure\n- 2/3 tasse d'eau\n- 2 tasses de farine\n- 1/4 tasse d'huile\n- Herbes (origan, basilic)\n- Sel d'ail et d'oignon",
                "Pizza généreuse à la saucisse.",
                "ÉTAPE 1: Préparer la pâte.\nÉTAPE 2: Laisser lever.\nÉTAPE 3: Cuire."));

        // Pizza 5 - Homemade Pizza
        catalogue.add(new Produit("HOMEMADE PIZZA", 4.0,
                R.mipmap.pizza5, "50 min",
                "- 7g de levure\n- 1 c. café de sucre\n- 1.25 tasse d'eau\n- 1/4 tasse d'huile\n- 3.5 tasses de farine\n- 250g de bœuf haché\n- Sauce tomate\n- Poivron vert\n- Mozzarella",
                "Pizza maison classique.",
                "ÉTAPE 1: Préparer la pâte.\nÉTAPE 2: Laisser lever.\nÉTAPE 3: Cuire la viande.\nÉTAPE 4: Garnir et cuire."));

        // Pizza 6 - Pesto Chicken Pizza
        catalogue.add(new Produit("PESTO CHICKEN PIZZA", 3.0,
                R.mipmap.pizza6, "50 min",
                "- 2 c. café de levure\n- 1 tasse d'eau\n- 2.75 tasses de farine\n- 1 c. soupe d'huile\n- 250g de poulet\n- 1 oignon\n- Poivrons\n- 1/2 tasse de champignons\n- 3 c. soupe de pesto\n- Mozzarella",
                "Pizza au poulet et pesto.",
                "ÉTAPE 1: Préparer la pâte.\nÉTAPE 2: Cuire le poulet.\nÉTAPE 3: Garnir et cuire."));

        // Pizza 7 - Loaded Mexican Pizza
        catalogue.add(new Produit("LOADED MEXICAN PIZZA", 3.0,
                R.mipmap.pizza7, "30 min",
                "- 1 boîte de haricots noirs\n- 1 oignon rouge\n- 1 poivron jaune\n- 3 c. café de chili\n- 3/4 c. café de cumin\n- 3 tomates\n- 1 jalapeño\n- Épinards\n- Coriandre\n- Fromages",
                "Pizza mexicaine épicée.",
                "ÉTAPE 1: Écraser les haricots.\nÉTAPE 2: Garnir la croûte.\nÉTAPE 3: Cuire."));

        // Pizza 8 - Bacon Cheeseburger Pizza
        catalogue.add(new Produit("BACON CHEESEBURGER PIZZA", 2.0,
                R.mipmap.pizza8, "20 min",
                "- 250g de bœuf haché\n- 1 oignon\n- 1 croûte à pizza\n- 1 boîte de sauce pizza\n- 6 tranches de bacon\n- Cornichons\n- Mozzarella et cheddar",
                "Pizza burger au bacon.",
                "ÉTAPE 1: Cuire le bœuf.\nÉTAPE 2: Garnir la croûte.\nÉTAPE 3: Cuire."));

        // Pizza 9 - Pizza Margherita
        catalogue.add(new Produit("PIZZA MARGHERITA", 1.0,
                R.mipmap.pizza9, "30 min",
                "- 3 c. café de levure\n- 1 tasse d'eau\n- 2 c. soupe d'huile\n- 1 c. café de sucre\n- 3 tasses de farine\n- Tomates\n- Basilic\n- Mozzarella",
                "Pizza classique italienne.",
                "ÉTAPE 1: Préparer la pâte.\nÉTAPE 2: Laisser lever.\nÉTAPE 3: Garnir et cuire."));

        // Pizza 10 - Pepperoni-Sausage Stuffed Pizza
        catalogue.add(new Produit("PEPPERONI-SAUSAGE STUFFED PIZZA", 5.0,
                R.mipmap.pizza10, "45 min",
                "- 7g de levure\n- 1.25 tasse d'eau\n- 2 c. soupe d'huile\n- 4 tasses de farine\n- Mozzarella et cheddar\n- Saucisse\n- Champignons\n- Pepperoni",
                "Pizza farcie généreuse.",
                "ÉTAPE 1: Préparer la pâte.\nÉTAPE 2: Laisser lever.\nÉTAPE 3: Garnir et cuire."));
    }

    @Override
    public Produit ajouter(Produit element) {
        catalogue.add(element);
        return element;
    }

    @Override
    public Produit modifier(Produit element) {
        for (int i = 0; i < catalogue.size(); i++) {
            if (catalogue.get(i).getIdentifiant() == element.getIdentifiant()) {
                catalogue.set(i, element);
                return element;
            }
        }
        return null;
    }

    @Override
    public boolean supprimer(long identifiant) {
        return catalogue.removeIf(p -> p.getIdentifiant() == identifiant);
    }

    @Override
    public Produit trouverParId(long identifiant) {
        for (Produit p : catalogue) {
            if (p.getIdentifiant() == identifiant) {
                return p;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Produit> listerTout() {
        return catalogue;
    }
}