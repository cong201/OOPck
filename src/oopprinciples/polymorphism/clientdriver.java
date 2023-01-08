package oopprinciples.polymorphism;

public class clientdriver {
    public static void main(String args[]) {
        //Tạo 2 lớp Bike và Splender , lớp Splender kế thừa lớp Bike và ghi đè phương thức run của lớp Splender
        //Khi nó tham chiếu tới đối tượng của lớp con và phương thức lớp con ghi đè phương thức của lớp cha, phương thức lớp con được gọi lúc runtime
        //Khi việc gọi phương thức được quyết định bởi JVM chứ không phải Compiler, vì thế đó là đa hình lúc runtime.
        //Lúc thay tên trong hàm print của Splender thì trong hàm main print ra tên của Splender nó đã ghi đè lên tên trong hàm print của Bike .
        Bike b = new Splender();
        b.run();
    }
}
