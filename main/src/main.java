
public class main{

	public static void main (String[] args) {
		
		System.out.println("Saskatchewan prairies........");
		System.out.println("------------------------");
		
		wolf w=new wolf("wolf",3,3,false,"Wooooo");
		hawk h=new hawk("hawk",3,4,false,"Gaaaaaaaaa");
		
		deer d=new deer("Deer",3,3,false,"Deeeeeee");
		rabbit r=new rabbit("rabbit",3,2,false,"raaaaaaaaa");
		squirrel s=new squirrel("rabbit",3,2,false,"raaaaaaaaa");
		mouse m=new mouse("mouse",3,2,false,"Mooooooooo");
		grassHopper gh=new grassHopper("grassHopper",3,2,false,"Grrrrrrrrr");
		caterpillar c=new caterpillar("caterpillar",3,2,false,"Grrrrrrrrr");
		
		bluejay b=new bluejay("bluejay",3,4,false,"bllllllll");
		
		grass g=new grass(false,"Grass");
		tree t=new tree(false,"Tree");

		d.eat(g);
		h.print();
		w.print();
		t.print();
		g.print();
	}

}
