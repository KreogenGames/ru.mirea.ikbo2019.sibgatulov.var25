package Practice_7.FlyWeight;

import java.awt.*;

public final class Situational {
    public final int x;
    public final int y;
    public final int z;
    public final Color color;

    public Situational(int x, int y, int z, Color color) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.color = color;
    }

    @Override
    public String toString() {
        return " " + x + " чашек, " +
                y + " тарелок," +
                z + " ложек" +
                " и цвета " + color;
    }
}
