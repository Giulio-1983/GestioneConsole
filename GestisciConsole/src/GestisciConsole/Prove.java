package GestisciConsole;

import java.time.LocalDate;
import java.time.LocalTime;

public class Prove {

	public static void main(String[] args) {
		ConsoleManage cm = new ConsoleManage();
		LocalDate[] cDate = new LocalDate[2];
		cDate = (cm.giveDate("Inserisci una data (dd/mm/yyyy)", "Non è stata riconosciuta come data",
				"Non è stata inserita una data", 3));
		if (cDate[0].equals(LocalDate.of(0002, 01, 01))) {
			LocalDate date = cDate[1];
			System.out.println("la data inserita è: " + date);
		}

	
	
	}

}
