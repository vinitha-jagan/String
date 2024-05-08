package stringmethods;

public class Stringgroups {
	
	public static void main(String[] args) {
		
		String a="Jagan is a Smartest guy";
		
	     String aa="jagan is a Smartest guy";
		//1
		char a1 = a.charAt(3);
		
		System.out.println(a1);
		
	//2
	int b = a.indexOf('g');
	
	System.out.println(b);
	//3
	int b1 = a.lastIndexOf('t');
	System.out.println(b1);
	//4
	String c = a.toUpperCase();
	//5
	System.out.println(c);
	//6
	String d = a.toLowerCase();
	
	System.out.println(d);
	
	//7
	
	boolean e = a.isEmpty();
	
	System.out.println(e);
	//8
	
	boolean e1 = a.startsWith("Jagan");
	
	System.out.println(e1);
	//9
    boolean f = a.startsWith("jagan");
    System.out.println(f);
    //10
    int f1 = a.lastIndexOf('n');
    
    System.out.println(f1);
    //11
    boolean g = a.contains("Jagan");
    
    System.out.println(g);
    //12
    boolean h = a.equals(aa);
    
    System.out.println(h);
    
    //13
    boolean h1 = a.equalsIgnoreCase(aa);
    
    System.out.println(h1);
    //14
    int i = a.compareTo(aa);
    System.out.println(i);
    
    //15
    
    String i1 = a.replace('J', 'v');
    
    System.out.println(i1);
    //16
    String j = a.replaceAll("Jagan is a", "vinitha is a");
    
    System.out.println(j);
    
    
    
    
    
    
    
    
    
    
	
	
	
	
	
	}
	
	

}
