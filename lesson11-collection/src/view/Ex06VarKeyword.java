package view;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import bean.Item;

public class Ex06VarKeyword {

    public static void main(String[] args) {
        // Khai báo biến thông thường
        int a = 5;
        Integer b = 6;
        String s = "hello";
        Item item = new Item();
        List<String> list = new ArrayList<>();
        Set<Entry<String, Integer>> set = new HashSet<>();

     // Sử dụng từ khóa var
        var a1 = 5;
        var b1 = 6;
        var s1 = "hello";
        var item1 = new Item();

        // là list of objects
        var list1 = new ArrayList<String>();
        var stringList1 = List.of("a", "b", "c");
        var set1 = new HashSet<Entry<String, Integer>>();

        // var x1 = null;
        // void test(var a)

        // var f1 = (v1, v2) -> {
//             return v1 + v2;
        // };

        Test1 f2 = (v1, v2) -> {
            return v1 + v2;
        };

    }
    
    static interface Test1() {
    	int sum (in1 v1, int v2);
    }
}
