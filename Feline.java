import java.awt.Color;

public class Feline extends Critter {
    private int moveCount; // counter for getMove method before random direction
    private int eatCount; // counter for eating
    private Direction currDir; // current direction

    public Feline() {
        super("Fe");
        moveCount = 0;
        eatCount = 0;
        currDir = getRandomDirection();
    }

    @Override
    public Direction getMove() {
        if (moveCount >= 5) {
            currDir = getRandomDirection();
            moveCount = 0;
        }
        moveCount++;
        return currDir;
    }

    @Override
    public boolean eat() {
        eatCount++;
        if (eatCount >= 3) {
            eatCount = 0;
            return true;
        }
        return false;
    }

    @Override
    public Attack getAttack(String opponent) {
        return Attack.POUNCE;
    }

    @Override
    public Color getColor() {
        return Color.MAGENTA;
    }
}
