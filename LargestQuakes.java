
/**
 * Find N-closest quakes
 * 
 * @author Duke Software/Learn to Program
 * @version 1.0, November 2015
 */

import java.util.*;

public class LargestQuakes {
    public ArrayList<QuakeEntry> getLargest(ArrayList<QuakeEntry> quakeData, int howMany) {
        ArrayList<QuakeEntry> ret = new ArrayList<QuakeEntry>();
        ArrayList<QuakeEntry> copy = new ArrayList<QuakeEntry>(quakeData);
        
        for(int i = 0; i < howMany; i++){
            int index = indexOfLargest(copy);
            ret.add(copy.get(index));
            copy.remove(index);
        }
        return ret;
    }
    
    public int indexOfLargest(ArrayList<QuakeEntry> quakeData){
        int ind = 0;
        for(int i=0; i < quakeData.size(); i++){
            QuakeEntry current = quakeData.get(i);
            if(current.getMagnitude() > quakeData.get(ind).getMagnitude()){
                ind = i;
            }
        }
        return ind;
    }

    public void findLargestQuakes() {
        EarthQuakeParser parser = new EarthQuakeParser();
        String source = "data/nov20quakedata.atom";
        //String source = "http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_week.atom";
        ArrayList<QuakeEntry> list  = parser.read(source);
        System.out.println("read data for "+list.size());

        ArrayList<QuakeEntry> largest = getLargest(list,50);
        for(QuakeEntry quake : largest){
            System.out.println(quake.getMagnitude()+" "+quake.getInfo());
        }
    }
    
}
