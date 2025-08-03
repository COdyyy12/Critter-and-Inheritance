import java.awt.Color;

public class Ocelot extends Leopard {
     public Ocelot() {
        super();
        this.displayName = "Oce";
    }
    public Color getColor() {
        return Color.LIGHT_GRAY;
    }
    @Override
    protected Attack generateAttack(String opponent) {
        if ("Lion".equals(opponent) || "Fe".equals(opponent) || "Lpd".equals(opponent)) {
            return Attack.SCRATCH;
        } else {
            return Attack.POUNCE;
        }
    }
}
