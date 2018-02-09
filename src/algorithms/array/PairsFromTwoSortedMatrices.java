/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.array;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author dichha
 */
class Index{
    int x; 
    int y; 
    Index(int x, int y){
        this.x = x; 
        this.y = y; 
    }
}

public class PairsFromTwoSortedMatrices {
    /*
    Map<Integer, Index> map = new HashMap<Integer, Index>(); 
    void pairs(int[][] mat1, int[][] mat2, int x){
        for(int r=0; r< mat1.length; r++){
            for(int c = 0; c <mat1[0].length; c++ ){
                map.put(mat1[r][c], new Index(r, c));
            }
        }
        for(int r=0; r < mat2.length; r++){
            for(int c=0; c < mat2[0].length; c++){
                int pair = x - mat2[r][c]; 
                if(map.containsKey(pair)){
                    Index i = map.get(pair);
                    System.out.print("(" + mat1[i.x][i.y] + ", " + mat2[r][c] +")"+ " " );
                }
            }
        }
        
        
    }
  */
    int binarySearchOnRow(int[][] mat2, int t, int b, int p){
        
        while(b <= t){
            int mid = (t + b)/2; 
             
            if(mat2[mid][0] <= p)
                t = mid+1;
            
            else
                 b= mid-1;
            
        }
        return b; 
    }
    boolean binarySearchOnCol(int[][] mat2, int l, int r, int row, int p){
        while(l <= r){
            int mid =  (l + r)/2; 
            if(mat2[row][mid] == p)
                return true;
            else if(mat2[row][mid] > p)
                r = mid-1; 
            else
                l = mid + 1; 
        }
        return false; 
    }
    boolean searchValue(int[][] mat2, int d){
        int rowNum = binarySearchOnRow(mat2, 0, mat2.length-1, d);
        System.out.print(rowNum + " ");
        if(rowNum == -1){
            System.out.print(-1 + " ");
            return false;
        }
        return binarySearchOnCol(mat2, 0, mat2[rowNum].length-1, rowNum, d); 
    }
    int pairs(int[][] mat1, int[][] mat2, int x){
        int count = 0; 
        for(int r=0; r<mat1.length; r++){
            for(int c=0; c<mat1.length; c++){
                 //System.out.print(1 + " ");
                if(searchValue(mat2, x-mat1[r][c]))
                    count++; 
                
            }
        }
        return count;
    }
    public static void main(String[] args){
        PairsFromTwoSortedMatrices p =  new PairsFromTwoSortedMatrices();
        int mat1[][] = {{1, 5, 6}, 
                          {8, 10, 11}, 
                          {15, 16, 18}};
        int mat2[][] = {{2, 4, 7},
                          {9, 10, 12}, 
                          {13, 16, 20}}; 
        System.out.print(mat1.length + " " + mat1[0].length);
        int c = p.pairs(mat1, mat2, 21);
        System.out.print( c + " ");
    }
  
    
    
    
    
}
