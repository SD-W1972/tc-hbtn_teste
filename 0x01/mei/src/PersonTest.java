import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class PersonTest {
    Person person = new Person();
    @BeforeEach
    public void setup(){

        person.setName("Paul");
        person.setSurname("McCartney");
        person.setBirthDate(new Date(100, 0, 1));
        person.setAnotherCompanyOwner(true);
        person.setPublicServer(true);

    }

    @Test
    public void show_full_name(){
        Assertions.assertEquals("Paul McCartney", person.fullName());
    }

    @Test
    public void teste_calculateYearlySalary(){
        person.setSalary(1200);
        Assertions.assertEquals(14400, person.calculateYearlySalary());
    }
}
