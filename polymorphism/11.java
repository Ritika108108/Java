//method overloading
class Demo{
        void fun(String str){
                System.out.println("String");
        }
}
class Client{
        public static void main(String[] args){
                Demo obj=new Demo();
                obj.fun("Core2Web");
        }
}
