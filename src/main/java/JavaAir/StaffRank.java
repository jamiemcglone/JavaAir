package JavaAir;

public enum StaffRank {

    CAPTAIN("Captain"),
    FIRSTOFFICER("First Officer"),
    FLIGHTATTENDANT("Flight Attendant");

    private final String rank;

    StaffRank(String rank) {
        this.rank = rank;
    }

}
