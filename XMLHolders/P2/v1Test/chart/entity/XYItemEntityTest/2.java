@Test
    public void testSerialization() {
        XYItemEntity e1 = new XYItemEntity(new Rectangle2D.Double(1.0, 2.0,
                3.0, 4.0), new TimeSeriesCollection(), 1, 9, "ToolTip", "URL");
        XYItemEntity e2 = (XYItemEntity) TestUtils.serialised(e1);
        assertEquals(e1, e2);
    }

}