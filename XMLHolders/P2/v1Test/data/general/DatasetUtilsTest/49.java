private TableXYDataset createTableXYDataset1() {
        DefaultTableXYDataset dataset = new DefaultTableXYDataset();

        XYSeries s1 = new XYSeries("Series 1", true, false);
        s1.add(1.0, 1.0);
        s1.add(2.0, 2.0);
        dataset.addSeries(s1);

        XYSeries s2 = new XYSeries("Series 2", true, false);
        s2.add(1.0, -2.0);
        s2.add(2.0, -1.0);
        dataset.addSeries(s2);

        return dataset;
    }

    