import java.util.*;

public class MenoreseMaiores4 {
	public static void main(String arg[]) {
		Scanner in = new Scanner(System.in);
		int i, a[], maior, menor;
		a = new int[3];
		
		System.out.println("entre com 1º valor do vetor");
		a[0]=in.nextInt();
		maior=a[0];
		menor=a[0];
		
		for(i=1;i<10;i++) {
			System.out.println("entre com o "+(i+1)+"do vlor do vetor");
			a[i]=in.nextInt();
			if(a[i]>maior) {
				maior=a[i];
				
				
			}else if(a[i]<menor) {
				menor=a[i];
			}
			System.out.println("o maior valor é :"+maior);
			System.out.println("o menor valor é :"+menor);
			in.close();
		}
	
	}
		
	
}
 
	


/*
 maior=max_value(numero mt alto mt alto)
 menor=min+value(vai ir numero muito baixo)
 */
 */
/*4) Ler um vetor A de 10 inteiros.
 Apresentar o maior valor e o menor valor lido.
*/