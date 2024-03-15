package org.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Report {

	public static void getJVMReport(String jsonfile) {

		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\OmrBranch_Cucumber\\target");
		Configuration configuration = new Configuration(file, "facebook report");
		configuration.addClassifications("browser", "chrome");
		List<String> jsonfiles = new ArrayList<>();
		jsonfiles.add(jsonfile);
		ReportBuilder builder = new ReportBuilder(jsonfiles, configuration);
		builder.generateReports();

	}

}
