package FunVectors;

public class Vector {

    private final int x1, x2, y1, y2;

    public Vector(int x1, int x2, int y1, int y2) { // (x1,x2) (y1,y2)
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public Vector(int y1, int y2) {
        this.x1 = 0;
        this.x2 = 0;
        this.y1 = y1;
        this.y2 = y2;
    }

    @Override
    public String toString() {

        return String.valueOf(x1 != 0 && x2 != 0 ? " Координаты начала: (" + x1 + ";" + x2 + ")\r\n" : "") + "  Координаты конца: (" + y1 + ";" + y2 + ")";
    }

    public Vector Вычесть(Vector Z) {
        return new Vector(x1 - Z.x1, x2 - Z.x2, y1 - Z.y1, y2 - Z.y2);
    }

    public Vector Сложить(Vector Z) {
        return new Vector(x1 + Z.x1, x2 + Z.x2, y1 + Z.y1, y2 + Z.y2);
    }

    public Vector ПереносВНачало() {  //  тернарный оператор не работает
        if ((this.x1 != 0) || (this.x2 != 0)) {
            return new Vector(this.y1 - this.x1, this.y2 - this.x2);
        } else {
            return new Vector(this.x1, this.x2, this.y1, this.y2); //обязательно ли возвращать новый вектор?
        }
    }

    public Vector Перенос(int a, int b) {  

        return new Vector(this.x1 + a, this.x2 + a, this.y1 + b, this.y2 + b);

    }

}
