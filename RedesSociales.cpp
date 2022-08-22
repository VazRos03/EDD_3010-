/*Vázquez Rosales Luis Arturo
Ingenieria en computacion
422051561
Facultad de Estudios Superiores Aragón*/

#include<iostream>
#include<conio.h>
using namespace std;

//funciones
int youtube(){
	cout<<"\n \n \t YOUTUBE \n";
	
	//meses youtube visualizaciones
	int meses[]={12226,15605,19602,19452,21805, 17344};

	
	

	
	
	
	
	
	
	
	
	return meses[6];
	}
	
//funcion principal
int main(){
	//meses twitter
	int ene = 62404, jun= 67496;
	
	cout<<"\tPRESENCIA REDES SOCIALES \n";
	
	cout<<" 1-Enero\n 2-Febreo\n 3-Marzo\n 4-Abril\n 5-Mayo\n 6-Junio\n";
	
	int res = jun - ene;
	
	cout<<"\n TWITTER";
	
	cout<<"\nDiferencia de seguidores entre el mes de Enero y Junio: "<<res<<" seguidores";
	
	youtube();
	
	
	getch();
	return 0;
}
