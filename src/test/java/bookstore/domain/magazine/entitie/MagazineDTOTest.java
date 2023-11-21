package bookstore.domain.magazine.entitie;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MagazineDTOTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    private MagazineDTO magazine;
    @Before
    public void setUp ()
    {
        PublishingCompanyDTO publishingCompany = new PublishingCompanyDTO("Teste", "Testing", "0123456789");
        magazine = new MagazineDTO("Magazine", 30.00, publishingCompany);
    }

    @Test
    public void mustDoDiscount(){

        double expect = 27.00;

        magazine.doDiscount(0.1);
        double result = magazine.getPrice();

        Assert.assertEquals(result, expect, 2);
    }

    @Test
    public void mustThrowExceptionInDiscount () throws IllegalArgumentException
    {

        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("O desconto não pode ser maior que 10%");

        magazine.doDiscount(0.4);


    }
}
