/*
@author Maddie Temares
Vertices know whether or not they have been visited
Way to traverse from 1 vertex to others
*/

import java.util.ArrayList;
public class Vertex<E>
{
	private E value;
	private ArrayList<Vertex<E>> pointers;
	private ArrayList<Integer> costs;
	private boolean beenVisited;
	
	public Vertex(E v)
	{
		beenVisited = false;
		value = v;
		pointers = new ArrayList<Vertex<E>>();
		costs = new ArrayList<Integer>();	
	}
	/*
	two directional
	*/
	public void connect(Vertex v, int i)
	{
		pointers.add(v);
		costs.add(i);
		v.add(this, i);
	}
	/*
	one directional
	*/
	public void add(Vertex v, int i)
	{
		pointers.add(v);
		costs.add(i);
	}
	
	public E value()
	{
		return value;
	}
	
	public ArrayList<Vertex<E>> pointers()
	{
		return pointers;
	}
	
	public ArrayList<Integer> costs()
	{
		return costs;
	}
	
	public boolean beenVisited()
	{
		return beenVisited;	
	}
	
	public void changeBeenVisited()
	{
		beenVisited = !beenVisited;	
	}
}
