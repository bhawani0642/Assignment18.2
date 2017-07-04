import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * Create a class named Main it should contains ou main method
 * @author Pri
 *
 */
public class MainClass  {
	//Main method
	public static void main(String[] args) {
		//Created an array-list
		List<HDTV> list= new ArrayList<HDTV>();
		
		//By using add method we have added three objects of HDTV
	    list.add(new HDTV("Samsung",32));
	    list.add(new HDTV("Samsung",50));
	    list.add(new HDTV("Samsung",40));
	    
	    
	    //Calling the sort method from the collection class
	    Collections.sort(list,new Inches());
	    System.out.println("sorted based on length");
	    //Applying for-each loop
	    for(HDTV M:list){
	    	System.out.println(M);

	}

	}
	}

	
	

	


