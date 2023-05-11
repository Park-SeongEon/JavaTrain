package t20230428;

public class Test02 {

	public static void main(String[] args) {
		Human2 gildong = new Human2("길동", 170, 60);
		Human2 chulsh = new Human2("철수", 166, 72);
		
		gildong.gainWeght(3);    //길동이 3kg 쪗다
		chulsh.reduceWeight(5);   //철수가 5kg 빠졌다
		
		System.out.println("이름:" + gildong.getName());
		System.out.println("신장:" + gildong.getHeight() + "cm");
		System.out.println("체중:" + gildong.getWeight() + "kg");
		System.out.println();
		
		System.out.println("이름:" + chulsh.getName());
		System.out.println("신장:" + chulsh.getHeight() + "cm");
		System.out.println("체중:" + chulsh.getWeight() + "kg");

	}

}
