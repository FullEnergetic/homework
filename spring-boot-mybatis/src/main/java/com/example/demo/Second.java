package com.example.demo;

import java.util.ArrayList;

public class Second {

	  // ��������
	  private static final int N = 10;
	  // ���N��ʵ�����������
	  private static ArrayList<Second> list = new ArrayList<Second>(N);
	  // ÿ���������� ��ʶ
	  private int no;
	  // ˽�й��췽�� ��ֹ���Ӧ�ó���ʵ����
	  private Second(int no) {
	    this.no = no;
	    System.out.println("-- Create Multipleton Object[" + no + "]!");
	  }
	  // ʵ����N������ʵ��
	  static {
	    // ���Second����ʵ��
	    for (int i = 0; i < N; i++) {
	      list.add(new Second(i));
	    }
	  }
	  /**
	   * ������ ʵ������
	   */
	  public static Second getRandomInstance() {
	    // ����������
	    int num = (int) (Math.random() * N);
	    // ���list�еĶ���ʵ��
	    return list.get(num);
	  }
	  public int getNo() {
	    return no;
	  }
	  public void setNo(int no) {
	    this.no = no;
	  }
}
