package cn.com.day1;
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Test t = new Test();
		t.method2();
	}
	
	public void method1(){
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}
	}
	
	public void method2(){
		int temp=0;
		int[] arr= {1,2,4,7,5,6,9,12};
		for (int i = 1; i < arr.length; i++) {
			for (int j = i-1; j < arr.length-1; j++) {
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		for (int i : arr) {
		    System.out.print(i+"\t");	
		}
	}
	

}
