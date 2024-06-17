/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timo
 */
public class Statistic {
    private String theme;
    private String ageGroup;
    private String gender;
    private String country;
    private Integer year;
    private Double literacy;
    
    public Statistic(String theme, String age, String gender, String country, int year, double lit){
        this.theme = theme;
        this.ageGroup = age;
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.literacy = lit;
    }
    
    public Double getLiteracy(){
        return this.literacy;
    }
    public String toString(){
        return String.format("%s (%s), %s, %s",this.country,this.year,this.gender,this.literacy);
    }
}
