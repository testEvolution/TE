@Test
    public void testEquals_ObjectList2() {
        XYPlot p1 = new XYPlot();
        p1.setDomainAxisLocation(AxisLocation.BOTTOM_OR_RIGHT);
        XYPlot p2 = new XYPlot();
        p2.setDomainAxisLocation(AxisLocation.BOTTOM_OR_RIGHT);
        assertEquals(p1, p2);
        p2.setDomainAxisLocation(1, AxisLocation.TOP_OR_LEFT);
        assertNotEquals(p1, p2);
    }

    