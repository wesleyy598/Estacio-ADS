#include <iostream>
#include <locale.h>

using namespace std;

int main(){
	setlocale(LC_ALL,"");
	int idade;
	
	cout << "Ol�, por favor, informe a sua idade: \n";
	cin >> idade;
	
	if(idade >= 0 && idade <= 5){
		cout << "Classifica��o de risco �: BAIXA N�VEL 1!\n";
	}
	if(idade > 5 && idade <= 10){
		cout << "Classifica��o de risco �: BAIXA N�VEL 2!\n";
	}
	if(idade > 10 && idade <= 15){
		cout << "Classifica��o de risco �: M�DIA N�VEL 1!\n";
	}
	if(idade > 15 && idade <= 18){
		cout << "Classifica��o de risco �: M�DIA N�VEL 2!\n";
	}
	if(idade > 18 && idade <= 30){
		cout << "Classifica��o de risco �: ALTA N�VEL 1!\n";
	}
	if(idade > 30 && idade <= 40){
		cout << "Classifica��o de risco �: ALTA N�VEL 2!\n";
	}
	if(idade > 40){
		cout << "GRUPO DE RISCO!\n";
	}
	return 0;
}
