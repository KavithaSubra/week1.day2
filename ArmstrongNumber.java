package week1.day2;

public class ArmstrongNumber {
public static void main(String[] args) {
	int num = 153, origNum, rem, result = 0;
	origNum = num;
	while(origNum!=0)
	{
		rem = origNum % 10;
		result = result + (rem*rem*rem);
		origNum = origNum/10;
	}
	
	if (result == num)
	{
		System.out.println(num + " is an Armstrong number");
	}
	else
	{
		System.out.println(num + " is not an Armstrong number");
	}	
}
}
