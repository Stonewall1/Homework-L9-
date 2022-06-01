package task1VectorFrom0;

public class Vector2D extends Coords implements Informative{
    final String info = "This is vector for 2D system of coordinates";
    public Vector2D(double x, double y) {
        super(x, y);
    }
    public Vector2D(){

    }

    public double vectorLength(Vector2D vector) {
        return Math.sqrt(vector.getX() * vector.getX() + vector.getY() * vector.getY());
    }

    public double scalarMultiplication(Vector2D vector1, Vector2D vector2) {
        return vector1.getX() * vector2.getX() + vector1.getY() * vector2.getY();
    }

    public Vector2D vectorSum(Vector2D vector1, Vector2D vector2) {
        return new Vector2D(vector1.getX() + vector2.getX(),
                vector1.getY() + vector2.getY());
    }

    public Vector2D vectorMinus(Vector2D vector1, Vector2D vector2) {
        return new Vector2D(vector1.getX() - vector2.getX(),
                vector1.getY() - vector2.getY());
    }

    public static Vector2D[] randomVectors(int n) {
        Vector2D[] arrayOfRandomVectors = new Vector2D[n];
        for (int i = 0; i < arrayOfRandomVectors.length; i++) {
            arrayOfRandomVectors[i] = new Vector2D(Math.random()*100 + 1 ,
                    Math.random()*100 + 1);
        }
        return arrayOfRandomVectors;
    }

    public void compare(Vector2D vector1 , Vector2D vector2){
        if(vectorLength(vector1) > vectorLength(vector2)){
            System.out.println("Vector1 > Vector2");
        }
        else if(vectorLength(vector1) < vectorLength(vector2)){
            System.out.println("Vector1 < Vector2");
        }
        else System.out.println("Vector1 = Vector2");
    }

    @Override
    public void info() {
        System.out.println(info);
        System.out.println("Coordinates : " + this.getX() + ";" + this.getY());
        System.out.println("Vector length = " + vectorLength(this));
    }
}
