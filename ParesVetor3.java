import java.util.*;
public class ParesVetor3 {
	public static void main(String arg[]) {
		Scanner in= new Scanner(System.in);
		int i, a[], l = 0;
				
	  a=new int[10];
	  
	  for(i=0;i<10;i++) {
		  System.out.println("digite o numero inteiro");
		  a[i]=in.nextInt();
		  if(a[i]%2==0) {
			  System.out.println("o numero: "+a[i]+" é par");
			  l++;
		  }
		 
			 
		  
	  }
	         System.out.print("a quantidade de numeros pares é de :"+l);
	}
}





/*3) Criar um vetor A com 10 inteiros. Calcular e apresentar quais
  e quantos elementos de A são números pares;
*/