@Test
    public void testGetValue() {
        Number value1 = this.seriesA.getValue(new Year(1999));
        assertNull(value1);
        int value2 = this.seriesA.getValue(new Year(2000)).intValue();
        assertEquals(102000, value2);
    }

    