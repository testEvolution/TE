@Test
    public void testEquals() {
        StatisticalLineAndShapeRenderer r1
            = new StatisticalLineAndShapeRenderer();
        StatisticalLineAndShapeRenderer r2
            = new StatisticalLineAndShapeRenderer();
        assertTrue(r1.equals(r2));
        assertTrue(r2.equals(r1));

        r1.setErrorIndicatorPaint(Color.RED);
        assertFalse(r1.equals(r2));
        r2.setErrorIndicatorPaint(Color.RED);
        assertTrue(r2.equals(r1));
    }

    