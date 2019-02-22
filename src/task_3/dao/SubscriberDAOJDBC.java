package task_3.dao;

import task_3.model.Model;

public class SubscriberDAOJDBC implements SubscriberDAO {
    @Override
    public void create(Model user) throws IllegalArgumentException, DAOException {
        String subscriberNickName = "ItExist";
        if(subscriberNickName != null) {
            throw new IllegalArgumentException("The user with a such NickName already exists");
        }
    }
}
