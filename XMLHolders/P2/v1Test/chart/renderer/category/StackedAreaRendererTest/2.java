@Test
    public void testHashcode() {
        StackedAreaRenderer r1 = new StackedAreaRenderer();
        StackedAreaRenderer r2 = new StackedAreaRenderer();
        assertTrue(r1.equals(r2));
        int h1 = r1.hashCode();
        int h2 = r2.hashCode();
        assertEquals(h1, h2);
    }

    