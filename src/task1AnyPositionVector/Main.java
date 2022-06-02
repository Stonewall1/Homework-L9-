package task1AnyPositionVector;

public class Main {
    public static void main(String[] args) {
        // Working with 3D Vector
        Coordinates startPoint1 = new Coordinates(3, 2, 13);
        Coordinates endPoint1 = new Coordinates(7, 8, 20);
        Vector3D vector1 = new Vector3D(startPoint1, endPoint1);

        Coordinates startPoint2 = new Coordinates(5, 0, 9);
        Coordinates endPoint2 = new Coordinates(1, 3, 11);
        Vector3D vector2 = new Vector3D(startPoint2, endPoint2);
        Vector3D vector3DLogic = new Vector3D();

        System.out.printf("vector1 length = %.3f\n", vector1.vectorLength());
        System.out.printf("vector2 length = %.3f\n", vector2.vectorLength());

        System.out.printf("Result of scalar multiplication of 2 vectors = %.3f\n",
                vector3DLogic.scalarMultiplication(vector1, vector2));

        Vector3D summedVector = vector3DLogic.vectorSum(vector1, vector2);
        System.out.println("Result vector after summing 2 vectors : " + " StartPointCoords : " +
                summedVector.startPoint.x + " " +
                summedVector.startPoint.y + " " +
                summedVector.startPoint.z + " EndPointCoords : " +
                summedVector.endPoint.x + " " +
                summedVector.endPoint.y + " " +
                summedVector.endPoint.z);

        Vector3D substractedVector = vector3DLogic.vectorDiff(vector1, vector2);
        System.out.println("Result vector after substracting 2 vectors : " + " StartPointCoords : " +
                substractedVector.startPoint.x + " " +
                substractedVector.startPoint.y + " " +
                substractedVector.startPoint.z + " EndPointCoords : " +
                substractedVector.endPoint.x + " " +
                substractedVector.endPoint.y + " " +
                substractedVector.endPoint.z);

        Vector3D[] vectors = Vector3D.randomVectors(5);
        for(Vector3D vector : vectors){
            System.out.println("StartPointCoords : " +
                             vector.startPoint.x + ";" + vector.startPoint.y + ";" + vector.startPoint.z +
                    " EndPointCoords : " + vector.endPoint.x + ";" + vector.endPoint.y + ";" + vector.endPoint.z);
        }
        vector3DLogic.compareByLength(vector1 , vector2);
        vector1.info();

        //Working with 2D Vector

        Coordinates startPoint3 = new Coordinates(14, 7);
        Coordinates endPoint3 = new Coordinates(3, 10);
        Vector2D vector3 = new Vector2D(startPoint3, endPoint3);

        Coordinates startPoint4 = new Coordinates(52, 8);
        Coordinates endPoint4 = new Coordinates(11, 9 );
        Vector2D vector4 = new Vector2D(startPoint4, endPoint4);
        Vector2D vector2DLogic = new Vector2D();

        System.out.printf("vector3 length = %.3f\n", vector3.vectorLength());
        System.out.printf("vector4 length = %.3f\n", vector4.vectorLength());

        System.out.printf("Result of scalar multiplication of 2 vectors = %.3f\n",
                vector2DLogic.scalarMultiplication(vector3, vector4));

        Vector2D summedVector1 = vector2DLogic.vectorSum(vector3, vector4);
        System.out.println("Result vector after summing 2 vectors : " + " StartPointCoords : " +
                summedVector1.startPoint.x + " " +
                summedVector1.startPoint.y + " " +
                " EndPointCoords : " +
                summedVector1.endPoint.x + " " +
                summedVector1.endPoint.y);

        Vector2D substractedVector1 = vector2DLogic.vectorDiff(vector3, vector4);
        System.out.println("Result vector after substracting 2 vectors : " + " StartPointCoords : " +
                substractedVector1.startPoint.x + " " +
                substractedVector1.startPoint.y + " " +
                " EndPointCoords : " +
                substractedVector1.endPoint.x + " " +
                substractedVector1.endPoint.y );

        Vector2D[] vectors1 = Vector2D.randomVectors(5);
        for(Vector2D vector : vectors1){
            System.out.println("StartPointCoords : " +
                    vector.startPoint.x + ";" + vector.startPoint.y +
                    " EndPointCoords : " + vector.endPoint.x + ";" + vector.endPoint.y);
        }
        vector2DLogic.compareByLength(vector3 , vector4);
        vector3.info();

    }
}
