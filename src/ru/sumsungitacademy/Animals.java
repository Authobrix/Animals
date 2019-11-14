package ru.sumsungitacademy;

public class Animals {
    private int weight ;
    private String name ;
    private String color;
    private String type;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public void eat (){
        System.out.print("Eating...\n");
    }
    public void sleep(){
        System.out.print("Sleeping zz-zz-zz...\n");
    }
    public String speak(String words){
        String phrase = words + "...mauu...\n";
        return phrase;
    }
}
