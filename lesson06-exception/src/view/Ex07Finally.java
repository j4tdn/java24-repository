package view;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Ex07Finally {
    public static Random rd = new Random();

    public static void main(String[] args) {
        String[] data = mockData(100);
        data[88] = "89, Name89, aa";
        generate("Du lieu sau khi tinh toan", data);
        File file = new File("etest.txt");
        if (!file.exists()) {
            System.out.println("--> File etest is not existed!");
            return;
        }

        System.out.println("Bat dau ghi file......\n");
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
            for (String line : data) {
                fw.write(convert(line) + "\n");
            }

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                    Desktop.getDesktop().open(file);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Ket thuc ghi file!");
    }

    private static String convert(String line) {
        String[] words = line.split(", ");
        int age = Integer.parseInt(words[2]);
        int factor = (age - 18) * 2;
        return line + ", " + factor;
    }

    private static String[] mockData(int n) {
        String[] data = new String[n];
        for (int i = 0; i < n; i++) {
            data[i] = (i + 1) + ", " + "Name" + (i + 1) + ", " + rd.nextInt(18, 25);
        }
        return data;
    }

    private static void generate(String prefix, String[] data) {
        System.out.println(prefix + "--> {");
        for (String str : data) {
            System.out.println("    +" + str);
        }
        System.out.println("}\n");
    }
}
