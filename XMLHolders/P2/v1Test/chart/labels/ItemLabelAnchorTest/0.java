@Test
    public void testEquals() {
        assertTrue(ItemLabelAnchor.INSIDE1.equals(ItemLabelAnchor.INSIDE1));
        assertFalse(ItemLabelAnchor.INSIDE1.equals(ItemLabelAnchor.INSIDE2));
    }

    