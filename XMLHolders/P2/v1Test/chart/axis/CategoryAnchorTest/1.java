@Test
    public void testHashCode() {
        CategoryAnchor a1 = CategoryAnchor.START;
        CategoryAnchor a2 = CategoryAnchor.START;
        assertTrue(a1.equals(a2));
        int h1 = a1.hashCode();
        int h2 = a2.hashCode();
        assertEquals(h1, h2);
    }

    