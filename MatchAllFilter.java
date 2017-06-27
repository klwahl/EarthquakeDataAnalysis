
/**
 * Write a description of MatchAllFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;

public class MatchAllFilter implements Filter{
    private ArrayList<Filter> filters;
    
    public MatchAllFilter(){
         filters = new ArrayList<Filter>();
    }
    
    public void addFilter(Filter f){
        filters.add(f);
    }
    
    public boolean satisfies(QuakeEntry quake){
        for(int i=0; i < filters.size(); i++){
            Filter f = filters.get(i);
            if(!f.satisfies(quake)){
                return false;
            }
        }
        return true;
    }
    
    public String getName(){
        String names = "";
        for(Filter f : filters){
            names = names+" "+f.getName();
        }
        return names;
    }
}
