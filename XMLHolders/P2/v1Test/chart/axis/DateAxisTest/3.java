@Test
    public void testHashCode() {
        DateAxis a1 = new DateAxis("Test");
        DateAxis a2 = new DateAxis("Test");
        assertTrue(a1.equals(a2));
        int h1 = a1.hashCode();
        int h2 = a2.hashCode();
        assertEquals(h1, h2);
    }

    