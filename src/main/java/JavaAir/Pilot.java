package JavaAir;

public class Pilot extends AirlineStaff{

    private String PLN;

    public Pilot(String name, StaffRank rank, String PLN){
        super(name, rank);
        this.PLN = PLN;
    }

    public String flyPlane(){
        return "Whoo I am flying";
    }

}
