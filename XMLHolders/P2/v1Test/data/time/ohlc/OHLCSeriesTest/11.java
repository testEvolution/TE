@Test
    public void testClear() {
        OHLCSeries s1 = new OHLCSeries("S1");
        s1.addChangeListener(this);
        s1.clear();
        assertNull(this.lastEvent);
        assertTrue(s1.isEmpty());
        s1.add(new Year(2006), 1.0, 1.1, 1.1, 1.1);
        assertFalse(s1.isEmpty());
        s1.clear();
        assertNotNull(this.lastEvent);
        assertTrue(s1.isEmpty());
    }

}