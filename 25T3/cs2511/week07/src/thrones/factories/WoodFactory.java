package thrones.factories;

import thrones.characters.Dragon;
import thrones.characters.King;
import thrones.characters.Knight;
import thrones.characters.Queen;
import thrones.characters.wood.WoodDragon;
import thrones.characters.wood.WoodKing;
import thrones.characters.wood.WoodKnight;
import thrones.characters.wood.WoodQueen;

public class WoodFactory extends CharacterFactory {
    private int n;

    public WoodFactory(int n) {
        this.n = n;
    }

    @Override
    public King createKing() {
        return new WoodKing(getIntDivisibleBy(n), getIntDivisibleBy(n));
    }

    @Override
    public Queen createQueen() {
        return new WoodQueen(getIntDivisibleBy(n), getIntDivisibleBy(n));
    }

    @Override
    public Knight createKnight() {
        return new WoodKnight(getIntDivisibleBy(n), getIntDivisibleBy(n));
    }

    @Override
    public Dragon createDragon() {
        return new WoodDragon(getIntDivisibleBy(n), getIntDivisibleBy(n));
    }

}
