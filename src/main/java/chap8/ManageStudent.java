package chap8;

public class ManageStudent {
    public static void main(String[] args) {
//        Student student = new Student();
//        Student[] students = null;
//        students = student.addStudent();
//        student.PrintStudents(students);

        ManageStudent manageStudent = new ManageStudent();
        manageStudent.checkEquals();



    }

    public void checkEquals() {
        Student compare1 = new Student("Min","Seoul","01012345678","qwer@qwer.com");
        Student compare2 = new Student("Min","Seoul","01012345678","qwer@qwer.com");

        if (compare1.equals(compare2)) {
            System.out.println("same");
        } else {
            System.out.println("no same");
            System.out.println(compare1.hashCode());
            System.out.println(compare2.hashCode());
        }
    }
}
