/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancejava.d5;

/**
 *
 * @author dichha
 */

public enum DaysOftheWeekInterfaces implements DayOfWeek {
    MONDAY(){
        @Override
        publid boolean isWeekend(){
            return false; 
        }
    },
    
    TUESDAY(){
        @Override
        publid boolean isWeekend(){
            return false; 
        }
    },
    WEDNESDAY(){
        @Override
        publid boolean isWeekend(){
            return false; 
        }
    },
    THURSDAY(){
        @Override
        publid boolean isWeekend(){
            return false; 
        }
    },
    FRIDAY(){
        @Override
        publid boolean isWeekend(){
            return false; 
        }
    },
    SATURDAY(){
        @Override
        publid boolean isWeekend(){
            return true; 
        }
    },
    SUNDAY(){
        @Override
        publid boolean isWeekend(){
            return true; 
        }
    };
    /*
    The way we have implemented the interface is a bit verbose, however it is
    certainly possible to make it better by combining instance fields and interface
    together.
    eg.
    
    public enum DaysOfTheWeekFieldsInterfaces implements DayOfWeek{
        MONDAY(false); 
        TUESDAY(false); 
        WEDNESDAY(false); 
        THURSDAY(false); 
        FRIDAY(false); 
        SATURDAY(true); 
        SUNDAY(true); 
        
        private final boolean isWeekend; 
        private DaysOfTheWeekFieldsInterfaces(final boolean isWeekend){
            this.isWeekend = isWeekend; 
        }
        
        @Override
        public boolean isWeekend(){
            return isWeekend; 
        }
    }
    */
    /*
    Because of the presence of name(), ordinal(), value(), valueOf() methods
    they be used in switch/case statements. 
    for eg. 
    */
    public void performAction(DayOfTheWeek instance){
        switch(instance){
            case MONDAY: 
                // Do something
            break; 
            case TUESDAY: 
                // Do something
            break; 
            // Other enum constrain here
        }
    }
    
    

}
