package com.vector.beans;

public class PdfReportCreator implements ReportCreator {

	@Override
	public void createReport(int pages) {
			System.out.println("PdfReportCreator :: created report with : " + pages + " pages");
	}

}
