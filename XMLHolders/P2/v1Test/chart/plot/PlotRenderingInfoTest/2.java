@Test
    public void testSerialization() {
        PlotRenderingInfo p1 = new PlotRenderingInfo(new ChartRenderingInfo());
        PlotRenderingInfo p2 = (PlotRenderingInfo) TestUtils.serialised(p1);
        assertEquals(p1, p2);
    }

}