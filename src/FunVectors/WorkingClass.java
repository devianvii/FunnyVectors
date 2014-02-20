package FunVectors;

public class WorkingClass {

    public static void main(String[] args) {

        Vector c1 = new Vector(0, 0, 0, 3, 7, 4);
        Vector c2 = new Vector(0, 2, 0, 4, 0, -2);

        System.out.println("Имеем вектора:\r\nВектор 1:\r\n" + c1 + " \r\nВектор 2:\r\n" + c2);
        System.out.println("\r\nВычтем вектора 1 и 2, получим вектор:" + c1.Вычесть(c2));
        System.out.println("Модуль вектора 2: " + c2.Модуль());
        System.out.println("Скалярное произведение векторов 1 и 2: " + c1.СкалярноеПроизведение(c2));
        System.out.println("Векторное произведение векторов 1 и 2: " + c1.ВекторноеПроизведение(c2));
    }

}
