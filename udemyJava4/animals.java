package udemyJava4;

import java.util.Scanner;

public class animals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		draw();
		
		
	}
	
	public static void draw(){
		
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		
		System.out.print("\nWhich animal would you like to draw?\n");
		System.out.println("Write 1 for butterfly " );
		System.out.println("Write 2 for elephant  " );
		System.out.println("Write 3 for bear      " );
		System.out.println("Write 4 for snake     " );
		
		choice = scan.nextInt();
		
		
        if(choice == 1)
        {
		
        	System.out.println("  .==-.                   .-==.     ");
        	System.out.println("   \\()8`-._  `.   .'  _.-'8()/     ");
        	System.out.println("   (88\"   ::.  \\./  .::   \"88)     ");
        	System.out.println("    \\_.'`-::::.(#).::::-'`._/      ");
        	System.out.println("      `._... .q(_)p. ..._.'         ");
        	System.out.println("        \"\"-..-'|=|`-..-\"\"       ");
        	System.out.println("        .\"\"' .'|=|`. `\"\".       ");
        	System.out.println("      ,':8(o)./|=|\\.(o)8:`.        ");
        	System.out.println("     (O :8 ::/ \\_/ \\:: 8: O)      ");
        	System.out.println("      \\O `::/       \\::' O/       ");
        	System.out.println("       \"\"--'         `--\"\"      ");
        
        }
        if(choice == 2)
        {
         System.out.println("       _..--\"\"-.                  .-\"\"--.._ ");
         System.out.println("   _.-'         \\ __...----...__ /         '-._");
         System.out.println(" .'      .:::...,'              ',...:::.      '.");
         System.out.println("(     .'``'''::;                  ;::'''``'.     )");
         System.out.println(" \\             '-)              (-'             /");
         System.out.println("  \\             /                \\             /");
         System.out.println("   \\          .'.-.            .-.'.          /");
         System.out.println("    \\         | \\0|            |0/ |         /");
         System.out.println("    |          \\  |   .-==-.   |  /          |");
         System.out.println("     \\          `/`;          ;`\\`          /");
         System.out.println("      '.._      (_ |  .-==-.  | _)      _..'");
         System.out.println("          `\"`\"-`/ `/'        '\\` \\`-\"`\"`");
         System.out.println("               / /`;   .==.   ;`\\ \\");
         System.out.println("         .---./_/   \\  .==.  /   \\ \\");
         System.out.println("        / '.    `-.__)       |    `\"");
         System.out.println("       | =(`-.        '==.   ;");
         System.out.println("        \\  '. `-.           /");
         System.out.println("         \\_:_)   `\"--.....-'");
        }
        
        if(choice == 3)
        {
         
        	System.out.println("            ___   .--. ");
        	System.out.println("      .--.-\"   \"-' .- |");
        	System.out.println("     / .-,`          .'");
        	System.out.println("     \\   `           \\");
        	System.out.println("      '.            ! \\");
        	System.out.println("        |     !  .--.  |");
        	System.out.println("        \\        '--'  /.____");
        	System.out.println("       /`-.     \\__,'.'      `\\");
        	System.out.println("    __/   \\`-.____.-' `\\      /");
        	System.out.println("    | `---`'-'._/-`     \\----'    _");
        	System.out.println("    |,-'`  /             |    _.-' `\\");
        	System.out.println("   .'     /              |--'`     / |");
        	System.out.println("  /      /\\              `         | |");
        	System.out.println("  |   .\\/  \\      .--. __          \\ |");
        	System.out.println("   '-'      '._       /  `\\         /");
         	System.out.println("               `\\    '     |------'`");
         	System.out.println("                 \\  |      |");
         	System.out.println("                  \\        /");
         	System.out.println("                   '._  _.'");
         	System.out.println("                      ``");
        
        }

         if(choice == 4)
         {
        	 System.out.println("         ,,'6''-,.");
        	 System.out.println("        <====,.;;--.");
        	 System.out.println("        _`---===. \"\"\"==__");
        	 System.out.println("      //\"\"@@-\\===\\@@@@ \"\"\\\\");
         	 System.out.println("     |( @@@  |===|  @@@  ||");
         	 System.out.println("      \\\\ @@   |===|  @@  //");
         	 System.out.println("        \\\\ @@ |===|@@@ //");
         	 System.out.println("         \\\\  |===|  //");
         	 System.out.println("___________\\\\|===| //_____,----\"\"\"\"\"\"\"\"\"\"-----,_");
         	 System.out.println("  \"\"\"\"---,__`\\===`/ _________,---------,____    `,");
         	 System.out.println("             |==||                           `\\   \\");
         	 System.out.println("            |==| |                             )   |");
         	 System.out.println("           |==| |       _____         ______,--'   '");
         	 System.out.println("           |=|  `----\"\"\"     `\"\"\"\"\"\"\"\"         _,-'");
         	 System.out.println("            `=\\     __,---\"\"\"-------------\"\"\"''");
         	 System.out.println("                \"\"\"\"		");
         }
	}
	
}
