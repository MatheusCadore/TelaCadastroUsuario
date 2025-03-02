package Model.DAO;

import Model.MyJDBC;
import Model.Usuario;

import java.sql.*;
import java.util.ArrayList;
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
        Connection connection = MyJDBC.getConnection();

        String sql = "SELECT id_user, user_name, password, last_name, fone, cpf, email, age FROM users";

        List<Usuario> employees = new ArrayList<>();

        Statement stmt = connection.createStatement();

        ResultSet rs = stmt.executeQuery(sql);

        while(rs.next()) {
            int oid = rs.getInt("id_user");
            String nome = rs.getString("user_name");
            String sobrenome = rs.getString("last_name");
            String fone = rs.getString("fone");
            String cpf = rs.getString("cpf");
            int idade = rs.getInt("age");
            String email = rs.getString("email");
            String senha = rs.getString("password");

            Usuario usuario = new Usuario(oid, nome, sobrenome, idade, cpf, fone, email, senha);

            employees.add(usuario);
        }

        return employees;
    }

    @Override
    public int salva(Usuario usuario) throws SQLException {
        return 0;
    }

    @Override
    public int insere(Usuario usuario) throws SQLException {
        Connection connection = MyJDBC.getConnection();

        String sql = "INSERT INTO users (id_user, user_name, password, last_name, fone, cpf, email, age) VALUES  (?,?,?,?,?,?,?,?)";

        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setInt(1, usuario.getId());
        ps.setString(2, usuario.getNome());
        ps.setString(3, usuario.getSenha());
        ps.setString(4, usuario.getSobrenome());
        ps.setString(5, usuario.getTelefone());
        ps.setString(6, usuario.getCpf());
        ps.setString(7, usuario.getEmail());
        ps.setInt(8, usuario.getIdade());

        return ps.executeUpdate();

    }

    @Override
    public int atualiza(Usuario usuario) throws SQLException {
        Connection connection = MyJDBC.getConnection();

        String sql = "UPDATE users set user_name = ?, password = ?, last_name = ?, fone = ? , cpf = ?, email = ?, age = ? where id_user = ?";

        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setString(1, usuario.getNome());
        ps.setString(2, usuario.getSenha());
        ps.setString(3, usuario.getSobrenome());
        ps.setString(4, usuario.getTelefone());
        ps.setString(5, usuario.getCpf());
        ps.setString(6, usuario.getEmail());
        ps.setInt(7, usuario.getIdade());
        ps.setInt(8, usuario.getId());

        return ps.executeUpdate();
    }

    @Override
    public int deleta(Usuario usuario) throws SQLException {
        Connection connection = MyJDBC.getConnection();

        String sql = "DELETE FROM users WHERE user_id = ?";

        PreparedStatement ps =  connection.prepareStatement(sql);

        ps.setInt(1,usuario.getId());

        return ps.executeUpdate();
    }
}
