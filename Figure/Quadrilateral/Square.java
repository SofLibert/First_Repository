package Figure.Quadrilateral;

public class Square extends Quadrilateral{
    String name = "Квадрат";
    int corner = 4;
    String definition = "Квадрат — правильный четырёхугольник, то есть плоский четырёхугольник, у которого все углы и все стороны равны.";

    public void DisplayInfo() {
        System.out.println("Название фигуры - " + name);
        System.out.println("Количество углов - " + corner);
        System.out.println(definition);
        System.out.println();
    }
}
