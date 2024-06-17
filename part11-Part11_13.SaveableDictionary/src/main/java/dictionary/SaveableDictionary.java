/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author timo
 */
public class SaveableDictionary {
    private String filepath;
    private HashMap<String, String> dict;
    public SaveableDictionary(){
        this.dict = new HashMap<>();
    }
    public SaveableDictionary(String file){
        this.filepath = file;
        this.dict = new HashMap<>();
    }
    public boolean load(){
        try{
        Scanner fileReader = new Scanner(Paths.get(this.filepath));
        
        while (fileReader.hasNextLine()) {
            String line = fileReader.nextLine();
            String[] parts = line.split(":");  
            add(parts[0],parts[1]);
        }
        
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }
        return true;
    }
    
    public boolean save(){
        try{
        PrintWriter pw = new PrintWriter(this.filepath);
        ArrayList<String> alreadySaved= new ArrayList<>();
        this.dict.keySet().stream().forEach(s -> {
            if(alreadySaved.contains(this.dict.get(s))){
                return;
            }
            alreadySaved.add(s);
        });
        alreadySaved.stream().forEach(s -> pw.println(String.format("%s:%s",s,this.dict.get(s))));
        pw.close();
        return true;
        }
        
        catch(Exception e){
            return false;
        }
    }
    
    public void add(String words, String translation)throws NullPointerException{
        if(this.dict.containsKey(words)){
            return;
        }
        this.dict.put(words, translation);
        this.dict.put(translation, words);    
        
        
    }
    public String translate(String word){
        String translation = this.dict.get(word);
        return translation;
    }
    
    public void delete(String word){
        if(this.dict.get(word)!=null){
            String translation = this.dict.get(word);
            this.dict.remove(word);
            this.dict.remove(translation);
        }
    }
}
