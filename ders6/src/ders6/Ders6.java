package ders6;
import java.util.Scanner;
public class Ders6 {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	double[] values=new double[100];
	
	double sum=0;
	int count=0;
	
	double item;
	do {
		System.out.print("enter the " + (count+1) + ". value: ");
		item=input.nextDouble();
		
		values[count]=item;
		
		sum += item;
		count++;
		
	}while(item >= 0);
	
	
	if(item<0) {
		System.out.println(count+ ". number canceled..");
		count--;
		sum+=values[count]*(-1);
		System.out.println("last value: "+ values[count-1]);
		
	}
	
	System.out.println("number of all value: " + count);
	double average= (sum / count);
	
	int aboveofaverage=0;
	int underofaverage=0;
	int equalofaverage=0;
	
	for(int i=0;i<count;i++) {
		if(values[i] > average) {
			aboveofaverage++;
		}
		else if(values[i]== average) {
			equalofaverage++;
		}
		else {
			underofaverage++;
		}
	}
	System.out.println("sum: "+sum);
	System.out.println("average: "+average);
	
	System.out.println("count of above the average: " + aboveofaverage);
	System.out.println("count of equal the average: " + equalofaverage);
	System.out.println("count of under the average: " + underofaverage);
	
	
	}

}
