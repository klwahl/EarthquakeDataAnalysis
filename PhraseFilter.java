
/**
 * Write a description of PhraseFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class PhraseFilter implements Filter{
    private String type;
    private String phrase;
    private String name;
    
    public PhraseFilter(String input, String str, String filterName){
        type = input;
        phrase = str;
        name = filterName;
    }
    
    public boolean satisfies(QuakeEntry quake){
        String title = quake.getInfo();
        if(type.equals("start")){
            return title.startsWith(phrase);
        }else if(type.equals("end")){
            return title.endsWith(phrase);
        }else if(type.equals("any")){
            return title.indexOf(phrase) != -1;
        }else {
            return false;
        }
    }
    
    public String getName(){
        return name;
    }
}
