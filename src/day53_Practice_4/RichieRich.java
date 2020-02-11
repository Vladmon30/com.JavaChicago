package day53_Practice_4;

public class RichieRich extends RichardRich {
//the son
	
	@Override
	public void spendDaily(int spend) {
		if(spend>=50000) {
			System.out.println("Son you have been regected");
		}else {
			System.out.println("Purchse made.");
		}
	
	}
}
