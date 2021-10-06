@Test
    public void testSerialization() {
        XIntervalDataItem item1 = new XIntervalDataItem(1.0, 2.0, 3.0, 4.0);
        XIntervalDataItem item2 = (XIntervalDataItem) TestUtils.serialised(item1);
        assertEquals(item1, item2);
    }

}