package Figure.Quadrilateral;

public class Rhombus extends Quadrilateral{
    String name = "Ромб";
    int corner = 4;
    String definition = "Ромб — это параллелограмм, у которого все стороны равны.";

    public void DisplayInfo() {
        System.out.println("Название фигуры - " + name);
        System.out.println("Количество углов - " + corner);
        System.out.println(definition);
        System.out.println();
    }
}
