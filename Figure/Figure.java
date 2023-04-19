package Figure;

import Figure.Triangle.*;

class Program{
    public static void main(String[] args){
        Figure figure = new Figure();
        figure.DisplayInfo();
        Pentagon pentagon = new Pentagon();
        pentagon.DisplayInfo();
        Hexagon hexagon = new Hexagon();
        hexagon.DisplayInfo();
        Oval oval = new Oval();
        oval.DisplayInfo();
        Circle circle = new Circle();
        circle.DisplayInfo();
        Triangle triangle = new Triangle();
        triangle.DisplayInfo();
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        isoscelesTriangle.DisplayInfo();
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle();
        equilateralTriangle.DisplayInfo();
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.DisplayInfo();
    }
}

public class Figure{
    Figure(){

    }

    public void DisplayInfo(){
        System.out.println("Сейчас я выведу список всех фигур, их особенности и определения.");
        System.out.println();
    }
}

class Pentagon extends Figure{
    String name = "Пятиугольник";
    int corner = 5;

    public void DisplayInfo(){
        System.out.println("Название фигуры - " + name);
        System.out.println("Количество углов - " + corner);
        System.out.println();
    }
}

class Hexagon extends Figure{
    String name = "Шестиугольник";
    int corner = 6;

    public void DisplayInfo(){
        System.out.println("Название фигуры - " + name);
        System.out.println("Количество углов - " + corner);
        System.out.println();
    }
}

class Oval extends Figure{
    String name = "Овал";
    int corner = 0;

    public void DisplayInfo(){
        System.out.println("Название фигуры - " + name);
        System.out.println("Количество углов - " + corner);
        System.out.println();
    }
}

class Circle extends Figure{
    String name = "Окружность";
    int corner = 0;

    public void DisplayInfo(){
        System.out.println("Название фигуры - " + name);
        System.out.println("Количество углов - " + corner);
        System.out.println();
    }
}