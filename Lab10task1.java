
package lab10task1;
// Immutable class for failed students
final class ImmutableStudent {
    private final String rollNumber;
    private final String subjectCode;
    private final String subjectName;

    public ImmutableStudent(String rollNumber, String subjectCode, String subjectName) {
        this.rollNumber = rollNumber;
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }
}

// Mutable class for promoted students
class MutableStudent {
    private String rollNumber;
    private String subjectCode;
    private String subjectName;

    public MutableStudent(String rollNumber, String subjectCode, String subjectName) {
        this.rollNumber = rollNumber;
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}

public class Lab10task1 {
    public static void main(String[] args) {
        // Immutable example
        ImmutableStudent failedStudent = new ImmutableStudent("2022F-SE-216", "SE201", "OOP");
        System.out.println("Failed Student - Roll No: " + failedStudent.getRollNumber());

        // Mutable example
        MutableStudent promotedStudent = new MutableStudent("2022F-SE-124", "SE202", "DS");
        System.out.println("Promoted Student - Subject: " + promotedStudent.getSubjectName());

        // Changing details for mutable class
        promotedStudent.setSubjectName("SCD");
        System.out.println("Updated Subject: " + promotedStudent.getSubjectName());
    }
}



