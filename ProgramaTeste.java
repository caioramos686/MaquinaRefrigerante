package maquinaRefri;
import java.util.Scanner;

public class ProgramaTeste {

	public static void main(String[] args) {
		int   opc, qtd;
    	float dinheiro, vlr = 0, maq;
    	float coca = 5.00f, pepsi = 3.00f, sprite = 3.50f, guara = 3.50f;
    	
    	Scanner teclado = new Scanner(System.in);
	    System.out.println("------MAQUINA DE REFRIGERANTE------\n");
	    System.out.println("------- OPC -   SABOR   -  VALOR  -------");
		System.out.printf("-------  1  - Coca-cola - R$ %.2f -------\n", coca);
		System.out.printf("-------  2  - Pepsi     - R$ %.2f -------\n", pepsi);
		System.out.printf("-------  3  - Sprite    - R$ %.2f -------\n", sprite);
		System.out.printf("-------  4  - Guaraná   - R$ %.2f -------\n", guara);
		
		System.out.println("\nDigite a opção escolhida: ");
		opc = teclado.nextInt();

		
		if(opc == 1){
			System.out.println("\nDigite a quantidade: ");
			qtd = teclado.nextInt();
		    System.out.println("\n" + qtd + " Coca-cola(s)");
		    coca *= qtd;
		    System.out.printf("Valor: R$ %.2f Reais\n", coca);
		    vlr *= coca;
		        
		        while (vlr < coca){
		           
		            System.out.println("\nInsira a moeda ou nota: ");
		            System.out.println("*Somente moeda de 50c e 1 real.");
		            System.out.println("*Somente notas de 2, 5 e 10 reais.");
		            dinheiro = teclado.nextFloat();
		                if(dinheiro == 10.00 || dinheiro == 5.00 || dinheiro == 2.00 || dinheiro == 1.00 || dinheiro == 0.50){
		                    vlr += dinheiro;
		                    System.out.printf("\nMaquina: %.2f\n", vlr);
		                } else{
		                    System.out.println("\nValor inválido!");
		                }		             		                
		        }
	    System.out.println("\nPegue sua(s) coca-cola(s)!");
	    maq = vlr - coca;
		if(vlr > coca)
		System.out.printf("Retire seu troco: %.2f", maq);
        }
        
		
        if(opc == 2){
        	System.out.println("\nDigite a quantidade: ");
			qtd = teclado.nextInt();
        	System.out.println("\n" + qtd + " Pepsi(s)");
		    pepsi *= qtd;
		    System.out.printf("Valor: R$ %.2f Reais\n", pepsi);
		    vlr *= pepsi;
		    
		        while (vlr < pepsi){
		           
		            System.out.println("\nInsira a moeda ou nota: ");
		            System.out.println("*Somente moeda de 50c e 1 real.");
		            System.out.println("*Somente nota de 2, 5 e 10 reais.");
		            dinheiro = teclado.nextFloat();
		                if(dinheiro == 10.00 || dinheiro == 5.00 || dinheiro == 2.00 || dinheiro == 1.00 || dinheiro == 0.50){
		                    vlr += dinheiro;
		                    System.out.printf("\nMaquina: %.2f\n", vlr);
		                } else{
		                    System.out.println("\nValor inválido!");
		                }		             		                
		        }
	    System.out.println("\nPegue sua(s) Pepsi(s)!");
	    maq = vlr - pepsi;
		if(vlr > pepsi)
		System.out.printf("Retire seu troco: %.2f", maq);
        }
        
    
        if(opc == 3){
        	System.out.println("\nDigite a quantidade: ");
			qtd = teclado.nextInt();
        	System.out.println("\n" + qtd + " Sprite(s)");
		    sprite *= qtd;
		    System.out.printf("Valor: R$ %.2f Reais\n", sprite);
		    vlr *= sprite;
		    
		        while (vlr < sprite){
		           
		            System.out.println("\nInsira a moeda ou nota: ");
		            System.out.println("*Somente moeda de 50c e 1 real.");
		            System.out.println("*Somente nota de 2, 5 e 10 reais.");
		            dinheiro = teclado.nextFloat();
		                if(dinheiro == 10.00 || dinheiro == 5.00 || dinheiro == 2.00 || dinheiro == 1.00 || dinheiro == 0.50){
		                    vlr += dinheiro;
		                    System.out.printf("\nMaquina: %.2f\n", vlr);
		                } else{
		                    System.out.println("\nValor inválido!");
		                }     
		        }
	    System.out.println("\nPegue sua(s) Sprite(s)!");
	    maq = vlr - sprite;
		if(vlr > sprite)
		System.out.printf("Retire seu troco: %.2f", maq);
        }
        
        
        if(opc == 4){
        	System.out.println("\nDigite a quantidade: ");
			qtd = teclado.nextInt();
        	System.out.println("\n" + qtd + " Guaraná(s)");
		    guara *= qtd;
		    System.out.printf("Valor: R$ %.2f Reais\n", guara);
		    vlr *= guara;
		        while (vlr < guara){
		           
		            System.out.println("\nInsira a moeda ou nota: ");
		            System.out.println("*Somente moeda de 50c e 1 real.");
		            System.out.println("*Somente nota de 2, 5 e 10 reais.");
		            dinheiro = teclado.nextFloat();
		                if(dinheiro == 10.00 || dinheiro == 5.00 || dinheiro == 2.00 || dinheiro == 1.00 || dinheiro == 0.50){
		                    vlr += dinheiro;
		                    System.out.printf("\nMaquina: %.2f\n", vlr);
		                } else{
		                    System.out.println("\nValor inválido!");
		                }		             		                
		        }
	    System.out.println("\nPegue seu(s) Guaraná(s)!");
	    maq = vlr - guara;
		if(vlr > guara)
		System.out.printf("Retire seu troco: %.2f", maq);
        } else if (opc < 1 || opc > 4)
        System.out.println("Opção inválida!");     

	}

}
