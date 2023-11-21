package bookstore.domain.book.entitie;

import bookstore.domain.book.entitie.author.AuthorDTO;

public class PhysicalBookDTO extends BookDTO {
    public PhysicalBookDTO(String title, Double price, AuthorDTO author) {
        super(title, price, author);
    }

    public double getPrintingFee() {
        return this.getPrice() * 0.05;
    }

    @Override
    public void doDiscount(Double discountPercentage) {
        if (discountPercentage > 0.3) {
            throw new IllegalArgumentException("O desconto não pode ser maior que 30%");
        }
        changePrice(getPrice() - getPrice() * discountPercentage);
    }
}
