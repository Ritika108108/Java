//method overloading
class Demo{
	void fun(int x){
		System.out.println("Int para");
	}
	void fun(float y){
		System.out.println("Float para");
	}
}
class Client{
	public static void main(String[] args){
		Demo obj=new Demo();
		obj.fun(10.5f);
	}
}
