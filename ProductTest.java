import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private Product product;

    @BeforeEach
    void setUp() {
        product = new Product("Pipeweed", "Long Bottom Leaf", "000001", 600.00);
    }

    @Test
    void testCONSTRUCTORANDGETTERS(){
        assertEquals("Pipeweed", product.getName());
        assertEquals("Long Bottom Leaf", product.getDescription());
        assertEquals("000001", product.getID());
        assertEquals(600.00, product.getCost(), 0.001);
    }

    @Test
    void testSETTERS(){
        product.setName("Lembas");
        product.setDescription("Eleven Wayfare Bread");
        product.setCost(200.00, product.getCost(), 0.001);
    }

    @Test
    void toCSV() {
        String expected = "000001,Pipeweed,Long Bottom Leaf,600.00";
        assertEquals(expected, product.toCSV());
    }

    @Test
    void toJSON() {
        String expected = "{\"ID\":\"000001\",\"Name\":\"Pipeweed\",\"Description\":\"Long Bottom Leaf\",\"Cost\":600.00}";
        assertEquals(expected, product.toJSON());
    }

    @Test
    void toXML() {
        String expected = "<product><ID>000001</ID><Name>Pipeweed</Name><Description>Long Bottom Leaf</Description><Cost>600.00</Cost></product>";
        assertEquals(expected, product.toXML());
    }

    @Test
    void testToString() {
        String expected = "Product{ID='000001', Name='Pipeweed', Description='Long Bottom Leaf', Cost=600.00}";
        assertEquals(expected, product.toString());
    }

}