//method overriding
class Parent{
	static void fun(){
		System.out.println("In parent fun");
	}
}
class Child extends Parent{
	static void fun(){
		System.out.println("In child fun");
	}
}
class Client{
	public static void main(String[] args){
		Parent obj=new Child();
		obj.fun();
	}
}
