public enum Direction {
    Up, Down, Left, Right;

    public String toString() {
        switch (this) {
            case Up: return "U";
            case Down: return "D";
            case Left: return "L";
            case Right: return "R";
            default: throw new AssertionError();
        }
    }
}