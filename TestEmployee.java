//Test Class
public class TestEmployee {

	public static void main(String[] args) {
		
	Manager manager = new Manager("Ahmad Abu","A11981",6300.00,1300.00);
	SalesPerson salesPerson = new SalesPerson("Nur Atiqah Kamal","S02063",2500,1200);
	
	System.out.println(manager.toString());
	System.out.println(salesPerson.toString());	
	}

}
