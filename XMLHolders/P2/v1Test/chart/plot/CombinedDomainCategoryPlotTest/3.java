@Test
    public void testCloning() throws CloneNotSupportedException {
        CombinedDomainCategoryPlot plot1 = createPlot();
        CombinedDomainCategoryPlot plot2 = (CombinedDomainCategoryPlot) 
                plot1.clone();
        assertTrue(plot1 != plot2);
        assertTrue(plot1.getClass() == plot2.getClass());
        assertTrue(plot1.equals(plot2));
    }

    