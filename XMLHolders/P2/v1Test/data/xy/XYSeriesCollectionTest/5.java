@Test
    public void test1170825() {
        XYSeries s1 = new XYSeries("Series1");
        XYSeriesCollection dataset = new XYSeriesCollection();
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

    