package com.itacademy.soccer.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="player")
public class Player {
	//Player atributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private int age;
	private String aka;
	private int keeper;
	private int defense;
	private int pass;
	private int attack;

	//Error! duplicated declaration of team object
	//@ManyToOne
	//private Team team;
	
	@OneToMany
	List<PlayerActions> playerActions;

	
	//relation with team
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="team_id")
	@JsonIgnore
	private Team team;
	
	//Empty constructor
	public Player() {
		
	}

	//getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getAka() {
		return aka;
	}

	public void setAka(String aka) {
		this.aka = aka;
	}

	public int getKeeper() {
		return keeper;
	}

	public void setKeeper(int keeper) {
		this.keeper = keeper;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getPass() {
		return pass;
	}

	public void setPass(int pass) {
		this.pass = pass;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}


	public List<PlayerActions> getPlayerActions() {
		return playerActions;
	}

	public void setPlayerActions(List<PlayerActions> playerActions) {
		this.playerActions = playerActions;
	}
	

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + ", aka=" + aka + ", keeper=" + keeper
				+ ", defense=" + defense + ", pass=" + pass + ", attack=" + attack + ", team=" + team + "]";
	}

	
}
