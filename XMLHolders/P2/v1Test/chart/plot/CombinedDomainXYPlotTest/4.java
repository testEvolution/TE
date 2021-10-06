@Test
    public void testCloning() throws CloneNotSupportedException {
        CombinedDomainXYPlot plot1 = createPlot();
        CombinedDomainXYPlot plot2 = (CombinedDomainXYPlot) plot1.clone();
        assertTrue(plot1 != plot2);
        assertTrue(plot1.getClass() == plot2.getClass());
        assertTrue(plot1.equals(plot2));
    }

    