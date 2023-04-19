package Figure.Triangle;

public class IsoscelesTriangle extends Triangle {
    String name = "Равнобедренный треугольник";
    int corner = 3;
    String definition = "Равнобедренный треугольник — треугольник, в котором две стороны равны между собой по длине.";

    public void DisplayInfo() {
        System.out.println("Название фигуры - " + name);
        System.out.println("Количество углов - " + corner);
        System.out.println(definition);
        System.out.println();
    }
}
