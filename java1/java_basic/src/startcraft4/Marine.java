package startcraft4;

public class Marine extends Unit implements Terran {

	public Marine(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 80;
	}

	@Override
	public void attack(Unit unit) {
		System.out.println(this.name + "이(가) " + unit.getName() + "을 공격합니다.");
		// 질럿의 공격력 this.power
		unit.beAttacked(this.power);
	}

}
