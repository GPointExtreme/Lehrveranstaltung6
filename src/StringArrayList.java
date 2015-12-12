import java.util.ArrayList;

public class StringArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> myStringList = 
				new ArrayList<String>();
		
		myStringList.add("Frog");
		myStringList.add("Cow");
		myStringList.add("Snkae");
		
		System.out.println(myStringList.size());
		
		System.out.println(myStringList.contains("Cow"));
		
		for(String animal : myStringList) {
			System.out.println(animal);
		}
		
	}

}
