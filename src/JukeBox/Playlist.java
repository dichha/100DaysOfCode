/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JukeBox;

import java.util.Queue;

/**
 *
 * @author dichha
 */
public class Playlist {
    private Song song; 
    private Queue<Song> queue; 
    
    public Playlist(Song song, Queue<Song> queue){
        
    }
    public Song getNextSToPlay(){
        return queue.peek(); 
    }
    public void queueUpSong(Song s){
        queue.add(s); 
    }
    
    
}
