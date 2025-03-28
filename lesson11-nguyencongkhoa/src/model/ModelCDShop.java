package model;

import java.util.HashMap;
import java.util.Map;

import bean.CDShop;

public class ModelCDShop {

    public ModelCDShop() {
    }

    public static Map<Integer, CDShop> getCDShop() {
        Map<Integer, CDShop> cdShop = new HashMap<>();
        CDShop cd3 = new CDShop(103, "Jazz", "Single C", 8, 12.49);
        CDShop cd4 = new CDShop(104, "Classical", "Single D", 15, 22.50);
        CDShop cd1 = new CDShop(101, "Pop", "Single A", 10, 15.99);
        CDShop cd6 = new CDShop(106, "Rock", "Single F", 14, 21.99);
        CDShop cd2 = new CDShop(102, "Rock", "Single B", 12, 19.99);
        CDShop cd5 = new CDShop(105, "Pop", "Single E", 10, 17.00);
        CDShop cd9 = new CDShop(109, "Pop", "Single I", 11, 18.50);
        CDShop cd7 = new CDShop(107, "Jazz", "Single G", 9, 14.99);
        CDShop cd8 = new CDShop(108, "Classical", "Single H", 20, 25.00);
        CDShop cd10 = new CDShop(110, "Rock", "Single J", 13, 23.75);

        cdShop.put(cd1.getCDId(), cd1);
        cdShop.put(cd2.getCDId(), cd2);
        cdShop.put(cd3.getCDId(), cd3);
        cdShop.put(cd4.getCDId(), cd4);
        cdShop.put(cd5.getCDId(), cd5);
        cdShop.put(cd6.getCDId(), cd6);
        cdShop.put(cd7.getCDId(), cd7);
        cdShop.put(cd8.getCDId(), cd8);
        cdShop.put(cd9.getCDId(), cd9);
        cdShop.put(cd10.getCDId(), cd10);

        return cdShop;
    }
}
