package string.mutable;

public class Ex01StringMutableDemo {

    //String: immutalbe
    //Vấn đề: Với những bài toán liên quan đến cập nhật giá trị của chuỗi
    //        nhiều lần --> tốn vùng nhớ
    //Vd: cho danh sách gồm N phần tử --> Viết hàm + các chuỗi trong danh sách lại với nhau
    //          ["a","b","c","d"]

    //StringBuilder, StringBuffer: Mutable

    public static void main(String[] args) {
        String [] letters = {"a","b","c","d"};
        String immutable ="";
        for(String letter:letters) {
            immutable += letter;
            System.out.println("immutable hash: " + System.identityHashCode(immutable));
        }
        System.out.println(immutable);

        System.out.println("==============================");

        StringBuilder mutable = new StringBuilder();
        for(String letter:letters) {
            mutable.append(letter);
            System.out.println("mutable hash: " + System.identityHashCode(mutable));
        }
        System.out.println(mutable);
    }
}
