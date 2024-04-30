package GestisciConsole;

import java.time.LocalTime;

public class Prove {

	public static void main(String[] args) {
		ConsoleManage cm = new ConsoleManage();
		LocalTime[] cTime = new LocalTime[2];
		cTime = (cm.giveTime("Inserisci un orario (hh:mm)", "Non è stato riscontrato come orario",
				"Non è stato inserito un orario", 3));
		if (cTime[0].equals(LocalTime.of(00,01))) {
			LocalTime time = cTime[1];
			System.out.println("L'orario inserito è: " + time);
		}

	
	
	}

}
