import java.util.Objects;

public class Test04 {
    public static void main(String[] args) {
        Student s1 = new Student(111, "朝天小学");
        Student s2 = new Student(111, "朝天小学");

        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2)); //true
    }
}

class Student{
    int no;
    String school;

    public Student() {
    }

    public Student(int no, String school) {
        this.no = no;
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", school='" + school + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return no == student.no && Objects.equals(school, student.school);
        //this.school.equals(student.school)
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, school);
    }
}
