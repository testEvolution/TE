@Test
    public void testBug1075255() {
        TimeSeries ts = new TimeSeries("dummy");
        ts.add(new FixedMillisecond(0L), 0.0);
        TimeSeries ts2 = new TimeSeries("dummy2");
        ts2.add(new FixedMillisecond(0L), 1.0);
        try {
            ts.addAndOrUpdate(ts2);
        }
        catch (Exception e) {
            fail("No exceptions should be thrown.");
        }
        assertEquals(1, ts.getItemCount());
    }

    