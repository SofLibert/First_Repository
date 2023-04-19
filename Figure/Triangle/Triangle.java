package Figure.Triangle;

public class Triangle{
    String name = "Треугольник";
    int corner = 3;
    String definition = "Треугольник - геометрическая фигура, образованная тремя отрезками, которые соединяют три точки, не лежащие на одной прямой.";

    public Triangle(){

    }

    public void DisplayInfo() {
        System.out.println("Название фигуры - " + name);
        System.out.println("Количество углов - " + corner);
        System.out.println(definition);
        System.out.println();
    }
}

