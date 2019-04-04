package src.database.model.constants;

public enum Gender implements EnumerationData {
	MALE("Mr."),FEMALE("Ms.");
	
	private String desc;
	Gender(String desc){
		this.desc=desc;
	}

	@Override
	public String getDescription() {
		return desc;
	}
	
}
