package com.company.lcp;

public class WithoutLSP {
    static RectangleTest getRect() {
        return new SquareTest(); // new Rectangle();
    }

    public static void main(String[] args) {
        RectangleTest rectangle = getRect();
        rectangle.setHeight(5);
        rectangle.setWidth(10);
        System.out.println(rectangle.getSquare());
    }
}

class RectangleTest {
    int height;
    int width;

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getSquare() {
        return width * height;
    }
}

class SquareTest extends RectangleTest {
    public void setWidth(int width) {
        this.width = width;
        height = width;
    }
    public void setHeight(int height) {
        this.height = height;
        width = height;
    }
}