public class Demo10 {
    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLogger();
        ReportService consoleReportService = new ReportService(consoleLogger);
        consoleReportService.generate();
    }
}
