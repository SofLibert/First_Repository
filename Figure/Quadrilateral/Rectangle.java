package Figure.Quadrilateral;

public class Rectangle extends Quadrilateral{
    String name = "Прямоугольник";
    int corner = 4;
    String definition = "Прямоугольник — четырёхугольник, у которого все углы прямые.";

    public void DisplayInfo() {
        System.out.println("Название фигуры - " + name);
        System.out.println("Количество углов - " + corner);
        System.out.println(definition);
        System.out.println();
    }
}
