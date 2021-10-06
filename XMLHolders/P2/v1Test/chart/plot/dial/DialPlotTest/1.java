@Test
    public void testEquals() {
        DialPlot p1 = new DialPlot();
        DialPlot p2 = new DialPlot();
        assertTrue(p1.equals(p2));

        // background
        p1.setBackground(new DialBackground(Color.GREEN));
        assertFalse(p1.equals(p2));
        p2.setBackground(new DialBackground(Color.GREEN));
        assertTrue(p1.equals(p2));

        p1.setBackground(null);
        assertFalse(p1.equals(p2));
        p2.setBackground(null);
        assertTrue(p1.equals(p2));

        // dial cap
        DialCap cap1 = new DialCap();
        cap1.setFillPaint(Color.RED);
        p1.setCap(cap1);
        assertFalse(p1.equals(p2));
        DialCap cap2 = new DialCap();
        cap2.setFillPaint(Color.RED);
        p2.setCap(cap2);
        assertTrue(p1.equals(p2));

        p1.setCap(null);
        assertFalse(p1.equals(p2));
        p2.setCap(null);
        assertTrue(p1.equals(p2));

        // frame
        StandardDialFrame f1 = new StandardDialFrame();
        f1.setBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f,
                4.0f, Color.WHITE));
        p1.setDialFrame(f1);
        assertFalse(p1.equals(p2));
        StandardDialFrame f2 = new StandardDialFrame();
        f2.setBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f,
                4.0f, Color.WHITE));
        p2.setDialFrame(f2);
        assertTrue(p1.equals(p2));

        // view
        p1.setView(0.2, 0.0, 0.8, 1.0);
        assertFalse(p1.equals(p2));
        p2.setView(0.2, 0.0, 0.8, 1.0);
        assertTrue(p1.equals(p2));

        // layer
        p1.addLayer(new StandardDialScale());
        assertFalse(p1.equals(p2));
        p2.addLayer(new StandardDialScale());
        assertTrue(p1.equals(p2));
    }

    