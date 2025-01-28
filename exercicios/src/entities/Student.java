package entities;

public class Student {

    public String name;
    private final double grade1;
    private final double grade2;
    private final double grade3;

public Student(String name, double grade1, double grade2, double grade3) {
    this.name = name;
    this.grade1 = grade1;
    this.grade2 = grade2;
    this.grade3 = grade3;
}

public double finalGrade() {
    return grade1 + grade2 + grade3;
}

public boolean isApproved() {
    return finalGrade() >= 60.0;
}

public double missingPoints() {
    if (isApproved()) {
        return 0.0;
    } else {
        return 60.0 - finalGrade();
    }
}

@Override
public String toString() {
    return "Final Grade = "
            + String.format("%.2f", finalGrade())
            + "\n"
            + ((isApproved()) ? "Pass" : "Failed\nMissing "
            + String.format("%.2f", missingPoints())
            + " Points");
    }
}
