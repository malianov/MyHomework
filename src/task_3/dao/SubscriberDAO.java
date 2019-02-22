package task_3.dao;

import task_3.model.Model;

public interface SubscriberDAO {
    void create(Model user) throws IllegalArgumentException, DAOException;
}
