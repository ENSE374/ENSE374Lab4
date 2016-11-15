
public class main{

	public static void main (String[] args) {
		
		System.out.println("Saskatchewan prairies........");
		
		wolf w=new wolf("wolf",3,3,false,"Wooooo");
		fox f=new fox(2,2,false,"fox","jajajajajaja");
		hawk h=new hawk("hawk",3,3,false,"Gaaaaaaaaa");
		grass g=new grass(false,"Grass");
		tree t=new tree(false,"Tree");

		h.print();
		f.print();
		w.print();
		t.print();
		g.print();
	}

}
