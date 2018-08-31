package valley.of.death.user_bank_list.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import valley.of.death.user_bank_list.DAO.UserDAO;

@Controller
public class UserController {

    private UserDAO service;

    @Autowired
    public void setUserServise(UserDAO service){
        this.service = service;
    }

    @GetMapping("/")
    public String list(Model model){
        return "index";
    }
}
