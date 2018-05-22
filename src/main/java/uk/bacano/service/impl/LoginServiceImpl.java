package uk.bacano.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.bacano.dao.LoginRepo;
import uk.bacano.model.Login_user;
import uk.bacano.service.LoginService;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    LoginRepo loginRepo;

    public String LoginWithAuto() {
        List<Login_user> list = loginRepo.findAll();

        list.parallelStream().forEach(x->
            System.out.println(x.getId())
        );

        return list.get(0).getId();

    }

    @Override
    public void Signin(Login_user user) {
        loginRepo.save(user);
    }
}
