@Test
    public void testScaleListener() {
        DialPlot p = new DialPlot();
        StandardDialScale s1 = new StandardDialScale();
        p.addScale(0, s1);
        p.addChangeListener(this);
        this.lastEvent = null;
        s1.setStartAngle(22.0);
        assertNotNull(this.lastEvent);

        StandardDialScale s2 = new StandardDialScale();
        p.addScale(0, s2);
        this.lastEvent = null;
        s1.setStartAngle(33.0);
        assertNull(this.lastEvent);
        s2.setStartAngle(33.0);
        assertNotNull(this.lastEvent);
    }

    