package FunVectors;

public class Vector {

    private final int x1, x2, x3, y1, y2, y3;
    private Vector vector;

    public Vector(int x1, int x2, int x3, int y1, int y2, int y3) { // (x1,x2,x3) (y1,y2,y3)
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;

        }

    public Vector(int y1, int y2, int y3) {
        this.x1 = 0;
        this.x2 = 0;
        this.x3 = 0;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    public Vector Сложить(Vector Z) {
        Z=Z.ПереносВНачало();
        this.ПереносВНачало(); // ???????
        return new Vector(y1 + Z.y1 , y2 + Z.y2 , y3 + Z.y3);
    }

    public Vector Вычесть(Vector Z) {
        Z=Z.ПереносВНачало();
        this.ПереносВНачало(); // ???????
        return new Vector(y1-Z.y1 , y2 - Z.y2, y3 - Z.y3);
    }

    public double Модуль() {
        return Math.pow(this.y1*this.y1+this.y2*this.y2+this.y3*this.y3,0.5);
    }
    
    public double СкалярноеПроизведение(Vector Z){
        Z=Z.ПереносВНачало();
        this.ПереносВНачало(); // ???????
        return this.y1*Z.y1+this.y2*Z.y2+this.y3*Z.y3;
    }
    
    public Vector ВекторноеПроизведение(Vector Z){
        Z=Z.ПереносВНачало();
        this.ПереносВНачало(); // ???????
        return new Vector(this.y2*Z.y3-this.y3*Z.y2,this.y1*Z.y3-this.y3*Z.y1,this.y1*Z.y2-this.y2*Z.y1);
    }

    private Vector ПереносВНачало() {  //  тернарный оператор не работает
        if ((this.x1 != 0) || (this.x2 != 0) || (this.x3 != 0)) {
            return new Vector(this.y1 - this.x1, this.y2 - this.x2, this.y3 - this.x3);
        } else {
            return new Vector(this.x1, this.x2, this.x3, this.y1, this.y2, this.y3); //обязательно ли возвращать новый вектор?
        }
    }

    @Override
    public String toString() {

        return String.valueOf(x1 != 0 || x2 != 0 || x3 != 0 ? " Координаты начала: (" + x1 + ";" + x2 + ";" + x3 + ")\r\n  Координаты конца:" : "") + "(" + y1 + ";" + y2 + ";" + y3 + ")";
    }

}
