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


//��ͨ����
   public void Attack(Monster m) {
	   //��һ���˺�
	   int injury = (int)(Math.random()*10+20);
	   //��ȡС���޵�Ѫ��
	   //��ȡ��������Ѫ��
	   int hp = m.getHp();
	   hp -= injury;
	   //Ѫ��Ϊ0ʱ��ô��
	   if(hp>=0) {
		   m.setHp(hp);
	   }else {
		   m.setHp(0);
	   }
 
   }
//��ɱ����
   public void HugeAttack(Monster m) {
	   //��һ���˺�
	   int injury = (int)(m.getHp()*0.75) > 60 ? (int)(m.getHp()*0.75) : 60;
	   //��ȡС���޵�Ѫ��
	   //��ȡ��������Ѫ��
	   int hp = m.getHp();
	   hp -= injury;
	   //Ѫ��Ϊ0ʱ��ô��
	   if(hp>=0) {
		   m.setHp(hp);
	   }else {
		   m.setHp(0);
	   }
	   
   }
   //ħ��
   public void MagicAttack(Monster[] m) {
	   for(Monster ms :m) {//��������
		   int hp = ms.getHp();
		   hp-= 30;
		 //Ѫ��Ϊ0ʱ��ô��
		   if(hp>=0) {
			   ms.setHp(hp);
		   }else {
			   ms.setHp(0);
		   }
	   }
	   
	   
   }
}
