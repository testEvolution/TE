private static JFreeChart createPieChart() {
        DefaultPieDataset data = new DefaultPieDataset();
        data.setValue("Java", 43.2);
        data.setValue("Visual Basic", 0.0);
        data.setValue("C/C++", 17.5);
        return ChartFactory.createPieChart("Pie Chart", data);
    }

    