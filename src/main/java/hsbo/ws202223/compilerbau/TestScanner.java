package hsbo.ws202223.compilerbau;

class TestScanner{
	static public void main(String args[]){
		NumScanner scanner;
		scanner = new NumScanner();
		if (scanner.readInput("arithmetischer_ausdruck.txt")){
			scanner.printInputStream();
			if(scanner.lexicalAnalysis())
				scanner.printTokenStream();
		}
		else
			System.out.println("Scanner beendet");
	}
}