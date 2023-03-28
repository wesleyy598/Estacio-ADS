#include <stdio.h>
#include <stdlib.h>

void comprar(int modelo, int quantidade){
    char descricao[1000];
    int carga;
    float valor;

    switch (modelo)
    {
	    case 1010:
	        descricao[1000] = "SsangYong Actyon Sports";
	        carga = 750 ;
	        valor = 94490 * quantidade;
	        printf("modelo: %s\ncapacidade de carga: %d kgs\nquantidade comprada: %d\nvalor total: %f ",&descricao,&carga,&quantidade,&valor);
	        break;
	        
	    case 1009:
	        descricao[] = "Toyota Hilux";
	        carga = 1005 ;
	        valor = 72900 * quantidade;
	        printf("modelo: %s\ncapacidade de carga: %d kgs\nquantidade comprada: %d\nvalor total: %f ",&descricao,&carga,&quantidade,&valor);
	        break;
	        
	    case 1008:
	       descricao[] = "Nissan Frontier";
	       carga = 1030;
	       valor = 79790 * quantidade;
	       printf("modelo: %s\ncapacidade de carga: %d kgs\nquantidade comprada: %d\nvalor total: %f ",&descricao,&carga,&quantidade,&valor);
	        break;
	        
	    case 1007:
	       descricao[] = "Dodge Ram";
	       carga = 1047;
	       valor = 104800 * quantidade;
	       printf("modelo: %s\ncapacidade de carga: %d kgs\nquantidade comprada: %d\nvalor total: %f ",&descricao,&carga,&quantidade,&valor);
	        break;
	        
	    case 1006:
	        descricao[] = "Mahindra Picape";
	        carga = 1060;
	        valor = 59900 * quantidade;
	        printf("modelo: %s\ncapacidade de carga: %d kgs\nquantidade comprada: %d\nvalor total: %f ",&descricao,&carga,&quantidade,&valor);
	        break;
	        
	    case 1005:
	       descricao[] = "Chevrolet S10" ;
	       carga = 1065;
	       valor = 47396 * quantidade;
	       printf("modelo: %s\ncapacidade de carga: %d kgs\nquantidade comprada: %d\nvalor total: %f ",&descricao,&carga,&quantidade,&valor);
	        break;
	        
	    case 1004:
	       descricao[] = "Ford Ranger" ;
	       carga = 1075;
	       valor = 45900 * quantidade;
	       printf("modelo: %s\ncapacidade de carga: %d kgs\nquantidade comprada: %d\nvalor total: %f ",&descricao,&carga,&quantidade,&valor);
	        break;
	        
	    case 1003:
	        descricao[] = "Mitsubishi L200" ;
	        carga = 1095;
	        valor = 75390 * quantidade;
	        printf("modelo: %s\ncapacidade de carga: %d kgs\nquantidade comprada: %d\nvalor total: %f ",&descricao,&carga,&quantidade,&valor);
	        break;
	        
	    case 1002:
	       descricao[] = "Ford F250";
	       carga = 1195;
	       valor = 92780 * quantidade;
	       printf("modelo: %s\ncapacidade de carga: %d kgs\nquantidade comprada: %d\nvalor total: %f ",&descricao,&carga,&quantidade,&valor);
	        break;
	        
	    case 1001:
	       descricao[] = "Land Rover Defender 130";
	       carga = 1670;
	       valor = 115000 * quantidade;
	       printf("modelo: %s\ncapacidade de carga: %d kgs\nquantidade comprada: %d\nvalor total: %f ",&descricao,&carga,&quantidade,&valor);
	        break;
	    
	    default:
	        printf("modelo escolhido invalido");
	        break;
    }
}

int main(){
    int modelo, quantidade;

    printf("Qual o modelo de picape voce gostaria de comprar?");
    scanf("%d", &modelo);
    printf("Quantas unidades voce gostaria de comprar?");
    scanf("%d", &quantidade);
    comprar(modelo, quantidade);


    return 0;
}
