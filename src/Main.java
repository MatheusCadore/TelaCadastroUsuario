import Model.DAO.UsuarioDAO;
import Model.DAO.UsuarioDAOImpl;
import Model.Usuario;

import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       //new PrimeiraTela();

        UsuarioDAO usuarioDAO = new UsuarioDAOImpl();

        try {
            Usuario usuario = usuarioDAO.get(1);
            System.out.println(usuario);
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}