import com.company.Dog;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DogTest {
    Dog dog;

    @BeforeEach
    public void initialize(){
        dog = new Dog("Rex", 2);
    }

    @Test
    public void testGetDogName(){
        assertEquals("Rex", dog.getName());
    }

    @Test
    public void testGetDogAge(){
        assertEquals(2, dog.getAge());
    }

    @Test
    public void testSetDogName(){
        dog.setName("Rex");
        assertEquals("Rex", dog.getName());
    }

    @Test
    public void testSetDogAge(){
        dog.setAge(1);
        assertEquals(1, dog.getAge());
    }

    @Test
    public void testSetDogNameEmptyArgs(){
        dog.setName("Jina");
        assertEquals("Jina", dog.getName());
    }

    @Test
    public void testSetDogAgeEmptyArgs(){
        dog.setAge(3);
        assertEquals(3, dog.getAge());
    }
}
