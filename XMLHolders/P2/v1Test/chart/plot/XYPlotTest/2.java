@Test
    public void testEquals_ObjectList() {
        XYPlot p1 = new XYPlot();
        p1.setDomainAxis(new NumberAxis("A"));
        XYPlot p2 = new XYPlot();
        p2.setDomainAxis(new NumberAxis("A"));
        assertEquals(p1, p2);
        p2.setDomainAxis(1, new NumberAxis("B"));
        assertNotEquals(p1, p2);
    }
    
    