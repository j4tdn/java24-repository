package view;

import java.io.File;
import java.io.IOException;

public class Ex05Throws {
    /*
    Runtime exception la class RuntimeException hoac cac class con cua no
    + Khi trong ham co nem ra runtime exception thi cho goi do khong bat buoc phai xu li(nhma phai xu li)

    Compile exception la class CompileException hoac cac IOException va cac class con cua no
    + Khi trong ham co nem ra compile exception thi cho goi no bat buoc phai xu li
     */

    public static void main(String[] args) {
        try {
            createFile("etest??.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createFile(String path) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            file.createNewFile();
        }
    }
}
