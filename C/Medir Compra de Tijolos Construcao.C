#include <stdio.h>
#include <stdlib.h>

void calcular_tijolos();

int main(){
    calcular_tijolos();

    return 0;
}

void calcular_tijolos(){
	
	int metragem = 0;
	float area_tijolo_6_furos = 0, area_tijolo_8_furos = 0, area_tijolo_9_furos = 0;
	float quantidade_6 = 0, quantidade_8 = 0, quantidade_9 = 0;
	
	printf("Qual a metragem do muro a ser construido? (em metros quadrados)\n");
    scanf("%d", &metragem);
	
    area_tijolo_6_furos = (0.14*0.19); // 9 x 14 x 19 dimensao do tijolo 6 furos
    area_tijolo_8_furos = (0.19*0.19); // 9 x 19 x 19 dimensao do tijolo 8 furos
    area_tijolo_9_furos = (0.14*0.24); // 11.5 x 14 x 24 dimensao do tijolo 9 furos

    quantidade_6 = metragem / area_tijolo_6_furos;
    quantidade_8 = metragem / area_tijolo_8_furos;
    quantidade_9 = metragem / area_tijolo_9_furos;

    printf("Para construir um muro de %d metros quadrados, voce precisara usar:\n\n %f Tijolos de 6 Furos \n %f Tijolos de 8 Furos \n %f Tijolos de 6 Furos \n", metragem, quantidade_6, quantidade_8, quantidade_9);
}
