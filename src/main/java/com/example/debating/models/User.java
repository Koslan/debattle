package  com.example.debating.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.debating.models.Role;

@Entity
@Table(name = "Users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	private String login;
	private String password;
	private String email;
	private String userImage;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "users_has_roles", joinColumns = {
			@JoinColumn(name = "users_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "roles_id", nullable = false, updatable = false) })
	private List<Role> roles = new ArrayList<Role>();
	@OneToMany
	private List<Message> messages;
	@OneToOne
	private UserStatistics statistics;
	@OneToOne
	private LobbyStatistics lobbyStatistics;
	@ManyToMany
	private List<Lobby> lobbies;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public LobbyStatistics getLobbyStatistics() {
		return lobbyStatistics;
	}

	public void setLobbyStatistics(LobbyStatistics lobbyStatistics) {
		this.lobbyStatistics = lobbyStatistics;
	}

	public List<Lobby> getLobbies() {
		return lobbies;
	}

	public void setLobbies(List<Lobby> lobbies) {
		this.lobbies = lobbies;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public UserStatistics getUserStatistics() {
		return statistics;
	}

	public void setUserStatistics(UserStatistics statistics) {
		this.statistics = statistics;
	}

	public String getUserImage() {
		return userImage;
	}

	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}

}
