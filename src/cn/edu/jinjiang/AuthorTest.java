package cn.edu.jinjiang;

import cn.edu.jinjiang.bean.Author;
import cn.edu.jinjiang.bean.Book;

import java.util.Arrays;
import java.util.List;

public class AuthorTest {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setName("明朝那些事");
        book1.setPrice(99);
        Book book2 = new Book();
        book2.setName("活着");
        book2.setPrice(99);
        List<Book> books = Arrays.asList(book1, book2);
        Author author1 = new Author("余华", 58, books);
        Author author2 = new Author("潘锋", 23, books);
        List<Author> authors = Arrays.asList(author1, author2);
        System.out.println(authors);
    }
}
