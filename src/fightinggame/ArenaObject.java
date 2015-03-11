/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fightinggame;

/**
 *
 * @author bradmash
 */
public abstract class ArenaCharacter {
    //Base class for all character types
   //Object can keep track of its own position
    private int x_coord;
    private int y_coord;
    private string description;
   
    public enum Team {
        TEAM_ONE,TEAM_TWO;
    }
    //What team this Character is playing for
    private Team alliance;
      
    //returns true if successful/valid; false if unsuccessful/invalid
    public abstract boolean move(int x, int y); 
    public abstract void attack();
    
}
