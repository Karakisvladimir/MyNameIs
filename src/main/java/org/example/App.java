package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class App {
    public static void main(String[] args) {
        Name name = new Name("Vladimir", "Karakis");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(name);
        System.out.println("My name is " + json);
    }
}

