@Test
    public void test1932146() {
        PeriodAxis axis = new PeriodAxis("TestAxis");
        axis.addChangeListener(this);
        this.lastEvent = null;
        axis.setRange(new DateRange(0L, 1000L));
        assertTrue(this.lastEvent != null);
    }

    