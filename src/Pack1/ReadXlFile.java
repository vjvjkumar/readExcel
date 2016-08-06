package Pack1;

import Pack2.XLS_Reader;
public class ReadXlFile {
	
	public static void main(String[] args) {
                   		
		XLS_Reader xls = new XLS_Reader("V:/WorkSpace/testfile/mytestdata.xlsx");
		         //obj//here create an object(obj) for XLS_Reader 
		
		//rows count 
		System.out.println("Total Rows: "+xls.getRowCount("testdata"));
		
		//columns count
		System.out.println("Total Colums: "+xls.getColumnCount("testdata"));
		
		//read data in the cell
		//xls.getCellData(sheetName, colNum, rowNum)
		System.out.println(xls.getCellData("testdata", 0, 2));
		System.out.println(xls.getCellData("testdata", 0, 3));
		System.out.println(xls.getCellData("testdata", 1, 2));
		System.out.println(xls.getCellData("testdata", 1, 3));
		
		//write data in the cell
		//xls.setCellData(sheetName, colName, rowNum, data)
		xls.setCellData("testdata", "data", 2, "This is my data1");
		xls.setCellData("testdata", "data", 3, "This is my data2");
		
	}
	

}
