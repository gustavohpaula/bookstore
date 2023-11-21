package bookstore.domain.book.entitie;

import bookstore.domain.book.entitie.author.AuthorDTO;

import java.util.Objects;

public class EBookDTO extends BookDTO {

    private String waterMark;

    public EBookDTO(String title, Double price, AuthorDTO author, String waterMark) {
        super(title, price, author);
        this.waterMark = waterMark;
    }

    @Override
    public void doDiscount(Double discountPercentage) {
        if (discountPercentage > 0.15) {
            throw new IllegalArgumentException("O desconto não pode ser maior que 15%");
        }
        double discountValue = getPrice() * discountPercentage;
        changePrice(getPrice() - discountValue);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        EBookDTO eBookDTO = (EBookDTO) o;
        return Objects.equals(waterMark, eBookDTO.waterMark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), waterMark);
    }

    @Override
    public String toString() {
        return "EBookDTO{" + "waterMark='" + waterMark + '\'' + '}';
    }
}
