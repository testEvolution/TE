private static JFreeChart createGanttChart() {

        return ChartFactory.createGanttChart(
            "Gantt Chart",
            "Domain", "Range",
            null,
            true,     // include legend
            true,
            true
        );
    }

    