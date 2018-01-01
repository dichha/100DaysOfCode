/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancejava.d3;

/**
 *
 * @author dichha
 */
/*
i) The benefits of encapsulation are maintainability and ease of change. 
ii) Encapsulation in Java is achieved using visibility and accessibilty rules. 

*/
public class Encapsulation {
    private final String email; 
    private String address; 
    public Encapsulation(final String email){
        this.email = email; 
    }
    public String getAddress(){
        return address; 
    }
    public void setAddress(String address){
        this.address = address; 
    }
    public String getEmail(){
        return email; 
    }
    
}
