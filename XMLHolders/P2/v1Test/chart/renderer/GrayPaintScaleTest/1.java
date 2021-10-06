@Test
    public void testGetPaint() {
        GrayPaintScale gps = new GrayPaintScale();
        Color c = (Color) gps.getPaint(0.0);
        assertTrue(c.equals(Color.BLACK));
        c = (Color) gps.getPaint(1.0);
        assertTrue(c.equals(Color.WHITE));

        // check lookup values that are outside the bounds - see bug report
        // 1767315
        c = (Color) gps.getPaint(-0.5);
        assertTrue(c.equals(Color.BLACK));
        c = (Color) gps.getPaint(1.5);
        assertTrue(c.equals(Color.WHITE));
    }

    