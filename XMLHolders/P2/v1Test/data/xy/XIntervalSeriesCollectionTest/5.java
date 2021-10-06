@Test
    public void test1170825() {
        XIntervalSeries s1 = new XIntervalSeries("Series1");
        XIntervalSeriesCollection dataset = new XIntervalSeriesCollection();
        dataset.addSeries(s1);
        try {
            /* XYSeries s = */ dataset.getSeries(1);
        }
        catch (IllegalArgumentException e) {
            // correct outcome
        }
        catch (IndexOutOfBoundsException e) {
            assertTrue(false);  // wrong outcome
        }
    }

}