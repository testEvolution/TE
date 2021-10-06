@Test
    public void testSerialization2() {
        ChartRenderingInfo i1 = new ChartRenderingInfo();
        i1.getPlotInfo().setDataArea(new Rectangle2D.Double(1.0, 2.0, 3.0,
                4.0));
        ChartRenderingInfo i2 = (ChartRenderingInfo) TestUtils.serialised(i1);
        assertEquals(i1, i2);
        assertEquals(i2, i2.getPlotInfo().getOwner());
    }
}