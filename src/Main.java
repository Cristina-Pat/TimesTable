
public class Main {

	public static void main(String[] args) {
		TimesTable t = new TimesTable();
		t.populateTimesTable(3);
		t.printTimesTable();
		
		TimesTable t2 = new TimesTable();
		t2.populateTimesTable(5);
		t2.printTimesTable();
		
		TimesTable t3 = new TimesTable();
		t3.populateTimesTable(6);
		for(int n: t3.getMyTimesTable()) {
		    System.out.println(n);
		}

	}

}
