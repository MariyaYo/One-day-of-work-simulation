

public class AllWork {
	private static final int SIZE_OF_TASK_ARRAY = 10;
	private Task [] tasks;
	private int freePlacesForTasks;
	private int currentUnassignedTask;
	
	
	AllWork(){
		this.tasks = new Task[SIZE_OF_TASK_ARRAY];
		this.freePlacesForTasks = SIZE_OF_TASK_ARRAY;
		this.currentUnassignedTask = 0;
	}
	
	void addTask(Task x){
		if(x != null && freePlacesForTasks > 0){
			this.tasks[SIZE_OF_TASK_ARRAY - freePlacesForTasks--] = x;
		}
	}
	
	Task getNextTask(){
		if(currentUnassignedTask < SIZE_OF_TASK_ARRAY){
			return this.tasks[currentUnassignedTask++];
		}else{
			return null;
		}
	}
	
	boolean isAllWorkDone(){
		int a =0;
		for(int i =0; i<tasks.length; i++){
			if(tasks[i] != null){
				a++;
				//count for all full cells
			}
		}
		for(int i = 0; i < tasks.length; i++){
			if(tasks[i] != null){
				if(tasks[i].getWorkingHours() == 0){
					if(a ==1){
						//if all cells have 0 working hours left only then all of the work is done
						return true;
					}
					a--;
				}
			}
		}
		return false;
	}
}
