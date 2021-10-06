@Test
    public void testRemoveColumn() {
        DefaultCategoryDataset d = new DefaultCategoryDataset();
        d.addValue(1.0, "R1", "C1");
        d.addValue(2.0, "R2", "C2");
        assertEquals(2, d.getColumnCount());
        d.removeColumn("C2");
        assertEquals(1, d.getColumnCount());

        boolean pass = false;
        try {
            d.removeColumn("XXX");
        }
        catch (UnknownKeyException e) {
            pass = true;
        }
        assertTrue(pass);

        pass = false;
        try {
            d.removeColumn(null);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    