package chap8;

public class Student {
    String name;
    String address;
    String phone;
    String email;
    public Student() {

    }
    public Student(String name) {
        this.name = name;
    }
    public Student(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return name + " " + address + " " +phone + " " +email;
    }

    public Student[] addStudent() {
        Student[] student = new Student[3];
        student[0] = new Student("Lim");
        student[1] = new Student("Min");
        student[2] = new Student("Sook","Seoul","010xxxxxxxx","lim@asdf.asdf");
        return student;
    }

    //매개변수가 정확히 정해져 있지 앟은 경우에 사용가능 !
    //원래는 public void PrintStudents(Student[]] student) { <- 이거였음 !

    public void PrintStudents(Student... student) {

        for(Student data : addStudent()) {
            System.out.println(data);
        }
        /*
        //
           for(int i=0; i< addStudent().length; i++) {
//            System.out.println(student[i]);
//        }
         */
    }
}


