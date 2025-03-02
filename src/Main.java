import Model.DAO.UsuarioDAO;
import Model.DAO.UsuarioDAOImpl;
import Model.Usuario;

import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Usuario userSabrina = new Usuario(2,"Sabrina", "Nascimento", 21,
                "11122233344", "47999888777", "sabrina@gmail.com", "senhaForte");

        UsuarioDAO usuarioDAO = new UsuarioDAOImpl();


        try{
            System.out.println( usuarioDAO.getAll());
        } catch (SQLException e){
            System.out.println(e);
        }

    }
}