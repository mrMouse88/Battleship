package com.company;

import java.util.ArrayList;

public class Ship {
    //ArrayList<Mast> masts = new ArrayList<>();
    Mast[] masts;

    public Ship(Mast... masts) {
        for (Mast mast : masts) {
            this.masts = masts;
        }
    }

    public boolean isDrowned() {
        for (Mast mast : masts) {
            if (!mast.isHited()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ship with " +
                this.masts.length +
                " masts";
    }
}
