@Test
    public void testConstructor() {
        // try a null source
        CategoryToPieDataset p1 = new CategoryToPieDataset(null,
                TableOrder.BY_COLUMN, 0);
        assertNull(p1.getUnderlyingDataset());
        assertEquals(p1.getItemCount(), 0);
        assertTrue(p1.getKeys().isEmpty());
        assertNull(p1.getValue("R1"));
    }

    