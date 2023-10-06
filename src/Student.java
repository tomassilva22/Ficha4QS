/**
 * This class represents a student who parks at the UPT parking lot.
 */
public class Student {

    private String name; // Student's name
    private int number; // Student's number
    private String licensePlate; // Student's car license plate
    private int totalTime; // Total time parked in minutes

    /**
     * Get the student's name.
     *
     * @return The student's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the student's name.
     *
     * @param name The student's name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the student's number.
     *
     * @return The student's number.
     */
    public int getNumber() {
        return number;
    }

    /**
     * Set the student's number.
     *
     * @param number The student's number.
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Get the student's car license plate.
     *
     * @return The student's car license plate.
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * Set the student's car license plate.
     *
     * @param licensePlate The student's car license plate.
     */
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    /**
     * Get the total time parked by the student in minutes.
     *
     * @return The total time parked in minutes.
     */
    public int getTotalTime() {
        return totalTime;
    }

    /**
     * Set the total time parked by the student in minutes.
     *
     * @param totalTime The total time parked in minutes.
     */
    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }
}
