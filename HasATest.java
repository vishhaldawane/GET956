
public class HasATest {
	public static void main(String[] args) {
		
		WorkBook wb = new WorkBook();
		
		wb.ws1.a1.setValue("Fruit");
		wb.ws1.a2.setValue("Apple");
		wb.ws1.a3.setValue("Mango");
		wb.ws1.a4.setValue("Orange");
		wb.ws1.a5.setValue("Total");
			
		wb.ws1.b1.setValue("Qty");
		wb.ws1.b2.setValue("100");
		wb.ws1.b3.setValue("200");
		wb.ws1.b4.setValue("300");
		
		Integer sum = Integer.parseInt(wb.ws1.b2.getValue())+Integer.parseInt(wb.ws1.b3.getValue())+Integer.parseInt(wb.ws1.b4.getValue());
		String total =  sum.toString(); //   String.valueOf(sum); where sum is int
		
		wb.ws1.b5.setValue(total);
		
		wb.ws1.printWorkSheet();
		
		System.out.println("----------------");
		
		
		
		wb.ws2.a1.setValue("Subject");
		wb.ws2.a2.setValue("Physics");
		wb.ws2.a3.setValue("Chemistry");
		wb.ws2.a4.setValue("Maths");
		wb.ws2.a5.setValue("Total");
			
		wb.ws2.b1.setValue("Qty");
		wb.ws2.b2.setValue("85");
		wb.ws2.b3.setValue("90");
		wb.ws2.b4.setValue("95");
		
		Integer sum1 = Integer.parseInt(wb.ws2.b2.getValue())+Integer.parseInt(wb.ws2.b3.getValue())+Integer.parseInt(wb.ws2.b4.getValue());
		String total1 =  sum1.toString(); //   String.valueOf(sum); where sum is int
		
		wb.ws2.b5.setValue(total1);
		
		wb.ws2.printWorkSheet();
		
		System.out.println("=========");
	
		wb.printWorkBook();
		
		

	}

}
/*
 *   Human has Heart
 *   
 *   class Heart
 *   {
 *      void pumping() { }
 *   }
 *   
 *   class Mammal
 *   {
 *   
 *   }
 *   class Human extends Mammal //isA
 *   {
 *        Heart h = new Heart();
 *   }
 *   
 *   class Filament { } //it is a vital part of the Whole Entity
 *   
 *   class Bulb { 
 *      Filament f = new Filament();//hasA  - vital part of this Whole entity -> Bulb
 *   }
 *   
 *   WorkSheet1 | WorkSheet2 | WorkSheet3 +
 * 		A		B		C		D		E
 * 1   Fruit   Qty
 * 2   Mango   200
 * 3   Orange  300
 * 4   Apple   100
 * 5   Totl    600
 * 	Cell a1 = new Cell("A",1,"Fruit"); //hasA
	Cell a2 = new Cell("A",2,"Mango");
	Cell a3 = new Cell("A",3,"Orange");
	Cell a4 = new Cell("A",4,"Apple");
	Cell a5 = new Cell("A",5,"Total");

	Cell b1 = new Cell("B",1,"Qty");
	Cell b2 = new Cell("B",2,"200");
	Cell b3 = new Cell("B",3,"300");
	Cell b4 = new Cell("B",4,"100");
 */

//WorkBook - to have 3 worksheets

class WorkBook //is nothing but your EXCEL file 
{
	WorkSheet ws1 = new WorkSheet();
	
	WorkSheet ws2 = new WorkSheet();
	
	/*WorkSheet ws[]= new WorkSheet[10]; //just 10 references, not the actual objects
	
	WorkBook() {
		ws[0] = new WorkSheet(); //first work sheet is here in the array
		ws[1] = new WorkSheet();
	}*/
	void printWorkBook() {
		ws1.printWorkSheet();
		ws2.printWorkSheet();
	}
	
}

class WorkSheet 
{
	Cell a1 = new Cell("A",1); //hasA
	Cell a2 = new Cell("A",2);
	Cell a3 = new Cell("A",3);
	Cell a4 = new Cell("A",4);
	Cell a5 = new Cell("A",5);

	Cell b1 = new Cell("B",1);
	Cell b2 = new Cell("B",2);
	Cell b3 = new Cell("B",3);
	Cell b4 = new Cell("B",4);
	Cell b5 = new Cell("B",5);
	
	public void printWorkSheet() {
		System.out.println(a1+"\t"+b1);
		System.out.println(a2+"\t"+b2);
		System.out.println(a3+"\t"+b3);
		System.out.println(a4+"\t"+b4);
		System.out.println(a5+"\t"+b5);
		
	}
}



class Cell //Object 
{
	private int rowNumber;
	private String columnName;
	private String value;
	
	public Cell(String columnName,int rowNumber, String value) {
		super();
		this.rowNumber = rowNumber;
		this.columnName = columnName;
		this.value = value;
	}
	
	public Cell(String columnName, int rowNumber) {
		super();
		this.columnName = columnName;
		this.rowNumber = rowNumber;
	}

	public Cell() {
		super(); // Constructor call must be the first statement in a constructor
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		//super(); //Constructor call must be the first statement in a constructor
		return columnName + rowNumber +" "+ value ;
	}



	/*public int getRowNumber() {
		return rowNumber;
	}
	public void setRowNumber(int rowNumber) {
		this.rowNumber = rowNumber;
	}
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}*/
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
	
}

class Font
{
	String fontName; //Times New Roman, ...Comic Sans MS......
	String fontColor;
	int fontSize; 
	int fontStyle; //bold italics or underline
	
	
}
class  Letter
{
	char alphabet;
	Font font = new Font();
}

class Word
{
	Letter l1 = new Letter();
	Letter l2 = new Letter();
	
	
}

class Sentence
{
	Word w1 = new Word();
	Word w2 = new Word();
}







 