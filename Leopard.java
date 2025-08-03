import java.awt.Color;

public class Leopard extends Feline {
    protected static int confidence = 0;
    public Leopard() {
        super();
        this.displayName = "Lpd";
    }
    @Override
    public Color getColor() {
        return Color.RED;
    }

    @Override
    public Direction getMove() {
        String north = info.getNeighbor(Direction.NORTH);
        if (".".equals(north) || "Patrick".equals(north)) {
            return Direction.NORTH;
        }
        String south = info.getNeighbor(Direction.SOUTH);
        if (".".equals(south) || "Patrick".equals(south)) {
            return Direction.SOUTH;
        }
        String east = info.getNeighbor(Direction.EAST);
        if (".".equals(east) || "Patrick".equals(east)) {
            return Direction.EAST;
        }
        String west = info.getNeighbor(Direction.WEST);
        if (".".equals(west) || "Patrick".equals(west)) {
            return Direction.WEST;
        }
        return getRandomDirection();
    }

    public boolean eat() {
        int roll = random.nextInt(100);
        return roll < confidence * 10;
    }

    @Override
    public void win() {
        if (confidence < 10) {
            confidence++;
        }
    }
    @Override
    public void lose() {
        if (confidence > 0) {
            confidence--;
        }
    }

    @Override
    public Attack getAttack(String opponent) {
        if ("Tu".equals(opponent) || confidence > 5) {
            return Attack.POUNCE;
        } else {
            return generateAttack(opponent);
        }
    }
    protected Attack generateAttack(String opponent) {
        if ("Patrick".equals(opponent)) {
            return Attack.FORFEIT;
        }
        int pick = random.nextInt(3);
        if (pick == 0) {
            return Attack.POUNCE;
        } else if (pick == 1) {
            return Attack.SCRATCH;
        } else {
            return Attack.ROAR;
        }
    }
    @Override
    public void reset() {
        confidence = 0;
    }
    private Direction getRandomDirection() {
        int r = random.nextInt(4);
        if (r == 0) return Direction.NORTH;
        if (r == 1) return Direction.SOUTH;
        if (r == 2) return Direction.EAST;
        return Direction.WEST;
    }
}
