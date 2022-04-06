import com.company.Motorcycle;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotorcycleTest {

    Motorcycle motorcycle;

    @BeforeEach
    public void createMotorcycle(){
        motorcycle = new Motorcycle("Yamaha", 35000, 150);
    }

    @Test
    public void testGetModel(){
        assertEquals("Yamaha", motorcycle.getModel());
    }

    @Test
    public void testSetModel(){
        motorcycle.setModel("BMW");
        assertEquals("BMW", motorcycle.getModel());
    }

    @Test
    public void testGetPrice(){
        assertEquals(35000, motorcycle.getPrice());
    }

    @Test
    public void testSetPrice(){
        motorcycle.setPrice(40000);
        assertEquals(40000, motorcycle.getPrice());
    }

    @Test
    public void testGetWeight(){
        assertEquals(150, motorcycle.getWeight());
    }

    @Test
    public void testSetWeight(){
        motorcycle.setWeight(100);
        assertEquals(100, motorcycle.getWeight());
    }
}
