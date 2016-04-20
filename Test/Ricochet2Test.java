import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;


public class Ricochet2Test {

    @Test
    public void board_4_012_Random() throws Exception {
        Scanner scanner = new Scanner("12\n" +
                "4\n" +
                "# 0 ##  #   \n" +
                "   #      # \n" +
                "#         # \n" +
                "#     #     \n" +
                "            \n" +
                " 2      #   \n" +
                "3           \n" +
                "#    1      \n" +
                " #      #   \n" +
                "    #    #  \n" +
                "    G       \n" +
                "       #    \n");
        Board board = new Ricochet2().loadBoard(scanner);
        Ricochet2.Solution solution = new Ricochet2().new Solution(board.board, board.robots, board.goal);
        assertEquals(solution.computeSolution(), "0D\n" +
                        "1D\n" +
                        "0R\n" +
                        "0U\n");
    }
    @Test
    public void board_8_020_Random() throws Exception {
        Scanner scanner = new Scanner("20\n" +
                "8\n" +
                "               G #  \n" +
                "                 # #\n" +
                "    #               \n" +
                "           #   7  # \n" +
                "#  0#    #  #       \n" +
                "         #          \n" +
                " #       #    1     \n" +
                "         ##3        \n" +
                "# #    #      5     \n" +
                "    #             # \n" +
                "          #     #   \n" +
                "#            #  ##  \n" +
                "    4               \n" +
                "  #      #          \n" +
                "  ##    #           \n" +
                "  ##       ###      \n" +
                "       # 6   #      \n" +
                "   #          #     \n" +
                "      #    #  #     \n" +
                "        # ###2      \n");
        Board board = new Ricochet2().loadBoard(scanner);
        Ricochet2.Solution solution = new Ricochet2().new Solution(board.board, board.robots, board.goal);
        assertEquals(solution.computeSolution(), "0U\n" +
                "1U\n" +
                "1R\n" +
                "0R\n");
    }
    @Test
    public void board_8_009_Random() throws Exception {
        Scanner scanner = new Scanner("9\n" +
                "8\n" +
                "    2  #4\n" +
                "   57   #\n" +
                "      6  \n" +
                "     # 0 \n" +
                "   1G  # \n" +
                "   3     \n" +
                "#    #   \n" +
                "    # #  \n" +
                "      ## \n");
        Board board = new Ricochet2().loadBoard(scanner);
        Ricochet2.Solution solution = new Ricochet2().new Solution(board.board, board.robots, board.goal);
        assertNotEquals(solution.computeSolution(), "no solution");
    }
    @Test
    public void board_8_045_Random() throws Exception {
        Scanner scanner = new Scanner("45\n" +
                "8\n" +
                "      #   #  # #            # #             #\n" +
                "                 #          #                \n" +
                "  # #   #    #                  #          # \n" +
                "  #                  #        #        ###   \n" +
                "       #            #  3    ##              #\n" +
                "    #        # #           #        #      # \n" +
                "        #     #      #                       \n" +
                "       #                    #                \n" +
                "                       #       #     #       \n" +
                "                 # #                         \n" +
                " #     #  #                     #    #  #    \n" +
                "#           ###       #              #       \n" +
                "     ##      #           #                   \n" +
                "        5 #          #             #    1#   \n" +
                "            #       #                     #  \n" +
                "      #  #                     #   ##        \n" +
                "                     #                      #\n" +
                "      #            #                #    #  #\n" +
                "  #        ####      #  #      ## 0 #   #    \n" +
                "# # #     #                    #         #   \n" +
                "    #                   #                    \n" +
                "                #                            \n" +
                "  #   #      #                 #             \n" +
                "               #                     #       \n" +
                "            #      #                         \n" +
                "  #       #      # #  #         #            \n" +
                "                    #                        \n" +
                "   #           ##   #       #       #  #  #  \n" +
                "#  #      #         #         ##            #\n" +
                "  #     #                       #           #\n" +
                "         #  2  #             #   #           \n" +
                "       #      7                #     # #  #  \n" +
                "                               ##    #       \n" +
                "                               #  #          \n" +
                "   #                     #    #      #       \n" +
                " #         ##   #     ##     #   #     #     \n" +
                "       # #          #         #   ##         \n" +
                "                    #      #   #             \n" +
                "               #  #    4                     \n" +
                "    #                 #       #      #       \n" +
                "                 6  #                        \n" +
                "         #         #                         \n" +
                "      #     #            #                   \n" +
                "                  #    #   #      #          \n" +
                "        #         G                          \n");
        Board board = new Ricochet2().loadBoard(scanner);
        Ricochet2.Solution solution = new Ricochet2().new Solution(board.board, board.robots, board.goal);
        assertNotEquals(solution.computeSolution(), "no solution");
    }
    @Test
    public void board_8_100_Random() throws Exception {
        Scanner scanner = new Scanner("100\n" +
                "8\n" +
                "  #              #               #                              ##      #              #   #        \n" +
                "   #             #    #     #              #     #                            #              #      \n" +
                "                                                       #   #       ##     #                         \n" +
                "             #                        #      #        #        # #                   #         #    \n" +
                "           #    ##     ##   #      #                        #   #    #    #           #          #  \n" +
                "                              #  #                 #        #    #       # 6  #    #                \n" +
                " ##        #                #              #          #            #   #                          # \n" +
                "   #         # #    #     #    #   # #            #       # ##    #   #      #  #  ##               \n" +
                "  #       #  ##     #         ###                     #                  #           #              \n" +
                " #                  #       #         #    #       #                                            #   \n" +
                "       #               #  #                     7#       # #   #    ##            #        #        \n" +
                "    #     ### #        #      #      #        #    #                       #           #            \n" +
                "#                     #                              # #                           #     # #     ###\n" +
                " #                       #   #     #                     #  #             #       #  #           # #\n" +
                "             ##    #     #  # ##                        # #                                #   # #  \n" +
                "  ##                    #           ##        #                #                                    \n" +
                "#              ##    # #             #               #    ##   #                             #      \n" +
                " #       #          #          ##                 #  #                #   #                      #  \n" +
                "       #                   #    #     #               5    #                #   #                   \n" +
                "     #                ## ##                   # #          #      #  # #                   #        \n" +
                "         #                 #   #     #                   #              #                 #         \n" +
                "                       #                                      #      #                          #   \n" +
                "          #            #               ##              #           #          #     #               \n" +
                "#        #     # #  ##          #        #  #                #    #    #               #            \n" +
                "                          #                     #  #    #              #  #  #                 #    \n" +
                "                 #    #             #                  # #   # #      #                       #     \n" +
                "      #         #                          #                                       #       #    #   \n" +
                " #     #   #         #  # #     #                              #         #     #   #        # #  #  \n" +
                "                                    #         #               #  #           # #       #            \n" +
                "                                               #                                       #          # \n" +
                "            #      #                   #       # #              #             #      #   # #        \n" +
                "                        #       #       #                                #                       #  \n" +
                "     #       #          #  #    #     ##                  #          #        # #   #      #   #   #\n" +
                "         #       #             #  #            #   #                                  #     #       \n" +
                "          #                                      #                                      #           \n" +
                "   #          # #    #                # #                    #     #                     #     #    \n" +
                "             #     #           #            #     #                                             #  #\n" +
                "   #        ## # #         # #      #             # #      ##                             # ##   #  \n" +
                "            # #      #   #                      #        #      1              #  #    #            \n" +
                "      #             #                               #      #         #       #                  4   \n" +
                "    #             #   ##   #                   #                  ##                 ##  ##      #  \n" +
                "          #     #      #    #                                                 #            #     ## \n" +
                "      #   #    #                                                             G               #    # \n" +
                "  ##      #            ##    # #         #                      ##    ###    #   #           #      \n" +
                "       #                  #     # #   # #                       ##    #      #                    # \n" +
                "                    #           #           #   #       #  #                                    #  #\n" +
                "               #     #              #              #   #                  #                     #   \n" +
                "              #    #         #                         #                 ##  #             #        \n" +
                "          #  #           #       #            # ##                   ##                #           #\n" +
                "       #   #                            #                 ## #    #       #         # #             \n" +
                "            ###                      #    #      #   #    #               ##   # #  #        #      \n" +
                "  #       #      #     #           ##    ##      #                       #  #  #                  # \n" +
                "                   # #        #                #  #   ##               #                      #   # \n" +
                "        #              #   #     #               ##    #     #          #                           \n" +
                "    # ##   #        #  ##                     #                               #       #        #    \n" +
                "#         # #     # #         #                            # #          #   #    #  #     #         \n" +
                "          # #  ##               #             #         #              #                       #   #\n" +
                "                #    #              #                        # #           #         #              \n" +
                "                   #                 #    #                  #         #             # #    #    #  \n" +
                "                    #        #  #               #                ##     ##     ##           # #   # \n" +
                "#             #     #                #                                 # # #                        \n" +
                "    ##                        #        # #   #       #     #  #     #           #   #   #   #       \n" +
                "            #       #                      #           #     #           #                          \n" +
                " #                 #           ##      #           #  #             #     #                     #   \n" +
                "      #        ##                         #        # #        #          #     #          #         \n" +
                "      #              #            #            ##       #     ##                               ##   \n" +
                "      #         #                           #                   ##                               #  \n" +
                "                         #         #   #          #  #                  #            # #            \n" +
                "     #    #       #  #           #  # #            #  #   #        #                 #         #    \n" +
                "                                       #  #  #              # # #  #   #              #           # \n" +
                "              0   #       #         #   #              #   #  ##            #       ## #            \n" +
                "   #         #          #         #     #      #   # # #             #                    #         \n" +
                "                #                #           #     #  #       #        #   #                   #    \n" +
                "                      #              #                   #           #       #                      \n" +
                "    # ##                 #       #    ##  #      #   #                         # ##       #       # \n" +
                "        #        #   #    #  #       #                               ##         #                   \n" +
                "#                       #             #      # #           ##          ##       # #3        #  #    \n" +
                "              #     #          #  # # #             #    #                       #          #       \n" +
                "     ##                 #    #   #     #       #     #   #    #                       #   #  #      \n" +
                "                                 #   ##  #          ## #                    ##              #       \n" +
                "                                  #                     ##  # #                    #   # #          \n" +
                "   #       ##                #   # #                       #    #    #     #             #     ##   \n" +
                "          ##  ### #    #      #    #         #  #      ## #     #   #   #            #              \n" +
                "                                    # #                #    #       # # #                       #  #\n" +
                "                         #   #  #              #       #  #   #       #     #                       \n" +
                "  #               #                #              #  #    # #    #   #            #        #        \n" +
                "    #  # #   #  #                                # #                    # ##           #  #        #\n" +
                "      #         #        ##                         #             #     #    #                      \n" +
                "#              2                                      #            #     ##                         \n" +
                "                 #               #  ## #             #                              #               \n" +
                "                      #               #    #          #  #        #    #  #                     #   \n" +
                "                   #  #           #        #       #            #                #       # #        \n" +
                "       #    #                     # #            #        #          #                              \n" +
                "             #       ##          #                 # #     ##                    #                  \n" +
                "#            #  #               #                #  #                 #   #                    #    \n" +
                "       #     #        #     ###                             #           #                # #    #   \n" +
                "         ###   #        #   #   #       #       #           #         # #              #     #      \n" +
                "     #      ##     # #                  #    # #  #    #    # #               #    #                \n" +
                "  #                   #  #    #   #          #                     #          #             #   #   \n" +
                "  #       #      #                 #                                      #      #         # #      \n");
        Board board = new Ricochet2().loadBoard(scanner);
        Ricochet2.Solution solution = new Ricochet2().new Solution(board.board, board.robots, board.goal);
        assertNotEquals(solution.computeSolution(), "no solution");
    }
    @Test
    public void board_10_breakFree() throws Exception {
        Scanner scanner = new Scanner("37\n" +
                "10\n" +
                "#####################################\n" +
                "#456# # # # # #   #           #     #\n" +
                "#3#7# # # # # # # ### # ##### ### # #\n" +
                "#2#8#       # # #   # # # # # #   # #\n" +
                "#1#9# ####### # ##### ### # ##### ###\n" +
                "#0#         #     #     # #   #     #\n" +
                "######### # ##### ### ### # # ### # #\n" +
                "# # #     # #     #       # #   # # #\n" +
                "# # ### ### ### # # # ### # ##### ###\n" +
                "# #       # #   # # # # #   #       #\n" +
                "# ### # # # # # ####### # # ##### ###\n" +
                "#     # # # ### # # #     #       # #\n" +
                "### # #####     # # # # ### ### # # #\n" +
                "#   # #   # # # #   # # # # #   # # #\n" +
                "# # ### ##### # # ####### ### ### # #\n" +
                "# #   #     # #     #       #   # # #\n" +
                "##### ### ##### ### # # ### # ##### #\n" +
                "# #   # #   # # #     # #         # #\n" +
                "# # # # # ### # ### ##### ### ##### #\n" +
                "#   #           # #   # # #     #   #\n" +
                "##### ######### # ### # ##### ### # #\n" +
                "#     #       #       #         # # #\n" +
                "# ### # ##### # ##### ####### # ### #\n" +
                "# #   #    #  #   # #   #     #   # #\n" +
                "# ######## ## ##### ######### ##### #\n" +
                "# #     #   #   #   #     #     #   #\n" +
                "# ##### # ##### ### ### # ### ### ###\n" +
                "#   #         #     #   #   # #     #\n" +
                "### # ########### ### ##### ### ### #\n" +
                "#     #         #   #   # #     # # #\n" +
                "# ### ##### ##### # # ### ### # # # #\n" +
                "#   #         #   #   #       # #   #\n" +
                "### ####### ##### ####### ### ##### #\n" +
                "# # #   #   #   # #     # # # #     #\n" +
                "# ### ### ### # # # ### ### # ### # #\n" +
                "#             #     #       # #   # G\n" +
                "#####################################\n");
        Board board = new Ricochet2().loadBoard(scanner);
        Ricochet2.Solution solution = new Ricochet2().new Solution(board.board, board.robots, board.goal);
        assertNotEquals(solution.computeSolution(), "no solution");
    }
    @Test
    public void board_6_20_Test() throws Exception {
        Scanner scanner = new Scanner("20\n" +
                "6\n" +
                "   #     # # ##     \n" +
                "       #         #  \n" +
                "    #           ##  \n" +
                "          #  #    # \n" +
                " #        #     #   \n" +
                "5          2 #### ##\n" +
                "     ##   #  #### ##\n" +
                "   #   #     #### ##\n" +
                "           ###### ##\n" +
                "          #  #### G#\n" +
                "             ###   0\n" +
                "  #   #     ##### ##\n" +
                "  #     ##   #### ##\n" +
                "   ## #      #### ##\n" +
                "   #         #### ##\n" +
                "#        3  ########\n" +
                "   #   #            \n" +
                "        ###         \n" +
                "     1          4 # \n" +
                " #        #         \n");
        Board board = new Ricochet2().loadBoard(scanner);
        Ricochet2.Solution solution = new Ricochet2().new Solution(board.board, board.robots, board.goal);
        assertNotEquals(solution.computeSolution(), "no solution");
    }
    @Test
    public void board_2_41_Random() throws Exception {
        Scanner scanner = new Scanner("41\n" +
                "2\n" +
                "## ###    #       #   #   #  #  #     #  \n" +
                "        # #  #     #  ##   ###          #\n" +
                "     ##        #   ##    ##       #    # \n" +
                " # ## # ##  ## #   #   ##  #  ##   # # # \n" +
                " #     ##         # # #   #       #  ##  \n" +
                "   1     # # # ##     #  0      # #      \n" +
                "     #   ####  #  ### ##   #             \n" +
                "   #            #  #    #  #          # #\n" +
                "     # #           #        #    #     # \n" +
                "#       ## # #   ##     #    #           \n" +
                "    #  #      ##  #                ##  # \n" +
                "#              ###      ##      ##  ##  #\n" +
                "     # ###   # #        #          ##  # \n" +
                "        #         ##   #    #           #\n" +
                "  #         ## #     #    ###    #    #  \n" +
                "#   #  ##         #           ##   ##    \n" +
                "    # #       #        #    ## #         \n" +
                "#       #     #      #  ## # #   #    ## \n" +
                "        #  ##      #   # #  #            \n" +
                "    #    # #   # #        # # ####      #\n" +
                "#       #  # # # #    #          ## #    \n" +
                "#  #  #  ####   #    #   #      ## #  #  \n" +
                "        ##  #    #   #       # #  ##     \n" +
                "  #       # #    #  #   #  # #  #    #   \n" +
                "      #   #  #    #            ###      #\n" +
                "#  #      #  #  #   #   #  #    # #     #\n" +
                " # #    ###    ###  # #  ##  # #  #   #  \n" +
                "#    #  ##  #  #  ###     #          #   \n" +
                "#  ## #   # #  #       #   ##    #    #  \n" +
                "   # ###          #  #  ##         # # # \n" +
                "      ##   #    ###   # #   ##  #   #    \n" +
                "  #   #  ##  ##        # #  ##  #   #  # \n" +
                "    # ## #  #       # #   ####    # #    \n" +
                "  # # ##  # #                     # #  # \n" +
                "        # #    #  #    #    #  #         \n" +
                "# # #              #      G # ###  #     \n" +
                "  ### #  #   #  ##   #   #   #    ##     \n" +
                " ##     # #  #     #    #       ## ## #  \n" +
                "  ## ##  #   #  #   # #                ##\n" +
                "     # #     #    # #   ###     # ##   # \n" +
                "#   ##          ##     #  # # #  # #     \n");
        Board board = new Ricochet2().loadBoard(scanner);
        Ricochet2.Solution solution = new Ricochet2().new Solution(board.board, board.robots, board.goal);
        assertNotEquals(solution.computeSolution(), "no solution");
    }
    @Test
    public void board_2_45_Random() throws Exception {
        Scanner scanner = new Scanner("45\n" +
                "2\n" +
                "       # ##    # # #  #           #   #     #\n" +
                " #     ###   # #  #  #  ##  ##  ###   #      \n" +
                "               #  ## #                #  ####\n" +
                "#  #     ####   ## #  #        #        #    \n" +
                "  #                  # #   #   # #          #\n" +
                "  #     #          #  #      ## # ###      # \n" +
                "# ##  # # # ###    #  #    #         # # ##  \n" +
                "    ##    #    #  # ## #  ## # #   #         \n" +
                "           #    ##   #    # # ######     ##  \n" +
                "  # #    #  #  #   # #              #   #  # \n" +
                " #   #      #  #         # ##      #    ## ##\n" +
                "##   #      #  ##  #  ##   ##         #     #\n" +
                "  #    ##     #  #         #      # #        \n" +
                "#  # # ### #  #       #    # # # #  #   #   #\n" +
                "####      #         G    #   ## ## #  #   ## \n" +
                "    #   #   ##       #              #       #\n" +
                " #    #  #  # ##  #  ## #            #       \n" +
                "      #   #        #           ##   #    #  #\n" +
                "   #     #    ##  #   #      # #  #   #   #  \n" +
                " #        # # ##    #           ##      #   #\n" +
                "    ### #           ## ##  #  # ###  # # #   \n" +
                "#  # ##          #    ## #   #    #          \n" +
                " #       #         #        #       ##   #   \n" +
                "      #     ## #  ##   # #    #     ## ##    \n" +
                "  ## #  #   #                      # #    #  \n" +
                "  #  # # # # #  ##    # ## #   ###      #   #\n" +
                "     #         ##### ##    #     #  #  ###   \n" +
                "  #              #      #  #           #    #\n" +
                "     # # #  #  ##   ## ## #            #     \n" +
                "  #        #        #  #    # #   #    #  #  \n" +
                "  # #    # #   ## ##  #  ## #      #  #      \n" +
                "##        # # # #     #        # #   ##    # \n" +
                "   #         #        ###   #           #    \n" +
                "         #  #  ##    # #   #  #   # # #      \n" +
                "   ##  #  ##   ##  #   # ##     # #  # #     \n" +
                "1           #   ##        # #          #  #  \n" +
                "# # # #    #  #     #   #  # #    # #  #  #  \n" +
                "## #      #      ##      #         ##  #     \n" +
                "   ###  ###        ###  ####         ### #   \n" +
                "   ##        #          #                    \n" +
                "#             # #     #           ####   #   \n" +
                " #  ##             #    ##               #   \n" +
                "#  ##     # #      ##     ##          #   #  \n" +
                "#  ##      # #  #      #   #0       #   ## # \n" +
                "     # ###  # #     #        ####    #     ##\n");
        Board board = new Ricochet2().loadBoard(scanner);
        Ricochet2.Solution solution = new Ricochet2().new Solution(board.board, board.robots, board.goal);
        assertNotEquals(solution.computeSolution(), "no solution");
    }
    @Test
    public void board_5_20_Random() throws Exception {
        Scanner scanner = new Scanner("20\n" +
                "5\n" +
                "##   #    #  ##  ## \n" +
                "  #       ## #  ##  \n" +
                "#    ##    ##  G ###\n" +
                "####  #  ##  #   # #\n" +
                "  #   ###  #     ## \n" +
                "        # # # # #   \n" +
                " #   # # # ##  #  ##\n" +
                " # #   ##   ##    ##\n" +
                "#  #           #### \n" +
                "  #    ##   # ######\n" +
                "    # #####   #  ## \n" +
                "     #   ######  ## \n" +
                "   ##   # #    #### \n" +
                "    ##      # # #  #\n" +
                "  #    ##   # ##   #\n" +
                " # ### #  ## 2      \n" +
                "#  #   #  #     ##  \n" +
                "     # #     3## #  \n" +
                "   # 1          ## #\n" +
                "    #4    #0#    # #\n");
        Board board = new Ricochet2().loadBoard(scanner);
        Ricochet2.Solution solution = new Ricochet2().new Solution(board.board, board.robots, board.goal);
        assertNotEquals(solution.computeSolution(), "no solution");
    }
}