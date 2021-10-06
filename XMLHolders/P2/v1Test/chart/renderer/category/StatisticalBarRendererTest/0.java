@Test
    public void testEquals() {
        StatisticalBarRenderer r1 = new StatisticalBarRenderer();
        StatisticalBarRenderer r2 = new StatisticalBarRenderer();
        assertEquals(r1, r2);

        r1.setErrorIndicatorPaint(Color.RED);
        assertFalse(r1.equals(r2));
        r2.setErrorIndicatorPaint(Color.RED);
        assertTrue(r2.equals(r1));

        r1.setErrorIndicatorStroke(new BasicStroke(1.5f));
        assertFalse(r1.equals(r2));
        r2.setErrorIndicatorStroke(new BasicStroke(1.5f));
        assertTrue(r2.equals(r1));
    }

    