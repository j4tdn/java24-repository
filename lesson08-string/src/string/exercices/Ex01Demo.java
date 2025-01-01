package string.exercices;

import java.util.Arrays;

public class Ex01Demo {

    public static void main(String[] args) {
        String s = "hello Vietnam";
        String s1 = "- danang";
        String s2 = "-hue";

        //1. Chieu dai chuoi s:
        System.out.println(s.length());

        //2. Noi chuoi s1 vao s
        //append, concat
        s+=s1;

        //3. Lay mot ki tu tai vi tri index(3) trong s
        System.out.println(s.charAt(3));

        //4. Duyet tung ki tu, tu trong chuoi
        for(int i=0;i<s.length();i++) {
            System.out.print(s.charAt(i) + " ");
        }

        System.out.println(Arrays.toString(s.split("[^a-zA-Z]+")));

        System.out.println("\n=====================");

        //5. Tìm vị trí(chỉ số) xuất hiện đầu tiên, cuối cùng của kí tự  “a” trong chuỗi s
        System.out.println(s.lastIndexOf("a"));
        System.out.println(s.indexOf("a"));

        //6. Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu || kết thúc trong chuỗi s không.
        if(s.startsWith(s1) || s.endsWith(s1)) {
            System.out.println("true");
        }

        // 7. Thay thế chuỗi s1 bằng chuỗi s2 trong  chuỗi s
        System.out.println(s.replace(s1, s2));

        // 8. Loại bỏ các khoảng trắng thừa của chuỗi s3
        String s3 = "       welcome     to         jv24       ";
        s3 = s3.strip().replaceAll("[\\s]+", " ");
        System.out.println(s3);

        // 9. Tạo chuỗi con của chuỗi s bắt đầu từ vị trí số 2
        System.out.println(s.substring(2));

        // 10. Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
        System.out.println(s1.contains(s2));
    }

}
