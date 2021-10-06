@Test
    public void testCloning() throws CloneNotSupportedException {
        CombinedRangeXYPlot plot1 = createPlot();
        CombinedRangeXYPlot plot2 = (CombinedRangeXYPlot) plot1.clone();
        assertTrue(plot1 != plot2);
        assertTrue(plot1.getClass() == plot2.getClass());
        assertTrue(plot1.equals(plot2));
    }

    