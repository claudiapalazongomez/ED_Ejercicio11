package es.studium.ejercicio11;

public class Equipo
{
	private String nombre;
	private int anioFundacion;
	private int numSocios;
	
	public Equipo(String nombre, int anioFundacion, int numSocios)
	{
		this.nombre = nombre;
		this.anioFundacion = anioFundacion;
		this.numSocios = numSocios;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public int getAnioFundacion()
	{
		return anioFundacion;
	}

	public void setAnioFundacion(int anioFundacion)
	{
		this.anioFundacion = anioFundacion;
	}

	public int getNumSocios()
	{
		return numSocios;
	}

	public void setNumSocios(int numSocios)
	{
		this.numSocios = numSocios;
	}
	
	
	
}
