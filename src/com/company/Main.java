package com.company;

public class Main {

    public static void main(String[] args) {
        int a =3;
        int b =4;
        int c = 5;
        int perimeter;
        int semi_per;
        int area;
        int height;
        int median;

        Triangle triangle = new Triangle(3,4,5);
        Triangle triangle2 = new Triangle(5,4,3);

        triangle.setA(4);
        System.out.println("New meaning of A =");
        System.out.println(triangle.getA());

        triangle.setB(5);
        System.out.println("New meaning of B =");
        System.out.println(triangle.getB());

        triangle.setC(7);
        System.out.println("New meaning of C =");
        System.out.println(triangle.getC());

        System.out.println("New Triangle parameters:");
        System.out.println(triangle);

        System.out.println("Perimeter =");
        System.out.println(perimeter = triangle.getPerimeter());

        System.out.println("Semi-perimeter =");
        System.out.println(semi_per = triangle.getSemiPer());

        System.out.println("Area =");
        System.out.println(area = triangle.getArea());

        System.out.println("Height =");
        System.out.println(height = triangle.getHeight());

        System.out.println("Median =");
        System.out.println(median = triangle.getMedian());

    }

}
