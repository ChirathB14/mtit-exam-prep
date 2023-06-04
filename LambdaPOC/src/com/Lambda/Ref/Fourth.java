package com.Lambda.Ref;

interface IFoodService{
	void display();
}

class Food {
	public Food() {
		System.out.println("Food construction...");
	}
}

public class Fourth {
	public static void main(String[] args) {
		IFoodService iFood = Food::new;
		iFood.display();
	}
}
