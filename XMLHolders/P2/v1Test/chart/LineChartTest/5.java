private static JFreeChart createLineChart() {

        Number[][] data = new Integer[][] {{-3, -2}, {-1, 1}, {2, 3}};

        CategoryDataset dataset = DatasetUtils.createCategoryDataset("S",
                "C", data);

        return ChartFactory.createLineChart("Line Chart", "Domain", "Range",
                dataset);

    }

    