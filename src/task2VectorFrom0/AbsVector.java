package task2VectorFrom0;

public abstract class AbsVector {
    public abstract double vectorLength();
    public abstract double scalarMultiplication(Vector vector1, Vector vector2);
    public abstract Vector vectorSum(Vector vector1, Vector vector2);
    public abstract Vector vectorMinus(Vector vector1, Vector vector2);
    public abstract void compareByLength(Vector vector1, Vector vector2);

}
