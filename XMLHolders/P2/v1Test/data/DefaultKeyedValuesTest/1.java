@Test
    public void testGetItemCount() {
        DefaultKeyedValues d = new DefaultKeyedValues();
        assertEquals(0, d.getItemCount());
        d.addValue("A", 1.0);
        assertEquals(1, d.getItemCount());
        d.addValue("B", 2.0);
        assertEquals(2, d.getItemCount());
        d.clear();
        assertEquals(0, d.getItemCount());
    }

    