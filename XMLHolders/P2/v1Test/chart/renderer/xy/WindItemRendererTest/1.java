@Test
    public void testHashcode() {
        WindItemRenderer r1 = new WindItemRenderer();
        WindItemRenderer r2 = new WindItemRenderer();
        assertTrue(r1.equals(r2));
        int h1 = r1.hashCode();
        int h2 = r2.hashCode();
        assertEquals(h1, h2);
    }

    