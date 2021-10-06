@Test
    public void testSerialization() {
        XYIntervalDataItem item1 = new XYIntervalDataItem(1.0, 0.5, 1.5, 2.0,
                1.9, 2.1);
        XYIntervalDataItem item2 = (XYIntervalDataItem) 
                TestUtils.serialised(item1);
        assertEquals(item1, item2);
    }

}