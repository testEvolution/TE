@Test
    public void test2902842() {
        this.lastEvent = null;
        double[] values = {0.0, 1.0, 2.0, 3.0, 4.0, 5.0};
        HistogramDataset hd = new HistogramDataset();
        hd.addChangeListener(this);
        hd.addSeries("S1", values, 5);
        assertNotNull(this.lastEvent);
    }

    