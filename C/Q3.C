#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void comprar();

int main(){
    comprar();

    return 0;
}

void comprar(){
	int modelo, quantidade;
    char descricao[100];
    int carga;
    float valor;

	printf("Modelos: \n");
	printf("1010, 'SsangYong Actyon Sports', '750 kg', 94.490");

    printf("Qual o modelo de picape voce gostaria de comprar?");
    scanf("%d", &modelo);
    printf("Quantas unidades voce gostaria de comprar?");
    scanf("%d", &quantidade);

    switch (modelo)
    {
	    case 1010:
	        descricao [] = "SsangYong Actyon Sports";
	        carga = 750 ;
	        valor = 94490 * quantidade;
	        printf("Modelo: %s\nCapacidade de Carga: %d kgs\nQuantidade Comprada: %d\nValor Total: %f ", descricao, carga, quantidade, valor);
	    break;
	        
	    case 1009:
	        descricao[] = "Toyota Hilux";
	        carga = 1005 ;
	        valor = 72900 * quantidade;
	        printf("Modelo: %s\nCapacidade de Carga: %d kgs\nQuantidade Comprada: %d\nValor Total: %f ", descricao, carga, quantidade, valor);
	    break;
	        
	    case 1008:
	       descricao[] = "Nissan Frontier";
	       carga = 1030;
	       valor = 79790 * quantidade;
	       printf("Modelo: %s\nCapacidade de Carga: %d kgs\nQuantidade Comprada: %d\nValor Total: %f ", descricao, carga, quantidade, valor);
	    break;
	        
	    case 1007:
	       descricao[] = "Dodge Ram";
	       carga = 1047;
	       valor = 104800 * quantidade;
	       printf("Modelo: %s\nCapacidade de Carga: %d kgs\nQuantidade Comprada: %d\nValor Total: %f ", descricao, carga, quantidade, valor);
	    break;
	        
	    case 1006:
	        descricao[] = "Mahindra Picape";
	        carga = 1060;
	        valor = 59900 * quantidade;
	        printf("Modelo: %s\nCapacidade de Carga: %d kgs\nQuantidade Comprada: %d\nValor Total: %f ", descricao, carga, quantidade, valor);
	    break;
	        
	    case 1005:
	       descricao[] = "Chevrolet S10" ;
	       carga = 1065;
	       valor = 47396 * quantidade;
	       printf("Modelo: %s\nCapacidade de Carga: %d kgs\nQuantidade Comprada: %d\nValor Total: %f ", descricao, carga, quantidade, valor);
	    break;
	        
	    case 1004:
	       descricao[] = "Ford Ranger" ;
	       carga = 1075;
	       valor = 45900 * quantidade;
	       printf("Modelo: %s\nCapacidade de Carga: %d kgs\nQuantidade Comprada: %d\nValor Total: %f ", descricao, carga, quantidade, valor);
	    break;
	        
	    case 1003:
	        descricao[] = "Mitsubishi L200" ;
	        carga = 1095;
	        valor = 75390 * quantidade;
	        printf("Modelo: %s\nCapacidade de Carga: %d kgs\nQuantidade Comprada: %d\nValor Total: %f ", descricao, carga, quantidade, valor);
	    break;
	        
	    case 1002:
	       descricao[] = "Ford F250";
	       carga = 1195;
	       valor = 92780 * quantidade;
	       printf("Modelo: %s\nCapacidade de Carga: %d kgs\nQuantidade Comprada: %d\nValor Total: %f ", descricao, carga, quantidade, valor);
	    break;
	        
	    case 1001:
	       descricao[] = "Land Rover Defender 130";
	       carga = 1670;
	       valor = 115000 * quantidade;
	       printf("Modelo: %s\nCapacidade de Carga: %d kgs\nQuantidade Comprada: %d\nValor Total: %f ", descricao, carga, quantidade, valor);
	    break;
	    
	    default:
	        printf("Modelo Escolhido Invalido");
	    break;
    }
}
