package com.vector.beans;

public class ReportManager {

	ReportCreator reportCreator;
	
	public ReportManager(ReportCreator reportCreator) {
		this.reportCreator = reportCreator;
		System.out.println("ReportCreator :: parameterized constructor");
	}

	public void setReportCreator(ReportCreator reportCreator) {
		this.reportCreator = reportCreator;
		System.out.println("ReportCreator :: Setter method");
	}

	public void printReport(int pages) {

		reportCreator.createReport(pages);
	}

}
