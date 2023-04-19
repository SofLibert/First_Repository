package Figure.Quadrilateral;

public class Quadrilateral{
    String name = "Четырёхугольник";
    int corner = 4;
    String definition = "Четырёхугольник - это геометрическая фигура, состоящая из четырёх точек, никакие три из которых не лежат на одной прямой, и четырёх отрезков, последовательно соединяющих эти точки.";

    public Quadrilateral(){

    }

    public void DisplayInfo() {
        System.out.println("Название фигуры - " + name);
        System.out.println("Количество углов - " + corner);
        System.out.println(definition);
        System.out.println();
    }
}
