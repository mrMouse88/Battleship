package com.company;

public class Main {

    public static void main(String[] args) {

        final Player player = createPlayer();
        player.addShip(2);

        System.out.println( player.ships.get(0).isDrowned());


//        s1.masts.get(0).setHited(true);
//        s1.masts.get(1).setHited(false);

//        System.out.println(player.ships[0].isDrowned());
    }

    public static Player createPlayer() {
        Ship s1 = new Ship(new Mast(12, 12), new Mast(11, 11));
        Ship s2 = new Ship(new Mast(12, 12));
        Ship s3 = new Ship(new Mast(12, 12), new Mast(11, 11));
        Ship s4 = new Ship(new Mast(12, 12), new Mast(11, 11));

        Ship[] ships = {s1, s2};
        return new Player("John");
    }
}
