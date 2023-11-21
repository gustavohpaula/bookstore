package bookstore.domain.book.entitie;

import bookstore.domain.book.entitie.author.AuthorDTO;

public class MiniBookDTO extends BookDTO {
    public MiniBookDTO(String title, Double price, AuthorDTO author) {
        super(title, price, author);
    }

    @Override
    public void doDiscount(Double discountPercentage) {
        throw new UnsupportedOperationException();
    }

}
