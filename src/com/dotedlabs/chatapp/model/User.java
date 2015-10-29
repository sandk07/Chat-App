package com.dotedlabs.chatapp.model;

import javafx.beans.property.StringProperty;

public class User {
	private final StringProperty userName;

	public User() {
		this(null);
	}

	public User(StringProperty userName) {
		this.userName = userName;
	}

	public final StringProperty userNameProperty() {
		return this.userName;
	}


	public final String getUserName() {
		return this.userNameProperty().get();
	}

	public final void setUserName(final String userName) {
		this.userNameProperty().set(userName);
	}

}
