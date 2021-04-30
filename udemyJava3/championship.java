package udemyJava3;

public class championship {

	public static void main(String[] args) {

		int gryffindor = 120;
		int ravenclaw = 200;
		
		if(gryffindor>ravenclaw && (gryffindor - ravenclaw)> 300)
		{
			System.out.println("griffindor takes the cup");
		}
		else if(gryffindor>ravenclaw)
		{
			System.out.println("griffindor second place");
		}
		else if(gryffindor<ravenclaw && (ravenclaw - gryffindor)< 100)
		{
			System.out.println("griffindor third place");
		}
		else
		{
			System.out.println("griffindor fourth place");
		}
	}

}
