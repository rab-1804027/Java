public enum Day {
    Sunday(1), Monday(2), Tuesday(3), Wednesday(4);

    private final int day;

    Day(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

}
