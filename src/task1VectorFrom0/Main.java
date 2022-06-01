package task1VectorFrom0;

public class Main {
    public static void main(String[] args) {
        // 3D Vector
        Vector3D vectorLogic = new Vector3D();
        Vector3D vector1 = new Vector3D(4 , 8 , 29);
        Vector3D vector2 = new Vector3D(1 , 4 , 3);
        System.out.printf("vector1 length = %.3f\n" , vectorLogic.vectorLength(vector1));
        System.out.printf("Scalar multiplication of 2 vectors = %.3f\n" , vectorLogic.scalarMultiplication(vector1 , vector2));
        Vector3D[] arrayOfRandomVectors = Vector3D.randomVectors(5);
        for (Vector3D vector : arrayOfRandomVectors) {
            System.out.printf("Random vector = %.0f;%.0f;%.0f\n", vector.getX(), vector.getY(), vector.getZ());
        }
        Vector3D summedVector = vectorLogic.vectorSum(vector1 , vector2);
        Vector3D substractedVector = vectorLogic.vectorMinus(vector1 , vector2);
        System.out.println("Result vector after summing 2 vectors = " + summedVector.getX() + ";" + summedVector.getY() + ";" + summedVector.getZ());
        System.out.println("Result vector after substracting 2 vectors = " + substractedVector.getX() + ";" + substractedVector.getY() + ";" + substractedVector.getZ());

        vectorLogic.compare(vector1 , vector2);
        vector1.info();

        // 2D Vector
        System.out.println();
        Vector2D vectorLogic1 = new Vector2D();
        Vector2D vector3 = new Vector2D(7 , 9 );
        Vector2D vector4 = new Vector2D(3 , 80 );
        System.out.printf("vector3 length = %.3f\n" , vectorLogic1.vectorLength(vector3));
        System.out.printf("Scalar multiplication of 2 vectors = %.3f\n" , vectorLogic1.scalarMultiplication(vector3 , vector4));
        Vector2D[] arrayOfRandomVectors1 = Vector2D.randomVectors(5);
        for (Vector2D vector : arrayOfRandomVectors1) {
            System.out.printf("Random vector = %.0f;%.0f;\n", vector.getX(), vector.getY());
        }
        Vector2D summedVector1 = vectorLogic1.vectorSum(vector3 , vector4);
        Vector2D substractedVector1 = vectorLogic1.vectorMinus(vector3 , vector4);
        System.out.println("Result vector after summing 2 vectors = " + summedVector1.getX() + ";" + summedVector1.getY());
        System.out.println("Result vector after substracting 2 vectors = " + substractedVector1.getX() + ";" + substractedVector1.getY());

        vectorLogic1.compare(vector3 , vector4);
        vector3.info();
    }
}
