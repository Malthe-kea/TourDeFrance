package ExamQuestion;

public enum Grade {
    A(1),
    B(2),
    C(3),
    D(4),
    E(5),
    F(6);
    private int gradeNumber;

    Grade(int gradeNumber) {
    }

    public void setGradeNumber(int gradeNumber) {
        this.gradeNumber = gradeNumber;
    }
}
