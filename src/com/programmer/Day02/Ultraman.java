package com.programmer.Day02;

public class Ultraman {
   private String name;
   private int hp;
   
   
   public Ultraman() {
	super();
	// TODO Auto-generated constructor stub
}


public Ultraman(String name, int hp) {
	super();
	this.name = name;
	this.hp = hp;
}


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


//普通攻击
   public void Attack(Monster m) {
	   //做一个伤害
	   int injury = (int)(Math.random()*10+20);
	   //获取小怪兽的血量
	   //获取奥特曼的血量
	   int hp = m.getHp();
	   hp -= injury;
	   //血量为0时怎么办
	   if(hp>=0) {
		   m.setHp(hp);
	   }else {
		   m.setHp(0);
	   }
 
   }
//必杀攻击
   public void HugeAttack(Monster m) {
	   //做一个伤害
	   int injury = (int)(m.getHp()*0.75) > 60 ? (int)(m.getHp()*0.75) : 60;
	   //获取小怪兽的血量
	   //获取奥特曼的血量
	   int hp = m.getHp();
	   hp -= injury;
	   //血量为0时怎么办
	   if(hp>=0) {
		   m.setHp(hp);
	   }else {
		   m.setHp(0);
	   }
	   
   }
   //魔法
   public void MagicAttack(Monster[] m) {
	   for(Monster ms :m) {//数组里面
		   int hp = ms.getHp();
		   hp-= 30;
		 //血量为0时怎么办
		   if(hp>=0) {
			   ms.setHp(hp);
		   }else {
			   ms.setHp(0);
		   }
	   }
	   
	   
   }
}
