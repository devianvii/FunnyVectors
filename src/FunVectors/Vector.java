package FunVectors;

public class Vector {

    private final int a, b, c;
    private Vector vector;

    public Vector(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public Vector Add(Vector other) {

        return new Vector(a + other.a, b + other.b, c + other.c);
    }

    public Vector Subtract(Vector other) {

        return new Vector(a - other.a, b - other.b, c - other.c);
    }

    public double Module() {
        return Math.pow(a * a + b * b + c * c, 0.5);
    }
    
     public Vector multiply(int g) {
        return new Vector(a * g, b * g, c * g); //Умножение вектора на число
    }

    public double MultiplyScalar(Vector other) {

        return this.a * other.a + this.b * other.b + this.c * other.c;
    }

    public Vector MultiplyVector(Vector other) {

        return new Vector(this.b * other.c - this.c * other.b, this.a * other.c - this.c * other.a, this.a * other.b - this.b * other.a);
    }

    @Override
    public String toString() {

        return String.valueOf("(" + a + ";" + b + ";" + c + ")");
    }

}
