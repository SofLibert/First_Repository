package Figure.Triangle;

public class EquilateralTriangle extends Triangle{
    String name = "Равносторонний треугольник";
    int corner = 3;
    String definition = "Равносторонний треугольник — это треугольник, все стороны которого равны между собой.";

    public void DisplayInfo() {
        System.out.println("Название фигуры - " + name);
        System.out.println("Количество углов - " + corner);
        System.out.println(definition);
        System.out.println();
    }
}
