package backtracking;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(count(3,3));
//        path("", 3, 3);
//        System.out.println(pathRet("",3, 3));
//        System.out.println(pathRetDiagonal("", 3, 3));
        boolean[][]  board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}

        };
        pathRestrictions("", board, 0, 0);
    }
    static int count(int row, int col){
        if(row == 1 || col == 1){
            return 1;

        }
        int left = count(row - 1, col);
        int right = count(row, col - 1);
        return left + right;

    }
    static void path(String p, int row, int col){
        if(row == 1 && col == 1){
            System.out.println(p);
            return;
        }
        if(row > 1){
            path(p + 'D', row - 1, col);
        }
        if(col > 1){
            path(p + 'R', row , col - 1);
        }
    }
    static ArrayList<String> pathRet(String p, int row, int col){
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(row > 1){
            list.addAll(pathRet(p + 'D', row - 1, col));
        }
        if(col > 1){
            list.addAll(pathRet(p + 'R', row , col - 1));
        }
        return list;
    }
    static ArrayList<String> pathRetDiagonal(String p, int row, int col){
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(row > 1 && col > 1){
            list.addAll(pathRetDiagonal(p + 'D', row - 1, col - 1));
        }
        if(row > 1){
            list.addAll(pathRetDiagonal(p + 'V', row - 1, col));
        }
        if(col > 1){
            list.addAll(pathRetDiagonal(p + 'H', row , col - 1));
        }
        return list;
    }
    static void pathRestrictions(String p, boolean[][] maze, int row, int col){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(p);
            return;
        }
        if(maze[row][col] == false){  // also can be written as if(!maze[row][col]
            return;
        }
        if(row < maze.length - 1  ){
            pathRestrictions(p + 'D', maze,row + 1, col);
        }
        if(col < maze[0].length - 1){
            pathRestrictions(p + 'R',maze, row , col +1);
        }
    }

}
