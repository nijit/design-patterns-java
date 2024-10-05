package org.example.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
    public String shopName;
    List<Book> bookList = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void loadBooksFromDB(){
        for(int i=1; i<=5; i++){
            Book book = new Book();
            book.setBookId(i);
            book.setBookName("Book-"+ i);
            this.getBookList().add(book);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", bookList=" + bookList +
                '}';
    }

    // Below is shallow copy, if we modify anything in 1 object it will impact other objects as well. so we should avoid it.
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop shop = new BookShop();
        shop.getBookList().addAll(this.getBookList());
        return shop;
    } // This is deep cloning.

}
