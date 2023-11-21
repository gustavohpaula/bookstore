package bookstore.domain.book.entitie;

import bookstore.domain.book.entitie.author.AuthorDTO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MiniBookDTOTest {

    private MiniBookDTO book;

    @Before
    public void setUp() {
        AuthorDTO author = new AuthorDTO("Rodrigo Turini", "rodrigo.turini@caelum.com.br", "123456789");
        book = new MiniBookDTO("Java 8 pratico", 39.90, author);
    }

    @Test
    public void mustDoDiscount() {
        double expect = 39.90;

        book.doDiscount(0.3);
        double result = book.getPrice();

        Assert.assertEquals(result, expect, 2);
    }
}
