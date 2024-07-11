package thrones;

import java.util.Random;

public class CharacterFactory {
    private static Random random = new Random(System.currentTimeMillis());

    public static int getRandomCoord() {
        return random.nextInt(5);
    }

    public static King createKing() {
        return new King(getRandomCoord(), getRandomCoord());
    }

    public static Queen createQueen() {
        return new Queen(getRandomCoord(), getRandomCoord());
    }

    public static Knight createKnight() {
        return new Knight(getRandomCoord(), getRandomCoord());
    }

    public static Dragon createDragon() {
        return new Dragon(getRandomCoord(), getRandomCoord());
    }
}
