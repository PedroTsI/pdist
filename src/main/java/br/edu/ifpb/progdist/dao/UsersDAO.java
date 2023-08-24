package br.edu.ifpb.progdist.dao;

import br.edu.ifpb.progdist.model.User;

import java.util.ArrayList;
import java.util.List;

public class UsersDAO {
    private List<User> user = new ArrayList<>();

    public UsersDAO(){
        this.user.add(new User(1,"valquer",25));
        this.user.add(new User(2,"maria rita", 18));
    }

    public List<User> getUser(){
        return this.user;
    }

    public void insertUser(User newUser){
        this.user.add(newUser);
    }
}
