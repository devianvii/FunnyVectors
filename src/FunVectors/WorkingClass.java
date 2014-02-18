package FunVectors; 

public class WorkingClass {

    public static void main(String[] args) {
        Vector c1 = new Vector(5, 3);
          Vector c2 = new Vector(1,1,5, 3);
        System.out.println("Имеем вектора:\r\n Вектор 1:\r\n" +c1 +"\r\nВектор 2:\r\n "+c2);
        System.out.println("\r\nВычтем из вектора 1 вектор 2\r\nПолучим вектор:\r\n"+c1.Вычесть(c2));
        System.out.println("\r\nПеренесем новый вектор в начало координат:\r\n"+(c1.Вычесть(c2)).ПереносВНачало());
        System.out.println("\r\nА теперь сдвинем его чуть выше и чуть правее:\r\n"+((c1.Вычесть(c2)).ПереносВНачало()).Перенос(2,2));
    }


    
}
