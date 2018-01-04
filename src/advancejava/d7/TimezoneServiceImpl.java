/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancejava.d7;

import java.net.HttpURLConnection;
import java.net.URL; 
import java.util.TimeZone;
import java.io.IOException;
import java.util.Collection; 
import java.util.HashSet; 
import java.util.TreeSet; 
import java.util.ArrayList; 
import java.util.Vector; 

/**
 *
 * @author dichha
 */
/* 
Interfaces and contract-based development, emphasizing a lot on the fact 
that interfaces should be preferred to concrete classes whereever possible. 

*/

public class TimezoneServiceImpl implements TimezoneService {
    @Override
    public TimeZone getTimeZone(final double lat, final double lon)
            throws IOException{
        final URL url = new URL(String.format(
                "http://api.geonames.org/timezone?lat=%.2f&amp;lng=%.2f&amp;username=demo",
                lat, lon
               ));
        final HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.setConnectTimeout(1000);
        connection.setReadTimeout(1000);
        connection.connect();
        
        int status = connection.getResponseCode();
        if(status == 200){
            // Do something here
        }
        return TimeZone.getDefault();
    }
    /*
    The code snippet above demonstrates a typical interface / implementation
    pattern. 
    The implementation uses external HTTP service (http://api.geonames.org/) to 
    retrieve the time zone for a particular location. However, because the 
    contact is driven by the interface, it is very easy to introduce yet another
    implementation using, for eg., database or even flat file. With that 
    interfaces greatly help to design testable code. For eg., it is not always
    practical to call external service on each test run so it makes sense to 
    provide the alternative, dummy implementation (also known as stub or mock)
    instead.
    */
    
    @Override
    public TimeZone getTimeZone(final double lat, final double lon) throws 
            IOException{
        return TimeZone.getDefault();
    }
    
    /*
    This implementation could be used in every place where TimezoneService
    interface is required, isolating the test scenario from dependency on 
    external componenets. 
    
    Many excellent examples of appropriate use of the interfaces are encapsulated
    inside the Java standard collection library. Collection, List, Set, all those 
    interfces are backed by several implementations which could be replaced 
    seamlessly and interchangeably when contracts are favored, for eg. 
    */
    public static<T> void print(final Collection<T> collection){
        for(final T element: collection){
            System.out.println(element);
        }
    }
    public static void display(){
        print(new  HashSet<Object>(/*...*/));
        print(new ArrayList<Object>(/* ...*/));
        print(new TreeSet<Object>(/*...*/));
        print(new Vector<Long>(/*...*/));
        
    }
    
    
}
