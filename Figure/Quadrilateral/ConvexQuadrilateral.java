package Figure.Quadrilateral;

public class ConvexQuadrilateral extends Quadrilateral{
    String name = "Выпуклый четырёхугольник";
    int corner = 4;
    String definition = "Выпуклый четырёхугольник — четырехугольник, который находится в одной полуплоскости относительно прямой, содержащей любую его сторону.";

    public void DisplayInfo() {
        System.out.println("Название фигуры - " + name);
        System.out.println("Количество углов - " + corner);
        System.out.println(definition);
        System.out.println();
    }
}
