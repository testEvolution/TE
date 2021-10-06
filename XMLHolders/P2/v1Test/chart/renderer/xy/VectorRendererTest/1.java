@Test
    public void testHashcode() {
        VectorRenderer r1 = new VectorRenderer();
        VectorRenderer r2 = new VectorRenderer();
        assertTrue(r1.equals(r2));
        int h1 = r1.hashCode();
        int h2 = r2.hashCode();
        assertEquals(h1, h2);
    }

    