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
public class JukeBox {
    private CDPlayer cdPlayer; 
    private User user; 
    private Set<CD> cdCollection; 
    private SongSelector ts; 
    
    public JukeBox(CDPlayer cdPlayer, User user, Set<CD> cdCollection, SongSelector ts){
        
    }
    public Song getCurrentSong(){
        return ts.getCurrentSong(); 
    }
    public void setUser(User u){
        this.user = u;
    }
}
