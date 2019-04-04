package src.database.model.constants;

public enum JobType implements EnumerationData  {
	PART_TIME("Part time job"),FULL_TIME("Full time job"),INTERNSHIP("Internship");
	
	private String description;
	
	JobType(String desc) {
		this.description=desc;
	}
	
	@Override
	public String getDescription() {
		return description;
	}
	
	
	
}
