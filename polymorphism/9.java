//Real time example of method overriding
class Match{
        void matchType(){
                System.out.println("T20/Oneday/WorldCup");
        }
}
class IPLMatch extends Match{
	void matchType(){
		System.out.println("T20");
	}
}
class TestMatch extends Match{
	void matchType(){
		System.out.println("Test");
	}
}
class Client{

        public static void main(String[] args){
                Match type1=new IPLMatch();
		type1.matchType();
                Match type2=new TestMatch();
                type2.matchType();
		Match type3=new Match();
        }
}
