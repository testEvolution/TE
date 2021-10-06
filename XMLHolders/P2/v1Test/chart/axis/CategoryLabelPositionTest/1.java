@Test
    public void testHashCode() {
        CategoryLabelPosition a1 = new CategoryLabelPosition();
        CategoryLabelPosition a2 = new CategoryLabelPosition();
        assertTrue(a1.equals(a2));
        int h1 = a1.hashCode();
        int h2 = a2.hashCode();
        assertEquals(h1, h2);
    }

    