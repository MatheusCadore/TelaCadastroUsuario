package Model.DAO;

import Model.MyJDBC;
import Model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UsuarioDAOImpl implements UsuarioDAO {

    @Override
    public Usuario get(int id) throws SQLException {
        Connection connection = MyJDBC.getConnection();
        Usuario usuario = null;

        String sql = "SELECT id_user, user_name, password, last_name, fone, cpf, email, age FROM users WHERE id_user = ?";

        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            int oid = rs.getInt("id_user");
            String nome = rs.getString("user_name");
            String sobrenome = rs.getString("last_name");
            String fone = rs.getString("fone");
            String cpf = rs.getString("cpf");
            int idade = rs.getInt("age");
            String email = rs.getString("email");
            String senha = rs.getString("password");

            usuario = new Usuario(oid, nome, sobrenome, idade, cpf, fone, email, senha);

        }

        return usuario;
    }

    @Override
    public List<Usuario> getAll() throws SQLException {
        return List.of();
    }

    @Override
    public int salva(Usuario usuario) throws SQLException {
        return 0;
    }

    @Override
    public int insere(Usuario usuario) throws SQLException {
        return 0;
    }

    @Override
    public int atualiza(Usuario usuario) throws SQLException {
        return 0;
    }

    @Override
    public int deleta(Usuario usuario) {
        return 0;
    }
}
