package codewars_kata;

public class DoIGetABonus {
	
	public static String bonusTime(final int salary, final boolean bonus) {
		if (bonus == true) {
			return "£" + salary*10;
		} else if (bonus == false) {
			return "£" + salary;
		} else {
			return null;
		}
	} 
}

