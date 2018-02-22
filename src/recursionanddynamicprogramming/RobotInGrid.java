/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionanddynamicprogramming;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author dichha
 */

/*
Imagine a robot sitting on th upper left corner of grid with r rows and c columns. 
The robot can only move in two directions, right and down, but certain cells are 
"off limit" such that robot cannot step on them. Design an algorithm to find a 
path for the robot from the top left to the bottom right.
*/
class Point{
    int row, col; 
    Point(int row, int col){
        this.row = row; 
        this.col = col; 
    }
}
public class RobotInGrid {
    /*
    If we picture this grid, the only way to move to spot (r, c) is by moving 
    to one of the adjacent spots: (r-1, c) or (r, c-1). So, we need to find a 
    path to either (r-1, c) or (r, c-1). 
    
    How do we find a path to those spots. To find a path to (r-1, c) or (r, c-1), 
    we need to move to one of its adjacent cells. So, we need to find a path to 
    a spot adjacent to (r-1, c) which are coordinates (r-2,c) and (r-1, c-1), or 
    a spot adjacent to (r, c-1) which are spots (r-1, c-1) and (r, c-2). Observe
    that we list the point (r-1, c-1) twice; we'll discuss that issue later. 
   
    */
    
    // So then, to find a path from the origin, we just work backwards like this. 
    // Starting from the last cell, we try to find a path to each of its adjacent cells. The 
    // recursive code below implements this algorithm. 
    
    /*
    ArrayList<Point> getPath(boolean[][] maze){
        if(maze == null || maze.length == 0) return null; 
        ArrayList<Point> path = new ArrayList<Point>();
        if (getPath(maze, maze.length -1, maze[0].length-1, path))
            return path;
        return null; 
    }
   boolean getPath(boolean[][] maze, int row, int col, ArrayList<Point> path){
       // If out of bounds or not available, return 
       if(col < 0 || row < 0 || !maze[row][col])
           return false; 
       boolean isAtOrigin = (row == 0) && (col == 0);
       
       // there's a path from the start to here, add my location
       if(isAtOrigin || getPath(maze, row, col-1, path) || getPath(maze, row-1, col, path)){
           Point p = new Point(row, col); 
           path.add(p);
           return true; 
       }
       return false;
   }
    */
   
   // Dynamic programming st we do not recompute (r-1, c-1) in both cases of down 
   // or right movement
   ArrayList<Point> getPath(boolean[][] maze){
       if (maze == null || maze.length == 0)
           return null; 
       ArrayList<Point> path = new ArrayList<Point>(); 
       HashMap<Point, Boolean> cache = new HashMap<Point, Boolean>(); 
       int lastRow = maze.length - 1; 
       int lastCol = maze[0].length -1; 
       if(getPath(maze, lastRow, lastCol, path, cache))
           return path;
       return null; 
   }
   boolean getPath(boolean[][] maze, int row, int col, ArrayList<Point> path, HashMap<Point, Boolean> cache){
       // if out of bound or not avilable, reurn 
       if (col < 0 || row < 0 || !maze[row][col])
            return false; 
       Point p = new Point(row, col); 
       // If we've already visited this cell return 
       if(cache.containsKey(p))
           return cache.containsKey(p);
       
       boolean isAtOrigin = (row == 0) && (col == 0); 
       boolean success = false; 
       
       // if there's a path from the start to my current location, add my location
       if(isAtOrigin || getPath(maze, row-1, col, path, cache) || getPath(maze, row, col-1, path, cache))
           path.add(p); 
           success = true; 
       cache.put(p, success); 
       return success; 
            
   }
   
    
    
}
