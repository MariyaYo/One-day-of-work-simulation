public class Employee {
	
	private String name;
	private Task currentTask;
	private int hoursLeft;
	static AllWork allWork;
	
	Employee(String name){
		setName(name);
		this.hoursLeft = 8;
		System.out.println(this.name + " started working on a new task.");
		this.currentTask = allWork.getNextTask();
	}
	
	void work(){
		if(this.currentTask != null){
			if(this.currentTask.getWorkingHours() >= this.hoursLeft){
				this.hoursLeft = 0;
				this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - this.hoursLeft);
				System.out.println(this.name + " couldn't finish his/her task. He/she will pick it up tomorrow");
			}else{
				this.hoursLeft -= this.currentTask.getWorkingHours();
				this.currentTask.setWorkingHours(0);
				if(this.hoursLeft > 0){
					if(!Employee.allWork.isAllWorkDone()){
						System.out.println(this.name + " started working on a new task.");
						this.currentTask = allWork.getNextTask();
						this.work();
					}
				}
			}
		}
		
	}
	void startWorkingDay(){
		System.out.println(this.getName() + " finished his/her shift.");
		this.setHoursLeft(8);
		
	}

	public Task getCurrentTask() {
		return currentTask;
	}
	public void setCurrentTask(Task currentTask) {
		this.currentTask = currentTask;
	}
	public AllWork getAllWork() {
		return Employee.allWork;
	}
	public void setAllWork(AllWork allWork) {
		Employee.allWork = allWork;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name!=null && !name.isEmpty()){
			this.name = name;
		}else{
			this.name = "Steve";
		}
	}
	public int getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {
		this.hoursLeft = hoursLeft;
	}
}
