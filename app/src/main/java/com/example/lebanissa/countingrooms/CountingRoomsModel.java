package com.example.lebanissa.countingrooms;

import android.location.Location;

/**
 * Created by lebanissa on 2017-06-27.
 */

public class CountingRoomsModel

{
    public int count;
    private static final int WIDTH = 4;
    private static final int HEIGHT = 5;
    public int x;
    public int y;

    public CountingRoomsModel()
    {
      this.count = 0;
      this.x = 0;
      this.y = 0;
    }

    public void getNorth() {
        count++;
        if (canGoNorth()){
            this.y--;
        }

    }

    public void getSouth(){
        count++;
        if (canGoSouth()){
            this.y++;
        }
    }

    public void getEast(){
        count++;
        if (canGoEast()){
            this.x++;
        }
    }

    public void getWest(){
        count++;
        if (canGoWest()){
            this.x--;
        }
    }

    public String getCount(){
        String count1 = String.valueOf(count);
        return count1;

    }

    public boolean canGoNorth(){

        return this.y < 0;
    }

    public boolean canGoSouth(){

        return this.y < HEIGHT-1;
    }

    public boolean canGoEast(){

        return this.x < WIDTH-1;
    }

    public boolean canGoWest(){

        return this.x > 0;
    }
}
