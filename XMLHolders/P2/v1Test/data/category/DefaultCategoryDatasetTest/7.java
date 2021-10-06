@Test
    public void testAddValue() {
        DefaultCategoryDataset d1 = new DefaultCategoryDataset();
        d1.addValue(null, "R1", "C1");
        assertNull(d1.getValue("R1", "C1"));
        d1.addValue(1.0, "R2", "C1");
        assertEquals(1.0, d1.getValue("R2", "C1"));

        boolean pass = false;
        try {
            d1.addValue(1.1, null, "C2");
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    