import java.util.Scanner;
public class PenultimoVetor2 {
	public static void main (String arg[]) {
		Scanner in=new Scanner (System.in);
		int i,l,a[],b[];
		a=new int[10];
		b=new int[10];
		
		l=9;
		
		for(i=0;i<10;i++) {
			System.out.println("Digite o elemento do vetor");
			a[i]=in.nextInt();
			b[l]=a[i];
			l--;
		}
		System.out.print("Vetor A [");
		for(i=0;i<10;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("] ");
		
		System.out.print("Vetor B [");
		for(i=0;i<10;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print("] ");
		in.close();
		
	}

}


/*2) Criar um vetor A com 10 inteiros. Calcular e apresentar um vetor B, onde B terá os
mesmos elementos de A em ordem inversa. Ou seja, o 1º elemento 
de B será o ultimo de A, o segundo elemento de B será o penúltimo de A e assim sucessivamente.
*/