package com.example.debating.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Themes")
public class Theme {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	private String name;
	@OneToOne
	private User creator;

	private String firstPosition;
	private String secondPosition;
	private String backgroundImage;

	@OneToMany
	private List<Lobby> listOfDebats; // Список дебатов
	@ManyToMany
	private List<User> subscribers;
	@ManyToOne
	private Sphere sphere;

	public Sphere getSphere() {
		return sphere;
	}

	public void setSphere(Sphere sphere) {
		this.sphere = sphere;
	}

	public Theme() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstPosition() {
		return firstPosition;
	}

	public void setFirstPosition(String firstPosition) {
		this.firstPosition = firstPosition;
	}

	public String getSecondPosition() {
		return secondPosition;
	}

	public void setSecondPosition(String secondPosition) {
		this.secondPosition = secondPosition;
	}

	public String getBackgroundImage() {
		return backgroundImage;
	}

	public void setBackgroundImage(String imageURL) {
		backgroundImage = imageURL;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public List<Lobby> getListOfDebats() {
		return listOfDebats;
	}

	public void setListOfDebats(List<Lobby> listOfDebats) {
		this.listOfDebats = listOfDebats;
	}

	public List<User> getSubscribers() {
		return subscribers;
	}

	public void setSubscribers(List<User> subscribers) {
		this.subscribers = subscribers;
	}

}
