import com.company.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DogTest {

    @Test
    public void testGetDogName(){
        Dog dog = new Dog("Rex", 2);
        assertEquals("Rex", dog.getName());
    }

    @Test
    public void testGetDogAge(){
        Dog dog = new Dog("Rex", 2);
        assertEquals(2, dog.getAge());
    }
}
