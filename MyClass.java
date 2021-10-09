package LinkHashMap;

public class MyClass {

	public static void main(String[] args) 
	{
		LinkHashMap map=new LinkHashMap();//25,10,15,1,16,5,3,4
		map.add(25, "a");
		map.add(10, "b");
		map.add(15, "c");
		map.add(1, "d");
		map.add(16, "e");
		map.add(5, "f");
		map.add(3, "g");
		map.add(4, "h");
		map.print();
		System.out.println(map.get(16));
		
	}

}
