package com.epam.Calculator;

class Division{
	int a;
	int b;
	public Division(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public String divide() {
		if(this.b!=0)
			return Integer.toString(this.a/this.b);
		else
			return "Error : Division by Zero";
			
	}
}