package com.dicegame.model.containers;

import com.dicegame.model.Move;

/**
 * Created by Karol on 11/01/2017.
 */
public class CreateGameContainer {

    private String nick;
    private Move move;

    public CreateGameContainer(String nick, Move move) {
        this.nick = nick;
        this.move = move;
    }
}
