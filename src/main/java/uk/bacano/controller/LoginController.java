package uk.bacano.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import uk.bacano.model.Login_user;
import uk.bacano.service.LoginService;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/login")
    @ResponseBody
    public String Login(){
        String str = loginService.LoginWithAuto();
        return str;
    }


    @RequestMapping(value = "/signin")
    @ResponseBody
    public void signin(@RequestBody Login_user user){

    }
}

