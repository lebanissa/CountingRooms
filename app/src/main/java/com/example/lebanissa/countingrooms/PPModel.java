package com.example.lebanissa.countingrooms;

/**
 * Created by lebanissa on 2017-07-08.
 */

public class PPModel {
    private boolean PingPong;

    public PPModel() {
        this.PingPong = true;

    }

    public String getPingPong(){

        this.PingPong = !this.PingPong;

        if (this.PingPong){
            return "Pong";
        }
        else{
            return "Ping";
        }

    }
}
