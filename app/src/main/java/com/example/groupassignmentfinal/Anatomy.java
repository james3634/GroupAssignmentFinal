package com.example.groupassignmentfinal;

public class Anatomy {

    private String topic;
   private String image;
   private String link;
   private char pin;
   private String name;

    public Anatomy(String topic, String image, String link, char pin, String name) {
        this.topic = topic;
        this.image = image;
        this.link = link;
        this.pin = pin;
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public char getPin() {
        return pin;
    }

    public void setPin(char pin) {
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
