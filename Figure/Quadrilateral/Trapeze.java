package Figure.Quadrilateral;

public class Trapeze extends Quadrilateral{
    String name = "Трапеция";
    int corner = 4;
    String definition = "Трапеция — выпуклый четырёхугольник, у которого две стороны параллельны, а две другие стороны не параллельны.";

    public void DisplayInfo() {
        System.out.println("Название фигуры - " + name);
        System.out.println("Количество углов - " + corner);
        System.out.println(definition);
        System.out.println();
    }
}
