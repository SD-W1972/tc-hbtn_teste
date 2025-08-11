public class Pessoa {

    public static boolean emailValid(String email){
        if(email.contains(String.valueOf("@")) && (email.length()) <= 50){
            return true;
        }
         throw new IllegalArgumentException("Email inválido !");
    }

    public Pessoa() {
    }
}
