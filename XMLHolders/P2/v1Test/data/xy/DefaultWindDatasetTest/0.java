@Test
    public void testEquals() {
        DefaultWindDataset d1 = new DefaultWindDataset();
        DefaultWindDataset d2 = new DefaultWindDataset();
        assertTrue(d1.equals(d2));
        assertTrue(d2.equals(d1));

        d1 = createSampleDataset1();
        assertFalse(d1.equals(d2));
        d2 = createSampleDataset1();
        assertTrue(d1.equals(d2));
    }

    