import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerManager1 = new NeroCustomerManager(new MernisServiceAdapter());
		customerManager1.save(new Customer(123, "Emine", "Özbek", LocalDate.of(1997, 7, 11), "11111111111"));

		BaseCustomerManager customerManager2 = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager2.save(new Customer(456, "Hasan", "Olcan", LocalDate.of(1990, 2, 9), "11111111111"));
		
	}

}
