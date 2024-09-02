package controller;
/*
 * 4) Fazer uma aplicação de uma corrida de sapos, com 5 Threads, cada Thread 
controlando 1 sapo. Deve haver um tamanho máximo para cada pulo do sapo (em 
metros) e a distância máxima para que os sapos percorram. A cada salto, um sapo pode 
dar um salto de 0 até o tamanho máximo do salto (valor aleatório). Após dar um salto, a 
Thread, para cada sapo, deve mostrar no console, qual foi o tamanho do salto e quanto 
o sapo percorreu. Assim que o sapo percorrer a distância máxima, a Thread deve 
apresentar que o sapo chegou e qual sua colocação.
Dica: O exercício deve ser resolvido todo em console, ou seja, como se estivesse sendo 
narrado. Atenção para a forma de definir a ordem de chegada.
 */
public class ThreadSapo extends Thread
{
	private int sapo;
	private static int vencedor;
	
	public ThreadSapo(int sapo)
	{
		this.sapo=sapo;
		
	}
	public void run()
	{
		corridaSapo();
	}
	private void corridaSapo()
	{
	int soma=0;
	int salto=0;
			
		while(soma<100)
			{
				salto=(int)(Math.random()*9+1);
				soma+=salto;
				System.out.println("Sapo "+sapo+ "  Saltou  :" + salto+" cm" +"\ntotal percorrido :"+soma+"cm\n");
				if(soma>=100)
				{
					vencedor++;					
					System.out.println("Sapo " + sapo+" "+vencedor+"º colocado");					
				}
			}
		
		
	
		
		
	}
	
}
