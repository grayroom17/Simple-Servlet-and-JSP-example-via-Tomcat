package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    public List<String> getBrands(String color){
        List<String> brands = new ArrayList<>();
        switch (color){
            case ("light"):
                brands.add("Velkopopovicky Kozel");
                break;
            case ("amber"):
                brands.add("Jack Amber");
                brands.add("Red Moose");
                break;
            case ("brown"):
                brands.add("SWEETWATER GEORGIA BROWN");
                brands.add("DURTY MUD SEASON HOPPY BROWN ALE FROM SMUTTYNOSE");
                break;
            case ("dark"):
                brands.add("Deschutes Black Butte Porter");
                brands.add("Zero Gravity Extra Stout");
                break;
        }
        return brands;
    }
}
