//Class manager
public class Manager extends Employee{
			private double allowance;
			
			
			public Manager(String name,String num,double basic,double allowance) {
				super(name,num,basic);
				this.allowance=allowance;
			}


			public double getAllowance() {
				return allowance;
			}
			
			public String toString() {
				return "The Manager "+ getName()+ "(employee number "+ getNum() + ") has a salary of "+ getBasic() + " and has an allowance of "+ getAllowance();
			}
}
