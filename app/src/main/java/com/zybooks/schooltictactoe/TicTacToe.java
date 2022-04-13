package com.zybooks.schooltictactoe;

import android.widget.Toast;

public class TicTacToe {
    public static final int GRID_SIZE = 3;

    private boolean is_end = false;

    // Selects that make up the grid
    private boolean[][] mBoxGrid;

    public TicTacToe() {
        mBoxGrid = new boolean[GRID_SIZE][GRID_SIZE];
    }

    public void newGame() {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++)
                mBoxGrid[row][col] = false;
            }
        }

    public void selectBox(int row, int col) {
        mBoxGrid[row][col] = !mBoxGrid[row][col];
    }

    public String getState() {
        StringBuilder boardString = new StringBuilder();
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                char value = mBoxGrid[row][col] ? 'T' : 'F';
                boardString.append(value);
            }
        }

        return boardString.toString();
    }

    public void setState(String gameState) {
        int index = 0;
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                mBoxGrid[row][col] = gameState.charAt(index) == 'T';
                index++;
            }
        }
    }
}
