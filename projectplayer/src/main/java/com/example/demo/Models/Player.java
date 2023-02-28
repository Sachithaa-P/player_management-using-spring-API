package com.example.demo.Models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Player_Management1")
public class Player {
    
	@Id
    @Column(name="ID")
    private int id;
    
    @Column(name="NAME")
    private String name;
    
    @Column(name="AGe")
    private int age;
    
    @Column(name="SPORTS")
    private String sport;
    
    @Column(name="Agent_Name")
    private String aname;

    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public Player() {}
    public Player(int id, String name, int age,String sport,String aname) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sport = sport;
		this.aname = aname;
	}
}
