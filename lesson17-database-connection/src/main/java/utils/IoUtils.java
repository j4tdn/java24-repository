package utils;

import java.util.Collection;
import java.util.List;

public class IoUtils {
    private IoUtils() {
    }

    public static void close(AutoCloseable... closeables) {
        try {
            for (AutoCloseable closeable : closeables) {
                if (closeable != null) {
                    closeable.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static <Element> void generate(String statement, Collection<Element> elements) {
        System.out.println(statement + "----> {");
        for (Element element : elements) {
            System.out.println(" - " + element);
        }
        System.out.println("}\n");
    }
    public static <Element> void generate(String statement, Element element) {
        if (element == null) {
            System.out.println(statement + "----> không tìm thấy \n");
        } else {
            generate(statement, List.of(element));
        }
    }
}