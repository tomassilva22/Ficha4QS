import java.util.ArrayList;

public class StudentManage {

    ArrayList<Student> students;
    int maximumCapacity = 500;

    public StudentManage(int maximumCapacity) {
        students = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        if (students.size() < maximumCapacity) {
            students.add(student);
        } else {
            System.out.println("The park is complete. Access cannot be allowed at this time.");
        }
    }

    private static double calculatePrice(double timeParked) {
        return (timeParked / 15) * 0.10;
    }

    public Student findStudentByLicensePlate(String licensePlate) {
        for (Student student : students) {
            if (student.getLicensePlate().equalsIgnoreCase(licensePlate)) {
                return student;
            }
        }
        return null;
    }

    public void pintStudentsInformation(Student student) {
        if (student != null) {
            double finalPrice = calculatePrice(student.getTotalTime());
            System.out.println("Name: " + student.getName());
            System.out.println("License Plate: " + student.getLicensePlate());
            System.out.println("Valor Pago: " + finalPrice + " €");
        } else {
            System.out.println("Student cannot be find.");
        }
    }
}
