@Test
    public void testSerialization() {
        CombinedDomainCategoryPlot plot1 = createPlot();
        CombinedDomainCategoryPlot plot2 = (CombinedDomainCategoryPlot) 
                TestUtils.serialised(plot1);
        assertEquals(plot1, plot2);
    }

    