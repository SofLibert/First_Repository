package Figure.Triangle;

public class RightTriangle extends Triangle{
    String name = "Прямоугольный треугольник";
    int corner = 3;
    String definition = "Прямоугольный треугольник — это треугольник, в котором один угол прямой.";

    public void DisplayInfo() {
        System.out.println("Название фигуры - " + name);
        System.out.println("Количество углов - " + corner);
        System.out.println(definition);
        System.out.println();
    }
}
