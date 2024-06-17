
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timo
 */
public class Abbreviations {
    private HashMap<String, String> abbs;
    
    public Abbreviations(){
        this.abbs = new HashMap<String, String>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation){
        abbreviation = sanitize(abbreviation);
        this.abbs.put(abbreviation, explanation);
    }
    public boolean hasAbbreviation(String abbreviation){
        abbreviation = sanitize(abbreviation);
        return this.abbs.containsKey(abbreviation);
    }
    public String findExplanationFor(String abbreviation){
        abbreviation = sanitize(abbreviation);
        return this.abbs.get(abbreviation);
    }
    
    private String sanitize(String s){
        return s.toLowerCase().trim();
    }
    
}
