package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex01StringListOperations {
    public static void main(String[] args) {
        List<String> list = mockData();
        String valToBeDeleted = "A";
        //duyet bat dong bo
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }


        //duyet dong bo
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if(s.equals(valToBeDeleted)) {
                iterator.remove();
            }
        }

        list.removeIf(s -> s.equals(valToBeDeleted));
    }

    private static List<String> mockData() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        return list;
    }
}
