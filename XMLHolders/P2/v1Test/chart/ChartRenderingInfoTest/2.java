@Test
    public void testSerialization() {
        ChartRenderingInfo i1 = new ChartRenderingInfo();
        i1.setChartArea(new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0));
        ChartRenderingInfo i2 = (ChartRenderingInfo) TestUtils.serialised(i1);
        assertEquals(i1, i2);
    }

    