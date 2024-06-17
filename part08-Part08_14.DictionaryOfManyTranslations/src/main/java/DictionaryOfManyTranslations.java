
import java.util.ArrayList;
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
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dict;
    public DictionaryOfManyTranslations(){
        this.dict = new HashMap<String, ArrayList<String>>();
    }
    public void add(String word, String translation){
//        if(this.dict.containsKey(word)){
//        ArrayList<String> trans = this.dict.get(word);
//        trans.add(translation);
//        this.dict.put(word, trans);
//        }else{
//            ArrayList<String> trans = new ArrayList<String>();
//            trans.add(translation);
//            this.dict.put(word, trans);
//        }
          ArrayList<String> trans = translate(word);
          trans.add(translation);
          this.dict.put(word, trans);
    }
    public ArrayList<String> translate(String word){
        if(this.dict.containsKey(word)){
            return this.dict.get(word);
        }else{
            return new ArrayList<String>();
        }
    }
    public void remove(String word){
        this.dict.remove(word);
    }
    
}
