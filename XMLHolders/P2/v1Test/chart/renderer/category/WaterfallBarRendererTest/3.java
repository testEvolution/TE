@Test
    public void testCloning() throws CloneNotSupportedException {
        WaterfallBarRenderer r1 = new WaterfallBarRenderer();
        WaterfallBarRenderer r2 = (WaterfallBarRenderer) r1.clone();
        assertTrue(r1 != r2);
        assertTrue(r1.getClass() == r2.getClass());
        assertTrue(r1.equals(r2));

        // quick check for independence
        r1.setFirstBarPaint(Color.YELLOW);
        assertFalse(r1.equals(r2));
        r2.setFirstBarPaint(Color.YELLOW);
        assertTrue(r1.equals(r2));

    }

    