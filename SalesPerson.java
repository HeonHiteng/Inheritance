//Class salesperson
public class SalesPerson extends Employee{
        private double commission;
		
		public SalesPerson(String name,String num,double basic,double commission) {
			super(name,num,basic);
			this.commission=commission;
		}
		
		public double getCommission() {
			return commission;
		}
		public String toString() {
			return "The SalesPerson "+ getName()+ "(employee number "+ getNum() + ") has a salary of "+ getBasic() + " and has a commission of "+ getCommission();
		}
 
		
}
