import java.util.Comparator;
/**
 * Created a class inches it implements comparator 
 * @author Pri
 *
 */
public class Inches implements Comparator<HDTV> {
	//as we are sorting based on integer we only need Compare method 
public int compare(HDTV TV, HDTV TV1){
	//logic for sorting
 if(TV.getSize()<TV1.getSize()){
	 return -1;
 } else{
	return 1;
 }
}
}
