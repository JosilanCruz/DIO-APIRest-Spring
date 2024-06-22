package app.service;

import app.model.User;

public interface UserService {

    User findById(Long id);

    User create(User usertoCreate);
}
