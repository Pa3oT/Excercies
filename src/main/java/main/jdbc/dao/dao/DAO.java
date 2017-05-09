package main.jdbc.dao.dao;

import java.util.List;

public interface DAO<T> {

    public List<T> selectAll();
    public int deleteById(int id);
    public void insertUser(T entity);
}
