package task1AnyPositionVector;

import task1VectorFrom0.Informative;

public abstract class Vector  implements Informative {
    Coordinates startPoint;
    Coordinates endPoint;

    public Vector(Coordinates startPoint , Coordinates endPoint){

        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }
    public Vector(){

    }


}
