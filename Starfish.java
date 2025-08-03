import java.awt.Color;

public class Starfish extends Critter {
    private static final String SPECIES_NAME = "Patrick";

    /**
     * Default constructor - creates critter with name Patrick
     */
    public Starfish() {
        super(SPECIES_NAME);
    }
    @Override
    public Direction getMove() {
        return Direction.CENTER;
    }

    public Color getColor() {
        return Color.PINK;
    }
}
