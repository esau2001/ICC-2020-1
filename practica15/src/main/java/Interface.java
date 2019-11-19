public class Interface{

public static Stream<String> f(String s){//tercer método
	return Stream.generate (new Supplier<String>(){
	int i = 0;
	
	public String get(){
	return s.repeat(i++){	
	}
	}
    })

}



public static String ff(List<String> list){//primer método
	return list.stream()
	.filter (s->!s.isBlanck())
	.map(StringBuilder::new)
	.map(StringBuilder::reverse)
	.reduce(new StringBuilder(), StringBuilder::append)
	toString(); 

	
}

public static Stream<String> fff(List<String> )



//Prueba 
//f("ab").limit(10)
	  // .forEach(System.out::println;)
