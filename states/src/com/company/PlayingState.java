package com.company;

public class PlayingState extends AbstractState {
    public PlayingState(Player player){
        super(player);
    }

    @Override
    public String onNext() {
        return _player.Next();
    }

    @Override
    public String onPrevious() {
        return _player.Previous();
    }
}
