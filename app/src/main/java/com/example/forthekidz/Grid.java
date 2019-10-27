package com.example.forthekidz;

import android.graphics.Point;

public class Grid {
    private int[][] game;
    private Hedgehog hedgehog;
    private boolean winner;

    /**
     *  Grid: Invalid spots set to 0, Walls set to -1, valid spots set to 1
     */
    public Grid() {
        game = new int[7][9];
        createMotionGrid();
        hedgehog = new Hedgehog(new Point(4, 1), 'E');
        winner = false;
    }

    public void stepForward() {
        int posX = hedgehog.getPos().x;
        int posY = hedgehog.getPos().y;
        if (!isValidMovement()) {
            return;
        } else if (hedgehog.getDirection() == 'E') {
            hedgehog.setPos(posX + 1, posY);
        } else if (hedgehog.getDirection() == 'W') {
            hedgehog.setPos(posX - 1, posY);
        } else if (hedgehog.getDirection() == 'N') {
            hedgehog.setPos(posX, posY - 1);
        } else if (hedgehog.getDirection() == 'S') {
            hedgehog.setPos(posX, posY + 1);
        }
        game[posX][posY] = 0;
        if (game[hedgehog.getPos().x][hedgehog.getPos().y] == 1) {
            winner = true;
        }
    }

    public void turnRight() {
        if (hedgehog.getDirection() == 'E') {
            hedgehog.setDirection('S');
        } else if (hedgehog.getDirection() == 'W') {
            hedgehog.setDirection('N');
        } else if (hedgehog.getDirection() == 'N') {
            hedgehog.setDirection('E');
        } else if (hedgehog.getDirection() == 'S') {
            hedgehog.setDirection('W');
        }
    }

    public void turnLeft() {
        if (hedgehog.getDirection() == 'E') {
            hedgehog.setDirection('N');
        } else if (hedgehog.getDirection() == 'W') {
            hedgehog.setDirection('S');
        } else if (hedgehog.getDirection() == 'N') {
            hedgehog.setDirection('W');
        } else if (hedgehog.getDirection() == 'S') {
            hedgehog.setDirection('E');
        }
    }

    private void createMotionGrid() {
        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[0].length; j++) {
                game[i][j] = 0;
            }
        }
        game[1][4] = -1;
        game[1][6] = -1;
        game[2][3] = -1;
        game[2][4] = -1;
        game[2][6] = -1;
        game[3][1] = -1;
        game[3][2] = -1;
        game[3][6] = -1;
        game[4][4] = -1;
        game[4][5] = -1;
        game[5][1] = -1;
        game[5][2] = -1;
        game[5][3] = -1;

        game[1][5] = 1;
    }

    private boolean isValidMovement() {
        char direction = hedgehog.getDirection();
        int posX = hedgehog.getPos().x;
        int posY = hedgehog.getPos().y;
        if (direction == 'E' && (invalidBounds(posX + 1, posY) || game[posX + 1][posY] == -1)) {
            return false;
        } else if (direction == 'W' && (invalidBounds(posX - 1, posY) || game[posX - 1][posY] == -1)) {
            return false;
        } else if (direction == 'N' && (invalidBounds(posX, posY - 1) || game[posX][posY - 1] == -1)) {
            return false;
        } else if (direction == 'S' && (invalidBounds(posX, posY + 1) || game[posX][posY + 1] == -1)) {
            return false;
        } else {
            return true;
        }
    }

    private boolean invalidBounds(int x, int y) {
        return x < 0 || x >= game[0].length || y < 0 || y >= game.length;
    }
}
