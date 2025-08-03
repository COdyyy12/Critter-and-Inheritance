import java.awt.Color;

public class Feline extends Critter {
    private int moveCount;   // counter for getMove before changing direction
    private int eatCount;    // counter for eating
    private Direction currDir; // current direction
    
    public Feline() {
        super("Fe");
        moveCount = 5;   
        eatCount = 0;
        currDir = Direction.NORTH; 
    }
    
    @Override
    public Direction getMove() {
        if (moveCount >= 5) {
            Direction[] options = {
                Direction.NORTH,
                Direction.SOUTH,
                Direction.EAST,
                Direction.WEST
            };
            currDir = options[random.nextInt(options.length)];
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
}

