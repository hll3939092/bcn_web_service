package uk.bacano.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import uk.bacano.model.Game;
import uk.bacano.service.BetService;

@Controller
public class BetController {

    @Autowired
    BetService betService;

    @RequestMapping("/betBankCount")
    @ResponseBody
    public String betBankCount(@RequestBody Game game){
        betService.betBankCount(game);
        return "";
    };


    @RequestMapping("/betPlayCount")
    @ResponseBody
    public String betPlayCount(@RequestBody Game game){
        return "";
    };

    @RequestMapping("/betTieCount")
    @ResponseBody
    public String betTieCount(@RequestBody Game game){
        return "";
    };
}
