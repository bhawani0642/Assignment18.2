/**
 * Cretaed a class named HDTV
 * @author Pri
 *
 */

public class HDTV  {
	String brand;
	int size;
	//Created getters and setters
 public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
//Created a constructor and initialize it
public HDTV(String brand,int size){
	 this.brand=brand;
	 this.size=size;
}
//Here we have toString method it will returns the string representation of the object.
public  String toString(){
return "shorted as per size of TV "+size;



}
}