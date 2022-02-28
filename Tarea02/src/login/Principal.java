package login;

public class Principal {

    public static void main(String[] args) {

        String nombre;
        String apellido;
        String carnet;
        
        Usuario[] usuarios = new Usuario[3];
        
        usuarios[0] = new Usuario("Oliverio", "Macz", 202002019);
        
        
        Login login = new Login(usuarios);
        
        login.setVisible(true);
        
        

    }

}
