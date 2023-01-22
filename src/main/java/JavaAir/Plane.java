package JavaAir;

public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public int getBaggageWeight(){
        return planeType.getWeight() / 2;
    }
}
