//method overriding
class Parent{
	int fun(){
		System.out.println("Parent fun");
		return 10;
	}
}
class Child extends Parent{
	int fun(){
		System.out.println("Child fun");
		return 20;
	}
}
class Client{
	public static void main(String[] args){
		Parent obj=new Child();
		obj.fun();
	}
}
