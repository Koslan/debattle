package ua.step.debating.models.authentication;

import java.io.Serializable;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.*;

import org.hibernate.annotations.Cascade;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import ua.step.debating.models.User;

@ Entity
@ Table(name = "auth_user")
@ Inheritance(strategy = InheritanceType.JOINED)
public class AuthUser implements Serializable, UserDetails {
	@ Id
	@ Column(name = "id")
	@ GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ Column(name = "identification_name", length = 64, nullable = false)
	private String identificationName;

	@ Enumerated(EnumType.STRING)
	@ Column(name = "type", nullable = false)
	private AuthorityType type;

	@ Column(name = "binary_authorities", nullable = false)
	private Long binaryAuthorities;

	@ Column(name = "enabled", nullable = false, columnDefinition = "tinyint")
	private Boolean enabled;

	@ Transient
	private Set<Authority> authorities;

	@ OneToOne(fetch = FetchType.LAZY, orphanRemoval = true)
	@ JoinColumn(name="user_id")
	private User user;

	@ Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		authorities = EnumSet.noneOf(Authority.class);
		for (Authority authority : Authority.values())
        		if ((binaryAuthorities & (1 << authority.ordinal())) != 0)
				authorities.add(authority);
		return authorities;
	}
	public void setAuthority(Set<Authority> authorities) {
		binaryAuthorities = 0L;
		for (Authority authority : authorities)
			binaryAuthorities |= 1 << authority.ordinal();
	}
	@ Override
	public String getPassword() {
		return type.name();
	}
	@ Override
	public String getUsername() {
		return identificationName;
	}
	@ Override
	public boolean isAccountNonExpired() {
		return true;
	}
	@ Override
	public boolean isAccountNonLocked() {
		return true;
	}
	@ Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	//getters/setters
}
