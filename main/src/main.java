

public class main{

	public static void main (String[] args) {
		wolf w=new wolf("wolf",3,3,false,"Wooooo");
		fox f=new fox(2,2,false,"fox","cccc");
		w.eat(f);
		w.eat(f);
		w.print3();
		System.out.println("Hello");
	}

}
