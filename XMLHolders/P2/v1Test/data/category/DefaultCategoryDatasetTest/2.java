@Test
    public void testIncrementValue() {
        DefaultCategoryDataset d = new DefaultCategoryDataset();
        d.addValue(1.0, "R1", "C1");
        d.incrementValue(2.0, "R1", "C1");
        assertEquals(3.0, d.getValue("R1", "C1"));

        // increment a null value
        d.addValue(null, "R2", "C1");
        d.incrementValue(2.0, "R2", "C1");
        assertEquals(2.0, d.getValue("R2", "C1"));

        // increment an unknown row
        boolean pass = false;
        try {
            d.incrementValue(1.0, "XX", "C1");
        }
        catch (UnknownKeyException e) {
            pass = true;
        }
        assertTrue(pass);

        // increment an unknown column
        pass = false;
        try {
            d.incrementValue(1.0, "R1", "XX");
        }
        catch (UnknownKeyException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    