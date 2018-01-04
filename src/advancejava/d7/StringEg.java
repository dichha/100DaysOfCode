/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancejava.d7;

/**
 *
 * @author dichha
 */
/*
Strings are one of the most widely used types in Java and, arguably, 
in most of the programming languages. 
The Java language simplifies a lot the routine operations over
strings by natively supporting the concatenations and comparison. 
Additionally, the Java standard library provides many different classes
to make strings operation efficient and that is what 
we are going to discuss in this section. 
In Java, strings are immutable objects, represented in UTF-16 format. 
Every time you concatenate the strings (or perform any operation which 
modifies the orifinal string) the new instance of the String class is 
created. Because of this fact, the concatenation operations may become 
very ineffective, causing the creation of many intermediate string
instances (generally speaking, generating garbage). 

But the Java standard library provides two very useful classes which 
aim to facilitate string maniputations: StringBuilder and  StringBuffer
(the only difference between those is that StringBuffer is thread-safe
while StringBuilder is not). Let us take a look on couple of examples 
usign of these classes: 
*/
public class StringEg {
    public static void  stringEg(){
        final StringBuilder sb = new StringBuilder();
        for (int i=1; i <= 10; ++i){
            sb.append(" ");
            sb.append(i);
        }
        sb.deleteCharAt(0);
        sb.insert(0, "[");
        sb.replace(sb.length()-3, sb.length(), "]");
        
    }
    /*
    Though using the StringBuilder/String Buffer is the recommendsed way
    to manipulate strings, it may look over-killing in simple scenario
    of concatenaing two or three stings so the regular + operator could 
    be used instead, for eg. 
    String userId = "user:" + new Random().nextInt(100);  
    */
}
