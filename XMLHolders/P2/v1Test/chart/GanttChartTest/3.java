@Test
    public void testReplaceDataset() {
        LocalListener l = new LocalListener();
        this.chart.addChangeListener(l);
        CategoryPlot plot = (CategoryPlot) this.chart.getPlot();
        plot.setDataset(null);
        assertEquals(true, l.flag);
    }

    