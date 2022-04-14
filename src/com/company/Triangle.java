package com.company;

import java.util.Objects;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle() {
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return a == triangle.a && b == triangle.b && c == triangle.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    public int getPerimeter() {
        return this.getA()+this.getB()+this.getC();
    }

    public int getSemiPer() {     // Search semi-perimeter to get area via a formula of Heron
        return (this.getA()+this.getB()+this.getC())/2;
    }

    public int getArea() {
        int p=8; // result of semi-perimeter
        return (int) Math.sqrt((p-getA())*(p-getB()*(p-getC())));
    }

    public int getHeight() {
        return (2*this.getArea())/this.getA();
    }

    public int getMedian() {
        return (int) Math.sqrt((2*this.getA()*this.getA())+(2*this.getB()*this.getB())-(this.getC()*this.getC()))/2;
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
