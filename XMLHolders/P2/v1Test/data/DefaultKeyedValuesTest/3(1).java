@Test
    public void testClear() {
        DefaultKeyedValues v1 = new DefaultKeyedValues();
        v1.addValue("A", 1.0);
        v1.addValue("B", 2.0);
        assertEquals(2, v1.getItemCount());
        v1.clear();
        assertEquals(0, v1.getItemCount());
    }

    