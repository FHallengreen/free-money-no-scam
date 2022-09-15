package com.example.freemoneynoscam.repository;

import java.util.ArrayList;

public class repository {

    private ArrayList<String> arr = new ArrayList<>();

    public ArrayList<String> getArr() {
        return arr;
    }

    @Override
    public String toString() {
        String emails ="";
        for (String email: arr) {
            emails+= email + ", ";
        }
        return emails;
    }
}
