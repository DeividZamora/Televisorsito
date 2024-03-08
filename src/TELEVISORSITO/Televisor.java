package TELEVISORSITO;

public class Televisor 
{
private String marca, entradas;
private int tamaño, volumen, canal;
private boolean encendido=false;

//Getters y setters---------------------------

public String getEntradas() {
	return entradas;
}

public void setEntradas(String entradas) {
	this.entradas = entradas;
}

public boolean isEncendido() {
	return encendido;
}

public void setEncendido(boolean encendido) {
	this.encendido = encendido;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public int getTamaño() {
	return tamaño;
}

public void setTamaño(int tamaño) {
	this.tamaño = tamaño;
}

public int getVolumen() {
	return volumen;
}

public void setVolumen(int volumen) {
	this.volumen = volumen;
}

public int getCanal() {
	return canal;
}

public void setCanal(int canal) {
	this.canal = canal;
}

//Metodos de la clase-------------------

public void Encneder()
{
	encendido=true;
	if (encendido==true)
	{encendido=false;}
}

public void VolMas() 
{
	if (volumen==100)
	{volumen=99;}	
	volumen++;
}

public void VolMenos() 
{	
	if (volumen==0)
	{volumen=1;}
	volumen--;
}

public void CanalMas() 
{
if (canal==100)
{canal=0;}
canal++;}

public void CanalMenos () 
{
	if (canal==100)
	{canal=0;}
	canal--;
}

}
