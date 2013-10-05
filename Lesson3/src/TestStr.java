
public class TestStr {

	public static void main (String[] args) {
	
	  String gfriend="Masha";
	
	  if (gfriend=="Masha"){
		  System.out.println("1.gfriend==\"Masha\" - same objects");
	  }
	  else {
		  System.out.println("1.gfriend==\"Masha\" - different objects");
	  }

	  String gfriend1 = new String("Natasha");
	  String gfriend2 = new String("Natasha");
	
	  if (gfriend1==gfriend2){ 
		  System.out.println("2.gfriend1==gfriend2 - same objects");
	  }	
	  else {
		  System.out.println("2.gfriend1==gfriend2 - different objects");
	  }
	  
	  if (gfriend1.equals(gfriend2)) {
		  System.out.println("3.gfriend1.equals(gfriend2) - same values");
	  }
	  else {
	      System.out.println("3.gfriend1.equals(gfriend2) - different values");
      }
	}
}
