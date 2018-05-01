package com.hikvision.rensu.algorithms.leetcode.basic.array;

import org.junit.Assert;
import org.junit.Test;

public class Sudoku {
    /**
     * 判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。
     * 数字 1-9 在每一行只能出现一次。
     * 数字 1-9 在每一列只能出现一次。
     * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
     *
     * @param board
     * @return true: is Valid
     */
    public boolean isValidSudoku(char[][] board) {

        if (isVerticalValid(board) && isHorizonValid(board) && isBlockValid(board)) {
            return true;
        }

        return false;
    }

    private boolean isBlockValid(char[][] board) {

        for (int i = 0; i < 9; i++) {
            char[] v = new char[9];
            for (int j = 0; j < 9; j++) {
                v[j] = board[3 * (i / 3) + j / 3][3 * (i % 3) + j % 3];
            }
            if (hasDuplicate(v)) {
                return false;
            }
        }
        return true;
    }

    private boolean isHorizonValid(char[][] board) {
        for (int i = 0; i < 9; i++) {
            char[] line = board[i];
            if (hasDuplicate(line)) {
                return false;
            }
        }
        return true;
    }

    private boolean isVerticalValid(char[][] board) {
        for (int i = 0; i < 9; i++) {
            char[] v = new char[9];
            for (int j = 0; j < 9; j++) {
                v[j] = board[j][i];
            }
            if (hasDuplicate(v)) {
                return false;
            }
        }
        return true;
    }

    private boolean hasDuplicate(char[] line) {
        for (int i = 0; i < line.length; i++) {
            char k = line[i];
            if (k != '.') {
                for (int j = i + 1; j < line.length; j++) {
                    if (k == line[j]) {
                        return true;
                    }
                }
            }
        }

        return false;
    }


    @Test
    public void test() {
        char[][] a = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        char[][] b = {
                {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        char[][] c = {
                {'.', '4', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '4', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '1', '.', '.', '7', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '3', '.', '.', '.', '6', '.'},
                {'.', '.', '.', '.', '.', '6', '.', '9', '.'},
                {'.', '.', '.', '.', '1', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '2', '.', '.'},
                {'.', '.', '.', '8', '.', '.', '.', '.', '.'}
        };

        char[][] d = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        Sudoku t = new Sudoku();
        //Assert.assertTrue(t.isValidSudoku(a));
        //Assert.assertFalse(t.isValidSudoku(b));
        //Assert.assertFalse(t.isValidSudoku(c));
        Assert.assertTrue(t.isValidSudoku(d));
//
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                int p = 3 * (i / 3) + j / 3;
//                int q = 3 * (i % 3) + j % 3;
//                String k = Integer.toString(p) + ' ' + Integer.toString(q);
//                System.out.println(k);
//
//            }
//
//        }
    }
}
