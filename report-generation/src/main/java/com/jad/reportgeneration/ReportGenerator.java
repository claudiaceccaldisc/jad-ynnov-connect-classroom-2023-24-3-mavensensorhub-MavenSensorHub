package com.jad.reportgeneration;

import com.jad.SensorData;
import com.jad.ReportType;
import com.jad.IReportGenerator;


import java.util.List;

public class ReportGenerator implements IReportGenerator {
    @Override
    public void generate(final ReportType reportType, List<SensorData> data) {
        switch (reportType) {
            case TEXT -> new TextReportGenerator().generateReport(data);
            case CSV -> new CSVReportGenerator().generateReport(data);
        }
    }
}
