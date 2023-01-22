package JavaAir;

public class CabinCrewMember extends AirlineStaff{

    public CabinCrewMember(String name, StaffRank rank){
        super(name, rank);
    }

    public String announceLanding(){
        return "Hello passengers, we will land soon";
    }
}
