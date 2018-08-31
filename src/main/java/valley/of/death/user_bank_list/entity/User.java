package valley.of.death.user_bank_list.entity;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "userid")
    private int userid;
    @Column(name = "name")
    private String name;
    @Column(name = "sureName")
    private String sureName;

    public void setUsreid(int userid){
        this.userid = userid;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSureName(String sureName){
        this.sureName = sureName;
    }

    public String getSureName(){
        return sureName;
    }
}