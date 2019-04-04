package src.database.model.constants;

public enum Role implements EnumerationData {
	ADMIN("Admin"), DIRECTOR("Director"), MANAGER("Manager"), JANITOR("Janitor");

	private final String role;

	Role(String role) {
		this.role = role;
	}

	@Override
	public String getDescription() {
		return role;
	}

	@Override
	public String toString() {
		return role.toLowerCase();
	}

}
