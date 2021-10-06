@Test
    public void testGetValue() {
        DefaultCategoryDataset underlying = new DefaultCategoryDataset();
        underlying.addValue(1.0, "R1", "C1");
        underlying.addValue(2.0, "R1", "C2");
        underlying.addValue(3.0, "R1", "C3");
        underlying.addValue(4.0, "R1", "C4");
        SlidingCategoryDataset dataset = new SlidingCategoryDataset(underlying,
                1, 2);
        assertEquals(2.0, dataset.getValue("R1", "C2"));
        assertEquals(3.0, dataset.getValue("R1", "C3"));
        boolean pass = false;
        try {
            dataset.getValue("R1", "C1");
        }
        catch (UnknownKeyException e) {
            pass = true;
        }
        assertTrue(pass);

        pass = false;
        try {
            dataset.getValue("R1", "C4");
        }
        catch (UnknownKeyException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    