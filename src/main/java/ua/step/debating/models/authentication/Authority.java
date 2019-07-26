package ua.step.debating.models.authentication;

import org.springframework.security.core.GrantedAuthority;

public enum Authority implements GrantedAuthority {
	NEW_CUSTOMER, CUSTOMER, ADMINISTRATOR;

	@ Override
	public String getAuthority() {
		return toString();
	}
}
