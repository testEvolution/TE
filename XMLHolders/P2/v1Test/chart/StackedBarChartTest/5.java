private static JFreeChart createChart() {
        Number[][] data = new Integer[][] {{-3, -2}, {-1, 1}, {2, 3}};

        CategoryDataset dataset = DatasetUtils.createCategoryDataset("S",
                "C", data);
        return ChartFactory.createStackedBarChart(
            "Stacked Bar Chart",  // chart title
            "Domain", "Range",
            dataset,      // data
            PlotOrientation.HORIZONTAL,
            true,         // include legend
            true,
            true
        );

    }

    