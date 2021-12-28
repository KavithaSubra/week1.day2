package week1.day2;

public class LearnLooping {
public static void main(String[] args) {
	//same set of code to be executed multiple times
	//want to print 1 to 5
	//initialize; Condition; Increment/Decrement
	for(int i=1;i<=5;i++)//i++ = i+1
	System.out.println(i);
	
	//Post increment
	int j=10;
	System.out.println(j++);
	System.out.println(j);
	
	//Pre-increment
	int k=10;
	System.out.println(++k);
	System.out.println(k);
}
}
