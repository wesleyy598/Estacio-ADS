#include <iostream>
#include <stdlib.h>

using namespace std;

struct Clientes{
	int codigo;
	char nome[50];
	int idade;
	char cpf[30];
	char rg[30];
	char sexo[1];
};

int main(){
	
	//criando variavel ponteiro clientes do tipo Clientes (struct)
	struct Clientes *clientes = (struct Clientes*) calloc(2, sizeof(struct Clientes));
	
	int cont = -1;
	int i = 0;
	
	cont++;
	while(cont > -1){
		
		cout<<"Digite o codigo do cliente: "<<endl;
		cin>>clientes[i].codigo;
		cout<<"Digite o nome do cliente: "<<endl;
		cin>>clientes[i].nome;
		cout<<"Digite a idade do cliente: "<<endl;
		cin>>clientes[i].idade;
		cout<<"Digite o CPF do cliente: "<<endl;
		cin>>clientes[i].cpf;
		cout<<"Digite o RG do cliente: "<<endl;
		cin>>clientes[i].rg;
		cout<<"Digite o sexo do cliente (M ou F): "<<endl;
		cin>>clientes[i].sexo;
		cout<<"Digite 0 para continuar ou um numero menor que zero para encerrar!"<<endl;
		
		cin>>cont;
		i++;
	}
	
	for(int j = 0; j < i; j++){
		cout<<"Id: "<<clientes[j].codigo<<"  Nome: "<<clientes[j].nome<<"  Idade: "<<clientes[j].idade<<
		"  CPF: "<<clientes[j].cpf<<"  RG: "<<clientes[j].rg<<"  Sexo: "<<clientes[j].sexo<<endl;
	}
	
	cout<<endl<<endl<<"Total de clientes: "<<i<<endl;
	
	free(clientes);
	
	return 0;
}
