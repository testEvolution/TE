@Test
    public void testAddValue() {
        this.seriesA.add(new Year(1999), 1);
        int value = this.seriesA.getValue(0).intValue();
        assertEquals(1, value);
    }

    