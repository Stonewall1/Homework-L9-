package task1AnyPositionVector;

public class Vector2D extends Vector{
    final String info = "This is Vector is 2D system";
    public Vector2D(Coordinates startPoint, Coordinates endPoint) {
        super(startPoint, endPoint);
    }
    public Vector2D(){

    }
    public double vectorLength() {
        return Math.sqrt((endPoint.x - startPoint.x) * (endPoint.x - startPoint.x) +
                (endPoint.y - startPoint.y) * (endPoint.y - startPoint.y));
    }
   public double scalarMultiplication(Vector2D vector1, Vector2D vector2) {
        return (vector1.endPoint.x - vector1.startPoint.x) * (vector2.endPoint.x - vector2.startPoint.x) +
                (vector1.endPoint.y - vector1.startPoint.y) * (vector2.endPoint.y - vector2.startPoint.y);
    }
    public Vector2D vectorSum(Vector2D vector1 , Vector2D vector2){
        Coordinates startP = new Coordinates(
                vector1.startPoint.x + vector2.startPoint.x ,
                vector1.startPoint.y + vector2.startPoint.y);
        Coordinates endP = new Coordinates(
                vector1.endPoint.x + vector2.endPoint.x ,
                vector1.endPoint.y + vector2.endPoint.y);
        return new Vector2D(startP , endP);
    }
    public Vector2D vectorDiff(Vector2D vector1 , Vector2D vector2){
        Coordinates startP = new Coordinates(
                vector1.startPoint.x - vector2.startPoint.x ,
                vector1.startPoint.y - vector2.startPoint.y);
        Coordinates endP = new Coordinates(
                vector1.endPoint.x - vector2.endPoint.x ,
                vector1.endPoint.y - vector2.endPoint.y );
        return new Vector2D(startP , endP);
    }
    public void compareByLength(Vector2D vector1 , Vector2D vector2){
        if(vector1.vectorLength() > vector2.vectorLength()){
            System.out.println("Vector1 > Vector2");
        }
        else if(vector1.vectorLength() < vector2.vectorLength()){
            System.out.println("Vector1 < Vector2");
        }
        else System.out.println("Vector1 = Vector2");
    }
    public static Vector2D[] randomVectors(int n) {
        Vector2D[] arrayOfRandomVectors = new Vector2D[n];
        for (int i = 0; i < arrayOfRandomVectors.length; i++) {
            double x1 = Math.random()*100 + 1;
            double y1 = Math.random()*100 + 1;
            double x2 = Math.random()*100 + 1;
            double y2 = Math.random()*100 + 1;
            Coordinates start = new Coordinates(x1 , y1);
            Coordinates end = new Coordinates(x2 , y2);
            arrayOfRandomVectors[i] = new Vector2D(start , end);
        }
        return arrayOfRandomVectors;
    }

    @Override
    public void info() {
        System.out.println(info);
        System.out.println("Coordinates of start point : " + this.startPoint.x + ";" + this.startPoint.y);
        System.out.println("Coordinates of end point : " + this.endPoint.x + ";" + this.endPoint.y);
        System.out.println("Vector length = " + this.vectorLength());
    }
}
