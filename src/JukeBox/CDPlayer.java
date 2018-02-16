/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JukeBox;

/**
 *
 * @author dichha
 */
public class CDPlayer {
    private Playlist p; 
    private CD c; 
    
    // Constructors
    public CDPlayer(CD c, Playlist p){
        
    }
    public CDPlayer(Playlist p){
        this.p = p; 
    }
    public CDPlayer(CD c){
        this.c = c; 
    }
    // play song
    public void playSong( Song s){
        
    }
    // Getters and setters
    public Playlist getPlaylist(){
        return p;
    }
    public setPlaylist(Playlist p){
        this.p = p; 
    }
    public CD getCD(){
        return c; 
    } 
    public void setCD(CD c){
        this.c = c; 
    }
    
    
}
