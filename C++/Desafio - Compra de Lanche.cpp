#include <iostream>

using namespace std;

double total;
int codigo, qtd;

int main(){	
		while(codigo != 6){
		
		cout<<"CODIGO  ESPECIFICACAO     PRECO"<<endl;
		cout<<"  1     CACHORRO QUENTE   4.00"<<endl;
		cout<<"  2     X-SALADA          4.50"<<endl;
		cout<<"  3     X-BACON           5.00"<<endl;
		cout<<"  4     TORRADA SIMPLES   2.00"<<endl;
		cout<<"  5     REFRIGERANTE      1.50"<<endl;
		cout<<"  6	   FINALIZAR COMPRA"<<endl<<endl;
		
		cout<<"Informe o codigo do produto."<<endl;
		cin>>codigo;
		cout<<"Informe a quantidade desejada."<<endl;
		cin>>qtd;
	
	
		switch(codigo){
			case 1:
				//produto cachorro quente
				total = qtd * 4.00;
				break;
			case 2:
				total = qtd * 4.50;
				break;
			case 3:
				total = qtd * 5.00;
				break;	
			case 4:
				total = qtd * 2.00;
				break;
			case 5:
				total = qtd * 1.50;
				break;
			case 6:
				cout<<"Compra finalizada"<<endl;
				cout<<"Total a pagar: "<<total<<endl<<endl;
				break;	
			default:
				cout<<"Codigo invalido!"<<endl;
				break;
		}
	}
				
	return 0;
}
