@Test
    public void test1170825() {
        TimeSeries s1 = new TimeSeries("Series1");
        TimeSeriesCollection dataset = new TimeSeriesCollection();
        dataset.addSeries(s1);
        try {
            /* TimeSeries s = */ dataset.getSeries(1);
        }
        catch (IllegalArgumentException e) {
            // correct outcome
        }
        catch (IndexOutOfBoundsException e) {
            assertTrue(false);  // wrong outcome
        }
    }

    