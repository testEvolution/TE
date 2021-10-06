@Test
    public void testSerialization() {
        CombinedRangeCategoryPlot plot1 = createPlot();
        CombinedRangeCategoryPlot plot2 = (CombinedRangeCategoryPlot) 
                TestUtils.serialised(plot1);
        assertEquals(plot1, plot2);
    }

    