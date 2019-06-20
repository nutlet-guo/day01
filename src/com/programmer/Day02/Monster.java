package com.programmer.Day02;

public class Monster {
	private String name;
	private int hp;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public Monster() {
		
		
	}
	public Monster(String name, int hp) {
		super();
		this.name = name;
		this.hp = hp;
	}
	public void Attack(Ultraman u) {
		//做一个伤害
		   int injury = (int)(Math.random()*10+10);
		//获取奥特曼的血量
		   int hp = u.getHp();
		   hp -= injury;
		   //血量为0时怎么办
		   if(hp>=0) {
			   u.setHp(hp);
		   }else {
			   u.setHp(0);
		   }
	}
	
	
	
	
}
