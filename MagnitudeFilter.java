
/**
 * Write a description of MagnitudeFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MagnitudeFilter implements Filter {
    private double minMag;
    private double maxMag;
    private String name;
    
    public MagnitudeFilter(double min,double max, String filterName){
        minMag = min;
        maxMag = max;
        name = filterName;
    }
    
    public boolean satisfies(QuakeEntry quake){
        return quake.getMagnitude() >= minMag && quake.getMagnitude() <= maxMag;
    }
    
    public String getName(){
        return name;
    }
}
