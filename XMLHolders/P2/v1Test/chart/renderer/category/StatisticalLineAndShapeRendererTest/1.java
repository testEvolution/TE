@Test
    public void testHashcode() {
        StatisticalLineAndShapeRenderer r1
            = new StatisticalLineAndShapeRenderer();
        StatisticalLineAndShapeRenderer r2
            = new StatisticalLineAndShapeRenderer();
        assertTrue(r1.equals(r2));
        int h1 = r1.hashCode();
        int h2 = r2.hashCode();
        assertEquals(h1, h2);
    }

    