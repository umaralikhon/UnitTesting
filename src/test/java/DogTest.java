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

    @Test
    public void testSetDogName(){
        Dog dog = new Dog("Jina", 3);
        dog.setName("Rex");
        assertEquals("Rex", dog.getName());
    }

    @Test
    public void testSetDogAge(){
        Dog dog = new Dog("Rex", 3);
        dog.setAge(1);
        assertEquals(1, dog.getAge());
    }

    @Test
    public void testSetDogNameEmptyArgs(){
        Dog dog = new Dog();
        dog.setName("Jina");
        assertEquals("Jina", dog.getName());
    }

    @Test
    public void testSetDogAgeEmptyArgs(){
        Dog dog = new Dog();
        dog.setAge(3);
        assertEquals(3, dog.getAge());
    }
}
