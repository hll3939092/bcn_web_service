package uk.bacano.service;


import uk.bacano.model.Login_user;

public interface LoginService {
    String LoginWithAuto();
    void Signin(Login_user user);
}
