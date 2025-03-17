package OOPs;

import java.util.ArrayList;

public class object_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OOPS sample = new OOPS();
		sample.tomethod();
		sample.tomethod1();
		
		System.out.println(sample.age);
		System.out.println(sample.string);
		
		 ArrayList<String> sample1 =new ArrayList<>();
		 
		 sample1.add("sai");
		 sample1.add("saiaishu");
		 
		 for (int i=0; i<sample1.size();i++) {
			 System.out.println(sample1.get(i));
		 }
	}

}
