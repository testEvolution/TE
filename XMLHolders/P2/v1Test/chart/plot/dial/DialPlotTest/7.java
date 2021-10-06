@Test
    public void testFrameListener() {
        DialPlot p = new DialPlot();
        ArcDialFrame f1 = new ArcDialFrame();
        p.setDialFrame(f1);
        p.addChangeListener(this);
        this.lastEvent = null;
        f1.setBackgroundPaint(Color.gray);
        assertNotNull(this.lastEvent);

        ArcDialFrame f2 = new ArcDialFrame();
        p.setDialFrame(f2);
        this.lastEvent = null;
        f1.setBackgroundPaint(Color.BLUE);
        assertNull(this.lastEvent);
        f2.setBackgroundPaint(Color.GREEN);
        assertNotNull(this.lastEvent);
    }

    