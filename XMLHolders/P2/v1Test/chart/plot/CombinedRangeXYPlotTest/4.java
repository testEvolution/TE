@Test
    public void testSerialization() {
        CombinedRangeXYPlot plot1 = createPlot();
        CombinedRangeXYPlot plot2 = (CombinedRangeXYPlot) 
                TestUtils.serialised(plot1);
        assertEquals(plot1, plot2);
    }

    