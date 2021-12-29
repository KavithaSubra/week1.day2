package week1.day2;

import java.util.Arrays;

public class FindSecondSmallest {
public static void main(String[] args) {
	int[] data = {23,45,67,32,89,22};
	Arrays.sort(data);
	System.out.println(data[1]);
}
}
