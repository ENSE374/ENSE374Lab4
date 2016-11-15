
public class main{

	public static void main (String[] args) {
		
		System.out.println("Saskatchewan prairies........");
		System.out.println("------------------------");
		
		wolf w=new wolf("wolf",3,3,false,"Wooooo");
		fox f=new fox("fox",2,2,false,"Fooooooooo");
		hawk h=new hawk("hawk",3,4,false,"Gaaaaaaaaa");
		
		deer d=new deer("Deer",3,3,false,"Deeeeeee");
		rabbit r=new rabbit("rabbit",3,2,false,"raaaaaaaaa");
		grass g=new grass(false,"Grass");
		tree t=new tree(false,"Tree");

		d.eat(g);
		h.print();
		f.print();
		w.print();
		t.print();
		g.print();
	}

}
