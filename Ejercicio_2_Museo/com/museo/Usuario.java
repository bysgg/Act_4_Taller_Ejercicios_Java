package Ejercicio_2_Museo.com.museo;

public class Usuario {
    private String username;
    private String password;
    private String rol; // DIRECTOR, RESTAURADOR, ENCARGADO

    public Usuario(String username, String password, String rol) {
        this.username = username;
        this.password = password;
        this.rol = rol;
    }

    public boolean autenticar(String user, String pass) {
        return this.username.equals(user) && this.password.equals(pass);
    }

    public String getRol() { return rol; }
}