
//method overriding
class Parent{
	Parent(){
		System.out.println("Parent constructor");
	}
	void property(){
		System.out.println("Home,Car,Gold");
	}
	void marry(){
		System.out.println("Deepika Padukon");
	}
}
	class Child extends Parent{
		Child(){
			System.out.println("Child constructor");
		}
		void marry(){
			System.out.println("Alia Bhatt");
		}
	}
	class Client{
		public static void main(String[] args){
			Child obj=new Child();
			obj.property();
			obj.marry();
		}
	}

