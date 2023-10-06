public class Student {

    private String name;
    private int number;
    private String licensePlate;
    private int totalTime;

    /**
     *
     * @return student name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return student number
     */
    public int getNumber() {
        return number;
    }

    /**
     *
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     *
     * @return student license plate
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     *
     * @param licensePlate
     */
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    /**
     *
     * @return student total time parked
     */
    public int getTotalTime() {
        return totalTime;
    }

    /**
     *
     * @param totalTime
     */
    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }
}
