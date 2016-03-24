/*
 * 1. In a Runner class, make Spongebob. Use the methods below to make him eat, and laugh.
 * 2. Make Patrick and Squidward and print their name, have them eat, and make them laugh.
 */
public class spongerunner {

	public static void main(String[] args) {
		Spongebob sponge = new Spongebob("Spongebob");
		Spongebob squid = new Spongebob("Squidward");
		Spongebob patrick = new Spongebob("Patrick");
		
		sponge.eat();
		sponge.laugh();
		
		System.out.println(squid.getName());
		squid.eat();
		squid.laugh();
		
		System.out.println(patrick.getName());
		patrick.eat();

		patrick.laugh();
	}

}
