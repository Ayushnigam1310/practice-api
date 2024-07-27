package com.accio.practice.Service;

import com.accio.practice.Model.Information;
import com.accio.practice.Repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Autowired
    private MyRepository myRepository;

    public void createUser(Information information)
    {
        myRepository.storeUser(information);
    }
    public void deleteUser(String email)
    {
        myRepository.deleteUser(email);
    }


    public void updateUser(Information information) {
        myRepository.upadateUser(information);
    }

    public Information getUser(String email) {
        return myRepository.getUser(email);
    }
}
