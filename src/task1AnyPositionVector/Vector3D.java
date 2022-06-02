package task1AnyPositionVector;

public class Vector3D extends Vector {
    final String info = "This is Vector is 3D system";

    public Vector3D(Coordinates startPoint, Coordinates endPoint) {
        super(startPoint, endPoint);
    }

    public Vector3D() {

    }


    public double vectorLength() {
        return Math.sqrt((endPoint.x - startPoint.x) * (endPoint.x - startPoint.x) +
                (endPoint.y - startPoint.y) * (endPoint.y - startPoint.y) +
                (endPoint.z - startPoint.z) * (endPoint.z - startPoint.z));
    }

    public double scalarMultiplication(Vector3D vector1, Vector3D vector2) {
        return (vector1.endPoint.x - vector1.startPoint.x) * (vector2.endPoint.x - vector2.startPoint.x) +
                (vector1.endPoint.y - vector1.startPoint.y) * (vector2.endPoint.y - vector2.startPoint.y) +
                (vector1.endPoint.z - vector1.startPoint.z) * (vector2.endPoint.z - vector2.startPoint.z);
    }
    public Vector3D vectorSum(Vector3D vector1 , Vector3D vector2){
        Coordinates startP = new Coordinates(
                              vector1.startPoint.x + vector2.startPoint.x ,
                              vector1.startPoint.y + vector2.startPoint.y ,
                              vector1.startPoint.z + vector2.startPoint.z);
        Coordinates endP = new Coordinates(
                              vector1.endPoint.x + vector2.endPoint.x ,
                              vector1.endPoint.y + vector2.endPoint.y ,
                              vector1.endPoint.z + vector2.endPoint.z);
        return new Vector3D(startP , endP);
    }
    public Vector3D vectorDiff(Vector3D vector1 , Vector3D vector2){
        Coordinates startP = new Coordinates(
                vector1.startPoint.x - vector2.startPoint.x ,
                vector1.startPoint.y - vector2.startPoint.y ,
                vector1.startPoint.z - vector2.startPoint.z);
        Coordinates endP = new Coordinates(
                vector1.endPoint.x - vector2.endPoint.x ,
                vector1.endPoint.y - vector2.endPoint.y ,
                vector1.endPoint.z - vector2.endPoint.z);
        return new Vector3D(startP , endP);
    }
    public void compareByLength(Vector3D vector1 , Vector3D vector2){
        if(vector1.vectorLength() > vector2.vectorLength()){
            System.out.println("Vector1 > Vector2");
        }
        else if(vector1.vectorLength() < vector2.vectorLength()){
            System.out.println("Vector1 < Vector2");
        }
        else System.out.println("Vector1 = Vector2");
    }
    public static Vector3D[] randomVectors(int n) {
        Vector3D[] arrayOfRandomVectors = new Vector3D[n];
        for (int i = 0; i < arrayOfRandomVectors.length; i++) {
            double x1 = Math.random()*100 + 1;
            double y1 = Math.random()*100 + 1;
            double z1 = Math.random()*100 + 1;
            double x2 = Math.random()*100 + 1;
            double y2 = Math.random()*100 + 1;
            double z2 = Math.random()*100 + 1;
            Coordinates start = new Coordinates(x1 , y1 , z1);
            Coordinates end = new Coordinates(x2 , y2 , z2);
            arrayOfRandomVectors[i] = new Vector3D(start , end);
        }
        return arrayOfRandomVectors;
    }

    @Override
    public void info() {
        System.out.println(info);
        System.out.println("Coordinates of start point : " + this.startPoint.x + ";" + this.startPoint.y + ";" + this.startPoint.z);
        System.out.println("Coordinates of end point : " + this.endPoint.x + ";" + this.endPoint.y + ";" + this.endPoint.z);
        System.out.println("Vector length = " + this.vectorLength());
    }
}
