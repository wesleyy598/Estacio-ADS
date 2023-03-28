#include <stdio.h>
#include <stdlib.h>

void comprar(int modelo, int quantidade);

int main(){
    int modelo, quantidade;

	printf("Modelos: \n\n");
	printf("Codigo, Descricao, Capacidade de Carga, Valor Unitario\n\n");
	printf("1010, SsangYong Actyon Sports, 750 kg, 94.490\n");
	printf("1009, Toyota Hilux, 1.050 kg, 72.900\n");	
	printf("1008, Nissan Frontier, 1.030 kg, 79.790\n");	
	printf("1007, Dodge Ram, 1.047 kg, 104.800\n");	
	printf("1006, Mahindra Picape, 1.060 kg, 59.900\n");	
	printf("1005, Chevrolet S10, 1.065 kg, 47.396\n");	
	printf("1004, Ford Ranger, 1.075 kg, 45.900\n");	
	printf("1003, Mitsubishi L200, 1.095 kg, 75.390\n");	
	printf("1002, Ford F250, 1.195 kg, 92.780\n");	
	printf("1001, Land Rover Defender 130, 1.670 kg, 115.000\n\n");	
	
    printf("Qual o modelo de picape voce gostaria de comprar?\n");
    scanf("%d", &modelo);
    printf("Quantas unidades voce gostaria de comprar?\n");
    scanf("%d", &quantidade);
    comprar(modelo, quantidade);


    return 0;
}

void comprar(int modelo, int quantidade){
    float valor;

    switch (modelo)
    {
    case 1010:
        valor = (94490 * quantidade);
        printf("Modelo: SsangYong Actyon Sports\nCapacidade de Carga: 750 kgs\nQuantidade Comprada: %d\nValor Total: %.2f ", quantidade, valor);;
        break;
    case 1009:
        valor = (72900 * quantidade);
        printf("modelo: Toyota Hilux\ncapacidade de carga: 1005 kgs\nquantidade comprada: %d\nvalor total: %.2f ",quantidade,valor);;
        break;
    case 1008:
       valor = (79790 * quantidade);
       printf("modelo: Nissan Frontier\ncapacidade de carga: 1030 kgs\nquantidade comprada: %d\nvalor total: %.2f ",quantidade,valor);;
        break;
    case 1007:
       valor = (104800 * quantidade);
       printf("modelo: Dodge Ram\ncapacidade de carga: 1047 kgs\nquantidade comprada: %d\nvalor total: %.2f ",quantidade,valor);;
        break;
    case 1006:
        valor = (59900 * quantidade);
        printf("modelo: Mahindra Picape\ncapacidade de carga: 1060 kgs\nquantidade comprada: %d\nvalor total: %.2f ",quantidade,valor);;
        break;
    case 1005:
       valor = (47396 * quantidade);
       printf("modelo: Chevrolet S10\ncapacidade de carga: 1065 kgs\nquantidade comprada: %d\nvalor total: %.2f ",quantidade,valor);;
        break;
    case 1004:
       valor = (45900 * quantidade);
       printf("modelo: Ford Ranger\ncapacidade de carga: 1075 kgs\nquantidade comprada: %d\nvalor total: %.2f ",quantidade,valor);;
        break;
    case 1003:
        valor = (75390 * quantidade);
        printf("modelo: Mitsubishi L200\ncapacidade de carga: 1095 kgs\nquantidade comprada: %d\nvalor total: %.2f ",quantidade,valor);
        break;
    case 1002:
       valor = (92780 * quantidade);
       printf("modelo: Ford F250\ncapacidade de carga: 1195 kgs\nquantidade comprada: %d\nvalor total: %.2f ",quantidade,valor);
        break;
    case 1001:
       valor = (115000 * quantidade);
       printf("modelo: Land Rover Defender 130\ncapacidade de carga: 1670 kgs\nquantidade comprada: %d\nvalor total: %.2f ",quantidade,valor);
        break;
    
    default:
        printf("modelo escolhido invalido");
        break;
    }

}

