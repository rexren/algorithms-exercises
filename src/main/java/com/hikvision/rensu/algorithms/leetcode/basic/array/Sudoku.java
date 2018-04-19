package com.hikvision.rensu.algorithms.leetcode.basic.array;

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
        char[] v = new char[9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                v[i] = board[i][0];
                if (hasDuplicate(v)) {
                    return false;
                }

            }
        }
        return true;
    }

    private boolean isHorizonValid(char[][] board) {
        for (int i = 0; i < 9; i++) {
            char[] line = board[i];
            if (!hasDuplicate(line)) {
                return false;
            }
        }
        return false;
    }

    private boolean isVerticalValid(char[][] board) {
        char[] v = new char[9];
        for (int i = 0; i < 9; i++) {
            v[i] = board[i][0];
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
        int[][] a = {{1, 2, 3}, {4, 3, 5}, {3, 5, 3}};

        for (int i = 0; i < 3; i++) {
            System.out.println(a[i][0]);
        }
        //Sudoku t = new Sudoku();
        //Assert.assertTrue(t.isValidSudoku(a));
    }
}
