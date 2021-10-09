package LinkHashMap;

public class LinkHashMap 
{
	Node [] rootArray=new Node[4];
	Node link;
	void add(int key,String value)
	{
		int index=key%rootArray.length;
		if(rootArray[index]==null)
			rootArray[index]=new Node(key, value);
		else
		{
			Node temp=rootArray[index];
			while(true)
			{
				if(temp.key==key)
					break;
				else if(temp.nextBlue!=null)
					temp=temp.nextBlue;
				else if(temp.nextBlue==null)
					temp.nextBlue=new Node(key, value);
			}
		}
		if(link==null)
			link=new Node(key, value);
		else
		{
			Node temp=link;
			while(true)
			{
				if(temp.key==key)
					break;
				else if(temp.nextGreen!=null)
					temp=temp.nextGreen;
				else if(temp.nextGreen==null)
					temp.nextGreen=new Node(key, value);
			}
		}
	}
	void print()
	{
		Node temp=link;
		while(temp!=null)
		{
			System.out.println(temp.key+" "+temp.value);
			temp=temp.nextGreen;
		}
	}
	String get(int key)
	{
		int index=key%rootArray.length;
		if(rootArray[index]==null)
			return "empty";
		else
		{
			Node temp=rootArray[index];
			while(true)
			{
				if(temp.key==key)
					return temp.value;
				else if(temp.nextBlue!=null)
					temp=temp.nextBlue;
				else if(temp.nextBlue==null)
					return "not found";
			}
		}
	}
}
