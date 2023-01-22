package JavaAir;

public enum StaffRank {

    CAPTAIN(1),
    FIRSTOFFICER(2),
    FLIGHTATTENDANT(3);

    private final int rank;

    StaffRank(int rank) {
        this.rank = rank;
    }

}
