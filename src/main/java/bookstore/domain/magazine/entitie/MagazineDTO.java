package bookstore.domain.magazine.entitie;


import bookstore.domain.interfaces.Product;

public class MagazineDTO implements Product {

    private String name;
    private String description;
    private Double price;
    private PublishingCompanyDTO publishingCompany;

    public MagazineDTO(String name, Double price, PublishingCompanyDTO publishingCompany) {
        this.name = name;
        this.price = price;
        this.publishingCompany = publishingCompany;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public PublishingCompanyDTO getPublishingCompany() {
        return publishingCompany;
    }

    public void doDiscount(double percentage){
        if(percentage >0.1){
            throw new IllegalArgumentException("O desconto não pode ser maior que 10%");
        }
        double discount = price * percentage;
        this.price -= discount;
    }
}
