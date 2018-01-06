/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancejava.d8;

/**
 *
 * @author dichha
 */
/*
It is strongly advised that all user-defined exception should be 
inherited from RutimeException class and fall into the class 
of unchecked exceptions (however, thre are always exclusions from the rule). 
For eg. let us defined exception to dial w/ authentication
*/
public class NotAuthenticatedException extends RuntimeException{
    private static final long serialVersionUID = 207923538133605509L; 
    public NotAuthenticatedException(){
        super();
    }
    public NotAuthenticatedException( final String message ){
        super(message); 
    }
    public NotAuthenticatedException(final String message, final Throwable cause){
        super(message, cause);
    }
    /*
    The purpose of this exception is to signal about non-existing or invalid
    user credentials during sign-in process, for eg.
    public void signin(final String username, final String String password){
        if(!exists(username, password)){
            throw new NotAuthenticaedException(
                    "User / Password combination is not recognized.");
        }
    }
    */
   
    
}
