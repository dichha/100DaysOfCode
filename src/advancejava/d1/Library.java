/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancejava.d1;

/**
 *
 * @author dichha
 */
public class Library implements BookFactory{
    @Override
    public Book newBook(){
        return new PaperBook(); 
    }
}
