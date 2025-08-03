import java.awt.Color;

public class Turtle extends Critter {
    private static final String SPECIES_NAME = "Tu";

    public Turtle() {
        super(SPECIES_NAME);
    }

    public Direction getMove() {
        return Direction.WEST;
    }

     public boolean eat() {
        String neighborNorth = info.getNeighbor(Direction.NORTH);
        if (neighborNorth != null && !neighborNorth.equals(SPECIES_NAME) && !neighborNorth.equals("%")) {
            return false;
        }
        String neighborSouth = info.getNeighbor(Direction.SOUTH);
        if (neighborSouth != null && !neighborSouth.equals(SPECIES_NAME) && !neighborSouth.equals("%")) {
            return false;
        }
        String neighborEast = info.getNeighbor(Direction.EAST);
        if (neighborEast != null && !neighborEast.equals(SPECIES_NAME) && !neighborEast.equals("%")) {
            return false;
        }
        String neighborWest = info.getNeighbor(Direction.WEST);
        if (neighborWest != null && !neighborWest.equals(SPECIES_NAME) && !neighborWest.equals("%")) {
            return false;
        }
        return true;
    }

    public Attack getAttack(String opponent) {
        if (random.nextBoolean()) {
            return Attack.ROAR;
        } else {
            return Attack.FORFEIT;
        }
    }

     public Color getColor() {
        return Color.GREEN;
    }
}


