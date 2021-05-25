package test;

public class slot_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][][] fruit=
			{
				{
					{"                  "},
					{"                  "},
					{"                  "},
					{"                ╓²"},
					{" ]≥            ;╙ "},
					{"  ╠▒▒≥,     ,≤░≥# "},
					{"  \"╚▒▒▒▒░░▒▒▒▒╙  "},
					{"      =╚╩╩╩╩╩≈    "},
					{"                  "},
					{"                  "},
					{"                  "}
				},
				{
					{"                  "},
					{"                  "},
					{"                  "},
					{"     «≥░≤▄∩,      "},
					{"    ╩▒▒░░░░░▒     "},
					{"   ]╠╬╬╬╬╠╠╠▒≥    "},
					{"    ╚╬╬╣╣╣╬╬╠     "},
					{"     ╚╢╬╬╬╬╙      "},
					{"                  "},
					{"                  "},
					{"                  "}
				},
				{
					{"                  "},
					{"                  "},
					{"      ,╖▌▄╦╖,     "},
					{"  ╓▒╣▓╣▓██████▓   "},
					{" ╔╬╠╚▒╠╣▓███████  "},
					{" ╠╢╬╬╣╣▓███████▓  "},
					{" '╬╬╣▓▓▓▓█████▓▌  "},
					{"  `╢╬▓▓▓▓▓██▓▓╬▒▒░"},
					{"    ╚╬╣▓▓▓▓▓▀╩╙^  "},
					{"                  "},
					{"                  "}
				}
				
				
		};
		
		
		for(int b=0; b<fruit[0].length; b++) {
			for(int a=0; a<fruit.length; a++) {
				for(int c=0; c<fruit[0][0].length; c++) {
					System.out.print(fruit[a][b][c]);
				}
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
