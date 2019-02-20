package com.company;

public class Mast {
    private int x;
    private int y;
    private boolean isHited = false;

    public Mast(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isHited() {
        return isHited;
    }

    public void setHited(boolean hited) {
        isHited = hited;
    }
}
