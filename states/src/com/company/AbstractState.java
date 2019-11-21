package com.company;

public abstract class AbstractState {
    Player _player;
    AbstractState(Player player){
        this._player = player;
    }

    public abstract String onNext();
    public abstract String onPrevious();

}
