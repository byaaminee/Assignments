package assignment3_Yaaminee;

public class Calculation {
	
	int num1;
	int num2;
	int num3;
	
	Calculation (){	
	}
	
	Calculation (int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	
	int sum () {
		int tot = 0;
		tot = this.num1+ this.num2 + this.num3;
		
		return tot;
	}
}
