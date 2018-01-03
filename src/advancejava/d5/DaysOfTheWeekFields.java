package advancejava.d5;


/*
Enums are specialized classes and as such are extendible. It means they can have
instance fields, constructors and methods (although the only limitations are 
that the default no-args constructor cannot be declared and all constructors 
must be private). 
*/
public enum DaysOfTheWeekFields{
    MONDAY(false), 
    TUESDAY(false), 
    WEDNESDAY(false), 
    THURSDAY(false), 
    FRIDAY(false), 
    SATURDAY(true), 
    SUNDAY(true);
    private final boolean isWeekend; 
    private DaysOfTheWeekFields(final boolean isWeekend){
        this.isWeekend = isWeekend; 
    }
    public boolean isWeekend(){
        return isWeekend; 
    }
    
    // isWeekend() property could be used to detect if the value represents the 
    // week day or week-end. eg. 
    public boolean isWeekend(DaysOfTheWeek day){
        return day.isWeekend; 
    }

}
