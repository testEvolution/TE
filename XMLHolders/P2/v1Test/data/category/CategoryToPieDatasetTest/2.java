@Test
    public void testGetKey() {
        DefaultCategoryDataset underlying = new DefaultCategoryDataset();
        underlying.addValue(1.1, "R1", "C1");
        underlying.addValue(2.2, "R1", "C2");
        CategoryToPieDataset d1 = new CategoryToPieDataset(underlying,
                TableOrder.BY_ROW, 0);
        assertEquals(d1.getKey(0), "C1");
        assertEquals(d1.getKey(1), "C2");

        // check negative index throws exception
        try {
            /* Number n = */ d1.getKey(-1);
            fail("Expected IndexOutOfBoundsException.");
        }
        catch (IndexOutOfBoundsException e) {
            // this is expected
        }

        // check index == getItemCount() throws exception
        try {
            /* Number n = */ d1.getKey(d1.getItemCount());
            fail("Expected IndexOutOfBoundsException.");
        }
        catch (IndexOutOfBoundsException e) {
            // this is expected
        }

        // test null source
        CategoryToPieDataset p1 = new CategoryToPieDataset(null,
                TableOrder.BY_COLUMN, 0);
        try {
            /* Number n = */ p1.getKey(0);
            fail("Expected IndexOutOfBoundsException.");
        }
        catch (IndexOutOfBoundsException e) {
            // this is expected
        }
    }

    