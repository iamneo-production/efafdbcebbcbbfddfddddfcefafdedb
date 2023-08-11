package model;

import java.time.LocalDate;

public class Train{

    private int noOfPersons;
    private String breth;
    private int rates;
    private LocalDate date;
    public int getNoOfPersons() {
        return noOfPersons;
    }
    public void setNoOfPersons(int noOfPersons) {
        this.noOfPersons = noOfPersons;
    }
    public String getBreth() {
        return breth;
    }
    public void setBreth(String breth) {
        this.breth = breth;
    }
    public int getRates() {
        return rates;
    }
    public void setRates(int rates) {
        this.rates = rates;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public Train(int noOfPersons, String breth, int rates, LocalDate date) {
        this.noOfPersons = noOfPersons;
        this.breth = breth;
        this.rates = rates;
        this.date = date;
    }

    
    //Enter code here...    
}