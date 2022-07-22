package com.bilgeadam.boost.course02.lesson069;

public class Test {

	public static void main(String[] args) {
		Person talha = new Person("Talha", "Çamlıca");
		Person mehmet = new Person("Mehmet Hasan", "Çiftçi");
		Person babur = new Person("Babür", "Somer");
		
		PersonController pC = new PersonController();
		pC.create(talha);
		pC.create(mehmet);
		pC.create(babur);
		
		Skill java = new Skill();
		java.setName("Java");
		Skill dotNet = new Skill(".Net");
		SkillController sC = new SkillController();
		sC.create(java);
		sC.create(dotNet);
		
		System.out.println(talha);
		System.out.println(mehmet);
		System.out.println(babur);
		System.out.println(java);
		System.out.println(dotNet);
		
		Rating r1 = new Rating(talha, mehmet, java, 5);
		Rating r2 = new Rating(babur, mehmet, java, 6);
		Rating r3 = new Rating(babur, talha, dotNet, 10);
		Rating r4 = new Rating(mehmet, babur, java, 3);
		Rating r5 = new Rating(talha, babur, java, 2);
		RatingController rC = new RatingController();
		rC.create(r1);
		rC.create(r2);
		rC.create(r3);
		rC.create(r4);
		rC.create(r5);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
	}

}
