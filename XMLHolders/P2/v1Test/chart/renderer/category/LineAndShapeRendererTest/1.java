@Test
    public void testHashcode() {
        LineAndShapeRenderer r1 = new LineAndShapeRenderer();
        LineAndShapeRenderer r2 = new LineAndShapeRenderer();
        assertTrue(r1.equals(r2));
        int h1 = r1.hashCode();
        int h2 = r2.hashCode();
        assertEquals(h1, h2);
    }

    