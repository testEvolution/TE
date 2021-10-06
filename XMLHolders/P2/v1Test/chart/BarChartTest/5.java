private static JFreeChart createBarChart() {

        // create a dataset...
        Number[][] data = new Integer[][] {{-3, -2}, {-1, 1}, {2, 3}};

        CategoryDataset dataset = DatasetUtils.createCategoryDataset("S",
                "C", data);

        // create the chart...
        return ChartFactory.createBarChart(
            "Bar Chart",
            "Domain", "Range",
            dataset,
            PlotOrientation.HORIZONTAL,
            true,     // include legend
            true,
            true
        );

    }

    