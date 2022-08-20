/*Vázquez Rosales Luis Arturo
Ingenieria en computacion
422051561
Facultad de Estudios Superiores Aragón*/

#include<iostream>
#include<conio.h>


using namespace std;

int main(){
	//meses twitter
	int ene = 62404, jun= 67496;
	
	cout<<"\tPRESENCIA REDES SOCIALES \n";
	
	cout<<" 1-Enero\n 2-Febreo\n 3-Marzo\n 4-Abril\n 5-Mayo\n 6-Junio\n";
	
	int res = jun - ene;
	
	cout<<"\n TWITTER";
	
	cout<<"\nDiferencia de seguidores entre el mes de Enero y Junio: "<<res<<" seguidores";
	
	cout<<"\n \n \t YOUTUBE \n";
	
	//meses youtube visualizaciones
	
	int meses[]={12226,15605,19602,19452,21805, 17344}, dif = 0, n;
	
	//cout<<"MESES \n";
	
	cout<<"Seleccione cuantos meses desea calcular (en un rango del 1 al 6)\n";
	cin>>n;
	
	for(int i=0;i<n;i++){
		cout<<"Ingrese un mes del menu (Solo numeros)";
		cin>>meses[i];
	}
	
	for(int i=0; i<n; i++){
		cout<<meses[i];
	}
	
	
	getch();
	return 0;
}
