@Test
    public void testSerialization2() {
        MeterPlot p1 = new MeterPlot(new DefaultValueDataset(1.23));
        MeterPlot p2 = (MeterPlot) TestUtils.serialised(p1);
        assertEquals(p1, p2);

    }

}