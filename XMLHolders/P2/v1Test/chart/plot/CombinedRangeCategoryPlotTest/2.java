@Test
    public void testCloning() throws CloneNotSupportedException {
        CombinedRangeCategoryPlot plot1 = createPlot();
        CombinedRangeCategoryPlot plot2 = (CombinedRangeCategoryPlot) 
                plot1.clone();
        assertTrue(plot1 != plot2);
        assertTrue(plot1.getClass() == plot2.getClass());
        assertTrue(plot1.equals(plot2));
    }

    