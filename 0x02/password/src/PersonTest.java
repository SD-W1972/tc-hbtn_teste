import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PersonTest {

    Person person;

    @BeforeAll
    public void setup() {
        person = new Person();
    }

    @ParameterizedTest(name = "Usuario válido: {0} ")
    @ValueSource(strings = {"PaulMcCartney2", "NeilArms2"})
    void check_user_valid(String username) {
        Assertions.assertTrue(person.checkUser(username));
    }

    @ParameterizedTest(name = "Usuario invalido: {0}")
    @ValueSource(strings = {"Paul#McCartney2", "Neil@Arms2"})
    public void check_user_not_valid(String username){
        Assertions.assertFalse(person.checkUser(username));
    }

    @ParameterizedTest(name = "Senha inválida: {0}")
    @ValueSource(strings = {"123456789", "#$%1234"})
    public void does_not_have_letters(String password){
        Assertions.assertFalse(person.checkPassword(password));
    }

    @ParameterizedTest(name = "Senha inválida: {0}")
    @ValueSource(strings = {"Abcabcdefgh@", "#hbtn@%tc"})
    public void does_not_have_numbers(String password){
        Assertions.assertFalse(person.checkPassword(password));
    }

    @ParameterizedTest(name = "Senha inválida: {0}")
    @ValueSource(strings = {"Abc@123", "12$@gbt"})
    public void does_not_have_eight_chars(String password){
        Assertions.assertFalse(person.checkPassword(password));
    }

    @ParameterizedTest(name = "Senha válida: {0}")
    @ValueSource(strings ={"abC123456$", "Hbtn@1234", "Betty@1#2", "Hbtn@123"})
    public void check_password_valid(String password){
        Assertions.assertTrue(person.checkPassword(password));
    }
}

