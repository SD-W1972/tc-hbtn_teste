import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteEmail {

    @Test
    public void  testar_email_com_arroba(){
        Pessoa pessoa = new Pessoa();
        boolean b = pessoa.emailValid("email@mail.com");

        Assertions.assertTrue(b);
    }

    @Test
    public void testar_email_sem_arroba(){
        Assertions.assertFalse(Pessoa.emailValid("email"));
    }

}
