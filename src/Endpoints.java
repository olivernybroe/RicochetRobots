import java.awt.*;

public class Endpoints {
    public final Point Up, Down, Left, Right;

    public Endpoints(Point up, Point down, Point left, Point right) {
        this.Up = up;
        this.Down = down;
        this.Left = left;
        this.Right = right;
    }

    public String toString() {
        return "Endpoints (Up: " + Up + ", Down: " + Down + ", Left: " + Left + ", Right: " + Right + ")";
    }
}