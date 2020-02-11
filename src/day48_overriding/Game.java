package day48_overriding;

public class Game {
   public static void main(String[] args) {
	   SoccerPlayer p1 = new SoccerPlayer();
	   p1.age =30;
	   p1.gender="male";
	   p1.name = "Benzema";
	   
	   p1.bycicleKick();
	   p1.train();
	   p1.eat();
	   p1.run();
	   
	   ClubPlayer cp=new ClubPlayer();
	   cp.run();
//------------------------------------------------------	   
	   final int i = 5;   // final local variable cannot be changeble
//	   i=2;
//-------------------------------------------------------	   
   }
}
