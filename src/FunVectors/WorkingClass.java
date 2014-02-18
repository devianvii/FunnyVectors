package FunVectors; 

public class WorkingClass {

    public static void main(String[] args) {
        Vector c1 = new Vector(5, 3,4);
          Vector c2 = new Vector(1,1,1,5, 3,3);
        System.out.println("Имеем вектора:\r\nВектор 1:\r\n" +c1 +"\r\nВектор 2:\r\n "+c2);
        System.out.println("\r\nСложим вектора 1 и 2\r\nПолучим вектор:"+c1.Сложить(c2));
        System.out.println("\r\nСложим вектора 1 и 2\r\nПолучим вектор:"+c1.Вычесть(c2));

    }


    
}
