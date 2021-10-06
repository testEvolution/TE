public DefaultXYZDataset createSampleDataset1() {
        DefaultXYZDataset d = new DefaultXYZDataset();
        double[] x1 = new double[] {1.0, 2.0, 3.0};
        double[] y1 = new double[] {4.0, 5.0, 6.0};
        double[] z1 = new double[] {7.0, 8.0, 9.0};
        double[][] data1 = new double[][] {x1, y1, z1};
        d.addSeries("S1", data1);

        double[] x2 = new double[] {1.0, 2.0, 3.0};
        double[] y2 = new double[] {4.0, 5.0, 6.0};
        double[] z2 = new double[] {7.0, 8.0, 9.0};
        double[][] data2 = new double[][] {x2, y2, z2};
        d.addSeries("S2", data2);
        return d;
    }

}