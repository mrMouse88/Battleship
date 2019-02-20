package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    ArrayList <Ship> ships= new ArrayList<Ship>(); //tablica statków
    String name;

    public Player(String name) {
        this.name = name;
    }

    //dodaj statek do gracza
    public void addShip(int size) {
        Mast[] masts = new Mast[size];
        for (int i = 0; i < size; i++) {
            masts[i] = new Mast(this.getCoordinate(), this.getCoordinate());
        }
    }

    //Sprawdza czy gracz przegrał
    public boolean isLooser() {
        for (Ship ship : ships) {
            if (!ship.isDrowned()) {
                return false;
            }
        }
        return true;
    }

    //przyjmij pojedyxczą watrość od gracza
    protected int getCoordinate() {
        Scanner input = new Scanner(System.in);
        boolean status = false;
        int x = 0;

        while (!status) {
            System.out.println("Podaj liczbę od 1 do 10:");
            if (input.hasNextInt()) {
                x = input.nextInt();
                input.nextLine();
                if (x >= 1 && x <= 10) {
                    status = true;
                }
            } else {
                input.next();
            }
        }

        return x;
    }
}

