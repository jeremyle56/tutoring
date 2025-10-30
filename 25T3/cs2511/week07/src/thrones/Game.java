package thrones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import thrones.characters.Dragon;
import thrones.characters.King;
import thrones.characters.Queen;
import thrones.decorators.ChainMailDecorator;
import thrones.decorators.HelmetDecorator;
import thrones.factories.MetalFactory;
import thrones.factories.PlasticFactory;
import thrones.factories.WoodFactory;

/**
 * Plays the game with a command line interface.
 * 
 * @author Nick Patrikeos
 */
public class Game {
    private static MetalFactory metalFactory = new MetalFactory();
    private static PlasticFactory plasticFactory = new PlasticFactory(10);
    private static WoodFactory woodFactory = new WoodFactory(5);

    private List<Character> characters = new ArrayList<Character>();

    public void play() {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;

        for (Character character : characters) {
            System.out.print("Move " + character + " to: ");
            String[] line = scanner.nextLine().split(" ");
            x = Integer.parseInt(line[0]);
            y = Integer.parseInt(line[1]);

            MoveResult result = character.makeMove(x, y, characters);

            if (result.equals(MoveResult.SUCCESS)) {
                System.out.println("Success! Character is now " + character);
            } else if (result.equals(MoveResult.INVALID)) {
                System.out.println("Invalid move.");
            } else if (result.equals(MoveResult.ATTACK)) {
                System.out.println("Attacked another character.");
            }
        }

        scanner.close();
    }

    public void addCharacter(Character character) {
        characters.add(character);
    }

    public static void main(String[] args) {
        Game game = new Game();

        King k = woodFactory.createKing();
        // King k = new WoodKing(0, 0);
        game.addCharacter(k);

        Dragon d = metalFactory.createDragon();
        // Dragon d = new MetalDragon(0, 1);

        ChainMailDecorator cm = new ChainMailDecorator(d);
        HelmetDecorator h = new HelmetDecorator(cm);
        game.addCharacter(h);

        Queen q = plasticFactory.createQueen();
        // Queen q = new PlasticQueen(2, 2);

        game.addCharacter(q);
        game.play();
    }
}
