@Test
    public void testEquals_ObjectList() {
        CategoryPlot p1 = new CategoryPlot();
        p1.setDomainAxis(new CategoryAxis("A"));
        CategoryPlot p2 = new CategoryPlot();
        p2.setDomainAxis(new CategoryAxis("A"));
        assertEquals(p1, p2);
        p2.setDomainAxis(1, new CategoryAxis("B"));
        assertNotEquals(p1, p2);
    }
    
    