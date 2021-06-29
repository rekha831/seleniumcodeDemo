package batch14;

import java.util.ArrayList;

public class Collect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ArrayList<Object> arr = new ArrayList<Object>();
		 arr.add("rekha");
		 arr.add(12);
		 arr.add(12.4);
		 arr.add("rekharam");
		 
		 for(Object e:arr) {
			 e.toString();
			System.out.println(e);
			
		 }

	}

}
