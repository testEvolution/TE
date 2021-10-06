@Test
    public void testSerialization() {
        // try a default instance
        StandardDialScale s1 = new StandardDialScale();
        StandardDialScale s2 = (StandardDialScale) TestUtils.serialised(s1);
        assertEquals(s1, s2);

        // try a customised instance
        s1 = new StandardDialScale();
        s1.setExtent(123.4);
        s1.setMajorTickPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f,
                4.0f, Color.WHITE));
        s1.setMajorTickStroke(new BasicStroke(2.0f));

        s2 = (StandardDialScale) TestUtils.serialised(s1);
        assertEquals(s1, s2);
    }

    