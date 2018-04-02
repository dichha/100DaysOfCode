/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.treesandgraphs;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author dichha
 */
public class SnakeLadder {
    static class QEntry{
        int vertex; 
        int distance; 
        
    }
    static int getMinDiceThrows(int[] move, int n){
        int[] visited = new int[n]; 
        
        Queue<QEntry> q = new LinkedList<>(); 
        QEntry qe = new QEntry(); 
        qe.vertex = 0; 
        qe.distance = 0; 
        
        visited[0] = 1; 
        q.add(qe); 
        
        // DFS search
        while(!q.isEmpty()){
            qe = q.remove(); 
            int v = qe.vertex; 
            
            // if from vertex is the destination, we are done
            if(v == n-1)
                break; 
            
            //Otherwise dequeue the front vertex and enqueue its adjacent vertices
            // (or cell numbers reachable through a dice throw)
            for(int j=v+1; j<= (v+6) && j < n; j++){
                // If this cell is visited then ignore
                if(visited[j] == 0){
                    // otherwise calulate is distance and mark as visited
                    QEntry a= new QEntry(); 
                    a.distance = qe.distance+1; 
                    visited[j] = 1; 
                    
                    // check if there's a snake or ladder at j
                    // then tail of snake or top of ladder become sthe adjacent 'i'
                    if(move[j] != -1)
                        a.vertex = move[j]; 
                    else
                        a.vertex = j; 
                    q.add(a); 
                }
            }
    
        }
        return qe.distance;
    }
    /*
    public static void main(String[] args){
        // constructing the board
        int N = 30; 
        int[] moves = new int[N]; 
        for(int i=0; i<N; i++){
            moves[i] = -1;
        }
        // Ladders
        moves[2] = 21; 
        moves[4] = 7; 
        moves[10] = 25; 
        moves[19] = 28; 
        
        // Snakes 
        moves[26] = 0; 
        moves[20] = 8; 
        moves[16] = 3; 
        moves[18] = 6; 
        
        System.out.println("Min dice throw required is " + getMinDiceThrows(moves, N)); 
    }
    */
    
}
