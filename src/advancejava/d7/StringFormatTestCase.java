/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancejava.d7;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo; 
import org.junit.Test;
/**
 *
 * @author dichha
 */
public class StringFormatTestCase {
    @Test
    public void testNumberFormatiingWithLeadingZeros(){
        final String formatted = String.format("%04d", 1); 
        assertThat(formatted, equalTo("0001"));
    }
    @Test
    public void testDoubleFormattingWithTwoDecimalPoints(){
        final String formatted = String.format("%.2f", 12.324234d);
        assertThat(formatted, equalTo("12.32"));
    }
    
    
}
