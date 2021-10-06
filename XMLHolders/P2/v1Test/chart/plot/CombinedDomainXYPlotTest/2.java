@Test
    public void testRemoveSubplot() {
        CombinedDomainXYPlot plot = new CombinedDomainXYPlot();
        XYPlot plot1 = new XYPlot();
        XYPlot plot2 = new XYPlot();
        plot.add(plot1);
        plot.add(plot2);
        // remove plot2, but plot1 is removed instead
        plot.remove(plot2);
        List plots = plot.getSubplots();
        assertTrue(plots.get(0) == plot1);
    }

    