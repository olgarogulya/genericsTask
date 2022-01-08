package by.epam.training.mylist.entity;

//import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		MyList<String> list = new MyList<String>();
		
		list.add("Minsk");
		list.add("Paris");
		list.add("London");
		list.add("Miami");
		list.add("Vienna");
		list.add("Rome");
		list.print();
		System.out.println("**********");
		//list.remove(0);
		list.add(1, "NewTown");
		list.print();
		System.out.println("**********");
		list.sort();
		list.print();
	}

}
