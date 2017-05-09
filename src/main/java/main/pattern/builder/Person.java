package main.pattern.builder;

public class Person {
	private long id;
	private String name;
	private String login;
	private String password;

	public static class Builder {
		private long id;
		private String name;
		private String login = "";
		private String password = "";

		public Builder(String name) {
			this.name = name;
		}

		public Builder id(long id) {
			this.id = id;
			return this;
		}

		public Builder login(String login) {
			this.login = login;
			return this;
		}

		public Builder password(String password) {
			this.password = password;
			return this;
		}

		public Person build() {
			return new Person(this);
		}
	}

	private Person(Builder builder) {
		id = builder.id;
		name = builder.name;
	}

	public static void main(String[] args) {
		Person person = new Builder("name").login("Login").password("pass").build();
	}
}
