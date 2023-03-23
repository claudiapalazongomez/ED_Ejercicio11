package es.studium.ejercicio11;

public class TestLiga
{

	public static void main(String[] args)
	{
		Equipo equipo1 = new Equipo("Sevilla F.C.", 1890, 44785);
		Equipo equipo2 = new Equipo("Real Betis Balompié", 1907, 61109);
		Futbolista futbolista1 = new Futbolista("Joaquín", "Sánchez", true, equipo2);
		Futbolista futbolista2 = new Futbolista("Jesús", "Navas", false, equipo1);
		Futbolista futbolista3 = new Futbolista("Diego", "Lainez", true, equipo2);
		Futbolista futbolista4 = new Futbolista("Franco", "Vázquez", true, equipo1);
		
		System.out.println(futbolista1.getNombre() + " " + futbolista1.getApellido() + " juega en " + futbolista1.getEquipo().getNombre());
		System.out.println(futbolista2.getNombre() + " " + futbolista2.getApellido() + " juega en " + futbolista2.getEquipo().getNombre());
		System.out.println(futbolista3.getNombre() + " " + futbolista3.getApellido() + " juega en " + futbolista3.getEquipo().getNombre());
		System.out.println(futbolista4.getNombre() + " " + futbolista4.getApellido() + " juega en " + futbolista4.getEquipo().getNombre());
	}

}
