@Test
    public void testSerialization() {
        XYPlot plot = new XYPlot();
        LegendTitle t1 = new LegendTitle(plot);
        LegendTitle t2 = (LegendTitle) TestUtils.serialised(t1);
        assertTrue(t1.equals(t2));
        assertTrue(t2.getSources()[0].equals(plot));
    }
}