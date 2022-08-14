package ru.netology.tickets;

public class Product implements Comparable<Product> {
    protected int id;
    protected int summa;
    protected String from;
    protected String to;
    protected int time;

    public Product(){

    }

    public Product(int id, int summa, String from,String to,int time){
        this.id = id;
        this.summa = summa;
        this.from = from;
        this.to = to;
        this.time = time;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSumma() {
        return summa;
    }

    public void setSumma(int summa) {
        this.summa = summa;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public int compareTo(Product o) {
        return this.getSumma() - o.getSumma();
    }
}
