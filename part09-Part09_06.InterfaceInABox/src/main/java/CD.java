/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timo
 */
public class CD implements Packable{
    private String artist;
    private String name;
    private int publicationYear;
    
    public CD(String artist, String name, int publicationYear){
        this.artist = artist;
        this.name = name;
        this.publicationYear = publicationYear;
    }
    
    @Override
    public String toString(){
        return String.format("%s: %s (%s)",this.artist,this.name,this.publicationYear);
    }

    @Override
    public double weight() {
        return 0.1;
    }
    
    
            
}
