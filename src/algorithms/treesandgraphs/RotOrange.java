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
public class RotOrange {
    public final static int R = 3; 
    public final static int C = 5; 
    
    // structure for storing coordinates of the cell
    static class Ele{
        int x = 0; 
        int y = 0; 
        Ele(int x, int y){
            this.x = x;
            this.y = y; 
        }
        
    }
    // function to check whether a cell is valid / invalid
    static boolean isValid(int i, int j){
        return (i >= 0 && j >= 0 && i < R && j < C);
    }
    
    // function to check whether the cell is delimiter
    // which is (-1, -1)
    static boolean isDelim(Ele temp){
        return (temp.x == -1 && temp.y == -1);
    }
    
    // Function to check whether there is still a fresh
    // orange remaining
    static boolean checkAll(int[][] arr){
        for(int i=0; i < R; i++){
            for(int j=0; j<C; j++){
                if(arr[i][j] == 1)
                    return true; 
            }
        }
        return false; 
    }
    
    // This function finds if it's possible to rot all oranges
    // or not. If possible, then it returns the minimum time 
    // required to rot all, o/w returns -1
    
    static int rotOranges(int[][] arr){
        // Create a queue of cells
        Queue<Ele> Q = new LinkedList<>(); 
        Ele temp; 
        int ans = 0; 
        // Store all the cells having rotten orange in first
        // time frame
        for (int i=0; i < R; i++){
            for(int j=0; j<C; j++){
                if(arr[i][j] == 2)
                    Q.add(new Ele(i, j));
            }
        }
        // Separate these rotten oranges from the oranges which
        // will rotten due to these oranges in first time framce
        // using delimite which is (-1, -1)
        Q.add(new Ele(-1, -1));
        
        
        // Process the grid while there are rotten oranges in
        // the queue
        while(!Q.isEmpty()){
            // This flag is used to determine whether even a single
            // fresh orange gets rotten due to rotten oranges
            // in current time frame so we can incrase the count of 
            // of the required time
            boolean flag = false;
            // Process all the rotten oranges in current time frame
            while(!isDelim(Q.peek())){
                temp = Q.peek();
                // Check right adjacent cell that if it can be rotten
                if(isValid(temp.x, temp.y+1) && arr[temp.x][temp.y+1] == 1){
                    if(!flag){
                        ans++; 
                        flag = true; 
                    }
                    // make the orange rotten
                    arr[temp.x][temp.y+1] = 2;
                    
                    // push the adjacent orange to Queue
                    temp.y++;
                    Q.add(new Ele(temp.x, temp.y));
                    
                    // Move back to current cel
                    temp.y--; 
                }
                
                // Check left adjacent cell that if it can be rotten 
                if(isValid(temp.x, temp.y-1) && arr[temp.x][temp.y-1] == 1){
                    if(!flag){
                        ans++; 
                        flag = true;
                    }
                    arr[temp.x][temp.y-1] = 2;
                    temp.y--; 
                    Q.add(new Ele(temp.x, temp.y)); // push this cell to Queue
                    temp.y++;
                           
                }
                  // Check top adjacent cell that if it can be rotten 
                if(isValid(temp.x+1, temp.y ) && arr[temp.x+1][temp.y] == 1){
                    if(!flag){
                        ans++; 
                        flag = true;
                    }
                    arr[temp.x+1][temp.y] = 2;
                    temp.x++; 
                    Q.add(new Ele(temp.x, temp.y)); // push this cell to Queue
                    temp.x--;
                           
                }
                  // Check bottom adjacent cell that if it can be rotten 
                if(isValid(temp.x-1, temp.y) && arr[temp.x-1][temp.y] == 1){
                    if(!flag){
                        ans++; 
                        flag = true;
                    }
                    arr[temp.x-1][temp.y] = 2;
                    temp.x--; 
                    Q.add(new Ele(temp.x, temp.y)); // push this cell to Queue
                    temp.x++;
                           
                }
                
                // Pop the delimiter
                Q.remove();
                
            }
            // Pop the delimiter
            Q.remove(); 
            // If oranges were rotten in current frame than separate the 
            // rotten oranges using delimiter for the next frame for
            // processing

            if(!Q.isEmpty()){
                Q.add(new Ele(-1, -1));

            }

            // If Queue was empty then no rotten oranges left to process 
            // so exit

        }
         // Return -1 if all oranges could not rot, o/w ans
           return (checkAll(arr) ? -1: ans);
           
        
        //return -1; 
    }
    // Drive program
    /*
    public static void main(String[] args){
        int arr[][] = {{2, 1, 0, 2, 1}, 
                       {1, 0, 1, 2, 1}, 
                       {1, 0, 0, 2, 1}};
        int ans = rotOranges(arr);
        if (ans == -1)
            System.out.println("All oranges cannot rot");
        else
            System.out.println("Time required for all oranges to rot " + ans);
        
    }
    */
    
}
