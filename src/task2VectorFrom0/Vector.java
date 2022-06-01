package task2VectorFrom0;

public class Vector extends AbsVector implements Informative {
    final String info = "This is Vector for " + dimension + "D" + " system of coordinates";
    private static int dimension;
    double[] array = new double[dimension];

    public static int getDimension() {
        return dimension;
    }

    public static void setDimension(int dimension) {
        Vector.dimension = dimension;
    }

    public void vectorCoordinatesGeneration() {
        System.out.println("Vector Coordinates : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 100 + 1;
            System.out.printf("%.0f  ", array[i]);
        }
        System.out.println();
    }

    public double vectorLength() {
        double sumResult = 0;
        for (double v : array) {
            sumResult = sumResult + v * v;
        }
        return Math.sqrt(sumResult);
    }

    public double scalarMultiplication(Vector vector1, Vector vector2) {
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result + vector1.array[i] * vector2.array[i];
        }
        return result;
    }

    public Vector vectorSum(Vector vector1, Vector vector2) {
        Vector resultVector = new Vector();
        for (int i = 0; i < array.length; i++) {
            resultVector.array[i] = vector1.array[i] + vector2.array[i];
        }
        return resultVector;
    }

    public Vector vectorMinus(Vector vector1, Vector vector2) {
        Vector resultVector = new Vector();
        for (int i = 0; i < array.length; i++) {
            resultVector.array[i] = vector1.array[i] - vector2.array[i];
        }
        return resultVector;
    }

    public void compareByLength(Vector vector1, Vector vector2) {
        if (vector1.vectorLength() > vector2.vectorLength()) {
            System.out.println("Vector1 > Vector2");
        } else if (vector1.vectorLength() < vector2.vectorLength()) {
            System.out.println("Vector1 < Vector2");
        } else System.out.println("Vector1 = Vector2");
    }

    @Override
    public void info() {
        System.out.println("VECTOR INFORMATION!!!");
        System.out.println(info);
        System.out.print("Coordinates : ");
        for (double coord : array) {
            System.out.printf("%.0f  ", coord);
        }
        System.out.println();
    }
}
