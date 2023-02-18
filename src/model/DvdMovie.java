package model;

public class DvdMovie implements RetailItem {
    private String title;
    private int runningTime;
    private double retailPrice;
    public DvdMovie(String title, int runningTime, double retailPrice){
        this.title = title;
        this.runningTime = runningTime;
        this.retailPrice = retailPrice;
    }
    public String getTitle(){
        return title;
    }
    public int getRunningTime(){
        return runningTime;
    }
    public double getRetailPrice(){
        return retailPrice;
    }
}
