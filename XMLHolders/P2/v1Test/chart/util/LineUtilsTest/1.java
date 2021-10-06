@Test
    public void testClipLine() {
        Rectangle2D rect = new Rectangle2D.Double(1.0, 1.0, 1.0, 1.0);
        Line2D line = new Line2D.Double();

        assertFalse(LineUtils.clipLine(line, rect));
        assertTrue(lineEquals(line, 0.0, 0.0, 0.0, 0.0));

        line.setLine(0.5, 0.5, 0.6, 0.6);
        assertFalse(LineUtils.clipLine(line, rect));
        assertTrue(lineEquals(line, 0.5, 0.5, 0.6, 0.6));

        line.setLine(0.5, 0.5, 1.6, 0.6);
        assertFalse(LineUtils.clipLine(line, rect));
        assertTrue(lineEquals(line, 0.5, 0.5, 1.6, 0.6));

        line.setLine(0.5, 0.5, 2.6, 0.6);
        assertFalse(LineUtils.clipLine(line, rect));
        assertTrue(lineEquals(line, 0.5, 0.5, 2.6, 0.6));

        line.setLine(0.5, 0.5, 0.6, 1.6);
        assertFalse(LineUtils.clipLine(line, rect));
        assertTrue(lineEquals(line, 0.5, 0.5, 0.6, 1.6));

        line.setLine(0.5, 0.5, 1.6, 1.6);
        assertTrue(LineUtils.clipLine(line, rect));
        assertTrue(lineEquals(line, 1.0, 1.0, 1.6, 1.6));

        line.setLine(0.5, 0.5, 2.6, 1.6);
        assertTrue(LineUtils.clipLine(line, rect));
        assertTrue(lineEquals(line, 1.4545454545454546, 1.0, 2.0,
                1.2857142857142858));

        line.setLine(0.5, 0.5, 0.5, 2.6);
        assertFalse(LineUtils.clipLine(line, rect));
        assertTrue(lineEquals(line, 0.5, 0.5, 0.5, 2.6));

        line.setLine(0.5, 0.5, 1.5, 2.6);
        assertTrue(LineUtils.clipLine(line, rect));
        assertTrue(lineEquals(line, 1.0, 1.55, 1.2142857142857142, 2.0));

        line.setLine(0.5, 0.5, 2.5, 2.6);
        assertTrue(LineUtils.clipLine(line, rect));
        assertTrue(lineEquals(line, 1.0, 1.025, 1.9285714285714284, 2.0));

        line.setLine(0.5, 0.5, 1.5, 1.5);
        assertTrue(LineUtils.clipLine(line, rect));
        assertTrue(lineEquals(line, 1.0, 1.0, 1.5, 1.5));

        line.setLine(2.5, 1.0, 1.5, 1.5);
        assertTrue(LineUtils.clipLine(line, rect));
        assertTrue(lineEquals(line, 2.0, 1.25, 1.5, 1.5));

        line.setLine(1.5, 1.5, 2.5, 1.0);
        assertTrue(LineUtils.clipLine(line, rect));
        assertTrue(lineEquals(line, 1.5, 1.5, 2.0, 1.25));
    }

}