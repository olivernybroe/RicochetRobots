import java.awt.*;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ricochet2 {


    public static void main(String[] args) throws Exception {

        Board board = new Ricochet2().loadBoard(new Scanner(System.in));
        Solution solution = new Ricochet2().new Solution(board.board, board.robots, board.goal);
        System.out.println(solution.computeSolution());

    }


    public class Solution {

        private Board board;
        private boolean[][][] visitedRobots;

        public Solution(char[][] board, Point[] robots, Point goal) {
            this.board = new Board(board, robots, goal);
            this.visitedRobots = new boolean[robots.length][board.length][board.length];

        }

        public String computeSolution() throws Exception {
            Queue<Board> q = new LinkedList<>();

            q.add(this.board);

            while (!q.isEmpty()) {
                Board tempBoard = q.poll();

                if (tempBoard.isGoal()) {
                    return tempBoard.moves;
                }

                for (int i = 0; i < tempBoard.robots.length; i++) {
                    Endpoints endpoint = tempBoard.possibleEndpointsForRobot(i);

                    visitedRobots[i][tempBoard.robots[i].x][tempBoard.robots[i].y] = true;

                    if (!visitedRobots[i][endpoint.Right.x][endpoint.Right.y]) {
                        Board tempBoardDirection = new Board(tempBoard);
                        tempBoardDirection.moveRobot(i, Direction.Right);
                        q.add(tempBoardDirection);
                    }

                    if (!visitedRobots[i][endpoint.Left.x][endpoint.Left.y]) {
                        Board tempBoardDirection = new Board(tempBoard);
                        tempBoardDirection.moveRobot(i, Direction.Left);
                        q.add(tempBoardDirection);
                    }

                    if (!visitedRobots[i][endpoint.Up.x][endpoint.Up.y]) {
                        Board tempBoardDirection = new Board(tempBoard);
                        tempBoardDirection.moveRobot(i, Direction.Up);
                        q.add(tempBoardDirection);
                    }

                    if (!visitedRobots[i][endpoint.Down.x][endpoint.Down.y]) {
                        Board tempBoardDirection = new Board(tempBoard);
                        tempBoardDirection.moveRobot(i, Direction.Down);
                        q.add(tempBoardDirection);
                    }
                }
            }
            throw new Exception("no solution");
        }

    }


    public Board loadBoard(Scanner scanner) throws IOException {
        int size = scanner.nextInt();
        int numberOfRobots = scanner.nextInt();
        scanner.nextLine();

        char[][] b = new char[size][size];
        Point[] robots = new Point[numberOfRobots];

        Point goal = null;

        for (int i = 0; i < size; i++) {
            char[] line = scanner.nextLine()
                    .toCharArray();
            for (int j = 0; j < line.length; j++) {
                if (line[j] == Board.GOAL_CHAR) {
                    goal = new Point(i, j);
                } else if (Character.isDigit(line[j])) {
                    int number = Character.getNumericValue(line[j]);
                    robots[number] = new Point(i, j);
                } else if (line[j] != Board.EMPTY_CHAR && line[j] != Board.WALL_CHAR) {
                    System.err.println(
                            "Error: Unknown character '" + line[j] + "' on line " + (i + 1) + ", column " + (j + 1));
                }

                b[i][j] = line[j];
            }
        }

        if (goal == null) {
            System.err.println("Error: No goal found on board");
        }

        return new Board(b, robots, goal);
    }
}
