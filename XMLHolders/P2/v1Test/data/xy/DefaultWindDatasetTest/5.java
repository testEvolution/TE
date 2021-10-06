@Test
    public void testIndexOf() {
        DefaultWindDataset d = createSampleDataset1();
        assertEquals(0, d.indexOf("Series 1"));
        assertEquals(1, d.indexOf("Series 2"));
        assertEquals(-1, d.indexOf("Green Eggs and Ham"));
        assertEquals(-1, d.indexOf(null));
    }

    