package view;

import functional.Type;
import utils.ArrayUtils;

import java.util.Arrays;

public class Ex04 {

    public static boolean isNumber(String str) {
        return str.matches("^-?\\d+$");
    }

    private static String[] handleSpecial(String[] str) {
        int index = 0;

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("Special")) {
                index = i;
            }
        }

        str = ArrayUtils.remove(str, index);
        str = ArrayUtils.add(str, 0, "Special");

        return str;
    }

    public static String[] sortString(String[] str, Type type) {
        for (int i = 0; i < str.length - 1; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (type.type(str[i], str[j])) {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        return str;
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"-2", "-6", "10", null, "4", "8", null, "Special", "a", "c",
                "b", "xx"};
        String[] arrClone = new String[strings.length];
        String[] res = new String[strings.length];

        int count = 0;

        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) {
                arrClone[count++] = strings[i];
            }
        }

        arrClone = Arrays.copyOf(arrClone, count);

        arrClone = sortString(arrClone,
                (str1, str2) -> isNumber(str1) && isNumber(str2) && Integer.parseInt(str1) > Integer.parseInt(str2));

        arrClone = sortString(arrClone,
                (str1, str2) -> !isNumber(str1) && !isNumber(str2) && ArrayUtils.sumOfAnAscii(str1.getBytes()) > ArrayUtils.sumOfAnAscii(str2.getBytes()));


        arrClone = handleSpecial(arrClone);

        for (int i = 0; i < arrClone.length; i++) {
            res[i] = arrClone[i];
        }

        System.out.println(Arrays.toString(res));

    }

}
