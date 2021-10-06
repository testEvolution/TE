@Test
    public void test1170825() {
        YIntervalSeries s1 = new YIntervalSeries("Series1");
        YIntervalSeriesCollection dataset = new YIntervalSeriesCollection();
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