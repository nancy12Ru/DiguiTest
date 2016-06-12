package digui;

public class digui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr='a';
		//String s="abcd";
		//Func(s+0);
		//Func(arr);
		//System.out.println("\n-------------------");
		//Func1(arr);
		//System.out.println("\n-------------------");
		//Func2(arr);
		//System.out.println("\n-------------------");
		//Func3(arr);
		//System.out.println("\n-------------------");
		Func4(arr);
	}
	public static void Func(char ch){
		if(ch<='d'){
			System.out.print(ch);
			Func((char) (ch+1));
			
		}
	}

	public static void Func1(char ch){
		if(ch<='e'){
			Func1((char) (ch+1));
			System.out.print(ch);	
		}
	}
	
	public static void Func2(char ch){
		if(ch<='d'){
			System.out.print(ch);	
			Func2((char) (ch+1));
			System.out.print(ch);	
		}
	}
	
	public static void Func3(char ch){
		if(ch<='d'){
			Func3((char) (ch+1));
			System.out.print(ch);	
			Func3((char) (ch+1));
			//System.out.print(ch);	
		}
	}
	
	public static void Func4(char ch){
		if(ch<='d'){
			Func4((char) (ch+1));
			Func4((char) (ch+1));
			System.out.print(ch);	
			//System.out.print(ch);	
		}
	}
}
