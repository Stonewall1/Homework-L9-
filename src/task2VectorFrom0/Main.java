package task2VectorFrom0;

public class Main {
    public static void main(String[] args) {
        Vector.setDimension(5);
        System.out.println("Coordinate system dimension set at : " + Vector.getDimension());

        Vector vectorLogic = new Vector();
        Vector vector1 = new Vector();
        vector1.vectorCoordinatesGeneration();
        Vector vector2 = new Vector();
        vector2.vectorCoordinatesGeneration();
        vector1.info();

        System.out.printf("vector1 length = %.3f\n" , vector1.vectorLength());
        System.out.printf("vector2 length = %.3f\n" , vector2.vectorLength());

        System.out.printf("Scalar multiplication result of 2 vectors = %.3f\n" ,
                          vectorLogic.scalarMultiplication(vector1 , vector2));

        Vector summedVector = vectorLogic.vectorSum(vector1 , vector2);
        System.out.print("SummedVector coordinates : ");
        for(double coord : summedVector.array){
            System.out.printf("%.0f " , coord);
        }
        System.out.println();

        Vector substractedVector = vectorLogic.vectorMinus(vector1 , vector2);
        System.out.print("SubstractedVector coordinates : ");
        for(double coord : substractedVector.array){
            System.out.printf("%.0f " , coord);
        }
        System.out.println();

        vectorLogic.compareByLength(vector1 , vector2);
    }
}
