//print number is a perfect number or not
class Demo{
	public static void main(String[]args){
	int n=6;
	int sum=0;
	for(int i=1;i<n;i++){
		if(n%i==0){
			sum=sum+i;
		}
	}
		if(sum==n){
			System.out.println("Perfect no.");
		}
		else{
			System.out.println("Not a perfect no.");
		}
	}
}

