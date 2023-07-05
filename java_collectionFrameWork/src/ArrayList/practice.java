package ArrayList;

@FunctionalInterface
interface parser{
		String parse(String str);
}

class Strparse{
	public static String convert(String s) {
		if (s.length()>3) {
						s=s.toUpperCase();
		}
		else {
			s=s.toLowerCase();
		}
		return s;
	}
	
	public static String hoho() {
		return "kam";
	}
}

class Myprinter{
	
	public void print(String s, parser p) {
		s= p.parse(s);
		System.out.println(s);
}
}

public class practice {

	public static void main(String[] args) {
		
//		List<String> name= Arrays.asList("man","woman","pande","kanda");
		
//		Consumer<String> con= s -> System.out.println(s);	
//		name.forEach(con -> System.out.println(con));
		
//		name.forEach(System.out::println); 
		// that how we pass method in a method '::' indicates that it is a method and we are giving it the location 			where this method "println" come from which is "System.out"
		
		

		String string="Man will be men";
		Myprinter mp= new Myprinter();
		
		//	mp.print(string, (j-> Strparse.convert(string)));// we can also write is as:
		mp.print(string, Strparse::convert);
		// we can directly access it, coz it is static in nature
		// else we have to create an obj for it
		// this is callled method reference, which take string as an arguement
		
		mp.print(Strparse.hoho(), Strparse::convert);		;
	}
	}


