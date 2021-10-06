@Test
    public void testSerialization() {
        CombinedDomainXYPlot plot1 = createPlot();
        CombinedDomainXYPlot plot2 = (CombinedDomainXYPlot) 
                TestUtils.serialised(plot1);
        assertEquals(plot1, plot2);
    }

    