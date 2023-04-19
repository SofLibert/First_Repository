package Figure.Quadrilateral;

public class Parallelogram extends Quadrilateral{
    String name = "Параллелограмм";
    int corner = 4;
    String definition = "Параллелограмм — четырёхугольник, у которого противолежащие стороны попарно параллельны, то есть лежат на параллельных прямых.";

    public void DisplayInfo() {
        System.out.println("Название фигуры - " + name);
        System.out.println("Количество углов - " + corner);
        System.out.println(definition);
        System.out.println();
    }
}
