package com.accio.practice.Repository;

import com.accio.practice.Model.Information;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class MyRepository {

    private HashMap<String, Information> data = new HashMap<>();
    public void storeUser(Information information)
    {
        String email = information.getEmail();
        data.put(email, information);
    }
    public void deleteUser(String email)
    {
        data.remove(email);
    }

    public void upadateUser(Information information) {
        String email = information.getEmail();
        data.put(email, information);
    }

    public Information getUser(String email) {
        return data.get(email);
    }
}
