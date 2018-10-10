package com.example.demo;

public class First {
	//����һ��˽�о�̬����
   private static First Obj ;
   //����������
   private First(){}
   //��̬�������ö���
   public static First getObj(){
	   if(Obj==null){
		   Obj=new First();
	   }
	   return Obj;
   }
}

