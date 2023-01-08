package oopprinciples.encapsulation;

public class clientdriver {
    public static void main(String[] args) {

        //Một lớp Student chỉ có 1 trường và các phương thức setter và getter của chúng
        Student s = new Student();
        s.setName("Cong");
        System.out.println(s.getName());
    }
}
