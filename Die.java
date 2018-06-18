import java.util.Random;
public class Die {

	int faces;
	public Die(int faces){
		this.faces = faces;
		
	}
	
	public String roll(){
		Random r = new Random();
		String[] HT = {"Head" , "Tail"};
		String[] other = {"One", "Two", "Three", "Four","Five","Six"};
		
		if(this.faces == 2){
			int  output = r.nextInt(this.faces);
			return HT[output];
		}
		else{
			int  output = r.nextInt(this.faces);
			return(other[output]);
		}
	}
	
	public static void main(String[] args) {
		Die d = new Die(2);
		System.out.println("Face of die -> " + d.roll());
	}
}