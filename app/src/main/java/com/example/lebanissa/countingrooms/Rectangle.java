package com.example.lebanissa.countingrooms;

/**
 * Created by lebanissa on 2017-07-08.
 */

public class Rectangle {

    private int width;
    private int height;

    public Rectangle(){
        this.width = 0;
        this.height = 0;

    }

    public Rectangle (int width ,int height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle rectangle){
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getArea(){
        return this.width*this.height;
    }


    public String toString() {
        return "Rectangle of width" + this.width + "and height" + this.height;
    }

    public void scale (int factor){
        this.width = this.width * factor;
        this.height = this.height *factor;
    }
}
