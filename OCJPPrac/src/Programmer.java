


	
	class Writer {
	public static void write() {
	System.out.println("Writing...");
	}
	}
	class Author extends Writer {
	public static void write() {
	System.out.println("Writing book");
	}
	}
	public class Programmer extends Writer {
	public static void write() {
	System.out.println("Writing code");
	}
	public static void main(String[] args) {
		Writer w = new Programmer();
		Writer pr = new Writer();
		pr.write();
	    w.write();
	   
	   
	   int x = 0, y=10;          
	      try{
	          y /=x; 
	           }
	    
	         catch(Exception e){
	          System.out.print("error");

	}
	
	}
	}

