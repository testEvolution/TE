@Test
    public void testHashcode() {
        LevelRenderer r1 = new LevelRenderer();
        LevelRenderer r2 = new LevelRenderer();
        assertTrue(r1.equals(r2));
        int h1 = r1.hashCode();
        int h2 = r2.hashCode();
        assertEquals(h1, h2);
    }

    