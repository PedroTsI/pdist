package br.edu.ifpb.progdist.service;

import br.edu.ifpb.progdist.dao.UsersDAO;
import br.edu.ifpb.progdist.model.User;

import java.util.List;
import java.util.stream.Collectors;

public class UserService {
    private UsersDAO usersDAO = new UsersDAO();

    public List<User> getUser(){
        return usersDAO.getUser();
    }

    public User getUserByCode(int code){
        return this.getUser()
                .stream()
                .filter(user -> user.getCode() == code)
                .collect(Collectors.toList())
                .get(0);
    }

    public void insertUser(User newUser){
        this.usersDAO.insertUser(newUser);
    }
}
