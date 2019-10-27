package com.example.forthekidz;

import android.graphics.Point;

public class Hedgehog {
    private Point pos;
    private char direction;

    public Hedgehog(Point pos, char direction) {
        this.pos = pos;
        this.direction = direction;
    }

    public Point getPos() {
        return pos;
    }

    public char getDirection() {
        return direction;
    }

    public void setPos(int x, int y) {
        this.pos.set(x, y);
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }

    //    public void stepForward() {
//        if (direction == 'E') {
//            this.pos.set(this.pos.x + 1, this.pos.y);
//        } else if (direction == 'W') {
//            this.pos.set(this.pos.x - 1, this.pos.y);
//        } else if (direction == 'N') {
//            this.pos.set(this.pos.x, this.pos.y - 1);
//        } else if (direction == 'S') {
//            this.pos.set(this.pos.x, this.pos.y + 1);
//        }
//    }
//
//    public void turnRight() {
//        if (direction == 'E') {
//            this.direction = 'S';
//        } else if (direction == 'W') {
//            this.direction = 'N';
//        } else if (direction == 'N') {
//            this.direction = 'E';
//        } else if (direction == 'S') {
//            this.direction = 'W';
//        }
//    }
//
//    public void turnLeft() {
//        if (direction == 'E') {
//            this.direction = 'N';
//        } else if (direction == 'W') {
//            this.direction = 'S';
//        } else if (direction == 'N') {
//            this.direction = 'W';
//        } else if (direction == 'S') {
//            this.direction = 'E';
//        }
//    }
}
