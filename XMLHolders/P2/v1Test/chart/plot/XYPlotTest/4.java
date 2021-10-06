@Test
    public void testEquals_ObjectList3() {
        XYPlot p1 = new XYPlot();
        p1.setRangeAxis(new NumberAxis("A"));
        XYPlot p2 = new XYPlot();
        p2.setRangeAxis(new NumberAxis("A"));
        assertEquals(p1, p2);
        p2.setRangeAxis(1, new NumberAxis("B"));
        assertNotEquals(p1, p2);
    }
    
    