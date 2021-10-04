import java.util.Scanner;

public class University {

    public static void main(String[] args) {
        Specialty specialty = setSpecialty("student");
        specialty.doWork();
    }

    static Specialty setSpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("teacher")) {
            return new Teacher();
        } else  if (specialty.equalsIgnoreCase("student")) {
            return new Student();
        } else  if (specialty.equalsIgnoreCase("assistant")) {
            return new Assistant();
        } else {
            throw new RuntimeException(specialty + " is unknown specialty...");
        }
    }
}
