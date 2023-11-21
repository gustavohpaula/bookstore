package bookstore.domain.magazine.entitie;

public class PublishingCompanyDTO {

    private String tradingName;
    private String companyName;
    private String cnpj;

    public PublishingCompanyDTO(String tradingName, String companyName, String cnpj) {
        this.tradingName = tradingName;
        this.companyName = companyName;
        this.cnpj = cnpj;
    }

    public String getTradingName() {
        return tradingName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCnpj() {
        return cnpj;
    }
}
