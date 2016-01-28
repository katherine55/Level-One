
public class Square {
	int length;
	
	Square(int length){
		this.length = length;
		System.out.println(length);
	}
	
	int area(){
		
		return length * length;
		
	}
	int perimeter(){
		
		return 4*length;	
	
	}
	
public static void main(String[] args) {
	Square s1 = new Square(5);
	System.out.println(s1.area());
	
	Square s2 = new Square(55);
	System.out.println(s2.area());
}
}
