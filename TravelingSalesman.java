/*
@author Madeline Temares
*/
import java.util.ArrayList;
import java.lang.Math;

public class TravelingSalesman
{
	private static ArrayList<Vertex<String>> all;
	
	private static void init()
	{
		all = new ArrayList<Vertex<String>>();
		Vertex<String> ny = new Vertex<String>("New York");
		all.add(ny);
		Vertex<String> tokyo = new Vertex<String>("Tokyo");
		all.add(tokyo);
		Vertex<String> paris = new Vertex<String>("Paris");
		all.add(paris);
		Vertex<String> moscow = new Vertex<String>("Moscow");
		all.add(moscow);
		Vertex<String> la = new Vertex<String>("Los Angeles");
		all.add(la);
		Vertex<String> chicago = new Vertex<String>("Chicago");
		all.add(chicago);
		Vertex<String> athens = new Vertex<String>("Athens");
		all.add(athens);
		Vertex<String> denver = new Vertex<String>("Denver");
		all.add(denver);
		join();
	}
	
	private static void join()
	{
		for (int i = 0; i<all.size(); i++)
		{
			for (int j= i+1; j <all.size(); j++)
			{
				all.get(i).connect(all.get(j), (int)(Math.random() * 100));
			}
		}
	}
	
	public static void main(String [] args)
	{
		init();
	}
}
