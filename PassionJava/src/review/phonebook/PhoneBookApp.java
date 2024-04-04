package review.phonebook;

public class PhoneBookApp {
	
	public static void getPersons(PersonController pc) {
		pc.getPersons();
	}
	
	public static void main(String[] args) {
		PersonController pc=new PersonController();
		pc.putPerson("김자바1","010-...1");
		pc.putPerson("김자바2","010-...2");
		pc.putPerson("김자바3","010-...3");
//		pc.getPersons();
		getPersons(pc);
		CustomController cc=new CustomController();
		cc.putPerson("김자바1","010-...1");
		cc.putPerson("김자바2","010-...2");
		cc.putPerson("김자바3","010-...3");
		getPersons(cc);
		
	}

}
