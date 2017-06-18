/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author hu.ziy
 */
public class Wage {
    private double basic;
    private double performance;
    private double full;
    private double age;
    private double punishment;
    private double night;
    private double living;
    private double recommand;
    private int number;
    private static int count=0;
    private String date;
    public Wage(){
        count++;
        number=count;
    }
    private WageCatalog wageCatalog;

    public WageCatalog getWageCatalog() {
        return wageCatalog;
    }

    public void setWageCatalog(WageCatalog wageCatalog) {
        this.wageCatalog = wageCatalog;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public double getPerformance() {
        return performance;
    }

    public void setPerformance(double performance) {
        this.performance = performance;
    }

    public double getFull() {
        return full;
    }

    public void setFull(double full) {
        this.full = full;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getPunishment() {
        return punishment;
    }

    public void setPunishment(double punishment) {
        this.punishment = punishment;
    }

    public double getNight() {
        return night;
    }

    public void setNight(double night) {
        this.night = night;
    }

    public double getLiving() {
        return living;
    }

    public void setLiving(double living) {
        this.living = living;
    }

    public double getRecommand() {
        return recommand;
    }

    public void setRecommand(double recommand) {
        this.recommand = recommand;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
}
