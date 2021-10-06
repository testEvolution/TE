@Test
    public void testGetItemCount() {
        DefaultIntervalXYDataset d = createSampleDataset1();
        assertEquals(3, d.getItemCount(0));
        assertEquals(3, d.getItemCount(1));

        // try an index out of bounds
        boolean pass = false;
        try {
            d.getItemCount(2);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    