@Test
    public void testUpdate2() {
       XYSeries series = new XYSeries("Series", false, true);
       series.add(5.0, 55.0);
       series.add(4.0, 44.0);
       series.add(6.0, 66.0);
       series.update(4.0, 99.0);
       assertEquals(99.0, series.getY(1));
    }

    