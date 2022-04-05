import com.company.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    Car car;

    @BeforeEach
    public void createCar(){
        this.car = new Car(
                "Audi",
                "Black",
                2022,
                500,
                "Tashkent"
                );
    }

    @Test
    public void testGetModel(){
        assertEquals("Audi", car.getModel());
    }

    @Test
    public void testSetColor(){
        car.setColor("Grey");
        assertEquals("Grey", car.getColor());
    }

    @Test
    public void testGetColor(){
        assertEquals("Black", car.getColor());
    }

    @Test
    public void testSetHorser(){
        car.setHorses(400);
        assertEquals(400, car.getHorses());
    }

    @Test
    public void testGetHorses(){
        assertEquals(500, car.getHorses());
    }

    @Test
    public void testGetYear(){
        assertEquals(2022, car.getYear());
    }

    @Test
    public void testGetDiler(){
        assertEquals("Tashkent", car.getDiler());
    }

    @Test
    public void testSetDiler(){
        car.setDiler("Samarkand");
        assertEquals("Samarkand", car.getDiler());
    }

    @Test
    public void getListOfDilers(){
        assertArrayEquals(new String[]{"Tashkent"}, car.getDilers().toArray());
    }

    @Test
    public void getListOfTwoOwners(){
        car.setDiler("Fergana");
        assertArrayEquals(new String[]{"Tashkent", "Fergana"}, car.getDilers().toArray());
    }
}
