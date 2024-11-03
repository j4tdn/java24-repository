package Ex05;

public class Main {

    public static void main(String[] args) {
        TextBook[] textBooks = {
                new TextBook("SGK01",
                        78000,
                        "Bộ giáo dục",
                        true),
                new TextBook("SGK02",
                        56000,
                        "Văn lang",
                        false),
                new TextBook("SGK03",
                        29000,
                        "Nhi Đồng",
                        true)
        };

        ReferBook[] referBooks = {
                new ReferBook("STK01",
                        34000,
                        "Nhi Đồng",
                        0.18),
                new ReferBook("STK02",
                        18000,
                        "Bộ giáo dục",
                        0.3)
        };


        //Tìm toàn bộ sách thuộc nhà xuất bản Nhi Đồng
        FindBooksByPublisher(textBooks, referBooks, "Nhi Đồng");

        //Tìm toàn bộ sách có đơn giá nhỏ hơn 50000
        findBooksByPrice(textBooks, referBooks, 50000);


    }
    public static void FindBooksByPublisher(TextBook[] textBooks, ReferBook[] referBooks, String publisher) {
        System.out.println("Sách thuộc nhà xuất bản " + publisher + ":");
        for (TextBook book : textBooks) {
            if (book.getPublisher().equals(publisher)) {
                System.out.println(book.getBookID() + " - Giá: " + book.getPrice());
            }
        }
        for (ReferBook book : referBooks) {
            if (book.getPublisher().equals(publisher)) {
                System.out.println(book.getBookID() + " - Giá: " + book.getPrice());
            }
        }
    }
    public static void findBooksByPrice(TextBook[] textBooks, ReferBook[] referBooks, double maxPrice) {
        System.out.println("Sách có đơn giá nhỏ hơn " + maxPrice + ":");
        for (TextBook book : textBooks) {
            if (book.getPrice() < maxPrice) {
                System.out.println(book.getBookID() + " - Giá: " + book.getPrice());
            }
        }
        for (ReferBook book : referBooks) {
            if (book.getPrice() < maxPrice) {
                System.out.println(book.getBookID() + " - Giá: " + book.getPrice());
            }
        }
    }
}
