@Test
    public void test1562759() {
        StatisticalLineAndShapeRenderer r
            = new StatisticalLineAndShapeRenderer(true, false);
        assertTrue(r.getDefaultLinesVisible());
        assertFalse(r.getDefaultShapesVisible());

        r = new StatisticalLineAndShapeRenderer(false, true);
        assertFalse(r.getDefaultLinesVisible());
        assertTrue(r.getDefaultShapesVisible());
    }

    