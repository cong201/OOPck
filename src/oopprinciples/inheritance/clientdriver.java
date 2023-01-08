package oopprinciples.inheritance;

public class clientdriver {
    public static void main(String[] args) {
        //Tạo 2 lớp Shape và Rectangel . Lớp Rectangel sẽ kế thừa hết những tính chất của lớp cha là lớp Shape
        //Lớp Rectangle kế thừa loại hình của Shape và tên của Rectangel kế thừa từ hàm name của Shape
        Rectangle rectangle = new Rectangle();
        rectangle.display();
    }
}
