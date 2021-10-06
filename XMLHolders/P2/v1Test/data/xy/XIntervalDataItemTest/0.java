@Test
    public void testConstructor1() {
        XIntervalDataItem item1 = new XIntervalDataItem(1.0, 2.0, 3.0, 4.0);
        assertEquals(1.0, item1.getX());
        assertEquals(2.0, item1.getXLowValue(), EPSILON);
        assertEquals(3.0, item1.getXHighValue(), EPSILON);
        assertEquals(4.0, item1.getYValue(), EPSILON);
    }

    