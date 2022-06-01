package task1VectorFrom0;

public class Vector3D extends Coords implements Informative{
    final String info = "This is vector for 3D system of coordinates";
    public Vector3D(double x, double y, double z) {
        super(x, y, z);
    }
    public Vector3D(){

    }

    public double vectorLength(Vector3D vector) {
        return Math.sqrt(vector.getX() * vector.getX() + vector.getY() * vector.getY() + vector.getZ() * vector.getZ());
    }

    public double scalarMultiplication(Vector3D vector1, Vector3D vector2) {
        return vector1.getX() * vector2.getX() + vector1.getY() * vector2.getY() + vector1.getZ() * vector2.getZ();
    }

    public Vector3D vectorSum(Vector3D vector1, Vector3D vector2) {
        return new Vector3D(vector1.getX() + vector2.getX(),
                vector1.getY() + vector2.getY(),
                vector1.getZ() + vector2.getZ());
    }

    public Vector3D vectorMinus(Vector3D vector1, Vector3D vector2) {
        return new Vector3D(vector1.getX() - vector2.getX(),
                vector1.getY() - vector2.getY(),
                vector1.getZ() - vector2.getZ());
    }

    public static Vector3D[] randomVectors(int n) {
        Vector3D[] arrayOfRandomVectors = new Vector3D[n];
        for (int i = 0; i < arrayOfRandomVectors.length; i++) {
            arrayOfRandomVectors[i] = new Vector3D(Math.random()*100 + 1 ,
                    Math.random()*100 + 1 ,
                    Math.random()*100 + 1);
        }
        return arrayOfRandomVectors;
    }

    public void compare(Vector3D vector1 , Vector3D vector2){
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
        System.out.println("Coordinates : " + this.getX() + ";" + this.getY() + ";" + this.getZ());
        System.out.println("Vector length = " + vectorLength(this));
    }
}
