import java.util.ArrayList;


public class exeicise219 {	
	/**
	 * @param args
	 */
	public static void test(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
		Gerbil gerbil1 = new Gerbil(100);
		Gerbil gerbil2 = new Gerbil(200);
		Gerbil gerbil3 = new Gerbil(300);
		Gerbil gerbil4 = new Gerbil(400);
		gerbils.add(gerbil1);
		gerbils.add(gerbil2);
		gerbils.add(gerbil3);
		gerbils.add(gerbil4);
		
//		for(Gerbil gb : gerbils){
//			gb.hop();
//		}
		for (int i = 0; i < gerbils.size(); i++){
			gerbils.get(i).hop();
		}	
	}

}

class Gerbil{
	public void hop(){
		System.out.println("Gerbil" + gerbilNumber + " is hopping");
	}
	
	public Gerbil(int gerbilNumber) {
		super();
		this.gerbilNumber = gerbilNumber;
	}
	
	private int gerbilNumber;
}	


