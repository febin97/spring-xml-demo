package com.stackroute.domain;

public class Actor {
    private String actorName;
    private String actorGender;
    private int actorAge;

    public String getActorName() {
        return actorName;
    }

    public String getActorGender() {
        return actorGender;
    }

    public int getActorAge() {
        return actorAge;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public void setActorGender(String actorGender) {
        this.actorGender = actorGender;
    }

    public void setActorAge(int actorAge) {
        this.actorAge = actorAge;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "actorName='" + actorName + '\'' +
                ", actorGender='" + actorGender + '\'' +
                ", actorAge=" + actorAge +
                '}';
    }
}
