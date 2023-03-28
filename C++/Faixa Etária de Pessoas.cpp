#include <iostream>

using namespace std;

int idade;

int main(){
	cout<<"0 a 15 ANOS - Criança"<<endl;
	cout<<"16 a 18 ANOS - Jovem"<<endl;
	cout<<"19 a 30 ANOS - Adulto"<<endl;
	cout<<"MAIOR QUE 30 ANOS - Master"<<endl<<endl;
	
	cout<<"Informe a sua idade: "<<endl;
	cin>>idade;
	
	/*
		&& == AND == E
		idade >= 0 && idade <= 15
			V	&&	V	=	V (SÓ VAI SER VERDADEIRA SE AMBAS FOREM VERDADEIRAS)
			V	&&  F	=	F
			F	&&	V	=	F
			F	&&	F	=	F
	*/
	
	/*if(idade >= 0 && idade <= 15){
		cout<<"Criança"<<endl;
	}else if(idade >= 16 && idade <= 18){
		cout<<"Jovem"<<endl;
	}else if(idade >= 19 && idade <= 30){
		cout<<"Adulto"<<endl;
	}else if(idade > 30){
		cout<<"Master"<<endl;
	}else{
		cout<<"Idade fora do intervalo"<<endl;
	}*/
	
	switch(idade){
		case 0 ... 15:
			cout<<"Crianca"<<endl;
			break;
		case 16 ... 18:
			cout<<"Jovem"<<endl;
			break;
		case 19 ... 30:
			cout<<"Adulto"<<endl;
			break;
		case 31 ... 100:
			cout<<"Master"<<endl;
			break;
		default:
			cout<<"Idade fora do intervalo!"<<endl;
			break;
			
			
	}
	
	
}
