//method overriding
class Parent{
	Object fun(){
		System.out.println("Parent fun");
		return obj;
	}
}
class Child extends Parent{
	String fun(){
		System.out.println("Child fun");
		return "Shashi";
	}
}
class Client{
	public static void main(String[] args){
		Parent obj=new Child();
		obj.fun();
	}
}
