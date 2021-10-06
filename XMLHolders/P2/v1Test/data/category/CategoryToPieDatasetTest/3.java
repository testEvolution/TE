@Test
    public void testGetIndex() {
        DefaultCategoryDataset underlying = new DefaultCategoryDataset();
        underlying.addValue(1.1, "R1", "C1");
        underlying.addValue(2.2, "R1", "C2");
        CategoryToPieDataset d1 = new CategoryToPieDataset(underlying,
                TableOrder.BY_ROW, 0);
        assertEquals(0, d1.getIndex("C1"));
        assertEquals(1, d1.getIndex("C2"));
        assertEquals(-1, d1.getIndex("XX"));

        // try null
        boolean pass = false;
        try {
            d1.getIndex(null);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    