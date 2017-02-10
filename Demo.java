
public class Demo {
	public static void main(String[] args) {
		int daysLeft = 2; 
		int days = 1;
			
		Employee natali = new Employee("Natali");
		Employee gosho = new Employee("Gosho");
		Employee sasho = new Employee("Sasho");
		
		AllWork tasksForAll = new AllWork();
		tasksForAll.addTask(new BuyChocolateForKrasi(1));
		tasksForAll.addTask(new TakeABrake(2));
		tasksForAll.addTask(new TakeABrake(1));
		tasksForAll.addTask(new TakeTheOfficeCatForAWalk(3));
		tasksForAll.addTask(new TakeTheOfficeCatForAWalk(5));
		tasksForAll.addTask(new TakeABrake(3));
		tasksForAll.addTask(new TakeTheOfficeCatForAWalk(6));
		tasksForAll.addTask(new BuyChocolateForKrasi(1));
		tasksForAll.addTask(new TakeABrake(3));
		tasksForAll.addTask(new TakeABrake(2));
		//is there a way to not do this manually
		
		while(daysLeft>0){
			System.out.println("Today is day:  " + days);	
			natali.work();
			gosho.work();
			sasho.work();	
			daysLeft--;
			days++;
			System.out.println("Work for today is over.");
			natali.startWorkingDay();
			gosho.startWorkingDay();
			sasho.startWorkingDay();

		}	
	}
}