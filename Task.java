public abstract class Task {
	private String name;
	private int workingHours;
	
	
	public Task(String name, int workingHours){
		setName(name);
		setWorkingHours(workingHours);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null && !name.isEmpty()){
			this.name = name;
		}else{
			this.name = "No tasks available";
		}
	}	
	public int getWorkingHours() {
		return workingHours;
	}
	public void setWorkingHours(int workingHours) {
		if(workingHours<0){
			this.workingHours = 0;
		}else{
			this.workingHours = workingHours;
		}
	}
}
