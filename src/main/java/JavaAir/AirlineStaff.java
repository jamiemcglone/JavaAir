package JavaAir;

public abstract class AirlineStaff {

    private String name;

    private StaffRank rank;

    public AirlineStaff(String name, StaffRank rank) {
        this.name = name;
        this.rank = rank;
    }

}
