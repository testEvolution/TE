@Test
    public void testEquals() {
        assertEquals(CategoryAnchor.START, CategoryAnchor.START);
        assertEquals(CategoryAnchor.MIDDLE, CategoryAnchor.MIDDLE);
        assertEquals(CategoryAnchor.END, CategoryAnchor.END);
        assertFalse(CategoryAnchor.START.equals(CategoryAnchor.END));
        assertFalse(CategoryAnchor.MIDDLE.equals(CategoryAnchor.END));
    }

    