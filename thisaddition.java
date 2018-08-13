package java_addition;
import java.util.*;
public class thisadd {
	int n1,n2,sum;
	int fun(int n1,int n2)
	{
		this.n1=n1;
		this.n2=n2;
		sum=n1+n2;
		return sum;
	}
	public static void main(String ar[]){
		thisadd k=new thisadd();
		System.out.println(k.fun(7, 6));
	}
}
© 2018 GitHub, Inc.