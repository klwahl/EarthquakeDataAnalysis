
/**
 * Write a description of DepthFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DepthFilter implements Filter {
    private double minDepth;
    private double maxDepth;
    private String name;
    
    public DepthFilter(double min, double max, String filterName){
        minDepth = min;
        maxDepth = max;
        name = filterName;
    }
    
    public boolean satisfies(QuakeEntry quake){
        return quake.getDepth() >= minDepth && quake.getDepth() <= maxDepth;
    }
    
    public String getName(){
        return name;
    }
}
