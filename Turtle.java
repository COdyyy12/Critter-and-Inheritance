import java.awt.Color;

public class Turtle extends Critter {
    private static final String SPECIES_NAME = "Tu";
    public Turtle() {
        super(SPECIES_NAME);
    }

    @Override
    public Direction getMove() {
        return Direction.WEST;
    }
   @Override
public boolean eat() {
    String neighbor;

    neighbor = info.getNeighbor(Direction.NORTH);
    if (neighbor != null && !neighbor.trim().isEmpty()&& !neighbor.equals(SPECIES_NAME)&& !neighbor.equals(".")) {
        return false;
    }
    neighbor = info.getNeighbor(Direction.SOUTH);
    if (neighbor != null && !neighbor.trim().isEmpty() && !neighbor.equals(SPECIES_NAME)&& !neighbor.equals(".")) {
        return false;
    }
    neighbor = info.getNeighbor(Direction.EAST);
    if (neighbor != null && !neighbor.trim().isEmpty()&& !neighbor.equals(SPECIES_NAME)&& !neighbor.equals(".")) {
        return false;
    }
    neighbor = info.getNeighbor(Direction.WEST);
    if (neighbor != null && !neighbor.trim().isEmpty()&& !neighbor.equals(SPECIES_NAME) && !neighbor.equals(".")) {
        return false;
    }
    return true;
}

    @Override
    public Attack getAttack(String opponent) {
        if (random.nextBoolean()) {
            return Attack.ROAR;
        } else {
            return Attack.FORFEIT;
        }
    }

    @Override
    public Color getColor() {
        return Color.GREEN;
    }
}



