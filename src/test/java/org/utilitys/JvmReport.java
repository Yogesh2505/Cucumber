package org.utilitys;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void generateJvmReport(String jpath) {
		File f=new File("C:\\Users\\ELCOT\\eclipse-workspace\\Cucumber\\target\\Reports\\JVMrport");
		Configuration con=new Configuration(f, "Facebook Project");
		con.addClassifications("yogesh", "kumar");
		con.addClassifications("isac", "sasi");
		List<String> s=new ArrayList<String>();
		s.add(jpath);
		ReportBuilder r=new ReportBuilder(s, con);
		r.generateReports();
		System.out.println("yogesh1");
		System.out.println("yogesh2");
		System.out.println("jeyaram1");

	}
	

}
