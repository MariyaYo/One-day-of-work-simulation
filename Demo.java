
public class Demo {
	private static final int NUM_OF_EMPLOYEES = 3;

	public static void main(String[] args) {
		int daysLeft = 5; 
		int days = 1;
			
		Employee.allWork = new AllWork();
		Employee.allWork.addTask(new BuyChocolateForKrasi(1));
		Employee.allWork.addTask(new TakeABrake(2));
		Employee.allWork.addTask(new TakeABrake(1));
		Employee.allWork.addTask(new TakeTheOfficeCatForAWalk(3));
		Employee.allWork.addTask(new TakeTheOfficeCatForAWalk(5));
		Employee.allWork.addTask(new TakeABrake(3));
		Employee.allWork.addTask(new TakeTheOfficeCatForAWalk(6));
		Employee.allWork.addTask(new BuyChocolateForKrasi(1));
		Employee.allWork.addTask(new TakeABrake(3));
		Employee.allWork.addTask(new TakeABrake(2));
		//is there a way to not do this manually
		
		Employee natali = new Employee("Natali");
		Employee gosho = new Employee("Gosho");
		Employee sasho = new Employee("Sasho");
		
		
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
				if(Employee.allWork.isAllWorkDone()){
					System.out.println("All Employees have done their job, they will get " + daysLeft + " days off, because they are too awesome");
					daysLeft =0;
				}
		}	
	}
}
