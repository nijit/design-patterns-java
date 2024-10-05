package org.example.designpattern.prototype;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        bs.setShopName("Novelty");
        bs.loadBooksFromDB();


        BookShop bs2 = bs.clone();
        bs2.setShopName("Novelty 2");

        bs.getBookList().remove(0);

        System.out.println(bs2);
        System.out.println(bs);
    }
}
