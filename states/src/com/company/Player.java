package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private PlayingState _state;
    private List<String> playList = new ArrayList<>();
    private int currentTrack = 0;

    public Player(){
        this._state = new PlayingState(this);
        for (int i=1;i<6; i++){
            playList.add("Track "+i);
        }
    }
    public int getCurrentTrack(){
        return currentTrack;
    }

    public void changeState(PlayingState state){
        this._state = state;
    }
    public PlayingState get_state(){
        return _state;
    }

    public String startPlay(){
        return "Playing " + playList.get(currentTrack);
    }

    public String Next(){
        currentTrack++;
        if(currentTrack>playList.size()-1){
             currentTrack = 0;
        }
        return "Playing "+playList.get(currentTrack);
    }

    public String Previous(){
        currentTrack--;
        if(currentTrack<0){
            currentTrack = playList.size()-1;
        }
        return "Playing "+playList.get(currentTrack);
    }

    public void setCurrentTrack(int track){
        this.currentTrack = track;
    }
}
