@Test
    public void testEquals() {
        CombinedDomainXYPlot plot1 = createPlot();
        CombinedDomainXYPlot plot2 = createPlot();
        assertTrue(plot1.equals(plot2));
        assertTrue(plot2.equals(plot1));
    }

    