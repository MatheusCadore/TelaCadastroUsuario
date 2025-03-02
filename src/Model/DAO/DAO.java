package Model.DAO;

import java.sql.SQLException;
import java.util.List;

public interface DAO<T> {

     T get(int id) throws SQLException;

     List<T> getAll() throws SQLException;

     int salva(T t) throws SQLException;

     int insere(T t) throws  SQLException;

     int atualiza(T t) throws  SQLException;

     int deleta(T t) throws SQLException;
}
