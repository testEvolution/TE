@Test
    public void testClear() {
        XIntervalSeries s1 = new XIntervalSeries("S1");
        s1.addChangeListener(this);
        s1.clear();
        assertNull(this.lastEvent);
        assertTrue(s1.isEmpty());
        s1.add(1.0, 2.0, 3.0, 4.0);
        assertFalse(s1.isEmpty());
        s1.clear();
        assertNotNull(this.lastEvent);
        assertTrue(s1.isEmpty());
    }

    