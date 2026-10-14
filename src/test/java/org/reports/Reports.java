package org.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reports {
	
	public static void generateJvmReports() {
		File f = new File("C:\\Users\\admin\\eclipse-workspace\\InkSpiredBDD\\reports\\JVMReports");
		Configuration c = new Configuration(f, "inkspired");
		c.addClassifications("EMPLOYEENAME", "PRAVEEN");
		c.addClassifications("EMPLOYEEID", "35");
		c.addClassifications("BUGNO", "1");
		List<String> l = new ArrayList<String>();
		l.add("C:\\Users\\admin\\eclipse-workspace\\InkSpiredBDD\\reports\\JsonReports\\inkspired.json");
		ReportBuilder r = new ReportBuilder(l, c);
		r.generateReports();

	}

	public static void main(String[] args) {
		generateJvmReports();

	}


}
