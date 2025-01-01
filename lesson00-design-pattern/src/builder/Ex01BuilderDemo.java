package builder;

public class Ex01BuilderDemo {
    public static void main(String[] args) {
        Item i1 = Item.builder().withId(1).withName("Jack").withQuantity(10).withSalePrice(10000d).withBuyPrice(20000d).build();

        AdvItem advItem = AdvItem.of().withId(10).withName("Jack").withSalePrice(555d);

        System.out.println(i1);
        System.out.println(advItem);
        System.out.println(System.identityHashCode(advItem));
        System.out.println(System.identityHashCode(advItem.withName("Vu")));
        System.out.println("===================\n");
        PvItem pvItem = builder.PvItem.of().withId(10).withName("Jack").withSalePrice(555d);

        System.out.println(pvItem);

        System.out.println(System.identityHashCode(pvItem));
        System.out.println(System.identityHashCode(pvItem.withName("Vu")));
    }
}
