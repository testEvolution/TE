@Test
    public void testHashCode() {
        Axis a1 = new CategoryAxis("Test");
        Axis a2 = new CategoryAxis("Test");
        assertEquals(a1, a2);
        int h1 = a1.hashCode();
        int h2 = a2.hashCode();
        assertEquals(h1, h2);
    }
    
    