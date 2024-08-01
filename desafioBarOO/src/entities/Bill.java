package entities;

public class Bill {
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public double cover() {
		return 4.00;
	}
	
	public double feeding() {
		return (beer*5) + (barbecue*7)+(softDrink*3);
	}
	
	public double ticket() {
		if(gender =='m' || gender=='M') {
			return 10.0;
		}else{
			return 8.0;
		}
	}
	
	public double total() {
		if(feeding()>30) {
			return feeding()+ticket(); 
		}else {
			return feeding()+cover()+ticket();
		}
	}
	
	public void relatorio() {
		System.out.printf("Consumo = R$ %.2f\n", feeding());
		if(feeding()>30) {
			System.out.println("Isento de couvert");
		}else {
			System.out.printf("Couvert = R$ %.2f\n", cover());
		}
		System.out.printf("Ingresso = R$ %.2f\n",ticket());	
		System.out.printf("Valor a pagar = R$ %.2f\n", total());	
	}
	
}
