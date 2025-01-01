package object.compare;

import bean.Item;

public class Ex01ObjectCompareDemo {
    /*
    Để so sánh giá trị
    +KDL nguyên thuỷ: dùng toán tử ><==
    +KDL đối tượng:
        --> .equals(o): Hàm ở class 'Object" sau đó sẽ override lại
                      : Mặc định so sánh với toán tử == (stack)
                      : Mong muốn so sánh giá trị của đối tượng
                      => 2 đối tượng sẽ equals với nhau khi nào?? tự định nghĩa(ví dụ id, name...)
        --> .CompareTo(o): Hàm ở interface Comparable<T> sau đó sẽ override lại
                         : Mặc định là hàm trừu tượng
     */

    public static void main(String[] args) {
        Item i1 = new Item(2,"Vu");
        Item i2 = new Item(1,"Vu");
        Item i3 = new Item();
        System.out.println(i1.equals(i3));

        System.out.println(i1.compareTo(i2));

        String s1 = "hello";
        String s2 = "hello";

        System.out.println(s1.equals(s2));

    }

}
