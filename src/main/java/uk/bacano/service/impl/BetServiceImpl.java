package uk.bacano.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.bacano.dao.BetRepo;
import uk.bacano.model.Game;
import uk.bacano.service.BetService;

import java.util.List;


@Service
public class BetServiceImpl implements BetService{

    @Autowired
    BetRepo betRepo;

    @Override
    public String betBankCount(Game game) {
        List<Game> list = betRepo.findAllById(game.getId());
        for(Game g : list){
            System.out.println(g.getStartTime());
        }

        return "ok";
    }

    @Override
    public String betPlayCount(Game game) {
        return null;
    }

    @Override
    public String betTieCount(Game game) {
        return null;
    }
}
