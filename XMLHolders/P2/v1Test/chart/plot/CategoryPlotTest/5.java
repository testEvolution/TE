@Test
    public void testEquals_ObjectList3() {
        CategoryPlot p1 = new CategoryPlot();
        p1.setRangeAxis(new NumberAxis("A"));
        CategoryPlot p2 = new CategoryPlot();
        p2.setRangeAxis(new NumberAxis("A"));
        assertEquals(p1, p2);
        p2.setRangeAxis(1, new NumberAxis("B"));
        assertNotEquals(p1, p2);
    }
    
    