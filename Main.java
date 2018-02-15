public class Main{
	static void DeterminarNumeroPrimo(int numero,boolean primo){
		for(int i=2;i<numero;i++){
			if((numero%i)==0){
				System.out.println(numero+" No es numero primo");
				i=numero;
				primo=false;
			}
		}
		if(primo==true){
			System.out.println(numero+" Es numero primo");
		}
	}
	public static void main(String[] arg){
		int a=5,b=10,c=15;
		boolean primo=true;
		DeterminarNumeroPrimo(a,primo);
		primo=true;
		DeterminarNumeroPrimo(b,primo);
		primo=true;
		DeterminarNumeroPrimo(c,primo);
	}
}