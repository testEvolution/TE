@Test
    public void testHashCode() {
        CategoryAxis a1 = new CategoryAxis("Test");
        CategoryAxis a2 = new CategoryAxis("Test");
        assertTrue(a1.equals(a2));
        int h1 = a1.hashCode();
        int h2 = a2.hashCode();
        assertEquals(h1, h2);
    }

    