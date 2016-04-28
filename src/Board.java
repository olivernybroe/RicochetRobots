import java.awt.*;


public class Board {
    public static final char GOAL_CHAR = 'G';
    public static final char WALL_CHAR = '#';
    public static final char EMPTY_CHAR = ' ';

    public char[][] board;
    public int size;
    public Point[] robots;
    public Point goal;
    public String moves = "";


    public Board(char[][] board, Point[] robots, Point goal) {
        this.board = board;
        this.size = board.length;
        this.robots = robots;
        this.goal = goal;
    }

    public Board(Board tempBoard){
        this.board = new char[tempBoard.board.length][]; // tempBoard.board.length];
        for (int i = 0; i < tempBoard.board.length; ++i) {
            this.board[i] = tempBoard.board[i].clone();
        }

        this.robots = new  Point[tempBoard.robots.length];
        this.robots = tempBoard.robots.clone();
        //System.arraycopy( tempBoard.board, 0, board, 0, tempBoard.board.length );
        //System.arraycopy( tempBoard.robots, 0, robots, 0, tempBoard.robots.length );
        this.size = tempBoard.size;
        this.goal = tempBoard.goal;
        this.moves = tempBoard.moves;
    }

    public boolean isGoal() {
        return this.robots[0].equals(this.goal);
    }

    public Endpoints possibleEndpointsForRobot(int robot) {
        assert robot < robots.length;

        Point up = pointAfterMovingRobot(robot, Direction.Up);
        Point down = pointAfterMovingRobot(robot, Direction.Down);
        Point left = pointAfterMovingRobot(robot, Direction.Left);
        Point right = pointAfterMovingRobot(robot, Direction.Right);

        return new Endpoints(up, down, left, right);
    }

    public Point pointAfterMovingRobot(int robot, Direction m) {
        assert robot < robots.length;

        Point pos = new Point(robots[robot]);
        int drow = 0, dcol = 0;

        if (m == Direction.Up) {
            drow = -1;
        } else if (m == Direction.Down) {
            drow = 1;
        }

        if (m == Direction.Left) {
            dcol = -1;
        } else if (m == Direction.Right) {
            dcol = 1;
        }

        while (withinBoard(pos.x+drow, pos.y+dcol) &&
                (board[pos.x+drow][pos.y+dcol] == EMPTY_CHAR
                        || board[pos.x+drow][pos.y+dcol] == GOAL_CHAR)) {
            pos.translate(drow, dcol);
        }

        return pos;
    }

    public void moveRobot(int robot, Direction d) {

        Point from = robots[robot];
        Point to = pointAfterMovingRobot(robot, d);
        board[from.x][from.y] = EMPTY_CHAR;
        robots[robot] = to;
        board[to.x][to.y] = (char) ('0' + robot);

        //add move to moves.
        this.moves += robot+d.toString()+"\n";
    }

    private boolean withinBoard(int x, int y) {
        return x >= 0 && x < size && y >= 0 && y < size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(size * size);

        for (int i = 0; i < board.length; i++) {
            sb.append(board[i]);
            sb.append(System.getProperty("line.separator"));
        }

        return sb.toString();
    }
}