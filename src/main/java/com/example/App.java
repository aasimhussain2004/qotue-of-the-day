package com.example;

public class App {
    public String getQuote() {
        return "Keep coding and stay curious!";
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println("Quote of the Day: " + app.getQuote());
    }
}