import java.awt.Color;
import java.util.Random;

public class CustomCritter extends Critter {
    private static final String DISPLAY_NAME = "Cst";  
    private static final Color COLOR = Color.BLUE;     
    private static final Random RNG = new Random();     

    public CustomCritter() {
        super(DISPLAY_NAME);
    }

    @Override
    public Color getColor() {
        return COLOR;
    }

    @Override
    public Direction getMove() {
        Direction dir;
        do {
            dir = Direction.values()[RNG.nextInt(Direction.values().length)];
        } while (dir == Direction.CENTER);
        return dir;
    }

    @Override
    public boolean eat() {
        return false;
    }
    
    @Override
    public Attack getAttack(String opponent) {
        return Attack.POUNCE;
    }
}