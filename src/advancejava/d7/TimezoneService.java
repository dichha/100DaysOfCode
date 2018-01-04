/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancejava.d7;

import java.io.IOException;

/**
 *
 * @author dichha
 */
public interface TimezoneService {
    Timezone getTimeZone(final double lat, final double lon) throws IOException;
    

}
