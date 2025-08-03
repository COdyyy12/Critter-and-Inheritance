import java.awt.Color;

public class Lion extends Feline {
    private int winCount;    
    private int movePhase;   
    private int moveCount;  

      public Lion() {
        super();
        displayName = "Lion";
        winCount = 0;
        movePhase = 0;
        moveCount = 0;
    }
    public Color getColor() {
        return Color.YELLOW;
    }
    public Direction getMove() {
        Direction dir;
        if (movePhase == 0) {
            dir = Direction.EAST;
        } else if (movePhase == 1) {
            dir = Direction.SOUTH;
        } else if (movePhase == 2) {
            dir = Direction.WEST;
        } else {
            dir = Direction.NORTH;
        }
        moveCount++;
        if (moveCount >= 5) {
            moveCount = 0;
            movePhase++;
            if (movePhase > 3) {
                movePhase = 0;
            }
        }
        return dir;
    }
       public boolean eat() {
        if (winCount > 0) {
            winCount = 0;
            return true;
        } else {
            return false;
        }
    }
     public void win() {
        winCount++;
    }
     public void sleep() {
        winCount = 0;
        displayName = new StringBuilder(displayName).reverse().toString();
    }
     public void wakeup() {
        displayName = "Lion";
    }
}

