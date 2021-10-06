@Test
    public void testConstructor1() {
        OHLCItem item1 = new OHLCItem(new Year(2006), 2.0, 4.0, 1.0, 3.0);
        assertEquals(new Year(2006), item1.getPeriod());
        assertEquals(2.0, item1.getOpenValue(), EPSILON);
        assertEquals(4.0, item1.getHighValue(), EPSILON);
        assertEquals(1.0, item1.getLowValue(), EPSILON);
        assertEquals(3.0, item1.getCloseValue(), EPSILON);
    }

    