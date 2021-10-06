@Test
    public void testEquals_ObjectList4() {
        XYPlot p1 = new XYPlot();
        p1.setRangeAxisLocation(AxisLocation.BOTTOM_OR_RIGHT);
        XYPlot p2 = new XYPlot();
        p2.setRangeAxisLocation(AxisLocation.BOTTOM_OR_RIGHT);
        assertEquals(p1, p2);
        p2.setRangeAxisLocation(1, AxisLocation.TOP_OR_LEFT);
        assertNotEquals(p1, p2);
    }

    