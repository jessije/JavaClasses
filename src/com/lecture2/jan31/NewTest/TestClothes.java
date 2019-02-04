package com.lecture2.jan31.NewTest;

public class TestClothes {
    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[]{
                new Trousers("Long trousers"),
                new Sweater(),
                new Tshirt(),
                new Trousers("Short trousers")
        };
        wearAllClothes(clothes);
    }
    public static void wearAllClothes(Clothes[] all){
        for (Clothes clothes: all){
            clothes.wear();
        }
    }
}
