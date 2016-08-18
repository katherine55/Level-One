
public class Olympian {

String name;
String sport;
String gender;
int age;
String country;
int numMedals;
int bibNum;
static int number = 0;

Olympian (String name, String sport, String gender, int age, String country, int numMedals){
	
	this.name = name;
	this.sport = sport;
	this.gender = gender;
	this.age = age;
	this.country = country;
	this.numMedals = numMedals;
	number++;
	bibNum+=number;
	
}

void perform (){
	if(country.equals("USA")){
		System.out.println(name + ", number "+bibNum + ", competed in "+ sport+ " and won. Go Team USA!");
		
	}
	else{
		System.out.println(name + ", number "+bibNum + ", competed in "+ sport+ " and lost bc they didn't win");
	}
	
}

}
