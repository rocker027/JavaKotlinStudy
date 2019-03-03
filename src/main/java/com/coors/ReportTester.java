package com.coors;

import java.util.ArrayList;
import java.util.List;

public class ReportTester {
    public static void main(String[] args) {
        Report financeReport = new FinanceReport();
        Report healthReport = new HealthrReport();
        List<Report> reports = new ArrayList<>();
        reports.add(financeReport);
        reports.add(healthReport);
        for (Report report : reports) {
            report.load();
            report.print();
        }
    }
}
