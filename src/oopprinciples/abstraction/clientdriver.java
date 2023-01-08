package oopprinciples.abstraction;

public class clientdriver {
    public static void main(String[] args) {
        //Tạo 3 lớp đối tượng là Animal, Dog và Cat, trong đó lớp Animal là lớp trừu tượng.
        //Lớp Animal có một phương thức trừu tượng tên là hienThiTiengKeu() dùng để hiển thị tiếng kêu của từng loài động vật tương ứng
        //Lớp Dog và Cat là 2 lớp kế thừa của lớp Animal, 2 lớp này khi mới tạo ra sẽ có nội dung lớp như phần code trong lớp Dog
        //khi lớp Dog kế thừa lớp Animal mới được tạo ra nó sẽ kế thừa lại phương thức trừu tượng của lớp cha thông qua sự ghi đè phương thức đó( hienThiTiengkeu())
        //Nếu chúng ta xóa bỏ phương thức này trong lớp Dog thì hệ thống sẽ báo lỗi
        //lớp cha có những phương thức trừu tượng nào thì lớp con cũng phải có phương thức trừu tượng đó (phải có override)
        Dog dog = new Dog();
        dog.hienThiTiengKeu();

        Cat cat = new Cat();
        cat.hienThiTiengKeu();
    }
}
