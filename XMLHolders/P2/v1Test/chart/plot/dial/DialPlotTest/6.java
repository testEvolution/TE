@Test
    public void testCapListener() {
        DialPlot p = new DialPlot();
        DialCap c1 = new DialCap();
        p.setCap(c1);
        p.addChangeListener(this);
        this.lastEvent = null;
        c1.setFillPaint(Color.RED);
        assertNotNull(this.lastEvent);

        DialCap c2 = new DialCap();
        p.setCap(c2);
        this.lastEvent = null;
        c1.setFillPaint(Color.BLUE);
        assertNull(this.lastEvent);
        c2.setFillPaint(Color.GREEN);
        assertNotNull(this.lastEvent);
    }

    