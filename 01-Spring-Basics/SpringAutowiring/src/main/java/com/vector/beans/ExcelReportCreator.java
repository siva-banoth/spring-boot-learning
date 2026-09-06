package com.vector.beans;

public class ExcelReportCreator implements ReportCreator{
	@Override
	public void createReport(int pages) {
		System.out.println("ExcelReportCreator :: created report with : "+pages+ " pages");
	}
}
