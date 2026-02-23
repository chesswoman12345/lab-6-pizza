package com.example.pizzaaarecipe.dao;

import java.util.ArrayList;

public interface Repository<T> {
    T ajouter(T element);
    T modifier(T element);
    boolean supprimer(long identifiant);
    T trouverParId(long identifiant);
    ArrayList<T> listerTout();
}