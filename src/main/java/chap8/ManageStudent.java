package chap8;

public class ManageStudent {
    public static void main(String[] args) {
        Student student = new Student();
        Student[] students = null;
        students = student.addStudent();
        student.PrintStudents(students);
    }
}
