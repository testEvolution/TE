private static JFreeChart createWaterfallChart() {
        Number[][] data = new Integer[][] {{-3, -2}, {-1, 1}, {2, 3}};

        CategoryDataset dataset = DatasetUtils.createCategoryDataset("S",
                "C", data);
        return ChartFactory.createWaterfallChart("Waterfall Chart",
            "Domain", "Range", dataset, PlotOrientation.HORIZONTAL,
            true,     // include legend
            true, true);
    }

}