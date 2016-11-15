
public class main{

	public static void main (String[] args) {
		
		System.out.println("Saskatchewan prairies........");
		
		wolf w=new wolf("wolf",3,3,false,"Wooooo");
		fox f=new fox(2,2,false,"fox","cccc");
		grass g=new grass(false,"Grass");

		w.print3();
		
		g.print();
	}

}
