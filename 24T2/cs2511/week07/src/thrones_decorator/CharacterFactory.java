package thrones_decorator;

import java.util.Random;

public class CharacterFactory {

    private static Random random = new Random(System.currentTimeMillis());

    public static int getRandomCoordinate() {
        return random.nextInt(5);
    }

    public static King createKing() {
        return new King(getRandomCoordinate(), getRandomCoordinate());
    }

    public static Queen createQueen() {
        return new Queen(getRandomCoordinate(), getRandomCoordinate());
    }

    public static Knight createKnight() {
        return new Knight(getRandomCoordinate(), getRandomCoordinate());
    }

    public static Dragon createDragon() {
        return new Dragon(getRandomCoordinate(), getRandomCoordinate());
    }
}