package uk.bacano.service;

import uk.bacano.model.Game;

public interface BetService {
    public String betBankCount(Game game);
    public String betPlayCount(Game game);
    public String betTieCount(Game game);
}
