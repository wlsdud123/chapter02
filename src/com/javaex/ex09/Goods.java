package com.javaex.ex09;

public class Goods {

	// 필드
	private String name;
	private int price;

	// 생성자
	public Goods() {
	}

	// 메소드 -gs
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	//메소드 - 일반 html(2일)
	public void showInfo(){
	    System.out.println("상품이름: " + name);
	    System.out.println("가격: " + price);
	    System.out.println("");
	}
	
	
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}

}