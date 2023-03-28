#include <iostream>
#include <stdlib.h>

using namespace std;

struct Alunos{
	int id;
	char nome[50];
	float notaAV1, notaAV2, media;
};

int main(){
	
	//criando variavel ponteiro alunos do tipo Alunos (struct)
	struct Alunos *alunos = (struct Alunos*) calloc(2, sizeof(struct Alunos));
	
	int cont = -1;
	int i = 0;
	
	cont++;
	while(cont > -1){
		
		cout<<"Digite o id do aluno: "<<endl;
		cin>>alunos[i].id;
		cout<<"Digite o nome do aluno: "<<endl;
		cin>>alunos[i].nome;
		cout<<"Digite a nota da AV1: "<<endl;
		cin>>alunos[i].notaAV1;
		cout<<"Digite a nota da AV2: "<<endl;
		cin>>alunos[i].notaAV2;
		cout<<"Digite 0 para continuar ou um numero menor que zero para encerrar!"<<endl<<endl;
		
		alunos[i].media = ((alunos[i].notaAV1 + alunos[i].notaAV2) / 2);
		
		free(alunos);
		cin>>cont;
		i++;
	}
	
	for(int j = 0; j < i; j++){
		
		if(alunos[j].media < 7){
			cout<<"Alunos Reprovados: "<<endl;
			cout<<"Id: "<<alunos[j].id<<"  Nome: "<<alunos[j].nome<<"  Media: "<<alunos[j].media<<endl;
		}
		if(alunos[j].media >= 7){
			cout<<"Alunos Aprovados: "<<endl;
			cout<<"Id: "<<alunos[j].id<<"  Nome: "<<alunos[j].nome<<"  Media: "<<alunos[j].media<<endl;
		}
		
		//cout<<"Id: "<<alunos[j].id<<"  Nome: "<<alunos[j].nome<<"  Media: "<<alunos[j].media<<endl;
	}
	
	return 0;
}
