package ohtu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private String team;
    private String nationality;
    private String birthday;
    private String goals;
    private String assists;
    private String penalties;
    private int points;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getGoals() {
        return goals;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAssists() {
        return assists;
    }

    public void setAssists(String assists) {
        this.assists = assists;
    }

    public String getPenalties() {
        return penalties;
    }

    public void setPenalties(String penalties) {
        this.penalties = penalties;
    }
    
    

    public void setGoals(String goals) {
        this.goals = goals;
    }
    
    public void setPoints() {
             
        this.points = Integer.parseInt(this.goals)+Integer.parseInt(this.assists);
    }
    
    public int getPoints() {
        
        return points;
    }
    

    @Override
    public String toString() {
        return "Name: " + name + ", Team: " + team + ", Nationality: " + nationality + ", Goals: " + goals + ", Assists: " + assists + ", Penalties: " + penalties +", Points: "+points;
    }

}
