import java.awt.Color;

public class Elephant extends Critter {
    protected static int goalX = 0;
    protected static int goalY = 0;

    public Elephant() {
        super("El");
    }
    @Override
    public Color getColor() {
        return Color.GRAY;
    }
    @Override
    public Direction getMove() {
        int x = info.getX();
        int y = info.getY();
        if (x == goalX && y == goalY) {
            goalX = random.nextInt(info.getWidth());
            goalY = random.nextInt(info.getHeight());
        }
        int dx;
        if (x >= goalX) {
            dx = x - goalX;
        } else {
            dx = goalX - x;
        }
        int dy;
        if (y >= goalY) {
            dy = y - goalY;
        } else {
            dy = goalY - y;
        }
        if (dx >= dy) {
            if (goalX > x) {
                return Direction.EAST;
            } else {
                return Direction.WEST;
            }
        } else {
            if (goalY > y) {
                return Direction.SOUTH;
            } else {
                return Direction.NORTH;
            }
        }
    }
    @Override
    public boolean eat() {
        return true;
    }
    @Override
    public void mate() {
        incrementLevel(2);}
    @Override
    public void reset() {
        goalX = 0;
        goalY = 0;
    }
}
