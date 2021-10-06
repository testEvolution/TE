@Test
    public void testSerialization() {
        OHLCItem item1 = new OHLCItem(new Year(2006), 2.0, 4.0, 1.0, 3.0);
        OHLCItem item2 = (OHLCItem) TestUtils.serialised(item1);
        assertEquals(item1, item2);
    }

    